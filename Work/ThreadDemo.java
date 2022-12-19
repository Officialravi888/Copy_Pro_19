package Com.Work;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
//        Runnable runnable=()->{
//          for (int i=0; i<=10; i++){
//              System.out.println("print no:"+i);
//              try {
//                  Thread.sleep(1000);
//              } catch (InterruptedException e) {
//                  throw new RuntimeException(e);
//              }
//          }
//        };
//        Thread Thread1=new Thread(runnable);
//        Thread1.setName("Ravikant");
//        Thread1.start();


        Runnable t2=()-> {
            try {
                for (int i = 1; i <= 10; i++) {
                    int i1 = +i * 2;
                    System.out.println(i * 2);
                    Thread.sleep(100);

                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };
        Thread t11=new Thread(t2);
        t11.start();
    }
}
