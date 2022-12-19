package Com.Coppy_File.input_Output_Stream;

import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class File_Copy {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("Ravikant.txt");
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        FileOutputStream FileOutputStream = new FileOutputStream(file);
        System.out.println(fileOutputStream);
    }
}

