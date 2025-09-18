package method_overriding;

public class Vehicle {
    void wheels(){
        System.out.println("All vehicle has wheels");
    }
}
class Bike extends Vehicle{
    @Override
    void wheels(){
        System.out.println("Bike has two wheels");
    }
}
class Car extends Vehicle{
//    @Override
    void wheels(){
        System.out.println("Car has four wheels");
    }
}

