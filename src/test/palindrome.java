package test;

public class palindrome {
    public static void main(String[] args) {
        String s1="ygxk";
        String s2="gxpl";
        String s3="";
        int n=s1.length();
        int count=0;

        for(int i=s2.length()-1;i>=0;i--){
            s3+=s2.charAt(i);
        }
        char[] s4=s1.toCharArray();
        char[] s5=s3.toCharArray();

        for(int i=0;i<n;i++){
            if(s4[i]!=s5[i]){
                count++;
            }
        }

        //System.out.println(s3);
        System.out.println("STEPS:"+count);
    }
}
