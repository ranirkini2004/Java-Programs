package array;

public class robot_moving_to_original_place {
    public static void main(String[] args) {
        String s="RLUD";
        int x=0,y=0;
        char[] s1=s.toCharArray();
        for(int i=0;i<s1.length;i++){
            if(s1[i]=='R'){
                x++;
            }else if(s1[i]=='L'){
                x--;
            }else if(s1[i]=='U'){
                y++;
            }else{
                y--;
            }
        }
        System.out.println("("+x+","+y+")");
    }
}
