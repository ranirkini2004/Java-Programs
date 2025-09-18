package programs;

public class palindrome {
    public static void main(String[] args){
        int num=123;
        int temp=num;
        int r;
        int rev=0;
        while(temp!=0){
            r=temp%10;
            rev=rev*10+r;
            temp/=10;
        }
        if(num==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
