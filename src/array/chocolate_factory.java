package array;
import java.util.* ;

public class chocolate_factory {
    public static void main(String[] args) {
           int[] arr={4,2,3};
           int t=0;
           int sum=0;
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           while(arr[n]>0){
               for(int i=0;i<arr.length;i++){
                   arr[i]-=1;
                   t+=1;
               }
           }
           for(int i=0;i<arr.length;i++){
               System.out.println(arr[i]);
           }
    }
}
