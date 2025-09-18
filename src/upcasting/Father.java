package upcasting;

public class Father {
    String fname="Ramesh";

    void land(){
        System.out.println("2 ACRE LAND");
    }
    void house(){
        System.out.println("1 HOUSE");
    }
}
class Son extends Father{
    //2 inherited methods i) land ii)house

    //bike() is own property of son
    String sname="Rohan";
    void bike(){
        System.out.println("hero honda");
    }
}
