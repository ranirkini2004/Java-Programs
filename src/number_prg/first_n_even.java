package number_prg;

public class first_n_even {
    public static void main(String[] args){
        int sum=0,c=1;
//        for(int i=10;i<=100;i++){
//           if(i%2==0 && c<=5){
//               sum+=i;
//               c++;
//           }
//        }
//        System.out.println(sum);
        int num=10, last=100;
        while(c<=5){
            if(num%2==0){
                sum+=num;
                c++;
            }
            num++;

        }
        System.out.println(sum);
    }
}
