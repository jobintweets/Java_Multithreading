class Multiply {
  synchronized void multiply(int num){

    for(int i=0;i<10;i++){
      System.out.println(i*num + " " + Thread.currentThread().getName());
      try {
        Thread.sleep(500);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}
class A extends Thread {
Multiply mul;
A(Multiply m){
  this.mul=m;
}
  @Override
  public void run(){
mul.multiply(10);
}
}


public class ThreadsPriority {
  public static void main(String[] args) {
    Multiply mul = new Multiply();
    A thread1=new A(mul);
    A thread2=new A(mul);
    thread1.start();
    thread2.start();
  }
}
