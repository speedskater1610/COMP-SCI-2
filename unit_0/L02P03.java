/*
Draw a dashed line from (-200, 200) to (100, -200).  Each dash (and break) should be 50 pixels long, 10 px wide and each dash should be a different color. (you will need turtle.face(x, y))
*/


public class L02P03 {
    public static void main(String[] args){
        Turtle pen = new Turtle();
        
        pen.width(10);
        pen.speed(10); 
        
        pen.up();
        pen.setPosition(-200, 200);
        pen.face(100, -200);
        pen.down();

        int counter = 0;

        while (pen.getX() != 100 && pen.getY() != -200) {
            String color = rand_color();
            pen.penColor(color);
            
            
            if (counter % 2 == 0) {
                pen.forward(50);
            }
            else {
                pen.up();
                pen.forward(50);
                pen.down();
            } 
            
            counter++;
        }
    }
    
    
    public static String rand_color () {
        /*
        this is where learning C can help me
        bc 
        a hex value is a way of represeing a number on base 16 scale
        which helps with storing things in memory because the sqares of 2 
        for 1 or 0 in bools
        
        
        so If I get a random number between 0 - 16 
        then concatinate that with a hex code then I can assine that as a color
        randomly
        
        and since a hex code for rgb colors is 
        #RRGGBB
        RR - red value
        GG - green value
        BB - blue value
        
        55 AA - iykyk
        */
        String hex_code = "#";
        String hex_digits = "0123456789abcdef";

        for (int i = 0; i < 6; i++) {
            int num = (int)(Math.random() * 16);  // 0–15 only
            hex_code += hex_digits.charAt(num);
        }

        return hex_code;

    }
    
}
