package CallabeAndFuture;

import java.util.concurrent.*;

// to return a value
class Task implements Callable<String> {

  @Override
  public String call() throws Exception {
    Thread.sleep(5000);
    return "hello";
  }
}
public class callabeandfuture {
  static Future<String> future;
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService exs= Executors.newFixedThreadPool(10);
    for(int i=0;i<5;i++){
 future=exs.submit(new Task());
 //the get() method blocks the main thread
      String result=future.get();
      System.out.println(result);
    }

    System.out.println( "Thread Name " + " " + Thread.currentThread().getName());
  }
}
