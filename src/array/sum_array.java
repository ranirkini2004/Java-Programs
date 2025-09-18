package array;
import java.util.*;

public class sum_array{
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Sum:");
        for(int i=0;i<n;i++) {
            sum+=arr[i];
        }
        System.out.print(sum);
        //System.out.println("Time complexity is O(n)");
    }
}
