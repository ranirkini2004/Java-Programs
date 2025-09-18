package programs;

public class factors_count {
    public static void main(String[] args){
        int n=6;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
        System.out.println("Number of factors:"+count);
    }
}
