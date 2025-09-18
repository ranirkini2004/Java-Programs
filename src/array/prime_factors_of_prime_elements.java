package array;

public class prime_factors_of_prime_elements {
    public static void main(String[] args) {
        int[] a={8,11,12,7,5,4,9,10};
        for(int i=0;i<a.length;i++){
            boolean isPrime=true;
            int ele=a[i];
            for(int j=2;j<=Math.sqrt(ele);j++){
               if(ele%j==0){
                   isPrime=false;
               }
           }
            if(isPrime){
                System.out.print(ele+":");
                for(int k=1;k<ele;k++){
                    if(ele%k==0){
                        System.out.print(k+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
