package array;

import java.util.Arrays;

public class occurence_of_largest_ele {
    public static void main(String[] args) {
        int[] a={6,5,3,2,8,8,8,7};
//        int max=Integer.MIN_VALUE;
//        for(int i=0;i<a.length-1;i++){
//
//            if(a[i]>max){
//                max=a[i];
//            }
//        }
        int n=a.length;
        Arrays.sort(a);
        int max=a[n-1];
        int c=0;
        System.out.println(max);
        for(int i=0;i<a.length;i++){
            if(max==a[i]){
                c++;
            }
        }
        System.out.println(max+"->"+c);
    }
}
