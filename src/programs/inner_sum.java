package programs;

public class inner_sum {
    public static void main(String[] args){
        int n=3971;
        int r;
        int sum=0;
        n/=10;
        method2(n);
        while(n!=0){
            r=n%10;
            n/=10;
            if(n!=0){
                sum+=r;
            }
        }
        System.out.println(sum);
    }
    public static void method2(int n){
        int dig;
        int sum=0;
        while(n>9){
            dig=n%10;
            sum+=dig;
            n/=10;
        }
        System.out.println(sum);
    }


}
