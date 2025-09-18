package array;

public class occurrance_letters {
    public static void main(String[] args) {
        char[] a={'r','a','n','i'};
        boolean visited=false;
        for(int i=0;i<a.length;i++){
            int c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]='\0';

                }
            }

            if(a[i]!='\0'){
                System.out.println(a[i]+"->"+c);
            }
        }
    }
}
