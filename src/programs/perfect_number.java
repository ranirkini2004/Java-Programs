package programs;

public class perfect_number {
    public static void main(String[] args){
        int n=6;
        int sum=0;
          for(int i=1;i<n;i++){
              if(n%i==0){
                  sum+=i;
              }
          }
          if(n==sum){
              System.out.println("It is perfect number");
          }
          else{
              System.out.println("Not a perfect number");
          }
    }
}
