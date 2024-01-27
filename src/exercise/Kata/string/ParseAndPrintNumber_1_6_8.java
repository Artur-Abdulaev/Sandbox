package exercise.Kata.string;

public class ParseAndPrintNumber_1_6_8 {
    public static void main(String[] args) {
        parseAndPrintNumber("64");
        parseAndPrintNumber("111");
    }

    public static void parseAndPrintNumber (String number) {
        System.out.println(Integer.parseInt(number)/2);
    }
}
