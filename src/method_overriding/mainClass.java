package method_overriding;

public class mainClass {
    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.wheels();

        Vehicle myVehicle=new Vehicle();
        myVehicle.wheels();

        System.out.println("====================================");
        System.out.println("Upcasting");
        Vehicle v=new Car();
        v.wheels();
    }
}
