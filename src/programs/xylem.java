package programs;

public class xylem {
    public static void main(String[] args){
        int inner,outer;
        int n=1234;
        int last = n%10;
        int num=n/10;
        outer=outer_dig(n,last);
        inner=inner_dig(num);

        if(inner==outer){
            System.out.println("Xylem");
        }
        else{
            System.out.println("Phloem");
        }
    }
    public static int outer_dig(int n,int last){
        int first=0;
        int sum=0;


        while(n!=0){
            first=n%10;
            n/=10;
        }
        sum=first+last;
        return sum;
    }
    public static int inner_dig(int n){
        int r,add=0;
        while(n>9){
            r=n%10;
            add+=r;
            n/=10;
        }
        return add;
    }
}
