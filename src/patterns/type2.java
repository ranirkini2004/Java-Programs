package patterns;

public class type2 {
    public static void main(String[] args){
        int n=5;
        System.out.println("-------------primary coordinates--------");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------opposite coordinates--------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)==(n+1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("-------------secondary coordinates--------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i==j || (i+j)==(n+1))){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("-------------N Shape--------");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1 || i==4 || i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("-------------inverted L and diagonal--------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==4 || j==4 || i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("-------------inverted L and diagonal--------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------inverted L and diagonal--------");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==4 || j==4 || i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------square with diagonal--------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n || j==n || i==1 || j==1 || i==j || (i+j)==n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------inverted N--------");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||(i+j)==n+1){
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
