package method_shadowing;

public class mainclass {
    static int a=10;
//    static int b=10;
    public static void add(){
        System.out.println("super");
    }
}
class demo extends mainclass{
    static int a=67;
//    static int b=68;
    public static void add(){
        System.out.println("subclass");
    }
}

