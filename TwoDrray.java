import java.util.Scanner;

public class TwoDrray{

    public static void main(String args[]){
        int arr[][] , i, j, m, temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of matrix: ");
        m = sc.nextInt();

        arr = new int[m][m];

        System.out.print("Enter matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(arr);
    }
}
