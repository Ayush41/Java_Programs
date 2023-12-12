//MULTITHREADING - BY IMPLEMENTING RUNNABLE INTERFACE IN JAVA
class A implements Runnable{
    public void run(){

        for(int i=1;i<=5;i++){
            System.out.println("Thread 1");
        }
    }
}


class Multithreading2{

    public static void main(String[] args){

        A a = new A();
        a.run();

        
        System.out.println("Program initialized");
    }
}