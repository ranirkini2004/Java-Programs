package Abstraction;

public abstract class Bank {

    abstract void withdraw();
    abstract void loan();
    abstract void deposit();
}
class SBI extends Bank{
     @Override
    void withdraw(){
         System.out.println("Money withdraw successful");
     }
     @Override
    void loan(){
         System.out.println("At 0 % interest");
     }
     @Override
    void deposit(){
         System.out.println("Money deposit successful");
     }

     void EmployeeLoan(){
         System.out.println("Please visit SBI Bank for more information");
     }
}
class Canara extends Bank{
    @Override
    void withdraw(){
        System.out.println("Money withraw successful");
    }
    @Override
    void loan(){
        System.out.println("At 0.8% interest");
    }
    @Override
    void deposit(){
        System.out.println("Money deposit successful");
    }

    void BusinessLoan(){
        System.out.println("Please visit Canara Bank for more information");
    }
}
