package inheritance;

public class Whatsapp1 {
    void text(){
        System.out.println("Only text");
    }
}
class Whatsapp2 extends Whatsapp1{
    void voiceCall(){
        System.out.println("text with voice call");
    }
}
class Whatsapp3 extends Whatsapp2{
    void videoCall(){
        System.out.println("text, voice and video call");
    }
}
