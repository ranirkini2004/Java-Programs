package programs;

public class twisted_prime {
    public static void main(String[] args){
        boolean original=false;
        int rev=0;
        int num=12;
        int temp=num;
        int r;
        original=isPrime(num);
        if(original){
            while(temp!=0){
                r=temp%10;
                rev=rev*10+r;
                temp/=10;
            }
            if(original && isPrime(rev)){
                System.out.println("Twisted Prime");
            }
            else{
            System.out.println("Not Twisted Prime");
        }
        }else{
            System.out.println("It is not a Prime");
        }
    }
    
    public static boolean isPrime(int n){
        boolean prime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                 prime=false;
                 break;
            }
        }
        return prime;


    }
}
