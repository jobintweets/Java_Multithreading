package ThreadLocal;

public class myRunnableThreadLocal implements Runnable {
  private ThreadLocal<Integer> threadLocal=new ThreadLocal<>(){
//    initial value of thread local variable is always null
    protected Integer initialValue(){
      return 0;
    }
  };
//int counter=0;
  @Override
  public void run() {
    for(int i=0;i<5;i++){
      threadLocal.set(threadLocal.get()+1);
//      counter ++;
//      System.out.println(Thread.currentThread().getName()+ " " + counter);
      System.out.println(Thread.currentThread().getName()+ " " + threadLocal.get());
    }
  }

  public static class ThreadLocalDemo {
    public static void main(String[] args) throws Exception {
  myRunnableThreadLocal myRunnableThreadLocal=new myRunnableThreadLocal();

      myRunnableThreadLocal myRunnableThreadLocal1=new myRunnableThreadLocal();
   Thread t1=new Thread(myRunnableThreadLocal);
      Thread t2=new Thread(myRunnableThreadLocal);

   t1.start();
      t2.start();

        t1.join();
        t2.join();
//    main thread will wait until the child threads finishes execution
      // thread t1 and thread t2 are spawned form the main thread.


    }
  }
}
