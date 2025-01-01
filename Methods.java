import java.util.Scanner;

public class Methods {

    public static int CaluSimpleInterest( Scanner sc){
        System.out.print("Enter the principal amount : ");
        int principal = sc.nextInt();
        System.out.print("Enter the rate of interest : ");
        int rate = sc.nextInt();
        System.out.print("Enter the time period in year : ");
        int time = sc.nextInt();
        
        int simpleInterest = (principal * rate * time) / 100;
        return simpleInterest ;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int interest = CaluSimpleInterest(sc);
        System.out.println("Simple Interest is : "+interest);
    }
}
