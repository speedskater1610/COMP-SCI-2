import java.text.DecimalFormat;

public class L01P06 {
    public static void main(String[] args) {
        double ctemp = 16.5;
        
        DecimalFormat df = new DecimalFormat("##.#"); // one dec place; returns a string
        System.out.printf("The %s* C is %s* F", df.format((float)ctemp), df.format((float)convert(ctemp, 'c')));
    }
    
    public static double convert (double data, char unit) {
        // F = (C * 1.8) + 32
        // C = 5/9(F-32)
        
        unit = (String.valueOf(unit))
            .toLowerCase()
            .charAt(0);
            
        switch (unit) {
            case 'c' :
                return (data * 1.8) + 32;
            case 'f' :
                return (5.0/9.0)*(data-32);
            default :
                return 0;
        }
    }
    
}