import java.util.*;

class Library{
    public static void main(String args[]){
        ArrayList<String>list = new ArrayList<String>();

        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravan");
        list.add("Aruyan");
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
} 