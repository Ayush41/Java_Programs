import java.util.*;

public class FindLargestSmallest{
    public static void main(String[] args){

        int arr[] = {12,21,3,5,54,6,7,7,3};

        int largest = arr[0], smallest =arr[0];

        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest = arr[i];
            }
            if(largest <arr[i]){
                largest =arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}