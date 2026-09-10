/*
Each disk drive in a shipment of devices is stamped with a code from 1 to 4, which indicates a manufacturer as follows:
1        	3M Corporation
2        	Maxell Corporation
3        	Sony Corporation
4        	Verbatim Corporation
    Write a program that accepts the code number as input, and, based on the value entered, displays the correct 
    manufacturer. Use a switch structure.
*/

import java.util.Scanner;

public class L01P01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter code 1..4 for the manufacturer: "); 
        /*
        I do love me some rust syntax
        ```rust
        for i in 1..5 {
            println!("{}", i);
        }
        ```
        */
        int code = input.nextInt();
        
        if (code < 0 || code > 4) { 
            System.out.print("Invalid code... try again");
        }
        
        DiskDrive manufacturer = applyCode(code);
        
        System.out.printf("Code: %d, applies to %s", code, manufacturer.getDescription().replace("_", " "));
    }
    
    public static DiskDrive applyCode(int code) {
        switch (code) {
            case 1:
                return DiskDrive._3M_CORPORATION;
                
            case 2:
                return DiskDrive._MAXELL_CORPORATION;
                
            case 3:
                return DiskDrive._SONY_CORPORATION;
                
            case 4:
                return DiskDrive._VERBATIM_CORPORATION;
                
            default:
                // https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalArgumentException.html  
                throw new IllegalArgumentException("Illegal code: " + code);
        }
    }
    
    
    public enum DiskDrive {
        _3M_CORPORATION("3M_CORPORATION"),
        _MAXELL_CORPORATION("MAXELL_CORPORATION"),
        _SONY_CORPORATION("SONY_CORPORATION"),
        _VERBATIM_CORPORATION("VERBATIM_CORPORATION");
        
        private final String description;
        
        public String getDescription() {
            return description.toLowerCase();
        }

        DiskDrive(String description) {
            this.description = description;
        }
    }
}