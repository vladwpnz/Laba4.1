public class Palindrome {

    public static boolean isPalindrome(String word) {
       
        word = word.toLowerCase();

       
        word = word.replaceAll(" ", "");

        
        return word.charAt(0) == word.charAt(word.length() - 1);
    }

    public static void main(String[] args) {
        String word = "ШАЛАШ";

        if (isPalindrome(word)) {
            System.out.println("Слово " + word + " є палиндромом");
        } else {
            System.out.println("Слово " + word + " не є палиндромом");
        }
    }
}
