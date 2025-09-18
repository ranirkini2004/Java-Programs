package array;

public class rotate_char_left {
    public static void main(String[] args) {
        String s1 = "abcd";

        char[] a = s1.toCharArray();
        int n = a.length;
        int n1 = 3;
        for(int j=0;j<n1;j++) {
            char first = a[0];
            for (int i = 0; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            a[n - 1] = first;

            String str = String.valueOf(a);
            System.out.println(str);

        }

    }
}
