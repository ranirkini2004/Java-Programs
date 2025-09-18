package Has_relation;

public class Has_A {
    public static void main(String[] args) {
        Car c=new Car();
        c.brand="Maruthi";
        c.price=500000;
        c.e.cc=200;

        System.out.println(c.brand);
        System.out.println(c.price);
        System.out.println(c.e.cc);
    }
}
