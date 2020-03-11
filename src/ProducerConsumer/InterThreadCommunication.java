package ProducerConsumer;

public class InterThreadCommunication {
  public static void main(String[] args) {
    Number num =new Number();
    Producer producer=new Producer(num);
    Consumer consumer=new Consumer(num);


  }
}
