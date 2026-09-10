// Write a program to output the letters H, T and L as created by * characters.  Create four variables that store * patterns and use ONLY THOSE to output the letters.  (Hint: one of the variables would store "*********")

public class L03P02 {
    public static void main(String[] args) {
        // Draw the H
        String[] H = H();
        for (String h : H) {
            if (h != null)
                System.out.println(h);
        }
        
        
        // draw a seperator
        System.out.println("\n\n\n");
        
        // Draw the T
        String[] T = T();
        for (String t: T) {
            if (t != null)
                System.out.println(t);
        }
        
        // draw a seperator
        System.out.println("\n\n\n");
        
        // Draw the L
        String[] L = L();
        for (String l: L) {
            if (l != null)
                System.out.println(l);
        }
    }
    
    public static String[] H (){
        String[] H = new String[11]; 
        for (int i = 10; i > 0; i--) {
            if (i == 5) {
                H[i] = "**********";
            } else {
                H[i] = "*        *";
            }
        }
        
        return H;
    }
    
    public static String[] T (){
        String[] T = new String[11]; 
        for (int i = 10; i > 0; i--) {
            if (i == 1) {
                T[i] = "**********";
            } else {
                T[i] = "    *";
            }
        }
        
        return T;
    }
    
    public static String[] L (){
        String[] L = new String[11]; 
        for (int i = 10; i > 0; i--) {
            if (i == 10) {
                L[i] = "**********";
            } else {
                L[i] = "*";
            }
        }
        
        return L;
    }
}
