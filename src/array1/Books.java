package array1;

public class Books {
    String brand;
    int price;

    Books(String brand,int price){
        this.brand=brand;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Brand:"+brand+"\nPrice:"+price;
    }
}
