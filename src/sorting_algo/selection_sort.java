package sorting_algo;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        //int[] a={4,1,3,7,9};
        int[] a={1,4,5,6,7,9};
        int n=a.length;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    a[i]=a[i]+a[j];
                    a[j]=a[i]-a[j];
                    a[i]=a[i]-a[j];
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
