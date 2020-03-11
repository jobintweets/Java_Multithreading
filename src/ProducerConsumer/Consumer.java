package ProducerConsumer;

//end of Producer Class
//------------------------------------
class  Consumer implements Runnable {
  Number num;

  public Consumer(Number n) {
    this.num = n;
    Thread t2 = new Thread(this, "Consumer");
    t2.start();
  }

  @Override
  public void run() {
    while (true) {
      num.getNum();
      try {
        Thread.sleep(2000);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}
