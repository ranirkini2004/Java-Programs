package programs;

public class fibonacci_number_c2 {
    public static void main(String[] args){
        int sum=0;
        int n1=0,n2=1;
        boolean flag=false;
        //boolean flag=false;
        int target=7;
        while(n1<=target){
            if(n1==target){
                //System.out.println("Fibonacci number");
                flag=true;
                break;
            }
            else{
                sum=n1+n2;
                n1=n2;
                n2=sum;
            }
        }
        if(flag){
            System.out.println("Fibonacci number");
        }else{
            System.out.println("Not a fibonacci number");
        }
    }
}
