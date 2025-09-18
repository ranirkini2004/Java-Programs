package programs;

public class power_each_dig {
    public static void main(String[] args) {
        int exp=3;
        int n=123;
        int r;
        int pow;
        while(n!=0){
            r=n%10;
            pow= (int) Math.pow(r,exp);
            System.out.print(pow+" ");
            n/=10;
        }
    }
}