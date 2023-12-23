import java.util.Scanner;

public class Main {
    public static final String NUM_TEST = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    public static void main(String[] args) {
        //todo Numbers

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String number = scanner.nextLine().trim();
        number = number.replaceAll("\\D+", " ");

       if(number.length() == 11){
           number =number.replaceAll("(\\d)" + NUM_TEST, "+7 ($2) $3 $4-S5");
           System.out.println(number);
        } else if (number.length() == 10) {
           number = number.replaceAll(NUM_TEST, "+7 ($1) $2 $3-$4");
           System.out.println(number);
       } else {
           System.out.println("Не верный номер");
       }
    }
}