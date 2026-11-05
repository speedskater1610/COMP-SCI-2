public class Problem12 {
    public static void main(String... args) {
        printLetterCount("Hello");
    }
    
    public static void printLetterCount(String word) {
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase(); /* Entire alphabet */
        word = word.toLowerCase();
        
        for (char i : alph.toCharArray()) {
            if (word.indexOf(i) != -1) {
                int count = 0;
                
                /* Increment count for every occurence of `i` in `word` */
                for (char j : word.toLowerCase().toCharArray())
                    if (i == j) ++count;
                
                System.out.printf("%c: %d\n", i, count);
            }
        }
    }
}
