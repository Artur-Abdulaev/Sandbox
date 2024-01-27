package exercise.SkillFactory.OOP.Module_8.Task_8_3_1_Coolprinter;

import java.util.ArrayList;

public class CoolPrinter {

    public static String testString = "";
    private static ArrayList<String> lines = new ArrayList<String>();

    public static void add(String line) {
        lines.add(line);
    }

    public static void print(Formatter formatter) {
        if (!testString.equals(""))
            System.out.println(testString);

        if (formatter == null) {
            print();
            return;
        }
        for (String line : lines) {
            System.out.println(formatter.format(line));
        }
        if (!formatter.getClass().isAnonymousClass()) {
            System.out.println("BUT FORMATTER'S CLASS IS NOT ANONIMOUS...");
        }
    }



    public static void clear() {
        lines.clear();
    }
    public static void print() {
        System.out.println("No formatter - no print!");
    }
}
