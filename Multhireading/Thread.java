package Com.Multhireading;

class Thread1 extends Thread {
    void run1(){
        for (int i=0; i<=5; i++){
            System.out.println("value print:"+i);
            try {
                Thread1.sleep(4888);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread1 Th=new Thread1();
        Th.run1();
    }
}
