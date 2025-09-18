package array;

public class prime_factors_of_each_element {
    public static void main(String[] args) {
        int[] a={8,11,12,7,5,4,9,10};
        for(int i=0;i<a.length;i++){
            int ele=a[i];
            System.out.print(ele+": " );
            for(int j=1;j<ele;j++){
                if(ele%j==0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
