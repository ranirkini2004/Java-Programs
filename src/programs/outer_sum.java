package programs;

public class outer_sum {
    public static void main(String[] args) {
        //int sum=0;
        int num = 3921;
        int first=0;
        int last = num % 10;
        while (num != 0) {
            first = num % 10;
            num /= 10;
        }
        System.out.println(first+last);
    }
}
