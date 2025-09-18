package array1;

public class Mobile {
    String brand;
    int price;

    Mobile(String brand,int price){
        this.brand=brand;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Brand:"+brand+"\nPrice:"+price;
    }
}
