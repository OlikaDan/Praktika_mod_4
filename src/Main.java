import java.util.Scanner;

/*Ввести с клавиатуры текст в свободной форме, в котором присутствуют время (в формате чч:мм),
дата (в формате дд.мм.гггг) и адрес электронной почты. Задача: выполнить проверку корректности ввода времени,
даты и электронной почты, и вывести на экран фразу (как напоминалка в Календаре):
"дд.мм.гггг в чч:мм отправить письмо на e-mail xxxx@xxx." Программу реализовать с применением геттеров и сеттеров.*/

public class Main {
    public static String text;

    public static void main(String[] args) {
        System.out.printf("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Time time = new Time(text);
        time.setVremya(text);
        time.getVremya();
        Mail mail = new Mail(text);
        mail.setMail(text);
        mail.getMail();
        Data data = new Data(text);
        data.setData(text);
        data.getData();
        if ((time.getVremya() == null) && (mail.getMail() == null) && (data.getData() == null)) {
            System.out.println("Ни один из запрошенных параметров не указан");
        } else
            System.out.println(data.getData() + " в " + time.getVremya() + " необходимо отправить сообщение на е-мейл: " + mail.getMail());

    }
}

