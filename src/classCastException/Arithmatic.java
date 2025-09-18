package classCastException;

import java.sql.SQLOutput;

public class Arithmatic {
    public static void main(String[] args) {
        int a=3;
        int b=0;


        System.out.println("hello");
        System.out.println("bye");
        System.out.println("welcome");
        try{
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("Division by zero error");
        }
        System.out.println("hello world");
        System.out.println("***********");
    }
}
