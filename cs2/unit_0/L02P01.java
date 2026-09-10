/*
Draw a stick figure on the screen.  Make sure it has a head, arms (with elbows), and legs with knees and feet.  The head can be a square or a triangle.

no it will be a circle
*/
public class L02P01 {
    public static void main(String[] args){
        Turtle pen = new Turtle();

        pen.setPosition(0,0);
        
        draw_body(pen);
        draw_head(pen);
        draw_arms(pen);
        draw_legs(pen);
        
    }
    
    public static void draw_head (Turtle pen) {
        pen.left(90);
        for (int i = 0; i < 75; i++) {
            pen.left(5);
            pen.forward(5);
        }
        
        pen.setPosition(0,0);
        return;
    }  
    
    public static void draw_body (Turtle pen) {
        pen.right(90);   // face down
        
        pen.forward(101);
        pen.setPosition(0,1);
    }
    
    public static void draw_arms (Turtle pen) {
        pen.up();
        
        // set up
        pen.face(0, -10);
        pen.forward(30);
        
        pen.down();
        
        
        // right
        pen.setDirection(0);
        pen.forward(45);
        pen.backward(45);
        
        
        // left
        pen.setDirection(180);
        pen.forward(45);
        pen.backward(45);
    }
    
    public static void draw_legs (Turtle pen) {
        pen.setDirection(270);  // down
        pen.forward(71);    // what is left from the arms
        
        // right
        pen.setDirection(-45);
        pen.forward(45);
        pen.backward(45);
        
        
        // left
        pen.setDirection(225);
        pen.forward(45);
        pen.backward(45);
    }
}
