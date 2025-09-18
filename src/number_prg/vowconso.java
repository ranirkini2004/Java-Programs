package number_prg;

import java.util.*;
public class vowconso {
    public static void main(String[] args){
//        char letter='m';
//        if(letter=='a' || letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A' || letter=='E'||letter=='I'||letter=='O'||letter=='U'){
//            System.out.println("It is a vowel");
//        }
//        else{
//            System.out.println("It is a consonent");
//        }
//        int n,op;
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        n=sc.nextInt();
//        op=n;
//
//        switch(op){
//            case 1: System.out.println("one");
//                    break;
//            case 2: System.out.println("two");
//                break;
//            case 3: System.out.println("three");
//                break;
//            case 4: System.out.println("four");
//                break;
//            case 5: System.out.println("five");
//                break;
//            default: System.out.println("Invalid Choice");
//        }

        String word="Rani";
        String Manvi="";
        for(int i=word.length()-1;i>=0;i--){
            Manvi+=word.charAt(i);

        }
        System.out.println(Manvi);
   }
}
