
class A extends Thread{
    @Override
    public void run(){
        for(int i =1;1<=5;i++){
            System.out.println("Thread A-  + i");
        }
    }
}

class B extends Thread{
    @Override
    public void run(){
        for(int i =1;i<=5;i++){
            System.out.println("Thread B - " + i);
        }
    }
}

class Multithreading{
    public static void main(String[] args) {
        // Create two threads
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }

}