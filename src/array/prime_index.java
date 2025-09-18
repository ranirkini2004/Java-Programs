package array;

public class prime_index {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        int element;

        for(int i=0;i<arr.length;i++){
            boolean isPrime=true;
            element=i;
            for(int j=2;i<=Math.sqrt(element);j++){
                if(element%j==0){
                    isPrime=false;

                }
            }
            if(isPrime){
                System.out.println(arr[element]);
            }
        }
    }
}
