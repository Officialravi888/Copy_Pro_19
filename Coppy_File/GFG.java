package Com.Coppy_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

// Main Class
    public class GFG {

        // Main driver method
        public static void main(String[] args) throws IOException {
            FileChannel src
                    = new FileInputStream(
                    "src/Com/Coppy_File/File2.txt")
                    .getChannel();
            FileChannel dest
                    = new FileOutputStream(
                    "src/Com/Coppy_File/File2.txt")
                    .getChannel();

            try {
                dest.transferFrom(src, 0, src.size());
            }
            catch (java.io.IOException e) {
                throw new RuntimeException(e);
            } finally {
                src.close();
                dest.close();
            }
        }
    }


