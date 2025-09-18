package array;

public class occurances_number {
    public static void main(String[] args) {
        int[] a={10,2,10,2,10,1,10,3,5,1,10};
        boolean visited=false;
        for(int i=0;i<a.length;i++){
            int c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=Integer.MAX_VALUE;

                }
            }

            if(a[i]!=Integer.MAX_VALUE){
                System.out.println(a[i]+"->"+c);
            }
        }
    }
}
