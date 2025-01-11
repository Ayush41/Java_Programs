class Power{  
  void printPower(int n){//method not synchronized
     int temp = 1;
     for(int i=1;i<=5;i++){ 
       System.out.println(Thread.currentThread().getName() + ":- " +n + "^"+ i + " value: " + n*temp);
       temp = n*temp;
       try{  
        Thread.sleep(500);  
       }catch(Exception e){System.out.println(e);}  
     }  
   }  
  }  
  class Thread1 extends Thread{  
  Power p;  
  Thread1(Power p){  
  this.p=p;  
  }  
  public void run(){  
  p.printPower(5);  
  }    
  }  
  class Thread2 extends Thread{  
  Power p;  
  Thread2(Power p){  
  this.p=p;  
  }  
  public void run(){  
  p.printPower(8);  
  }  
  }  
    
  public class TestSynchronization1{  
  public static void main(String args[]){  
  Power obj = new Power();//only one object  
  Thread1 p1=new Thread1(obj);  
  Thread2 p2=new Thread2(obj);  
  p1.start();  
  p2.start();
  }  
  }


// class Table{  
//     void printTable(int n){//method not synchronized  
//        for(int i=1;i<=5;i++){  
//          System.out.println(n*i);  
//          try{  
//           Thread.sleep(400);  
//          }catch(Exception e){System.out.println(e);}  
//        }  
      
//      }  
//     }  
      
//     class MyThread1 extends Thread{  
//     Table t;  
//     MyThread1(Table t){  
//     this.t=t;  
//     }  
//     public void run(){  
//     t.printTable(5);  
//     }  
      
//     }  
//     class MyThread2 extends Thread{  
//     Table t;  
//     MyThread2(Table t){  
//     this.t=t;  
//     }  
//     public void run(){  
//     t.printTable(100);  
//     }  
//     }  
      
//     class TestSynchronization1{  
//     public static void main(String args[]){  
//     Table obj = new Table();//only one object  
//     MyThread1 t1=new MyThread1(obj);  
//     MyThread2 t2=new MyThread2(obj);  
//     t1.start();  
//     t2.start();  
//     }  
//     } 

/*class Syncronization{
    //Syncronization in java
    public static void main(String[] args){
        System.out.println("PRogram started");

        Printing aa = new printing();
        A threadA = new A(aa);
        B threadB = new B(aa);

        threadA.start();
        threadB.start();
    }
}
*/