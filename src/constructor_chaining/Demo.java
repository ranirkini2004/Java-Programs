package constructor_chaining;

public class Demo {

    Demo(int a,int b){
        this();
        System.out.println(a+"->"+b);
    }

    Demo(){
        this(100,200,300);
        System.out.println("Hello");
    }

    Demo(int a,int b,int c){
        System.out.println(a+"->"+b+"->"+c);
    }
    Demo(int a){
        this(100,200);
        System.out.println(a);
    }
}
