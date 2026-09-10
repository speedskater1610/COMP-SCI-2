/*
Write a program that could act as a personal calendar.  Ask the user to enter the information for a date (month, day, year).  Then, ask them for information regarding another date.  If the second is the same as the first, then show output that notifies them that there is a conflict in their schedule.  Otherwise, simply output that the date has been recorded
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.Vector;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L02P06 {
    public static void main(String[] args) {
        File csvFile = new File("calender.csv");
        
        
        Vector<String> rows = new Vector<>();
        
        // read the file
        try {
            Scanner scanner = new Scanner(csvFile);
            
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                rows.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: The csv calender file was not found.");
            e.printStackTrace();
        }
        
        // seperate into rows by ','
        Vector<Vector<String>> parsedCsv = new Vector<>();
        
        for (String row : rows) {
            String[] seperatedRow = row.split(",");
            parsedCsv.add(new Vector<>(Arrays.asList(seperatedRow)));
        }
        
        if (hasDuplicates(parsedCsv)) {
            System.out.println("Your calender has a confict");
        } else {
            System.out.println("Your calender has no conficts");
        }
    }
    
    public static boolean hasDuplicates(Vector<Vector<String>> list) {
        Set<Vector<String>> seen = new HashSet<>();
        for (Vector<String> innerVector : list) {
            if (!seen.add(innerVector)) {
                return true; // dup found
            }
        }
        return false; // no dup found
    }
}