package sorting_algo;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        //int[] a={4,1,3,7,9};
        int[] a={1,4,5,6,7,9};
        int n=a.length;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]=a[j]-a[j+1];
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
