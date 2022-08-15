package Application;

import java.io.File;
import java.io.IOException;

public class Application {
    public void executeApplication() {
        try {
            readTxtFile();
        } catch (IOException e){
            System.out.println("IO Exception error!");
        }
    }

    public void readTxtFile() throws IOException {
        String dirName = "\\file";
        String fileName = "file.txt";

        File file = new File(dirName);

        boolean isDirCreated = file.mkdir();//
        if (isDirCreated) {
            File newFile = new File(dirName + File.separator + fileName);
            boolean isFileCreated = newFile.createNewFile();

            if (isFileCreated) {
                System.out.println(newFile.getCanonicalPath());
            }
        }
    }
}
