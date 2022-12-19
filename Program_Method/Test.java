package Com.Program_Method;

import java.awt.font.TextAttribute;

abstract class  Test{
     abstract void eat();
}
class Test1{
        public static void main(String[]args){
            Test a= new Test(){
                @Override
                void eat() {
                    System.out.println("HELLO");
                }

            };
            a.eat();
}
    }
