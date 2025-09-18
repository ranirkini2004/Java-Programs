package array;

import java.util.Arrays;

//store even prime numbers
//{6,3,14,13,12,65}
public class even_prime {
    public static void main(String[] args) {
        int[] a={3,1,5,8,4,6,2};
        int c=0;
        int element;
        for(int i=0;i<a.length;i++){
            boolean isPrime=true;
            element=a[i];
            if(a[i]<=1){
                isPrime=false;
            }
            if(a[i]==2){
                isPrime=true;
            }
            for(int j=2;j<=Math.sqrt(element);j++){
                if(element%j==0){
                    isPrime=false;

                }
                if(isPrime){
                    if(element%2==0){
                        c++;
                    }
                }
            }
        }
        int k=0;
        int[] b=new int[c];
        for(int i=0;i<a.length;i++){
            boolean isPrime=true;
            element=a[i];
            for(int j=2;j<=Math.sqrt(element);j++){
                if(element%j==0){
                    isPrime=false;

                }
                if(isPrime){
                    if(element%2==0){
                        b[k++]=element;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(b));
//        System.out.println(c);

    }
}
