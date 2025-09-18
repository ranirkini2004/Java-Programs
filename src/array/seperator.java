package array;
import java.util.ArrayList;

public class seperator {
    public static void main(String[] args) {
        String str="a1b2c3du";
        String s1="";
        String s2="";
//        String[] result=new String[2];

        char[] s0=str.toCharArray();

        for(int i=0;i<s0.length;i++){
            if(Character.isDigit(s0[i])){
                s1=s1.concat(String.valueOf(s0[i]));
            }
            else{
                s2=s2.concat(String.valueOf(s0[i]));
            }
        }
//        result[0]=s2;
//        result[1]=s1;
//        System.out.print("[");
//        for(int i=0;i< result.length;i++){
//            System.out.print(result[i]+"");
//        }
        ArrayList<Object> resultList = new ArrayList<>();
        resultList.add("'"+s2+"'");

        // Convert the digits string to an integer before adding it.
        resultList.add(Integer.parseInt(s1));

        // Print the ArrayList, which will format the output with brackets.
        System.out.println(resultList);
    }
}
