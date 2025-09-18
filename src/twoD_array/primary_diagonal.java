package twoD_array;
import java.util.*;
public class primary_diagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] a=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(a[i][j] );
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
