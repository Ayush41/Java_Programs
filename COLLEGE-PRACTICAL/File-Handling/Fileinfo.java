import java.io.File;

class Fileinfo{
    public static void main(String[] args){
        //DISPLAY THE FILE INFORMATION
        File f = new File("F:\\WebDevelpment\\Programming\\Java_Programs\\COLLEGE-PRACTICAL\\File-Handling\\temp1.txt");
        if(f.exists()){
        System.out.println("File NAme:" + f.getName());
        System.out.println("File Location:" + f.getAbsolutePath());
        System.out.println("File Writable:" + f.canWrite());
        System.out.println("File ReADABLE:" + f.canRead());
        System.out.println("File Size:" + f.length());
        }else{
            System.out.println("The file does not exist");
        }
    }
}