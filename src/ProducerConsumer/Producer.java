package ProducerConsumer;

// end of Number class
//------------------------------------
class Producer implements  Runnable{
Number num;

  public Producer(Number num) {
    this.num = num;
    Thread t1=new Thread(this,"Producer");
    t1.start();
  }

int i=0;
  public void run() {
    while(true) {
    num.setNum(i++);
      try {
        Thread.sleep(500);
      } catch (Exception e) {
        System.out.println(e);
  }
}
  }

  }
