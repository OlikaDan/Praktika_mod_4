import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {
    public String mail;

    Mail(String mail) {
        mail = "";
    }

    public void setMail(String text) {
        /*эл.адрес может содержать буквы и цифры, а также знаки: "-","_" и ".".
        Если стоит такой знак, после него должна быть минимум одна буква. В данной проверке допускается до трех небуквенных знаков*/
        Pattern pattern2 = Pattern.compile("([a-z\\d]+[\\.\\-_]*[a-z\\d]*[\\.\\-_]?[a-z\\d]*[\\.\\-_]?[a-z\\d]+)@[a-z]*\\.[a-z]");
        Matcher matcher2 = pattern2.matcher(text);
        int count = 0;

        while (matcher2.find()) {
            int start = matcher2.start();
            int end = matcher2.end();
            mail = text.substring(start, end + 1);//это параметр конструктора Mail, String ставить не нужно
            count++;
        }
        if (count == 0) {
            System.out.println("В введенном тексте не указан e-mail, либо он указан в неверном формате");
        }
    }

    public String getMail() {
        return mail;
    }
}
