package exercise.Kata.string;

public class CheckPalindrome_1_6_9 {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Was it a cat I saw?"));
        System.out.println(isPalindrome("A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801"));
    }

    public static boolean isPalindrome (String text) {

        String str =  text.replaceAll("[^a-zA-Z0-9]",""), reverse = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reverse = ch + reverse;
        }

        return reverse.equalsIgnoreCase(str);
    }
}
