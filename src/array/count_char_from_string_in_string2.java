package array;

public class count_char_from_string_in_string2 {
    public static void main(String[] args) {
        String s1="aaAAb";
        String s2= "aAAbbb";
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();

        for(int i=0;i<a.length;i++) {
            boolean flag=true;
            int k = i - 1;
            while (k >= 0) {
                if (a[i] == a[k] ) {
                    flag = false;
                    break;
                }
                k--;
            }
            if (flag) {
                int c = 0;
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        c++;
                        b[j] = Character.MAX_VALUE;
                    }

                }
//            a[i]=Character.MAX_VALUE;
                if (a[i] != Character.MAX_VALUE) {
                    System.out.println(a[i] + "->" + c);
                }
            }
        }

    }
}
