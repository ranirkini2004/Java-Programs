package upcasting1;

public class Father {
    String fname="ramesh";
    void land(){
        System.out.println("Land");
    }
}
class Son extends Father{
    String sname="Raman";
    void Bike(){
        System.out.println("Bike");
    }
}
class Daughter extends Father{
    String dname="ramya";
    void cosmetics(){
        System.out.println("Makeup kits");
    }
}
