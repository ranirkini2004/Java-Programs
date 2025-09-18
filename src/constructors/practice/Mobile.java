package constructors.practice;

public class Mobile {
    String model;
    int size;
    static String company;

    public  void gaming(){
        System.out.println("I am playing games");
        System.out.println(size);

    }
    public void drama(){
        System.out.println("watching dramas");
    }
    public static void music(){
        System.out.println("I am playing the music");
    }
    Mobile(String m,int s,String c){
        model=m;
        size=s;
        company=c;
    }

    public static void main(String[] args) {
        Calculator c=new Calculator("RX123456","XYZ");
        System.out.println(c.model+"->"+c.company);
        c.add();
        c.sub();

        System.out.println(Calculator.company);

//        Mobile m=new Mobile("RM1234",180,"Realme");
//        System.out.println("Mobile Model: "+ m.model);
//        System.out.println("Mobile size: "+m.size);
//        System.out.println("Mobile company: "+company);
    }
}
