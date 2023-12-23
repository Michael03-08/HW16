import java.util.Scanner;

public class Main {
    static  private final String VALID_CHAR = "([А-я]+\\s){2}([А-я]+)";
    public static void main(String[] args) {
        //todo ФИО
        System.out.print("Введите ФИО: ");
        String name = new Scanner(System.in).nextLine().trim();

        if (name.matches(VALID_CHAR)){
            System.out.println("Фамилия: " + name.substring(0, name.indexOf(' ')) + "\nИмя: " +
                    name.substring(name.indexOf(' '), name.lastIndexOf(' ')) + "\nОтчество: "
                    + name.substring(name.lastIndexOf(' ')).trim());
        }else {
            System.out.println("Введенная строка не является ФИО");
        }
    }
}