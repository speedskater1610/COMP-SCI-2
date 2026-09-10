import java.util.Scanner;
import java.util.stream.IntStream;

public class Competition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        IntStream.rangeClosed(1, n)
            .filter(i -> i % 2 != 0)
            .filter(i -> new AbundantNumberSolver(i).isAbundantNumber)
            .forEach(System.out::println);
    }

    public static class AbundantNumberSolver {
        private int num;
        public boolean isAbundantNumber;
        
        AbundantNumberSolver(int num) {
            this.num = num;
            this.isAbundantNumber = false; // base case
            
            this.solve();
        }
        
        private void solve() {
            ListNode propDivisors = getPropDivisors();
            
            // get the sum of all of the proper divisors
            ListNode head = propDivisors;
            int sum = 0;
            
            while (head != null) {
                sum += head.val;
                head = head.next;
            }
            
            // check if the sum is less than the input number
            if (sum > this.num) {
                this.isAbundantNumber = true;
            }
        }
        
        private ListNode getPropDivisors() {
            ListNode head = new ListNode(0); // Dummy node
            ListNode current = head;
            
            // get all of the proper divisors
            for (int i = 2; i < this.num; ++i) {                
                if (this.num % i == 0) {
                    current.next = new ListNode(i); // connect the new node
                    current = current.next;         // move pointer forward
                }
            }
            
            return head.next; // actual head
        }
    }
    
    // leetcode single linked list impl
    public static class ListNode {
        int val;
        ListNode next;
        
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
