package programs;

public class reverse {
    public static void main(String[] args){
        int n=12345;
        int r;
        int rev=0;
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        System.out.println(rev);
    }
}
