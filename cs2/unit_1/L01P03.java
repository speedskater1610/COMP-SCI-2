public class L01P03 {
    public static void main(String[] args) {
        int numbers[] = {20, 17, 14};
        
        double average = 0;
        
        for (int number : numbers) {
            average += number;
        }
        
        average = average / numbers.length; 
    }
}
