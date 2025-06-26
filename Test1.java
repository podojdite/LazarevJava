import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        System.out.print("Результат сравнения: ");
        System.out.println(((a > b) ? "a > b" : (a < b) ? "a < b" : "a = b"));
        System.out.printf("a + b = %d,\na - b = %d,\na / b = %d,\na * b = %d", a + b, a - b, a / b, a * b);
    }
}