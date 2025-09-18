package inheritance;

public class Animal {
    void noise(){
        System.out.println("All animals make noise");
    }
}
class Cat extends Animal{
    void catNoise(){
        System.out.println("Meow");
    }
}
class Dog extends Animal{
    void dogNoise(){
        System.out.println("Bow Bow");
    }
}