package programs;

public class fibonacci {
    public static void main(String[] args){
        int n=10;
        //System.out.println(fibonacci(n));
        for(int i=1;i<=n;i++){
            System.out.print(fibonacci(i)+" ");
        }
//        while(n>=0) {
//            System.out.println(fibonacci(n));
//            n--;
//        }
    }

    public static int fibonacci(int n){
        int no;
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }else{
            no= fibonacci(n-1)+fibonacci(n-2);
            return no;
        }


    }
}
