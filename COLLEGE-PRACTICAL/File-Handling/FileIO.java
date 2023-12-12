import java.io.*;
import java.util.*;

class FileIO{
    public static void main(String[] args){

        //Creating a New File named as "OUTPUT.TXT"
        File f = new File("F:\\WebDevelpment\\Programming\\Java_Programs\\COLLEGE-PRACTICAL\\File-Handling\\temp1.txt");
        try{
            if(f.createNewFile()){
                System.out.println("File Created SUccessfuly");
            }else{
                System.out.println("File already Exists");
            }
        }catch(IOException i){
            System.out.println("Exception handled");
        }           
        
            
    }
}