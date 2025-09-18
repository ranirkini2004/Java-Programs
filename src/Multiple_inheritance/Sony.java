package Multiple_inheritance;

public interface Sony {
   void dinner();
}

interface Sonal{
    void trip();
}

class Puneeth implements Sony, Sonal{
    @Override
    public void dinner(){
        System.out.println("Dinner at 8pm");
    }
    @Override
    public void trip(){
        System.out.println("Trip travelling with sonal at 9pm");
    }
}
