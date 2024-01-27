package exercise.Kata.string;

public class Regex_isGmailOrOutlook_1_6_10 {
    public static void main(String[] args) {
        System.out.println(isGmailOrOutlook("kata12@gmail.com"));
        System.out.println(isGmailOrOutlook("@outlook.com"));
    }

    public static boolean isGmailOrOutlook(String email) {
        String patternt = "[.\\-_a-z0-9]+@([a-z0-9][\\-a-z0-9]+\\.)+[a-z]{2,6}";
        return email.matches(patternt);

    }

}
