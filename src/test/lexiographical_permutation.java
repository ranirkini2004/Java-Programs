package test;

import java.util.Arrays;

public class lexiographical_permutation {
    public static void main(String[] args) {
        int[] a={2,4,1,7,5,0};
        int n=a.length;
        int i;
        for(i=n-1;i>=0;i++){
            int min=0,max=0;
            if(a[i]>a[i-1]){
                min=a[i];
            }
            int j=n-1;
            if(a[i]<a[j--]){
                max=a[j];
            }
            int temp=min;
            min=max;
            max=temp;
        }
        int last=a[n-1];
        for(int k=n-1;k>=i+1;k--){
          a[k-1]=a[k];
        }
        a[i+1]=last;

        System.out.println(Arrays.toString(a));
    }
}
