package array;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] a={1,2,3,4,7};
        int n=a.length-1;
        for(int i=0;i<=n/2;i++){
            int temp=a[i];
            a[i]=a[n-i];
            a[n-i]=temp;

        }
        System.out.println(Arrays.toString(a));
    }
}
