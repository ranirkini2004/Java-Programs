package searching_algorithms;

public class second_occurence {
    public static void main(String[] args) {
        int[] a={10,20,13,30,4,12,13,89};
        int n=a.length;
        int c=0;


        int ele=13;
        for(int i=0;i<n;i++){

            if(a[i]==ele){
                c++;
            }
            if(c==2){
                System.out.println("second occurrence of "+a[i]+" "+i);
                break;
            }
        }
    }
}
