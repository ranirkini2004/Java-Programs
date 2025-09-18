package programs;

public class alternate_sum {
    public static void main(String[] args){
        int num=1234;
        int r;
        boolean flag=true;
        int sum1=0,sum2=0;
        while(num!=0){
            r=num%10;
            if(flag){
                sum1+=r;
                flag=false;
            }
            else{
                sum2+=r;
            }
            num/=10;
        }
        System.out.println(sum1+" "+sum2);

    }
}
