import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Calculator {
    public static void main(String a[]) {
        String choice;
        int result;
        System.out.println("Enter the operation to be performed : \n Add \n Subtract \n Multiply \n Divide ");

        Scanner sc = new Scanner(System.in);
        choice = sc.nextLine();
        switch (choice.toLowerCase()) {
            case "add":
                result = add(sc);
                System.out.println("Result is : " + result);
                break;
            case "subtract":
                result = subtract(sc);
                System.out.println("Result is : " + result);
                break;
            case "multiply":
                result = multiply(sc);
                System.out.println("Result is : " + result);
                break;
            case "divide":
                result = divide(sc);
                System.out.println("Result is : " + result);
                break;
        }

        // Calculator obj = new Calculator();

    }

    public static int add(Scanner sc) {
        int num1, num2;
        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();
        return (num1 + num2);
    }

    public static int subtract(Scanner sc) {
        int num1, num2;
        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();
        return (num1 - num2);
    }

    public static int multiply(Scanner sc) {
        int num1, num2;
        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();
        return (num1 * num2);
    }

    public static int divide(Scanner sc) {
        int num1, num2;
        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();
        return (num1 / num2);
    }
}
