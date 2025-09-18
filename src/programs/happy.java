package programs;

public class happy {
    public static void main(String[] args){
        int n=2025;
        int a;
        while(true) {
            a = happy(n);
            if (a == 1) {
                System.out.println("Happy");
                break;
            } else if (a == 4) {
                System.out.println("Sad");
                break;
            }else{
                n=a;
            }
        }

    }

    public static int happy(int num){
        int r,sum=0;
        while(num!=0){
            r=num%10;
            sum+=Math.pow(r,2);
            num/=10;
        }
        return sum;
    }
}
