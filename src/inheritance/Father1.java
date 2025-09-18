package inheritance;

public class Father1 {
    Father1(int a){
        System.out.println("Super");
    }
}
//class Father2{
//    void house(){
//        System.out.println("House");
//    }
//}
class Son1 extends Father1{
    Son1(int a,int b){
        this();
        System.out.println(a+"->"+b);
    }
    Son1(){
        super(10);
        System.out.println("Sub");
    }
}
