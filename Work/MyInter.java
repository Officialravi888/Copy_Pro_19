package Com.Work;

public interface MyInter {
    void Test1();

    default  void Test() {
        System.out.println("hay bro kese ho");
    }

}