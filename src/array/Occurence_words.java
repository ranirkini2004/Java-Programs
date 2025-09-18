package array;

public class Occurence_words {
    public static void main(String[] args) {
        String s="hello hi welcome bye hello hi hello";
        String[] s1=s.split(" ");
        for(int i=0;i<s1.length;i++){
            int c=1;
            for(int j=i+1;j<s1.length;j++){
                if(s1[i].equals(s1[j])){
                    c++;
                    s1[j]=" ";
                }

            }
            if(s1[i]!=" "){
                System.out.println(s1[i]+"->"+c);
            }

        }

    }
}
