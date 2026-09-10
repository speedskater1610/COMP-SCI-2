/*
Write a program that outputs the letter Z.  The Z should be made of * characters and should be about 10 rows high and 9 characters wide.  Each row of the letter should be its own line of output.  See the example at right.  No variables needed.
*/

public class L01P05 {
    public static void main(String[] args) {
        System.out.printf("First way - \n%s \n\n or second way -\n", way1());
        way2();
    }
    
    
    public static void way2 () {
        String[] Z = {
            "* * * * * * * * *",
            "              *  ",
            "            *    ",
            "          *      ",
            "        *        ",
            "      *          ",
            "    *            ",
            "  *              ",
            "*                ",
            "* * * * * * * * *"
        };
        
        for (String z : Z) {
            System.out.println(z);
        }
    } 
    
    public static String way1 () {
        String overall = "";        
        String bar = "* * * * * * * * *";
        
        overall += (bar + "\n");
        for (int i = 8; i > 0; i--) {
            for(int j = i; j > 0; j--) {
                overall += ("  ");
            }
            overall += ("*\n");
        }
        overall += (bar + "\n");        
    
        return overall;
    }
}
