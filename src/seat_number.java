import java.util.Arrays;

public class seat_number {
    public static void main(String[] args) {
        int[] a=new int[11];
        int n=a.length;
//        for(int i=0;i<a.length;i++){
//            a[i]=0;
//        }

        a[3]=70;
        a[4]=100;
        a[7]=20;
        System.out.println(Arrays.toString(a));
        int j=1;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                System.out.println(j+"->"+i);
                j++;
            }
        }
    }
}
