//0.5 Quiz Practicum
import java.util.Arrays;

public class Practicum02{
    
    //Main Method - Test your methods here!
    public static void main(String[] args){
        /* Question 1 */
        int arr[] = {4, 1, 3, 6, 2, 9};
        System.out.println(divBySum(arr, 3));
        System.out.println(divBySum(arr, 5));
    
        /* Question 2 */
        System.out.println(average(arr));
        
        /* Question 3 */
        System.out.println(countEvenValues("1, 5, 4, 3, 7, 5, 3, 2, 7, 3, 1, 5, 7, 8, 9, 8", ", "));
    }
    

    // -------------------------------------------------------------------------
    // Write each method below. Then, test them with calls in the main method...
    // -------------------------------------------------------------------------
    
    /* Question 1 */
    public static int divBySum(int[] arr, int num) {
        int sum = 0;
        
        for (int i : arr) {
            if (i % num == 0) sum += i;
        }
        
        return sum;
    }
    
    /* Question 2 */
    public static float average(int[] nums) {
        return Math.round(100 * (Arrays.stream(nums).sum() / (float)nums.length)) / 100f;
    }
    
    /* Question 3 */
    public static int countEvenValues(String str, String delim) {
        return (int)Arrays.asList(str.split(delim))
                            .stream()
                            .mapToInt(x -> Integer.parseInt(x) Integer::parseInt)
                            .filter(x -> x % 2 == 0)
                            .count();
    }
}
