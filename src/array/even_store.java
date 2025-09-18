package array;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class even_store {
    public static void main(String[] args) {
        int c=0;
        int[] a={5,3,-6,2,12,8,9};
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                c++;
            }
        }
        int[] b=new int[c];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                b[j++]=a[i];
            }
        }
       System.out.println(Arrays.toString(b));
    }
}
