package programs;

public class prime_composite {
    public static void main(String[] args){
        int n=26;
        boolean isPrime=false;
        if(n<=1){
            isPrime=false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=true;
                break;
            }
        }
        if(isPrime){
            System.out.println("Its Composite");
        }else{
            System.out.println("Its Prime");
        }
    }
}
