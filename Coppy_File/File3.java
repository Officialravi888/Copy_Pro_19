package Com.Coppy_File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class File3 {
    public static void main(String[] args) throws IOException {
        File src=new File("src/Com/Coppy_File/File2.txt");
        File dest=new File("src/Com/Coppy_File/File2.txt");
        Files.copy(src.toPath(),dest.toPath());
    }
}
