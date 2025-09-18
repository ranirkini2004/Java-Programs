package number_prg;

public class table {
    public static void main(String[] args){
        int n=3000;
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
        Lastdig(n);
    }

    public static void Lastdig(int n){
        int r=0;
        while(n!=0){
            r=n%10;
            System.out.println(r);
        }
    }
}
