package array;
import java.util.*;

public class prime_elements{
    public static void main(String[] args) {
        int n;
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
        for(int i=1;i<n;i++){
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
                System.out.println(arr[i]);
            }
        }
        //System.out.println("Time complexity is O(n)");
    }
}
