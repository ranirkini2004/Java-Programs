package patterns;

public class char_pyramid {
    public static void main(String[] args) {

        int n=3;
        for(int i=1;i<=n;i++){
            char ch='a';
            for(int j=1;j<=2*n-1;j++){
                if(i+j>=n+1 && j-i<=n-1){
                    if(j>=n){
                        System.out.print(ch--);
                    }else{
                        System.out.print(ch++);
                    }
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
