// Draw a triangle with vertices (0,0), (30, 0) and (0, 40).

public class L01P02 {
    public static void main(String[] args){
        Turtle pen = new Turtle();

        // first line to (30, 0)
        pen.setPosition(0,0);
        pen.face(30,0);
        pen.forward(30);
        
        // head back home without drawing anything
        pen.up();
        pen.setPosition(0,0);
        pen.down();
 
        // draw the 2nd line from 0,0 to 0,40       
        pen.face(0, 40);
        pen.forward(40);
        
        
        // calc the hyponuse of the triange and face that way then go that way
        pen.face(30, 0);
        int a = 30; // 0, 0 to 30, 0
        int b = 40; // 0, 0 to 0, 40
        
        double hypo = (Math.sqrt(
                (a * a) + (b * b)    
            ));
            
        pen.forward(hypo);
    }
}
