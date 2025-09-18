package programs;

public class fibonacci_number {
    public static void main(String[] args){
        int n=7;
        if(isPerfectSq(5*(n*n)+4)||isPerfectSq(5*(n*n)-4)){
            System.out.println("It is a fibonacci number");
        }else{
            System.out.println("It is not a fibonacci number");
        }
    }
    public static boolean isPerfectSq(int n){
        int sqrt=(int)Math.sqrt(n);
        if(n==sqrt*sqrt){
            return true;
        }else{
            return false;
        }
    }
}
