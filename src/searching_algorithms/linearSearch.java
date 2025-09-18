package searching_algorithms;

public class linearSearch {
    public static void main(String[] args) {
        int[] a={10,20,30,4,12,13,89};
        int n=a.length;
        int ele=13;
        int index=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(a[i]==ele){
                index=i;
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Element found at index "+index);
        }else{
            System.out.println("Element not found");
        }
    }
}
