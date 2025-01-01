import java.util.Scanner;

public class Loops {
    public static void main(String args[]){
        int arr[] = { 1 , 2 , 3 , 4 ,5 , 6, 7 , 8 ,9};
        int len = arr.length;
        int sum = 0 ;
        for(int i = 0 ; i< len ; i++){
            for(int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Fibnoaacci series using while loop
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        int n3 = sc.nextInt();
        int a=1 , b =1 , c = 0 ;
        while (a <= n3) {

            a=b+c;
            if(a > n3 ){
                break;
            }
            b=c;
            c=a ;
            System.out.print(a+" ");
            
        }

    }
}
