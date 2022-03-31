package IOFile;

import java.io.*;

public class ReaderBuffer {
    public static void main(String[] args) throws IOException {
        String path="D:\\IpOp\\ipop\\bcd.txt";
        File file=new File(path);
        FileWriter writer=new FileWriter(file,true);
        BufferedWriter bufferedWriter=new BufferedWriter(writer);

        for(int i=0;i<=10;i++){
            bufferedWriter.write("Abdb");
            bufferedWriter.append('\n');
        }


        bufferedWriter.flush();
    }
}
