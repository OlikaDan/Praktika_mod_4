import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Time {
    public String time;

    Time(String time) {
        time = "";
    }

    public void setVremya(String text) {
        Pattern pattern1 = Pattern.compile("(([0-1]\\d|2[0-3]):[0-5]\\d)+");
        Matcher matcher1 = pattern1.matcher(text);
        int count = 0;

        while (matcher1.find()) {
            int start = matcher1.start();
            int end = matcher1.end();
            time = text.substring(start, end);//это параметр конструктора Time, String ставить не нужно
            count++;
        }
        if (count == 0) {
            System.out.println("В введенном тексте не указано время или оно указано в неверном формате");
        }
    }

    public String getVremya() {
        return time;
    }
}
