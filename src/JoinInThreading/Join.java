package JoinInThreading;

import java.awt.font.TextHitInfo;

public class Join  {
  public static int counter=0;
  public  static synchronized    void incrementCount() {
    counter ++;
    System.out.println(Thread.currentThread().getName() + " " +counter);
  }
  public static void main(String[] args) throws Exception {

    //creating thread 1
    Thread thread1=new Thread(new Runnable() {

      @Override
      public void run() {
for(int i=0;i<20;i++){

  incrementCount();

}
      }
    });

    //creating thread 2

    Thread thread2=new Thread(new Runnable() {

      @Override
      public void run() {
        for(int i=0;i<20;i++){

          incrementCount();

        }
      }
    });

    thread1.start();
    thread2.start();
    thread1.join();
    thread2.join();

    System.out.println("value of counter is " + " " + counter );
  }
}
