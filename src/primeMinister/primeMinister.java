package primeMinister;

public class primeMinister {
    int age;
    String name;

   // static boolean isElected=false;
    private static primeMinister pm;

    private primeMinister(){
        System.out.println("Prime minister elected");
    }
    public static void elected(){
        if(pm==null){
            pm=new primeMinister();
//            isElected=true;

        }else{
            System.out.println("Already elected");
        }
    }

    public static void main(String[] args) {
        elected();
        elected();
    }
}
