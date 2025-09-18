package array;
import java.util.*;

public class sum_prime{
    public static void main(String[] args) {
        int n,sum=0;
        int a,element;
        boolean isPrime=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            element=arr[i];
            if(element<=1){
                isPrime=false;
            }
            for(int j=2;j<Math.sqrt(element);j++){
                if(element%j==0){
                    isPrime=false;
                }
            }
            if(isPrime){
                sum+=element;
                System.out.print(element+" ");
            }

        }
        System.out.println();
        System.out.println("sum:"+sum);
        //System.out.println("Time complexity is O(n)");
    }
}
