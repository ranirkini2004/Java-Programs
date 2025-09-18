package array;
import java.util.*;

public class largest_ele{
    public static void main(String[] args) {
        int n;
        int max=0;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        for(int i=1;i<n;i++){

            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
