import java.util.Scanner;
import java.util.*;


public class FindSmallestElement{
    public static void main(String[] args){

        int arr[] = {2,34,1,5,443,4,55,3};

        int min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}