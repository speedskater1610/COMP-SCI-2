// An outdoor storage shed, which has the form of a rectangular prism, was recently built in a rectangular backyard.  In variables, store the width and length of the base of the shed.  Then, create two more variables to store the width and length of the yard (make sure that these numbers are >= their shed counterparts).  Write a program that calculates and prints the backyard area outside of the shed.

public class L03P03 {
    public static void main(String[] args) {
        double yard_wid = 45;
        double yard_len = 100;
        double shed_wid = 15;
        double shed_len = 20;
        
        Backyard backyard = new Backyard(yard_wid, yard_len, shed_wid, shed_len);
        
        System.out.println("Area - " + backyard.calc());
    }
    
    public static class Backyard {
        private double wid;
        private double len;
        private double area;
        private Shed shed;
        
        public Backyard (double yard_wid, double yard_len, double shed_wid, double shed_len) {
            // assign backyard size
            this.wid = yard_wid;
            this.len = yard_len;
            this.area = this.wid * this.len;
            
            // assign shed size
            this.shed = new Shed(shed_wid, shed_len); 
        }
        
        public class Shed {
            private double wid;
            private double len;
            private double area;
            
            public Shed (double wid, double len) {
                this.wid = wid;
                this.len = len;
                
                this.area = this.calc_area();
            }
            
            private double calc_area () {
                return this.wid * this.len;
            }
        }
        
        // calcuate the backyard without the shed counting
        public double calc () {
            return this.area - this.shed.area;
        }
    }
}