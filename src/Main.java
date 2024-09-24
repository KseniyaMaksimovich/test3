import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int num1 = scanner.nextInt();

        System.out.println("Введите второеe число");
        int num2 = scanner.nextInt();

        System.out.println("Введите операцию");
        String operation = scanner.nextLine();
        operation = scanner.nextLine();
        switch (operation) {
            case "+":
                System.out.println("Результат сложения : " + (num1 + num2));
                break;
            case "-":
                System.out.println("Результат вычитания : " + (num1 - num2));
                break;
            case "*":
                System.out.println("Результат умножени : " + (num1 * num2));
                break;
            case "/":
                System.out.println("Результат деления : " + (num1 / num2));
                break;
            default:
            System.out.println("Введена неверная операция");
        }
        scanner.close();


    }
}
