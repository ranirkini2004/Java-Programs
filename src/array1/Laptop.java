package array1;

public class Laptop {
    String brand;
    int price;

    Laptop(String brand,int price){
        this.brand=brand;
        this.price=price;
    }

    @Override
    public String toString(){
        return "Brand:"+brand+"\nPrice:"+price;
    }
}
