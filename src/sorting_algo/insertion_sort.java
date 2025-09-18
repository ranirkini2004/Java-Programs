package sorting_algo;

public class insertion_sort {
    public static void main(String[] args) {
        int[] a = {4, 1, 3, 7, 9};
        int i = 1;
        int j = i - 1;
        while (j<=i) {
            int temp = a[j];
            if (a[j] > a[i]) {
                a[j + 1] = a[j];
            }

        }
    }
}
