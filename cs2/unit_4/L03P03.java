// Store the following in a string. "JavaScript is a powerful programming language.  There are many built in functions and classes in JavaScript that allow programmers to perform tasks easily." Then, output the string with JavaScript being replaced by Java.  


public class L03P03 {
    public static void main(String[] args) {
        String phrase = "JavaScript is a powerful programming language. There are many built in functions and classes in JavaScript that allow programmers to perform tasks easily.";
        
        // 't' is the last char  in javascript
        String newPhrase = "Java" + phrase.substring(phrase.indexOf('t') + 1);
        System.out.println(newPhrase);
    }
}