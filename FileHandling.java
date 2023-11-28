//write a funciton in java to open google chrome

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

   public static void main(String[] args) {
       // Create a File object
       File file = new File("myfile.txt");
       // Check if the file exists
       if (file.exists()) {
           System.out.println("The file already exists.");
       } else {
           // Create a new file
           try {
               file.createNewFile();
           } catch (IOException e) {
               System.out.println("An error occurred while creating the file.");
               e.printStackTrace();
           }
       }

       // Write to the file
       try {
           FileWriter fileWriter = new FileWriter(file);
           fileWriter.write("This is a test.");
           fileWriter.close();
       } catch (IOException e) {
           System.out.println("An error occurred while writing to the file.");
           e.printStackTrace();
       }

       // Read from the file
       try {
           Scanner scanner = new Scanner(file);
           while (scanner.hasNextLine()) {
               String line = scanner.nextLine();
               System.out.println(line);
           }
           scanner.close();
       } catch (IOException e) {
           System.out.println("An error occurred while reading from the file.");
           e.printStackTrace();
       }
   }
}


/*import java.awt;
import java.swing.*;

class FileHandling{
    public static void main(String[] args){
        System.out.println("Program Started");

    }
}

*/

/*import java.io.File;   
class FileInfo {  
    public static void main(String[] args) {  
        // Creating file object  
        File f0 = new File("D:FileOperationExample.txt");  
        if (f0.exists()) {  
            // Getting file name  
            System.out.println("The name of the file is: " + f0.getName());  
   
            // Getting path of the file   
            System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());     
   
            // Checking whether the file is writable or not  
            System.out.println("Is file writeable?: " + f0.canWrite());    
   
            // Checking whether the file is readable or not  
            System.out.println("Is file readable " + f0.canRead());    
   
            // Getting the length of the file in bytes  
            System.out.println("The size of the file in bytes is: " + f0.length());    
        } else {  
            System.out.println("The file does not exist.");  
        }  
    }  
} 
*/