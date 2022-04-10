import java.util.Arrays;

public class Activity4 {
    public static void main(String []args) {
        int []a = {2,1,5,0,9,3,7};
        System.out.println("Array Before sorting"+ Arrays.toString(a));
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                   temp =a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
            }
        }
        System.out.println("Array After sorting"+ Arrays.toString(a));
    }
}
