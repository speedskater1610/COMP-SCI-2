// Write a program that displays the difference of two numbers.  Write a sentence that says "the difference of num1 and num2 is difference."  Except the values of num1, num2 and difference in the output should be replaced by variables that store values.

public class L03P01 {
    public static void main(String[] args) {
        double num1 = 54.67;
        double num2 = 6583.8675;
        
        System.out.printf("the diffrence of num1 : %f and num2 : %f is %f", num1, num2, num1 - num2);
    }
}
