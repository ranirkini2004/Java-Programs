package array;

public class reverse_a_string {
    public static void main(String[] args) {
        String s="hello";
        char ch;
        String rev=" ";
        for(int i=s.length()-1;i>=0;i--){
            ch=s.charAt(i);
            rev=rev+ch;
        }
        System.out.println(rev);
        if(s.equals(rev)){
            System.out.println("True");
        }
    }
}
