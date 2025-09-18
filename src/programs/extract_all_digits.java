package programs;

public class extract_all_digits {
    public static void main(String[] args) {
        int n = 3972;
        even_no(n);
        sum_dig(n);
        prod_odd_dig(n);
          spy_no();
        int r;
        int count = 0;
        System.out.print("Digits: ");
        while (n != 0) {
            r = n % 10;
            System.out.print(r + " ");
            n = n / 10;
            count++;
        }
        System.out.println(" ");
        System.out.println("No of digits=" + count);

    }

    public static void even_no(int n) {
        int temp = n;
        int rem;
        System.out.print("Even digits: ");
        while (temp != 0) {
            rem = temp % 10;
            if (rem % 2 == 0) {
                System.out.println(rem);
            }
            temp = temp / 10;
        }
    }

    public static void sum_dig(int n) {
        int temp = n;
        int re;
        int sum = 0;
        while (temp != 0) {
            re = temp % 10;
            sum += re;
            temp = temp / 10;
        }
        System.out.println("Sum:" + sum);
    }

    public static void prod_odd_dig(int n) {
        int temp = n;
        int remainder;
        int prod = 1;
        while (temp != 0) {
            remainder = temp % 10;
            if (remainder % 2 != 0) {
                prod *= remainder;
            }
            temp = temp / 10;
        }
        System.out.println("Product:" + prod);
    }

    public static void spy_no() {
        System.out.println("Spy numbers between 10 to 500:");
        for (int i = 10; i <500; i++) {
            int n=i;
            int remainder;
            int prod = 1;
            int sum = 0;
            while (n != 0) {
                remainder = n % 10;
                sum += remainder;
                prod *= remainder;
                n /= 10;
            }
            if (sum == prod) {
                System.out.println(i);
            }

        }

    }
}
