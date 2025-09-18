package array;

public class countCharacters {
    public static void main(String[] args) {
        String s="tom5758@gmail.com";
        int l=0,d=0,sp=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //s=s.toLowerCase();
            if(ch>='a' && ch<='z'){
                l++;
            }
            else if(ch>='0' && ch<='9'){
                d++;
            }else{
                sp++;
            }
        }
        System.out.println("letters: "+l);
        System.out.println("digits:"+d);
        System.out.println("Special characters: "+sp);
    }
}
