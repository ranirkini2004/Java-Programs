package programs;

public class power_without_inbuilt {
    public static void main(String[] args) {
        int base=2,exp=3;
        int pow=1;
        for(int i=1;i<=exp;i++){
            pow=pow*base;
        }
        System.out.println(pow);
    }
}
