// package ThreadPackage;
//MULTITHREADING - BY EXTENDING THREAD CLASS IN JAVA
class A extends Thread{
    @Override
    public void run(){
            System.out.println("Thread A");
      
    }
}

class B extends Thread{
    @Override
    public void run(){       
            System.out.println("Thread B");
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