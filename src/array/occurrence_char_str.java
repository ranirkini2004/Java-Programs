package array;

import java.util.Arrays;

public class occurrence_char_str {
    public static void main(String[] args) {
        String s="Hello";
        char[] s1= s.toCharArray();
        for(int i=0;i<s1.length;i++){
            int c=1;
            for(int j=i+1;j<s1.length;j++){
                if(s1[i]==s1[j]){
                    c++;
                    s1[j]=Character.MAX_VALUE;
                }

            }
            if(s1[i]!=Character.MAX_VALUE){
                System.out.println(s1[i]+"->"+c);
            }

        }

    }
}
