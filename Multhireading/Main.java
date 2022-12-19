package Com.Multhireading;
//creating or thread using interface
class MyThread implements Runnable {
    public void run(){
        //Task for thread
        for(int i=0; i<=10; i++){
            System.out.println("value is print:"+i);
            try{
                Thread.sleep(1990);}catch (Exception e){}
        }
        }

    public static void main(String[] args) {

        MyThread Thread = new MyThread();
        Thread t1= new Thread(Thread);
        t1.start();
    }
}
