package simple_project;

import java.sql.SQLOutput;

public interface Account {
    void details();
    void deposit(int a);
    void withdraw(int a);
    void checkBalance();
}

class Person implements Account{
    private String name="Rani";
   // private int balance=0;
    long accnt=1234536453;
    String IFSC="CNRB12345";
    private int bal=0;

    @Override
    public void details(){
        System.out.println("Name:"+name+" Account number: "+accnt+" IFSC:"+IFSC);
    }
    void setDetails(String name,long accnt,String IFSC){
        this.name=name;
        this.accnt=accnt;
        this.IFSC=IFSC;
//        this.bal=bal;
    }

    @Override
    public void deposit(int n){
        if(n>0){
            bal=bal+n;
            System.out.println("Data credited successfully");
        }else{
            System.out.println("Money cannot be deposited");
        }
    }
    @Override
    public void withdraw(int n){
        if(n>0 && n<bal){
            bal=bal-n;
            System.out.println("Money withdrawed successfully");
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public void checkBalance(){
          if(bal==0){
              System.out.println("Insufficient Balance");
          }else{
              System.out.println("Balance is: "+bal);
          }
    }
}
