import java.util.Scanner;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "CP866");
        System.out.print("Введите первую строку: ");
        String a = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String b = scanner.nextLine();
        System.out.print(a.equals(b) ? "Строки идентичны" : "Строки неидентичны");
    }
}