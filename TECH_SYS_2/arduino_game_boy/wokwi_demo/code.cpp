#include <Wire.h>
#include <LiquidCrystal_I2C.h>

LiquidCrystal_I2C lcd(0x27, 20, 4);

const int buttonPin = 2;
int buttonState = 0;
int vert = 0;
int horz = 0;

int playerX = 0;
int playerY = 2; // start in middle
int bulletX = -1;
int bulletY = -1;
bool bulletActive = false;

const int maxEnemies = 3;
int enemyX[maxEnemies];
int enemyY[maxEnemies];
bool enemyAlive[maxEnemies];

// all of the charcters that can be printed
byte playerChar[] = {
  B01110,
  B00100,
  B01111,
  B10100,
  B00100,
  B01010,
  B10010,
  B11011,
};

byte enemyChar[] = {
  B11100,
  B11100,
  B11100,
  B01000,
  B01000,
  B01000,
  B10100,
  B10100,
};

byte bulletChar[] = {
  B00000,
  B01000,
  B00100,
  B00010,
  B00100,
  B01000,
  B00000,
  B00000,
};

unsigned long lastMove = 0;
unsigned long lastEnemyMove = 0;

void setup() {
  lcd.init();
  lcd.backlight();
  pinMode(buttonPin, INPUT_PULLUP);

  lcd.createChar(0, playerChar);
  lcd.createChar(1, enemyChar);
  lcd.createChar(2, bulletChar);

  // Initialize enemies
  for (int i = 0; i < maxEnemies; i++) {
    enemyX[i] = 19; // right edge
    enemyY[i] = random(0, 4);
    enemyAlive[i] = true;
  }

  for (int k = 400; k >= 50; k -= 50) {
    lcd.clear();
    lcd.setCursor(5, 1);
    lcd.print("MAYO MAN!!");
    delay(k);
    lcd.clear();
    delay(k);
  }

  // final flash
  lcd.clear();
  lcd.setCursor(5, 1);
  lcd.print("STARTING..");
  delay(1000);

  lcd.clear();
}

void draw() {
  lcd.clear();

  // draw player
  lcd.setCursor(playerX, playerY);
  lcd.write(byte(0));

  // draw bullet
  if (bulletActive) {
    lcd.setCursor(bulletX, bulletY);
    lcd.write(byte(2));
  }

  // draw the enemies
  for (int i = 0; i < maxEnemies; i++) {
    if (enemyAlive[i]) {
      lcd.setCursor(enemyX[i], enemyY[i]);
      lcd.write(byte(1));
    }
  }
}

void loop() {
  vert = analogRead(A0);
  horz = analogRead(A1);
  buttonState = digitalRead(buttonPin);

  // handle the player movement 
  if (millis() - lastMove > 150) {
    if (vert < 400 && playerY < 3) playerY++;
    if (vert > 600 && playerY > 0) playerY--;
    if (horz < 400 && playerX < 19) playerX++;
    if (horz > 600 && playerX > 0) playerX--;
    lastMove = millis();
  }

  // handle the player shooting
  if (buttonState == LOW && !bulletActive) {
    bulletActive = true;
    bulletX = playerX + 1;
    bulletY = playerY;
  }

  // handle how the bullet moves
  if (bulletActive) {
    bulletX++;
    if (bulletX >= 20) {
      bulletActive = false;
    }
  }

  // handle how the enemy moves
  if (millis() - lastEnemyMove > 300) {
    for (int i = 0; i < maxEnemies; i++) {
      if (enemyAlive[i]) {
        enemyX[i]--;
        if (enemyX[i] < 0) {
          // enemy reached left side — player loses
          lcd.clear();
          lcd.setCursor(5, 1);
          for (int k = 400; k >= 50; k -= 50) {
            lcd.clear();
            lcd.setCursor(5, 1);
            lcd.print("GAME OVER!");
            delay(k);
            lcd.clear();
            delay(k);
          }

          // final flash
          lcd.clear();
          lcd.setCursor(5, 1);
          lcd.print("GAME OVER!");
          delay(1000);

          // reset enemies
          for (int j = 0; j < maxEnemies; j++) {
            enemyX[j] = 19;
            enemyY[j] = random(0, 4);
            enemyAlive[j] = true;
          }
        }
      } else {
        // respawn enemy
        enemyX[i] = 19;
        enemyY[i] = random(0, 4);
        enemyAlive[i] = true;
      }
    }
    lastEnemyMove = millis();
  }

  // collisions
  if (bulletActive) {
    for (int i = 0; i < maxEnemies; i++) {
      if (enemyAlive[i] && enemyX[i] == bulletX && enemyY[i] == bulletY) {
        enemyAlive[i] = false;
        bulletActive = false;
      }
    }
  }

  draw();
  delay(100);
}
