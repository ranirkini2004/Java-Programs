package patterns;

public class type4 {
    public static void main(String[] args){
        int n=4;
        System.out.println("_________________Triangle_________________________");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i+j>=n+1 && j-i<=n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("_________________Oppo Triangle_________________________");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j>=i && i+j<=2*n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("_____________right pyramid_____________________");
        for(int i=1;i<2*n;i++){
            for(int j=1;j<=n;j++){
                if(i>=j && i+j<=2*n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("________________left pyramid________________");
        for(int i=1;i<2*n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>=n+1 && i-j<=n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("------------------Diamond---------------------");

        for(int i=1;i<2*n;i++){
            for(int j=1;j<2*n;j++){
                if(i+j>=n+1 && j-i<=n-1 && i-j<=n-1 && i+j<=3*n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------Diamond (method 2)-----------------------");

        for(int i=1;i<2*n;i++){
            for(int j=1;j<2*n;j++){
                if(i+j>n && j-i<n && i-j<n && i+j<2*n+n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        }
}
