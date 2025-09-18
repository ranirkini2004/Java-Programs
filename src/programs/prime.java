package programs;

public class prime {
    public static void main(String[] args) {
        int n=6;
        boolean isPrime=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not a prime");
        }
    }
}
