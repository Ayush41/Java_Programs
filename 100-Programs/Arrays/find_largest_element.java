import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        
        int arr[] = {12,1,13,5,10,5,99,34,9,3};

        int max = arr[0];

        Arrays.sort(arr); //using inbuilt fnc
        System.out.println("Sorted array with inbuilt fnc: " + Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array is: "+max);
    }
}