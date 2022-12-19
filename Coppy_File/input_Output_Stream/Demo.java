package Com.Coppy_File.input_Output_Stream;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("Ravikant.txt");
        if (!file.exists()) {

            file.createNewFile();
        }
//        FileOutputStream fis=new FileOutputStream(file);
//
//        String textToBeWritten = "My name is ravi,i am ravi";
//        fis.write(textToBeWritten.getBytes());
//        fis.flush();
//        fis.close();

        FileInputStream fis=new FileInputStream(file);
        String textToBeWritten="How are you";
        fis.wait();
        }
}
