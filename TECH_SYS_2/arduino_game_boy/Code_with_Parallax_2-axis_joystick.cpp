#include <Wire.h>
#include <LiquidCrystal_I2C.h>

LiquidCrystal_I2C lcd(0x27, 20, 4);

const int buttonPin = 2;
int buttonState = 0;
int vert = 0;
int horz = 0;

// load all of the variables that used to be global into memory
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

// this helps with a smoother transitsione between games and menu when exit
void waitForButtonRelease() {
  while (digitalRead(buttonPin) == LOW) {
    delay(10);
  }
  delay(200); // small debounce
}

void mayoMan () {
  // load all of the attributes of player and enemies in 
  int playerX = 0;
  int playerY = 2; // start in middle
  int bulletX = -1;
  int bulletY = -1;
  bool bulletActive = false;

  const int maxEnemies = 3;
  int enemyX[maxEnemies];
  int enemyY[maxEnemies];
  bool enemyAlive[maxEnemies];


  unsigned long lastMove = 0;
  unsigned long lastEnemyMove = 0;

  // load the characters into lcd memory slots
  lcd.createChar(0, playerChar);
  lcd.createChar(1, enemyChar);
  lcd.createChar(2, bulletChar);

  // init enemies
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

  // now start game loop
  while (true) {
    vert = analogRead(A0);
    horz = analogRead(A1);
    buttonState = digitalRead(buttonPin);

    // handle the player movement 
    if (millis() - lastMove > 150) {
      if (vert > 600 && playerY < 3) playerY++;
      if (vert < 400 && playerY > 0) playerY--;
      if (horz > 600 && playerX < 19) playerX++;
      if (horz < 400 && playerX > 0) playerX--;
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

            // ask them if they want to leave
            lcd.clear();
            lcd.setCursor(0, 1);
            lcd.print("DO YOU WANT TO LEAVE");
            lcd.setCursor(2, 2);
            lcd.print("HOLD THE BUTTON");
            lcd.setCursor(6, 3);
            lcd.print("TO LEAVE");
            delay(1000);
            
            unsigned long holdStart = millis();
            bool exitHeld = false;
            while (millis() - holdStart < 3000) { // allow up to 3 seconds
              if (digitalRead(buttonPin) == LOW) {
                exitHeld = true;
                break;
              }
              delay(50);
            }
            if (exitHeld) {
              lcd.clear();
              waitForButtonRelease();
              return;
            }


            // reset enemies if they dont leave
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
    
    // draw and delay 
    drawMayoMan(playerX, playerY, bulletActive, bulletX, bulletY, maxEnemies, enemyAlive, enemyX, enemyY);
    delay(100);
    
  }
}

void drawMayoMan( int playerX, int playerY, 
                  bool bulletActive, 
                  int bulletX, int bulletY,
                  int maxEnemies,
                  bool enemyAlive[],
                  int enemyX[], 
                  int enemyY[] ) {
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


// -----------------------------------------------------------------------------------
// PACMAN

// the character sprites
// pacman char
byte pacmanChar[8] = {
  B01110,
  B11111,
  B11000,
  B10000,
  B11000,
  B11111,
  B01110,
  B00000
};
// ghost char
byte ghostChar[8] = {
  B01110,
  B11111,
  B10101,
  B11111,
  B11111,
  B10101,
  B10101,
  B00000
};
bool walls[4][20] = {
  {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, // row 0
  {1,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1}, // row 1
  {1,0,1,0,0,0,1,0,0,0,1,0,0,1,0,0,0,1,0,1}, // row 2
  {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}  // row 3
};

void drawPacman(int pacX, int pacY, int ghostX, int ghostY, bool dots[4][20]) {
  lcd.clear();
  
  // draw dots
  for (int y = 0; y < 4; y++) {
    for (int x = 0; x < 20; x++) {
      if (walls[y][x]) {
        lcd.setCursor(x, y);
        lcd.print("#"); 
      } else if (dots[y][x]) {
        lcd.setCursor(x, y);
        lcd.print(".");
      } 
    }
  }


  // draw ghost
  lcd.setCursor(ghostX, ghostY);
  lcd.write(byte(1));

  // draw the player (pacman)
  lcd.setCursor(pacX, pacY);
  lcd.write(byte(0));
}

void pacmanGame() {
  lcd.clear();
  lcd.setCursor(7, 1);
  lcd.print("PAC MAN!");
  delay(1000);

  lcd.clear();

  // create characters
  lcd.createChar(0, pacmanChar);
  lcd.createChar(1, ghostChar);

  int pacX = 0, pacY = 1;
  int ghostX = 19, ghostY = 2;
  unsigned long lastMove = 0;
  unsigned long lastGhostMove = 0;
  int score = 0;

  bool dots[4][20];
  for (int y = 0; y < 4; y++)
    for (int x = 0; x < 20; x++)
      dots[y][x] = true;

  dots[pacY][pacX] = false;

  while (true) {
    vert = analogRead(A0);
    horz = analogRead(A1);
    buttonState = digitalRead(buttonPin);

    // pacman move logic
    if (millis() - lastMove > 180) {
      int newX = pacX;
      int newY = pacY;

      if (vert > 600) 
        newY++;   // down

      if (vert < 400) 
        newY--;   // up

      if (horz > 600) 
        newX++;   // right

      if (horz < 400) 
        newX--;   // left

      // only move if the new position is not a wall
      if (walls[newY][newX] == 0) {
        pacX = newX;
        pacY = newY;
      }

      lastMove = millis();
    }


    // eating the dots
    if (dots[pacY][pacX]) {
      dots[pacY][pacX] = false;
      score++;
    }

    // ghost movement
    // a very simple NN type thing
    if (millis() - lastGhostMove > 500) {
      int newGhostX = ghostX;
      int newGhostY = ghostY;

      if (ghostX > pacX) 
        newGhostX--;

      else if (ghostX < pacX) 
        newGhostX++;
      
      if (ghostY > pacY) 
        newGhostY--;
      
      else if (ghostY < pacY) 
        newGhostY++;

      // only move ghost if it is not a wall
      if (walls[newGhostY][newGhostX] == 0) {
        ghostX = newGhostX;
        ghostY = newGhostY;
      }

      lastGhostMove = millis();
    }


    // check collisions
    if (ghostX == pacX && ghostY == pacY) {
      lcd.clear();
      lcd.setCursor(6, 0);
      lcd.print("GAME OVER!");
      lcd.setCursor(3, 2);
      lcd.print("SCORE: ");
      lcd.print(score);
      delay(2000);
      lcd.clear();
      lcd.setCursor(0, 1);
      lcd.print("HOLD BUTTON TO EXIT");
      lcd.setCursor(0, 2);
      lcd.print("OR WAIT TO TRY AGAIN");
      delay(1000);

      // I didnt want to reuse the old logic so I spent way way way way too long on this logic
      unsigned long holdStart = millis();
      bool exitHeld = false;
      while (millis() - holdStart < 3000) {
        if (digitalRead(buttonPin) == LOW) {
          exitHeld = true;
          break;
        }
        delay(50);
      }
      if (exitHeld) {
        lcd.clear();
        waitForButtonRelease();
        return;
      }

      pacmanGame(); // restart
      return;
    }

    drawPacman(pacX, pacY, ghostX, ghostY, dots);
    delay(100);
  }
}

//  -------------------------------------------------------------
// SNAKE GAME
// snake char
byte snakeBody[8] = {
  B00000,
  B11111,
  B11111,
  B11111,
  B11111,
  B11111,
  B11111,
  B00000,
};


byte snakeHead[8] = {
  B00000,
  B11100,
  B11110,
  B11011,
  B11111,
  B11110,
  B11100,
  B00000,
};

byte snakeTail[] = {
  B00000,
  B00111,
  B01111,
  B11111,
  B11111,
  B01111,
  B00111,
  B00000,
};

// apple char
byte appleChar[8] = {
  B00100,
  B01110,
  B01110,
  B01110,
  B01110,
  B00000,
  B00000,
  B00000
};

void drawSnakeGame(int snakeLength, int snakeX[], int snakeY[], int appleX, int appleY) {
  lcd.clear();

  // draw snake
  for (int i = 0; i < snakeLength; i++) {
    lcd.setCursor(snakeX[i], snakeY[i]);
    if (i == 0) {
      lcd.write(byte(3)); // head
    } else if (i == snakeLength - 1) {
      lcd.write(byte(5)); // tail
    } else {
      lcd.write(byte(4)); // body
    }
  }

  // draw apple
  lcd.setCursor(appleX, appleY);
  lcd.write(byte(6)); // appleChar
}

void snake() {
  lcd.clear();
  lcd.setCursor(7, 1);
  lcd.print("SNAKE!");
  delay(1000);
  lcd.clear();

  // create custom characters
  lcd.createChar(3, snakeHead); // head
  lcd.createChar(4, snakeBody); // body
  lcd.createChar(5, snakeTail); // tail
  lcd.createChar(6, appleChar); // apple

  const int maxLength = 20; // maximum snake length
  int snakeLength = 3;
  int snakeX[maxLength];
  int snakeY[maxLength];

  // initial snake positions
  snakeX[0] = 5; snakeY[0] = 1;
  snakeX[1] = 4; snakeY[1] = 1;
  snakeX[2] = 3; snakeY[2] = 1;

  int appleX = random(0, 20);
  int appleY = random(0, 4);

  int dirX = 1; // init movement direction (right)
  int dirY = 0;

  unsigned long lastMove = 0;

  while (true) {
    vert = analogRead(A0);
    horz = analogRead(A1);
    buttonState = digitalRead(buttonPin);

    // change direction
    if (vert > 600 && dirY != 1) { dirX = 0; dirY = 1; } // up
    if (vert < 400 && dirY != -1) { dirX = 0; dirY = -1; } // down
    if (horz > 600 && dirX != 1) { dirX = 1; dirY = 0; } // left
    if (horz < 400 && dirX != -1) { dirX = -1; dirY = 0; } // right

    if (millis() - lastMove > 300) {
      lastMove = millis();

      // move snake
      for (int i = snakeLength - 1; i > 0; i--) {
        snakeX[i] = snakeX[i - 1];
        snakeY[i] = snakeY[i - 1];
      }
      snakeX[0] += dirX;
      snakeY[0] += dirY;

      // check collision with edges
      if (snakeX[0] < 0) snakeX[0] = 19;
      if (snakeX[0] > 19) snakeX[0] = 0;
      if (snakeY[0] < 0) snakeY[0] = 3;
      if (snakeY[0] > 3) snakeY[0] = 0;

      // check collision with itself
      for (int i = 1; i < snakeLength; i++) {
        if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
          lcd.clear();
          lcd.setCursor(5, 1);
          lcd.print("GAME OVER!");
          delay(1500);
          return; // back to menu safely
        }
      }

      // eat apple
      if (snakeX[0] == appleX && snakeY[0] == appleY) {
        if (snakeLength < maxLength) snakeLength++;
        appleX = random(0, 20);
        appleY = random(0, 4);
      }

      drawSnakeGame(snakeLength, snakeX, snakeY, appleX, appleY);
    }

    delay(50);
  }
}

//  -------------------------------------------------------------
// MENU
// for the menu in loop
byte arrowChar[8] = {
  B00000,
  B00100,
  B00110,
  B11111,
  B00110,
  B00100,
  B00000,
  B00000
};
// TODO: UPDATE FOR NEW GAMES
const int NUM_GAMES = 3; 
String games[NUM_GAMES] = { "Mayo Man", "Pac-Man", "Snake" };

int selected = 0;
int topIndex = 0; // for scrolling

void showMenu() {
  vert = analogRead(A0);
  buttonState = digitalRead(buttonPin);

  // handle navigation
  if (vert < 400) { // up
    selected--;
    if (selected < 0) selected = NUM_GAMES - 1;
    delay(200);
  } else if (vert > 600) { // down
    selected++;
    if (selected >= NUM_GAMES) selected = 0;
    delay(200);
  }

  // handle scrolling window (if more games than 4 lines)
  if (selected < topIndex) topIndex = selected;
  else if (selected >= topIndex + 4) topIndex = selected - 3;

  // draw menu
  lcd.clear();
  for (int i = 0; i < 4 && (i + topIndex) < NUM_GAMES; i++) {
    lcd.setCursor(1, i);
    lcd.print(games[i + topIndex]);
    if (i + topIndex == selected) {
      lcd.setCursor(0, i);
      lcd.write(byte(7)); // arrow icon
    }
  }

  // handle selection
  if (buttonState == LOW) {
    lcd.clear();
    lcd.setCursor(4, 1);
    lcd.print("LOADING...");
    delay(500);
    launchGame(selected);
  }
}

void launchGame(int index) {
  lcd.clear();
  switch (index) {
    case 0:
      mayoMan();
      break;
    case 1:
      pacmanGame();
      break;
    case 2:
      snake();
    default:
      lcd.setCursor(0, 1);
      delay(1000);
      break;
  }
}

void setup() {
  lcd.init();
  lcd.backlight();
  pinMode(buttonPin, INPUT_PULLUP);

  lcd.createChar(7, arrowChar);

  // intro sorta thing
  lcd.setCursor(3, 1);
  lcd.print("ARDUINO GAME");
  delay(1500);
  lcd.clear();
}

void loop() {
  showMenu();
  delay(100);
}
