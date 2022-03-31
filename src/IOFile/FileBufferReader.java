package IOFile;

import java.io.*;

public class FileBufferReader {
    public static void main(String[] args) throws IOException {
        String path="D:\\IpOp\\ipop\\RandomFolder\\abcde.txt";
        File file=new File(path);
        FileReader fileReader=new FileReader(file);

        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String x=bufferedReader.readLine();
        while (x!=null){
            System.out.println(x);
            x=bufferedReader.readLine();
        }
        System.out.println(x);
        bufferedReader.close();
    }
}
