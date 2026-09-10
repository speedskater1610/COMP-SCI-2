// Draw your three initials (first, middle, last) and make each a different color.


public class L02P04 {
    public static void main(String[] args){
        Turtle pen = new Turtle();
    
        // String instructions = encode_letter("R");
        // instructions += encode_letter("M");
        // instructions += encode_letter("E");
        
        String instructions = "";
        instructions += encode_letter("A");
        instructions += encode_letter("B");
        instructions += encode_letter("C");
        instructions += encode_letter("D");
        instructions += encode_letter("E");
        instructions += encode_letter("F");
        instructions += encode_letter("G");
        instructions += encode_letter("H");
        instructions += encode_letter("I");
        instructions += encode_letter("J");
        instructions += encode_letter("K");
        instructions += encode_letter("L");
        instructions += encode_letter("M");
        instructions += encode_letter("N");
        instructions += encode_letter("O");
        instructions += encode_letter("P");
        instructions += encode_letter("Q");
        instructions += encode_letter("R");
        instructions += encode_letter("S");
        instructions += encode_letter("T");
        instructions += encode_letter("U");
        instructions += encode_letter("V");
        instructions += encode_letter("W");
        instructions += encode_letter("X");
        instructions += encode_letter("Y");
        instructions += encode_letter("Z");

        
        run(instructions, pen);
        
    }
    
    public static String encode_letter(String in) {
        in = in.toUpperCase();
        char letter = in.charAt(0);

        switch (letter) {
            case 'A': 
                return "!v^-/_-/e"; 
            case 'B':
                return "!v^-/_-/_e"; 
            case 'C': 
                return "!-_v-e"; 
            case 'D': 
                return "!-_v-^e"; 
            case 'E': 
                return "!v^-_/-_/-e"; 
            case 'F': 
                return "!v^-_/-_e"; 
            case 'G': 
                return "!-_v-|e"; 
            case 'H': 
                return "!v|-|ve"; 
            case 'I': 
                return "!>_v-<e"; 
            case 'J': 
                return "!>_v_|e"; 
            case 'K': 
                return "!v|-_dse"; 
            case 'L': 
                return "!v-e"; 
            case 'M': 
                return "!v^dsusve"; 
            case 'N': 
                return "!v^dl^e"; 
            case 'O': 
                return "!-_v-^e"; 
            case 'P': 
                return "!v^-/_e"; 
            case 'Q': 
                return "!-_v-^~v!/e"; 
            case 'R': 
                return "!v^-/_dse"; 
            case 'S': 
                return ""; 
            case 'T': 
                return ""; 
            case 'U': 
                return ""; 
            case 'V': 
                return ""; 
            case 'W': 
                return ""; 
            case 'X': 
                return ""; 
            case 'Y': 
                return ""; 
            case 'Z': 
                return ""; 
            default:
                return "";
        }
    }   

    
        /*
        ^    up 100
        v    down 100
        _    left 50
        -    right 50
        |    up 50
        /    down 50
        x    print the current x value to console
        y    print the current y value to console
        @    go back to 0,0
        <    left 100
        >    right 100
        ~    pick the mouse up
        !    put the mouse down
        e    end letter and go onto the start of the next letter
        u    rotate 45 to face up 
        d    rotate 45 to face down
        l    draws 100 in what ever direction
        s    draws 50 in facing direction
        */
    
    public static void run (String code, Turtle pen) {
        code = "@" + code;
        
        int e_count = 0;
        
        for (int i = 0; i < code.length(); i++) {
            switch (code.charAt(i)) {
                case 'l' :
                    pen.forward(100);
                    break;
                    
                case 's':
                    pen.forward(50);
                    break;
                
                case 'u':
                    pen.setDirection(45);
                    break;
                
                case 'd':
                    pen.setDirection(-45);
                    break;
                    
                case '^':
                    pen.setDirection(90);
                    pen.forward(100);
                    break;
                
                case 'v':
                    pen.setDirection(-90);
                    pen.forward(100);
                    break;
                
                case '_':
                    pen.setDirection(180);
                    pen.forward(50);
                    break;
                
                case '-':
                    pen.setDirection(0);
                    pen.forward(50);
                    break;
                
                case '|':
                    pen.setDirection(90);
                    pen.forward(50);
                    break;
                
                case '/':
                    pen.setDirection(-90);
                    pen.forward(50);
                    break;
                
                case 'x':
                    System.out.println(pen.getX());   
                    break;
                    
                case 'y':
                    System.out.println(pen.getY());
                    break;
                
                case '@':
                    pen.up();
                    pen.setPosition(0, 0);
                    pen.down();
                    break;
                
                case '<':
                    pen.setDirection(180);
                    pen.forward(100);
                    break;
                
                case '>':
                    pen.setDirection(0);
                    pen.forward(100);
                    break;
                
                case '~':
                    pen.up();
                    break;
                
                case '!':
                    pen.down();
                    break;
                
                case 'e':
                    e_count++;
                    
                    pen.up();
                    pen.setPosition(0, 0);
                    
                    for (int e = 0; e < e_count; e++) {
                        pen.setDirection(0);
                        pen.forward(115);
                    }
                    
                    pen.down();
                    break;
            }
        }
    }
}
