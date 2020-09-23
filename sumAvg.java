import java.util.Scanner;
public class sumAvg {
    public static void main(String[] args)
    {
        int n, sum = 0;
        float average;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = scan.nextInt();
        int[] a = new int[n]; //declaring array of n elements
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = scan.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);
    }
}


