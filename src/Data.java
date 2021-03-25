import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Data {
    String data;

    Data(String data) {
        data = "";
    }

    public void setData(String text) {
        Pattern pattern3 = Pattern.compile("\\b((0[1-9])|([1-2][0-9])|(3[0-1]))\\.((0[1-9])|(1[0-2]))\\.(202[1-9]{1})");
        Matcher matcher3 = pattern3.matcher(text);
        int count = 0;

        while (matcher3.find()) {
            int start = matcher3.start();
            int end = matcher3.end();
            data = text.substring(start, end);//это параметр конструктора Mail, String ставить не нужно
            count++;
        }
        if (count == 0) {
            System.out.println("В введенном тексте не указана дата, либо она указана в неверном формате");
        }
    }

    public String getData() {
        return data;
    }
}
