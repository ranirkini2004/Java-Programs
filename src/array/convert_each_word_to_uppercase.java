package array;

public class convert_each_word_to_uppercase {
    public static void main(String[] args) {
        String s="My name is Rohan";
        String[] s1=s.split(" ");
        for(int i=0;i<s1.length;i++){
            String str=s1[i];
            for(int j=0;j<s1.length;j++){
                char ch=str.charAt(j);
                if(j==0 && ch>='a' && ch<='z'){
                    int n=ch-32;
                    System.out.println((char)n);
                }else{
                    System.out.println(ch);
                }
            }
            System.out.print(" ");
        }
    }
}
