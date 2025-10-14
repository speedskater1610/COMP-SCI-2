/*
Draw a house with a roof, chimney, two second floor windows and a window and door on the first floor.
*/

public class L02P02 {
    public static void main(String[] args){
        Turtle pen = new Turtle();
        
        
        House house = new House(pen);

        
    }
    public static class House {
        private Turtle pen;
        
        public House (Turtle pen) {
            this.pen = pen;
            this.pen.speed(1);
            
            this.base();
            
            // second floor
            this.window(20, -25);
            this.window(60, -25);
            
            // everything above the base
            this.roof();
            this.chimney();
            
            // lower floor
            this.window(60, -65);
            this.door();
            
            // take the turtle away so you can see the full house
            this.end();
        }
        
        private void base () {
            this.pen.up();
            this.pen.setPosition(0,0);
            this.pen.down();
            
            
            // draw the main square 
            for (int i = 0; i < 4; i++) {
                this.pen.forward(100);
                this.pen.right(90); 
            }
        }
        
        private void window (final int x, final int y) {
            // get to the pos of the window
            this.pen.up();
            this.pen.home();
            this.pen.setPosition(x, y);
            this.pen.down();
            
            
            this.pen.setDirection(0);
            
            // draw a box for the outer of the window
            /*
             ___
            |   |
            |___|
            */
            for (int i = 0; i < 4; i++) {
                this.pen.forward(20);
                this.pen.right(90); 
            }
            
            // next draw the inner cross "+" inside 
            this.pen.up();
            // half-way throught the top bar
            this.pen.setPosition(x + 10, y);
            this.pen.setDirection(270); // face down
            this.pen.down();
            
            this.pen.forward(20);
            
            
            // now draw the middle line across
            this.pen.up();
            // half-way throught the side bar
            this.pen.setPosition(x, y - 10);
            this.pen.setDirection(0); // face sideways
            this.pen.down();
            
            this.pen.forward(20);
            
        }
    
        private void roof () {
            // get to the  start of where the roof starts
            this.pen.up();
            this.pen.setPosition(0,0);
            this.pen.down();
            
            this.pen.setDirection(45);
            
            // if top the roof strechs acros with a 45-45-90 tringle and the hypo (top bar on base) is 100 
            /*
            since it is a 45-45-90 triangle then the sides are half the hypo then root(2)
            so then we have 50*root(2)
            */
            double length = (50) * (Math.sqrt(2));
            this.pen.forward(length);
            
            // turn
            this.pen.setDirection(-45);
            this.pen.forward(length);
        }
        
        private void chimney () {
            // get ready
            this.pen.up();
            this.pen.setPosition(0,0);
            this.pen.setDirection(0);
            this.pen.forward(25);
            
            // find out how farI have to go up to be intersecting with the roof
            /*
            what do I know - 
                roof -
                    * 45-45-90 triangle 
                    * with hypo of 100  
                    * side lengths of 50 * root(2)
            
                base -
                    * top part is 100 long 
                    * so a good place along that would be 25
                    
                chimney -
                    starts 25 aways along the top of the base
            
            what do I need to find out -
                * where to place the 2 ponts that the chimney hits
                
            what would be helpful -
                * the slope0 which is one bc the line is 45* away from x and passes the origin
            */
            // solution - 
            int slope = 1;
            int start_height = 25 * slope;  // how far over mult by the slope
            
            this.pen.setDirection(90);  // face up
            this.pen.forward(start_height);
            
            this.pen.down();    // start drawing
            
            this.pen.forward(20);  // go up 35
            
            // now over 20
            this.pen.setDirection(0);
            this.pen.forward(12);
            
            // now I have to get it to meet back with the roof
            // bc we went over 12 then
            this.pen.setDirection(270);
            int end_height = start_height + (12 * slope);
            this.pen.forward(this.pen.getY() - end_height);
        }
        
        
        private void door () {
            // set up door pos
            this.pen.up();
            
            this.pen.setPosition(25, -125);
            this.pen.setDirection(0);
            this.pen.forward(10);
            this.pen.left(90);
            this.pen.forward(25);
            this.pen.left(0);
            
            this.pen.down();
            
            
            // door frame
            for (int i = 0; i < 4; i++) {
                if (i % 2 != 0)
                    this.pen.forward(20);
                else 
                    this.pen.forward(40);
                this.pen.left(90); 
            }
            
            
            // door handle
            this.pen.up();
            this.pen.forward(25);   // a little more than half way up
            this.pen.left(90);
            this.pen.forward(5);
            this.pen.down();
            
            int radius = 2; 
            double circumference = 2 * Math.PI * radius;
            // each little segment 
            double segmentLength = circumference / 360; 

            for (int i = 0; i < 360; i++) {
                pen.forward(segmentLength);
                pen.left(1);
            }
        }
        
        private void end () {
            this.pen.up();
            this.pen.forward(100);
        }
    }
}
