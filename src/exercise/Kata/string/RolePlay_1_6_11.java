package exercise.Kata.string;

public class RolePlay_1_6_11 {
    public static void main(String[] args) {
        String[] roles = new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука", "Лука Лукич"};
        String[] textLines = new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор."
                , "Аммос Федорович: Как ревизор?"
                , "Артемий Филиппович: Как ревизор?"
                , "Лука: Тра ля ля, тарам-парам"
                , "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем."
                , "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!"
                , "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));

    }

    public static String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder text = new StringBuilder();
        for (String role : roles) {
            text.append(role).append(":").append(System.lineSeparator());
            int count = 0;
            for (String textLine : textLines) {
                count++;
                if (textLine.startsWith(role + ":")) {
                    text.append(count).append(") ").append(textLine.substring(textLine.indexOf(":") + 2)).
                            append(System.lineSeparator());
                }
            }
            text.append(System.lineSeparator());
        }

        return text.toString();
    }
}
