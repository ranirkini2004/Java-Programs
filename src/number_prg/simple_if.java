package number_prg;

public class simple_if {
    public static void main(String[] args){
        int num=0;
        int num1=0;

       // large(num,num1);
      //  posorneg(num);
        grade();
    }

    public static void large(int n,int m){
        if(n>m){
            System.out.println(n+" is larger");
        }
        else{
            System.out.println(m+" is larger");
        }

    }

    public static void posorneg(int n){
        if(n<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Positive number");
        }
    }
    public static void grade(){
        char grade='B';
        if(grade=='A'){
            System.out.println("First class");
        }
        else if(grade=='B'){
            System.out.println("Second class");
        }
        else{
            System.out.println("Invalid grade");
        }
    }


}
