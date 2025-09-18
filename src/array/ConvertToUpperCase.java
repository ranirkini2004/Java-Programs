package array;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        String s="apple";
        //System.out.println(s.toUpperCase());
        //System.out.println(s);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int n=ch-32;
            System.out.print((char)n);
        }
    }
}
