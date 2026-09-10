/*
Draw a stop sign.  The sign should be filled in completely with red and the letters, in white, should appear on top of the octagon.
*/


public class L03P01 {
    public static void main(String[] args){
        Turtle pen = new Turtle();
        
        pen.width(30);
        pen.speed(1);
        pen.penColor("red");
        
        pen.setPosition(0, 0);
        
        int size = 70;
        
        for (int i = size; i > 0; i--) {    // inc down for how far yu mov forward
            for (int e = 0; e < 8; e++) {   // 8 sides
                pen.forward(size - i);      // get larger and larger
                pen.right(180-135);         // angle to turn of the octagon
            }
            System.out.printf("%d, ", i);
        }
        
        draw_stop(pen, size);
    }
    
    public static void get_to_start_of_s (Turtle pen, int size) {
        pen.up();
            pen.speed(1);
            pen.setPosition(0, 0);
            pen.backward(size);
        
            pen.right(90);
            pen.forward(size*1.8);
            pen.setDirection(0);
            pen.forward(25);
        pen.down();
    }
    
    public static void draw_stop (Turtle pen, int size) {
        // get set up and in pos to start the 'S'
        get_to_start_of_s(pen, size);


        pen.penColor("white");
        pen.width(5);
        
        
        // S
        /* to find the amount of rotation
        x*0.6=180

        x = 180 / 0.6 = 300
        */
        for (int i = 300; i > 0; i--) {
            pen.forward(.2);
            pen.left(.6);
        }
        pen.backward(7);
        for (int i = 300; i > 0; i--) {
            pen.forward(.2);
            pen.right(.6);
        }
        pen.forward(5);
        
        
        // T
        // set up
        get_to_start_of_s(pen, size);
        pen.up();
            pen.forward(50);
            pen.setDirection(90);
        pen.down();
        
        // draw
        pen.forward(78);
        pen.left(90);
        pen.forward(25);
        pen.left(180);
        pen.forward(50);
        
        // O
        // set up
        get_to_start_of_s(pen, size);
        pen.up();
            pen.forward(65);        // distance over
            pen.setDirection(90);
            pen.forward(40);        // height
        pen.down();
        
        // draw
        for (int i = 600; i > 0; i--) {
            pen.forward(0.7);   
            pen.right(1.2);
        }
        
        
        // P
        // set it up
        pen.up();
            pen.speed(1);
            pen.setPosition(0, 0);
            pen.backward(size);
        
            pen.right(90);
            pen.forward(size*1.8);
            pen.setDirection(0);
            pen.forward(25);
            pen.backward(50);
            pen.right(90);
            pen.backward(20);
        pen.down();
        
        // draw
        pen.forward(65);
        pen.backward(65);
        pen.setDirection(0);
        for (int i = 300; i > 0; i--) {
            pen.forward(.2);
            pen.right(.6);
        }
        
    }
}
