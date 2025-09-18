package test;

public class character_replacement {
    public static void main(String[] args) {
        String s="dslcoeet";
        int n=s.length();
        char[] s1=s.toCharArray();
        char[] s2=new char[n];

        int k = 0;
        for (int i = 0; i < n / 2; i++) {
            s2[k++] = s1[i];           // first half
            s2[k++] = s1[i + n / 2];   // second half
        }

        for(int j=0;j<s2.length;j++){
            System.out.print(s2[j]+"");
        }
    }
}
