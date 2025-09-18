package patterns;

public class type3 {
    public static void main(String[] args){
        int n=4;
        System.out.println("-------------left lower triangular--------");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i>=j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//        System.out.println("-------------upper triangular--------");
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=4;j++){
//                if(i<=j){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
        System.out.println("-------------right upper triangular--------");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i<=j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------right lower triangular--------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>=n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------left upper triangular--------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j<=n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
//        System.out.println("------------left upper triangular--------");
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i+j<=n+1||i-j<=n-1){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
        System.out.println("------------left upper triangular--------");


        for (int i = 1; i < 2*n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i+j<=n+1 || i-j>=n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

//        System.out.println("------------left upper triangular--------");
//        int o = 7;
//
//        for (int i = 1; i <= o; i++) {
//            for (int j = 1; j <= o - 3; j++) {
//                if (i + j < o - 1 ||i-j>=1 ) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


        }
    }

