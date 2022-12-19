package Com.Coppy_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.nio.file.Files.exists;

public class Demo {
    public static void main(String[] args) throws IOException {
        // Code for create the file
        File file=new File("Sample.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
                //Write the text into the above create file using fileOutputStream
            FileOutputStream fos=new FileOutputStream(file);
            String textToBeWritten;
            textToBeWritten = "My name is ravi";
            fos.write(textToBeWritten.getBytes());
         fos.flush();
         fos.close();
        }
    }
}
