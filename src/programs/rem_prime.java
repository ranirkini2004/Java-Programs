package programs;

public class rem_prime {
    public static void main(String[] args) {
        int n = 25;
        int r;


        while (n != 0) {
            r = n % 10;
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(r);i++){
                if(r%i==0){
                    isPrime=false;
                    break;
                }

            }
            if(isPrime){
                System.out.println(r);
            }

            n/=10;
        }
    }
}
