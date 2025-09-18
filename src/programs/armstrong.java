package programs;

public class armstrong {
    public static void main(String[] args){
        int num=153;
        int dig=0,sum=0;
        int temp=num;
        while(temp!=0){
            temp/=10;
            dig++;
        }
        int temp1=num;
        while(temp1!=0){
            int digit=temp1%10;
            sum+=Math.pow(digit,dig);
            temp1/=10;
        }
        if(num==sum){
            System.out.println("It is an armstrong number");
        }else{
            System.out.println("It is not an armstrong number");
        }
    }
}
