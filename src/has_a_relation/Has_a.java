package has_a_relation;

public class Has_a {
    public static void main(String[] args) {
        Car c=new Car("Maruthi",120000,new Engine());

//        System.out.println("Brand "+c.brand+" Price: "+c.price+);
        c.display();
    }
}
