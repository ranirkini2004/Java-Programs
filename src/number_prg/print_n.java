package number_prg;

public class print_n {
    public static void main(String[] args){
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
            sum+=i;
        }
        System.out.println(" ");
        System.out.print(sum);
    }
}
