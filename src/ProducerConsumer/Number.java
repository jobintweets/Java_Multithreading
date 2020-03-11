package ProducerConsumer;

class Number {
  private int num;

  boolean valueSet=false;

  synchronized public void getNum() {
    while (!valueSet){
      try {
        wait();
      }catch (InterruptedException e){ }
    }
    System.out.println("Getting :" +num);
    valueSet=false;
    notify();
  }

  synchronized public void setNum(int num) {
    while (valueSet){
      try {
        wait();
      }catch (InterruptedException e){ }
    }
    System.out.println("Putting:" + num);
    this.num = num;
    valueSet=true;
    notify();
  }
}
//end of ProducerConsumer.Consumer Class
