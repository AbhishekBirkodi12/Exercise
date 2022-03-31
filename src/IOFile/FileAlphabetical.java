package IOFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileAlphabetical {
    public static void main(String[] args) throws IOException {
        String path="D:\\IpOp\\ipop";
        File file=new File(path);
        System.out.println(file.canWrite());

        File[] files=file.listFiles();
        Arrays.sort(files);
        for (File f:files
             ) {
            System.out.println(f);
        }
    }
}
