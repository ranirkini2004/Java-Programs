package upcasting1;

public class upCasting_mainclass {
    public static void main(String[] args) {
        Father f=new Son();
        Son s=(Son)f;
        System.out.println(f.fname);
        f.land();
        System.out.println("=============================================");


        System.out.println(s.fname);
        System.out.println(s.sname);
        s.land();
        s.Bike();

        System.out.println("===============================================");
        Father f1=new Daughter();
        if(f1 instanceof Daughter){
            Daughter d=(Daughter)f1;
        }else{
            System.out.println("F doesn't contain object");
        }
//        System.out.println(d.fname);
//        System.out.println(d.dname);
        //d.land();
        //d.cosmetics();

    }
}
