package constructors.practice;

public class Calculator {
    String model;
    static String company;

    public void add(){
        System.out.println("Addition");
    }
    public void sub(){
        System.out.println("Subtraction");
    }
    public void div(){
        System.out.println("Division");
    }
    Calculator(String m,String c){
        this.model=m;
        this.company=c;
    }

}
