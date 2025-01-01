import java.util.Scanner;

public class MethodOverloading {

    // Palindrom Number along with method overloading
    // moding by 10 or dividing by 10 returns the number last value

    public int Ispalindrome(int n) {
        int temp = n;
        int sum = 0;
        // int rem = 0;
        while (n != 0) {
            int rem = n % 10; // 123 returns the last digit 3
            sum = sum * 10 + rem; // returns 0*10+3 = 3 next time 3*10 + 2 = 32
            n = n / 10; // returns 123 / 10 = 12 ,
        }
        if (temp == sum) {
            return 1;
        } else {
            return 0;
        }
    }

    public int Ispalindrome(String n) {
        String temp = n;
        String sum = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            sum = sum + n.charAt(i);
        }
        if (temp.equals(sum)) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check palindrome : ");
        int n = sc.nextInt();

        MethodOverloading obj = new MethodOverloading();
        int res = obj.Ispalindrome(n);
        if (res == 1) {
            System.out.println(n + " is a palindrome number");
        } else {
            System.out.println(n + " is not a palindrome number");
        }

        // Handle String
        sc.nextLine();
        System.out.print("Enter string to check palindrome : ");
        String str = sc.nextLine();
        int res1 = obj.Ispalindrome(str);
        if (res1 == 1) {
            System.out.println(str + " is a palindrome string");
        } else {
            System.out.println(str + " is not a palindrome string");
        }
        sc.close();
    }
}
