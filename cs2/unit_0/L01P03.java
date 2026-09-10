// Draw a line from (0,0) to (50, 73).  The line should be blue.

public class L01P03 {
    public static void main(String[] args){
        Turtle pen = new Turtle();

        pen.up();
        pen.setPosition(50, 73);
        pen.face(0, 0);
        pen.penColor("blue");
        
        
        
        // calc the hyponuse of a triange and face that way then go that way
        pen.face(30, 0);
        
        // distace of each side base off of the 50,73 coords
        int a = 50; // 0, 0 to 50, 0
        int b = 73; // 0, 0 to 0, 73
        
        // .sqrt() method I think returns a double but who cares
        double line_distance = (Math.sqrt(
                (a * a) + (b * b)    
            ));
            
            
        pen.down();
        pen.forward(line_distance);
    }
}
