import java.util.Scanner;

public class Main {

    static private final String VALID_LINE = "\\+\\d{11}";
    public static void main(String[] args) {
        //todo Numbers

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String number = scanner.nextLine().trim();

       if(number.matches(VALID_LINE)){
           System.out.println(number);
        }else {
           System.out.println("Не верный номер");
       }
    }
}