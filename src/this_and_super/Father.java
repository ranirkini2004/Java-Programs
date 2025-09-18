package this_and_super;

public class Father {
    String x="ramesh";
}
class Son extends Father{
    String x="rohan";   //subclass member variable

    void display(){
        String x="local";
        System.out.println(x);//local variable
        System.out.println(this.x);
        System.out.println(super.x);
    }
}
