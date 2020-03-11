package LOCKSMULTITHREADING;

import java.util.concurrent.locks.ReentrantLock;

public class LOCKS {
  private static ReentrantLock mylock=new ReentrantLock();
  public static void sharedResource() {
    try{
      mylock.lock();
      System.out.println(Thread.currentThread().getName() + " " + "has the lock" );
    }finally {
      mylock.unlock( );
    }


  }
  public static void main(String[] args) {
Thread t1=new Thread(()->sharedResource());
Thread t2=new Thread(()->sharedResource());
    Thread t3=new Thread(()->sharedResource());
    Thread t4=new Thread(()->sharedResource());

    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}
