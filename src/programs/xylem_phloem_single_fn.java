package programs;

public class xylem_phloem_single_fn {
    public static void main(String[] args){
        int n=1234;
        int last=n%10;
        int num=n/10;
        int sum=0;
        int r=0;
        while(num!=0){
            r=num%10;
            sum+=r;
            num/=10;
        }
        int inner=sum-r;
        int outer=last+r;
        if(inner==outer){
            System.out.println("Xylem");
        }
        else{
            System.out.println("Phloem");
        }
    }
}
