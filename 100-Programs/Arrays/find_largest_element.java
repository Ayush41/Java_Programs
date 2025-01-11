import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        int arr[] = {12,1,13,5,10,5,34,9};

        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array is: "+max);
    }
}