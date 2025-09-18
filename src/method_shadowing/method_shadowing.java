package method_shadowing;



public class method_shadowing {
    public static void main(String[] args) {
        demo d=new demo();
        d.add();

        mainclass m=new mainclass();
        m.add();

        mainclass m2=new demo();
        m2.add();




    }
}
