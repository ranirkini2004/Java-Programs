package modifier;

public class Demo {
    private static int a=10;
    static int b=20;
    public Demo(){
        System.out.println("Hello world");
    }
    public static void add(){
        System.out.println("Hi");
    }
    public void demo(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(Demo.a);
        Demo.add();
        d.demo();
    }
}
