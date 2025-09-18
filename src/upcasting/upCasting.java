package upcasting;

public class upCasting {
    public static void main(String[] args) {
        //upcasting
        //storing subclass object into superclass

        Father f=new Son();
        //we can access only superclass member
        //visible only for superclass
        System.out.println("Father name:"+f.fname);
        System.out.println("Father properties");
        f.land();
        f.house();
        //through upcasting we can access only superclass member
        System.out.println("==================================");
        Son s=(Son)f;
        System.out.println(s.fname);
        System.out.println(s.sname);
        s.land();
        s.bike();
        s.house();

    }
}
