import java.io.*;
import java.util.*;

class Write{
    public static void main(String[] args){
//WRTING INTO THE FILE
try {
    FileWriter f = new FileWriter("F:\\WebDevelpment\\Programming\\Java_Programs\\COLLEGE-PRACTICAL\\File-Handling\\write.txt"); //To Create a File 
    try{
        //performing write operation
        f.write("WE FINALLY WROTE SOME DATA INTO THIS FILE NAMED AS 'WRITE.TXT'");
    }
    finally{
        //closing the file after writing data into it
        f.close();   
    }
    System.out.println("Succesful writen the content in file");

}catch(){
    System.out.println("Error in writing into the file");  //Printing Error Message if any error occurs while writing into the file
}


    }
}