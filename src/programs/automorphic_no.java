package programs;

public class automorphic_no {
    public static void main(String[] args){
        int n=25;
        int u=10;
        int n2=n*n;
        int n3=n2;
        int r;
        boolean flag=false;
        while(n3!=0){
            r=n2%u;
            if(n==r){
                flag=true;
                break;
            }
            u*=10;
            n3/=10;
        }
        if(flag){
            System.out.println("Automorphic");
        }else{
            System.out.println("Not automorphic");
        }
    }
}
