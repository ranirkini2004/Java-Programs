package number_prg;

public class pos_even_no {
    public static void main(String[] args){
//        for(int i=-10;i<=20;i++){
//            if(i>=0 && i%2==0){
//                System.out.println(i);
//            }
//        }
        int c=1;
        int start=-10,end=20;
        while(start>=0 && c<=5){
            if(start%2==0){
                System.out.println(start);
                c++;
            }
            start++;
        }
    }
}
