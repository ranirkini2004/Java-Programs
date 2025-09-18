package waiter_container;

public class container {
    public static void main(String[] args){
        int[] height={1,8,6,2,5,4,8,3,7};
        int width=0;
        int max_i=0;
        int max_j=0;
        int Area=1;
        int i,j = 0;
        int max_area=0,min=0;
        int n=9;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                min=Math.min(height[i],height[j]);
                width=j-i;
                Area=min*width;
                
                if(min*width>max_area){
                    max_area=min*width;
                    max_i=i;
                    max_j=j;
                }
            }
        }
        System.out.println("Maximum Area for container "+max_i+" with height "+height[max_i]+" and "+max_j+" with height "+height[max_j]+" is "+max_area);
    }
}