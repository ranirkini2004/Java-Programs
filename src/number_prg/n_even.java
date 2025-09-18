package number_prg;

public class n_even {  //---1
    public static void main(String[] args){ //---1
        int n=1; //-----1
        while(n<=10){ //-----n+1
            if(n%2==0){ //--------n
                System.out.println(n);
            }
            n++; //-----n
        }
    }
}
