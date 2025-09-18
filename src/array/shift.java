package array;

public class shift {
    public static void main(String[] args) {
        int[] a = {-5, 6, -8, 7, 10, -11, -12, 2};
        int[] b = new int[8];
        int c=0;
        int m;

        int j = 0;
        for (int i = 0; i < a.length; i++) {
            //for(int j=0;j<a.length;j++){
            if (a[i] < 0) {
                b[j++] = a[i];

            }
        }

        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                b[j++]=a[i];
            }
        }

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}

