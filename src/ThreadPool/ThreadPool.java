package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

  @Override
  public void run() {
    System.out.println("THread Name " + " " + Thread.currentThread().getName());
  }
}
//end of Task class that implements the Runnable interface
public class ThreadPool {
  public static void main(String[] args) throws Exception {
    int coreCount=Runtime.getRuntime().availableProcessors();

    // create a thread pool equivalent to the core-count of the machine.
    // if cpu has 8 cores it can run 8 threads.
    ExecutorService exs= Executors.newFixedThreadPool(coreCount);
ExecutorService cachedThreadPool=Executors.newCachedThreadPool();
    // creating 100 tasks for the 10 threads to execute .
    for (int i=0;i<100;i++) {
//exs.execute(new Task());
      cachedThreadPool.execute(new Task());
}

    System.out.println("Thread Name" + " " + Thread.currentThread().getName());
  }

}
