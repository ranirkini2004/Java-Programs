package number_prg;
import java.util.Scanner;


public class extract_last_dig {
    public static void main(String[] arg){
        //write a java program to extract last digit from the given number.
        char size;
        int price;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size:");
        size=sc.next().charAt(0);
        System.out.println("Enter the number 2:");
        price=sc.nextInt();

        if(size=='s' && price<=1000){
            System.out.println("Tshirt is Available");
        }
        //System.out.println("Hii");
        else{
            System.out.println("Tshirt not Available");
        }

//        System.out.println("The remainder is: "+n%10);
//        System.out.println("The number after removing last digit: "+n/10);
//
//        System.out.println();


    }
}
