class A extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("values of A=" + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int j = 0; j <= 10; j++) {
            System.out.println("values of B=" + j);
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 0; k <= 10; k++) {
            System.out.println("values of C=" + k);
        }
    }
}

public class Thread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.start();
        b.start();
        c.start();
    }
}