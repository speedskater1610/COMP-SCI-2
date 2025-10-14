// Write a program that creates and initializes three double variables and stores their average in a variable called avg.  Output the average.

public class L02P04 {
    public static void main(String[] args) {
        double num1 = 4.5752;
        double num2 = 4563.75644;
        double num3 = 6743.564443332;
        
        double[] nums = {num1, num2, num3};
        double average = average(nums);
        
        System.out.printf("the average of \n%f, \n%f,  \n%f \n-\tis %f", num1, num2, num3, average);
    }
    
    public static double average (double[] nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        
        return sum / nums.length;
    }
}