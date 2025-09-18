package array;

public class floor_number {
    public static void main(String[] args) {
        int[] a={5,10,13,17,20,27};
        int left=0;
        int ele=25;
        int right=a.length-1;
        boolean flag=false;

        while(left<=right){
            int mid=(left+right)/2;
            if(a[mid]==ele){
                flag=true;
                break;
            }else if(a[mid]<ele){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        if(flag){
            System.out.println("Floor number: "+ele);
        }
        else if(right>0){
            System.out.println("Floor no: "+a[right]);
        }else{
            System.out.println("Floor no doesn't exist");
        }
    }
}
