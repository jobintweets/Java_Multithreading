  package ThreadPool;

  import java.util.concurrent.ExecutorService;
  import java.util.concurrent.Executors;
  import java.util.concurrent.ScheduledExecutorService;
  import java.util.concurrent.TimeUnit;

  class Task implements Runnable {

    @Override
    public void run() {
      System.out.println( "THread Name " + " " + Thread.currentThread().getName());

    }
  }
  //end of Task class that implements the Runnable interface
  public class ThreadPool {


    public static void main(String[] args) throws Exception {
      int coreCount=Runtime.getRuntime().availableProcessors();

      // create a thread pool equivalent to the core-count of the machine.
      // if cpu has 8 cores it can run 8 threads.
      //fixed thread pool
      ExecutorService exs= Executors.newFixedThreadPool(coreCount);
  //    cached ThreadPool
      ExecutorService cachedThreadPool=Executors.newCachedThreadPool();
  // scheduled ThreadPool
      ScheduledExecutorService scheduledExecutorService=Executors.newScheduledThreadPool(3);
      // creating 100 tasks for the 10 threads to execute .
      for (int i=0;i<100;i++) {
  //exs.execute(new Task());
  //      cachedThreadPool.execute(new Task());
//        scheduledExecutorService.schedule(new Task(),5,TimeUnit.SECONDS);
        //every 3 seconds it will run a new task .Wont wait for the completion of the previous task
//        scheduledExecutorService.scheduleAtFixedRate(new Task(),5,3,TimeUnit.SECONDS);
        // will wait for the complete execution of the previous task and will delay further for the execution of the nest task.
        scheduledExecutorService.scheduleWithFixedDelay(new Task(),5,3,TimeUnit.SECONDS);

  }

      System.out.println("Thread Name" + " " + Thread.currentThread().getName());
    }

  }
