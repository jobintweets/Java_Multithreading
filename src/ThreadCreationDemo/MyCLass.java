package ThreadCreationDemo;

public class MyCLass extends Thread {

  @Override
  public void run() {
test();
  }
  public void  test(){
    System.out.println("Thread is running");
  }
}
