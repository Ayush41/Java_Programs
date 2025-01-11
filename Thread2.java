class A implements Runnable{
    public void run(){
        System.out.println("Thread has ended");
    }
}

public class Thread2 {
    public static void main(String[] args) {
        System.out.println("Started...");
        A a = new A();
        Thread t1 = new Thread(a);
        t1.start();
        System.out.println("Hola! Amigo...");

    }
}