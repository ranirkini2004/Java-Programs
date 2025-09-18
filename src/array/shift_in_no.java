package array;

import java.util.Arrays;

public class shift_in_no {
    public static void main(String[] args) {
        int[] a={4,1,-9,2,-1,0,-3,0};
        int[] b=new int[a.length];
        int j=0;
        for(int arr:a){
            if(arr>0){
                b[j]=arr;
                j++;
            }
        }
        for(int arr:a){
            if(arr==0){
                b[j]=arr;
                j++;
            }
        }
        for(int arr:a){
            if(arr<0){
                b[j]=arr;
                j++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
