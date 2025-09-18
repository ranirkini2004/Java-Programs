package array1;

public class Bike {
    String brand;
    int price;

    Bike(String brand,int price){
        this.brand=brand;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Brand:"+brand+"\nPrice:"+price;
    }
}
