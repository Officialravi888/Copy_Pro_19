package Com.Coppy_File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try{
            fis=new FileInputStream("src/Com/Coppy_File/File");
            fos=new FileOutputStream("src/Com/Coppy_File/File1");
            int c;
            while ((c= fis.read())!=-1){
                fos.write(c);
            }
            System.out.println("coppy the file successfully");
        }
        finally {
            if (fis != null){
                fis.close();
            }
            if (fos != null){
                fos.close();
            }
        }
    }
}
