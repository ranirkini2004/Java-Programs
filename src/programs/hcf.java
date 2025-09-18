package programs;

public class hcf {
    public static void main(String[] args){
        int num1=6, num2=8;
        //int a=1;

        int num=num1<num2?num1:num2;
        for(int i=num;i>=1;i--){
            if(num1%i==0 && num2%i==0){
                System.out.println(i);
                break;
            }
        }
        }
    }

