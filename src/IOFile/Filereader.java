package IOFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {
    public static void main(String[] args) throws IOException {
        String path="D:\\IpOp\\ipop\\student.txt";
        File file=new File(path);
        FileReader reader=new FileReader(file);
        int x=reader.read();
        while (x!=-1){
            System.out.print((char)x);
            x=reader.read();
        }
        reader.close();
    }
}
