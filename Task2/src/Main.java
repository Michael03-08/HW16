import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //todo  код
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(workText(text));

    }
    //todo метод
    public static String workText(String text){
        text = text.replaceAll("[.,;:'+_&?!@#%-]"," ");
        return text.replaceAll("\\s+", "\n");
    }
}