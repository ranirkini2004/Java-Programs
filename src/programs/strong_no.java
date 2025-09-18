package programs;

public class strong_no {
    public static void main(String[] args) {
        //int n = 145;

        int r;

        for (int i = 1; i <=200; i++) {
            int temp = i;
            int sum = 0;
            while (temp != 0) {
                r = temp % 10;
                sum += factorial(r);
                temp /= 10;
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
    }
    public static int factorial(int n){
        if(n==0||n==1){
            return n;
        }else{
            return n*factorial(n-1);
        }
    }


}
