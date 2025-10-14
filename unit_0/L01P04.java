// Draw a T.  The lines of the T should be 20px wide and should be purple.

public class L01P04 {
    public static void main(String[] args){
        Turtle pen = new Turtle();
        pen.penColor("purple");
        pen.width(20);

        // first line to (30, 0)
        pen.setPosition(0,0);
        pen.right(90);   // face up
        pen.forward(30);    // draw the bottom part
        
        // draw to top 
        make_top(pen, 20);
    }
    
    
    // imagine there not being refrence so you can do this?
    public static void make_top (Turtle t, double top_width) {
        double x = t.getX();
        double y = t.getY();
        
        // pen isnt in the correct pos above the T
        if (y != 0 ) 
            y = 0;  
        // set the y to 0 so it is right above the | on the T so you can get ready to draw the _ on top
            
        // ste correct pos
        t.setPosition(x, y);
        
        // get each side length
        double side_length = top_width/2;
        t.setDirection(0);
        
        t.forward(side_length);
        
        // go back to middle of the "|"
        t.up();
        t.left(180);
        t.forward(side_length);
        
        // put back down and draw other side
        t.down();
        t.forward(side_length);
    } 
}
