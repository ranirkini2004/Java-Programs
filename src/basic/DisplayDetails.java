package basic;

public class DisplayDetails {
    static int a;
    public static void main(String[] args){
//        System.out.println("Long Method:\n");
//        System.out.println("Name: Rani R Kini");
//        System.out.println("Age:"+20);
//        System.out.println("Height:"+167+"cm");
//        System.out.println("Marks:"+50);
//        System.out.println("Blood: "+"B");
//
//        System.out.println("Are you an employee?");
//        System.out.println(false);
//
//        System.out.println("\n\n");


        System.out.println(a);

        //main(5);
        //initialize();
        //datatypes();
    }

    public static void main(int a){
        System.out.println("hii"+a);
    }

    public static void initialize() {
        int a=10;
        System.out.println(a);

    }

    public static void datatypes(){
        String A="Rani";
        int age=20;
        double height=5.6;
        boolean isemployeed=false;
        short a=12;
        byte b=1;

        System.out.println("Details: "+A+" "+age+" "+height+" "+isemployeed+" "+a+" "+b);
    }
}
