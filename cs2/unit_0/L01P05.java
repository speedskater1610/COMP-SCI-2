// Draw three vertical lines, each 50 pixels apart, and 100 pixels long.  You can pick the color of the lines.
// I ma pretty happy with this solution like a 9/10

public class L01P05 {
    public static void main(String[] args){
        Turtle pen = new Turtle();
        pen.setPosition(0,0);
        
        pen.right(90);

        for (int i = 1; i <= 3; i++) {
            pen.forward(100);
            
            reset_and_get_ready(pen);
        }
    }
    
    // not hard coded and easy to follow ??!?!?
    // did I just write good code?
    public static void reset_and_get_ready (Turtle t) {
        t.up();
        
        double x = t.getX();
        double y = t.getY();
        
        x += 50;
        y += 100; 
        
        t.setPosition(x, y);
        
        t.down();
    }
    
    // hard coding it but I think that I can doit without hard coding 
    public static void reset_and_get_ready_1 (Turtle t) {
            t.up();
            
            // move over the 50 px
            t.left(90);
            t.forward(50);
            
            // face the right way again 
            t.right(90);
            
            // no we are at the bottom of the last line 50px over
            // so we have to go 100 up 
            // to make them like pillars at the same height
            t.right(180);
            t.forward(100);
            t.right(180);
            
            // back ready to draw
            t.down();
    }
}
