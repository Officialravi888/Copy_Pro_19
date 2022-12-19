package Com.Coppy_File;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        try {
            ParallelTasks tasks = new ParallelTasks();
            File folder = new File("c:\\from_my_files");
            for (File file : folder.listFiles()) {
                tasks.add(new CopyFileTask(file.getAbsolutePath(), "c:\\to_my_files\\" + file.getName()));
            }
            tasks.go();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
