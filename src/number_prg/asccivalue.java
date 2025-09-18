package number_prg;

public class asccivalue {
    public static void main(String[] args) {
        char letter = 'A';
        do {
            int n=letter;
            System.out.println(letter+"="+n);
            letter++;
        } while (letter <= 'Z');
    }
}
