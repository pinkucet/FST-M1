import java.util.Arrays;

// In this activity, we are writing a program to check if the sum of all the 10's in the array is exactly 30.
public class Activity2 {
    public static void main(String args[]){
        int []arr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array"+ Arrays.toString(arr));
        int sum=0;
        for(int x:arr){
            if(x==10){
                sum=sum+x;
            }
        }
        if(sum==30){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
