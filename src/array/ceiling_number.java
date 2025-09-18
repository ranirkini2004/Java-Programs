package array;

public class ceiling_number {
    public static void main(String[] args) {
        int[] a={5,10,13,17,20,27};
        int left=0;
        int ele=14;
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
            System.out.println("Ceiling number: "+ele);
        }
        else if(left<a.length){
            System.out.println("Ceiling no: "+a[left]);
        }else{
            System.out.println("Ceiling no doesn't exist");
        }
    }
}
