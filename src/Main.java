import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи зарплату сотрдников: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > c && b > a) {
            max = b;
        } else {
            max = c;
        }
        int min;
        if (a < b && a < c) {
            min = a;
        } else if (b < c && b < a) {
            min = b;
        } else {
            min = c;
        }
        int salary;
        salary = max - min;

        System.out.println("наибольшее число: " + salary);

    }
}