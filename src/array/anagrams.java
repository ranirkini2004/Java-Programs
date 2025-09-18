package array;

import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String s1="care";
        String s2="race";

        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        String s3=new String(a);
        String s4=new String(b);

        if(s3.equalsIgnoreCase(s4)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an Anagram");
        }

    }
}
