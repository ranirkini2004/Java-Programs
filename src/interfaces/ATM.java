package interfaces;

public interface ATM {

    void checkBalance();

}
class SBI implements ATM{
    @Override
    public void checkBalance(){
        System.out.println("Balance is 1 lakh");
    }
}
