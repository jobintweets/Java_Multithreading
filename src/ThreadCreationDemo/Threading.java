package ThreadCreationDemo;


public class Threading {
  public static void main(String[] args) {
    MyCLass obj1=new MyCLass();
    Myclass2 ob2=new Myclass2();
//    TestClass ob3=new TestClass();
    obj1.start();
    ob2.start();
//    ob3.test();
    System.out.println("works");


  }
}
