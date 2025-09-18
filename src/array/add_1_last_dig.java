package array;

import java.util.Arrays;

public class add_1_last_dig {
    public static void main(String[] args) {

//        int[] arr={1,0,9};
//        //int[] result=add_one(arr);
//        System.out.println("Array is"+result.toString());
//
//
//
//    }
//    public static int add_one(int[] digits){
//        for(int i=digits.length-1;i>=0;i--){
//            if(digits[i]<9){
//                digits[i]++;
//                return digits[i];
//            }
//            digits[i]=0;
//        }
//        int[] result=new int[digits.length+1];
//
//    }
        int[] a={1,2,4};
        int c=0;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]==9){
                a[i]=0;
                c=1;
            }else{
               a[i]+=1;
               c=0;
               break;
            }
        }
        if(c==1){
            int[] a2=new int[a.length+1];
            a2[0]=1;
            int j=1;
            for(int i=0;i<a.length;i++){
                a2[j++]=a[i];
            }
            a=a2;

        }
        System.out.println(Arrays.toString(a));

    }
}
