package programs;

public class range_composite {
    public static void main(String[] args){
//        boolean isPrime;
        for(int num=2;num<=100;num++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(num);j++){
                if(num%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==false){
                System.out.println(num);
            }
        }
    }
}
