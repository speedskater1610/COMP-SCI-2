/*
Write a fortune teller program that gives you your ideal fortune. 
Declare and initialize four variables: 
num=your desired number of children, 
job is your ideal career, 
spouse is your dream significant other and loc is where you would like to live. 
Then, output a sentence that states 
"You will be a job in loc and married to spouse with num kids." 
Each variable name in the sentence should be replaced with the variable value on output.
*/

import java.util.Scanner;

public class L02P01 {
    public static void main(String[] args) {
        // create obj; which will prompt for user input
        fortune myFortune = new fortune(null, 0, null, false, null);

        // print collected data
        System.out.println("\n--- Your Fortune ---");
        
        System.out.println("Name: " + myFortune.name);
        
        System.out.println("Desired Children: " + myFortune.desired_num_child);
        
        System.out.println("Desired Job: " + myFortune.job);
        
        System.out.println("Wants Spouse: " + myFortune.has_spouse);
        
        System.out.println(
            "Location: Lat " + myFortune.loc.get_coords()[0] 
            + ", Lon " + myFortune.loc.get_coords()[1]
        );
    }

    public static class Location {
        private double[] coords;
        private double lat;
        private double lon;
        
        public Location (double lat, double lon) {
            this.lat = lat;
            this.lon = lon;
            
            this.coords = new double[] {this.lat, this.lon};
        }
        
        public double[] get_coords () {
            return this.coords;
        }
        
        public void set_lat (double new_lat) {
            this.lat = new_lat;
        }
        public void set_lon (double new_lon) {
            this.lon = new_lon;
        }
    }

    public static class fortune {
        // things about the person
        private String name;
        private int desired_num_child;
        private String job;
        private boolean has_spouse;
        private Location loc;
        
        // for input
        Scanner scan = new Scanner(System.in);
        
        // fill out about the person
        public fortune (String name, int desired_num_child, String job, boolean spouse, Location loc) {
            System.out.println("What is your name? > ");
            this.name = scan.nextLine();
            
            System.out.println("How many children do you want? > ");
            this.desired_num_child = scan.nextInt();
            clear_scan_buffer();
            
            System.out.println("What is your desired job? > ");
            this.job = scan.nextLine();
            
            System.out.println("Do you have a spouse? (true : false) > ");
            this.has_spouse = scan.nextBoolean();
            clear_scan_buffer();
            
            System.out.println("\nWhere do you live? - ");
            
            System.out.println("Latitude > ");
            double temp_lat = scan.nextDouble();
            clear_scan_buffer();
            
            System.out.println("longitude > ");
            double temp_lon = scan.nextDouble();
            clear_scan_buffer();
            
            this.loc = new Location(temp_lat, temp_lon);
        }
        
        
        private void clear_scan_buffer () {
            scan.nextLine();
        }
    }
}
