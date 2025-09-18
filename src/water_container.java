public class water_container {
    public static void main(String[] args) {
        int[] a={9,3,4,5,6};
        int min=0;
        int width=0;
        int area=0;
        int max_area=0;

        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    min=a[i];
                    width=j-i;

                    area=min*width;

                    if(area>max_area){
                        max_area=area;
                    }
                }
            }
        }
        System.out.println("AREA :"+area+" with "+min+" "+width);
    }
}
