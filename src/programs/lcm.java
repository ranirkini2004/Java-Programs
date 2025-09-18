package programs;

public class lcm {
    public static void main(String[] args) {
        int num1 = 12, num2 = 16;
        boolean found = false;
        int LCM = 0;
        int i = 2;

        int num = num1 > num2 ? num1 : num2;
        int large=num;
        while (!found) {
            //large = num;
            if (num % num1 == 0 && num % num2 == 0) {
                LCM = num;
                System.out.println(LCM);
                break;
            }
            num = num +large;
            i++;


        }

    }
}
