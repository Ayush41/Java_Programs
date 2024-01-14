import java.util.LinkedList;

class Linklist1{
    public static void main(String[] args){
        System.out.println("basic LinkedList");
        //METHODS :-
        //addAtHead() : Adds a new node at the head of the linked list.
        //deleteNode() : Deletes a given node from the linked list.
        //search()     : Search for a given key in the linked list
        //display()    : Displays the linked list.
        // getFirst(),removeLast(),removeFirst()

        // Creating a LinkedList
        LinkedList<String> llist = new LinkedList<>();
        // Adding elements to the linked list using addAtHead method.
        llist.add("Mercedes");
        llist.add("Audi");
        llist.add("Bucatti veyron");
        llist.addFirst("Lamborgini");
        llist.addLast("lastCar-Nano");

        // Removign the elements;
        llist.removeLast(); //removes the last element from the list..

        // LINKEDLIST AS A STACK
        System.out.println("LinkedList as a stack");
        LinkedList<String> stack = new LinkedList<>();
        stack.push("one");
        stack.push("three");
        stack.push("niine");

        // Displaying the linkedlist
        System.out.println(llist);
        System.out.println(stack);
    }
}