package searching_algorithms;

import java.sql.SQLOutput;

public class binarySearch {
    public static void main(String[] args) {
        int[] a={12,15,21,35,42,50};
        int n=a.length;
        int ele=22;
        int left=0;
        int mid;
        int right=n-1;
        while(left<=right){

            mid=(left+right)/2;

            if(a[mid]==ele){
                System.out.println(ele+" found");
                break;
            }else if(ele>a[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println("Element not found");

    }
}
