package patterns;

//outer loop travese row and inner loop tranverses element
public class type1 {
    public static void main(String[] args){
        //System.out.println("Step 1");
        System.out.println("------------------* horizontal----------------");
        //print * in 1 row, 4 column
        for(int i=1;i<=4;i++){
            System.out.print("* ");
        }
        System.out.println();
        System.out.println("------------------2 row and 4 column-------------------");
        //print * in 2 row, 4 column
        for(int i=1;i<=2;i++){
            for(int j=1;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------* vertically-------------------");
        //print * in 4 row, 1 column
        for(int i=1;i<=4;i++){
            System.out.println("* ");
        }
        System.out.println("----------------inverted T----------------------");
        //print inverted T with *
        for(int i=1;i<=4;i++) {
            for (int j = 1; j <= 4; j++) {
                if(j==4||i==4){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("---------------inverted L------------------");
        //print inverted L with *
        for(int i=1;i<=4;i++) {
            for (int j = 1; j <= 4; j++) {
                if(j==1||i==4){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println("-----------------------C shape-----------------");
        //print inverted c with *
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1||i==4||j==1){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("---------------------inverted L shape-----------------");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==4||j==4){
                    System.out.print("* ");
                    //System.out.print("  ");

                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("---------------------opposite C shape-----------------");
        //print inverted c with *
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1||i==4||j==4){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("---------------------inverted C shape-----------------");
        //print inverted c with *
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1||j==4||j==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------U shape-----------------");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j==1||j==4||i==4){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------| | shape-----------------");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j==1||j==4){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------inverted L shape-----------------");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1||j==4){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------oppo inverted L shape-----------------");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1||j==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------square boundary shape-----------------");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1||j==1||j==4||i==4){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------------inverted parallel L shape-----------------");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1||i==4){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
