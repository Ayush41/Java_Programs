//SINGLE INHERITENCE
class Student{
    int rollno,marks;
    String Name;
    void input(){
        System.out.println("Enter your ROll no, marks & Name");
    }
}

class AyushR extends Student{
    void Disinfo(){
        rollno=37;
        marks = 98;
        Name = "Ayush Raj Bhatt";
    }
}

public class Inheritence{
    public static void main(String[] args){
        System.out.println("Started...");
    }
} 