package has_a_relation;

public class Car {
    String brand;
    int price;

    Engine e=new Engine();
    Car(String brand,int price,Engine e){
        this.brand=brand;
        this.price=price;
        this.e=e;
    }

    //e.cc=100;
    void display(){
        System.out.println(brand);
        System.out.println(price);
        e.cc=100;
        System.out.println(e.cc);
        e.type="2 Stroke";

        System.out.println(e.type);
    }
}
