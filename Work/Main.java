package Com.Work;

public abstract class Main {
    public static void main(String[] args) {
//        System.out.println("i am ravi kant");
////            Main1 A= new Main2();
////            A.Test();
//
//        Main B = new Main() {
//            @Override
//            public void Test1 () {
//                System.out.println("this is my fiest anonimous class");
//
//            }
//        };
//        B.Test1();
//        MyInter i1=new MyInter() {
//            @Override
//            public void Test1() {
//                System.out.println("hay me ravi");
//            }
//        };
//        i1.Test1();
//    }
//
//    public abstract void Test1();
//}

        //with the help of lambda
        MyInter i =()->{
            System.out.println("this is first time");
        };
        i.Test1();


        SumInter i3=(int a, int b)->{
          return a+b;
        };
        System.out.println(i3.sum(2,5));
        System.out.println(i3.sum(7,9));
    }
}