package IOFile;

import java.io.*;

public class Bufferedwrite {
    public static void main(String[] args) throws IOException {
        String path="D:\\IpOp\\ipop\\RandomFolder\\abcde.txt";
        File file=new File(path);

        FileWriter fileWriter=new FileWriter(file,true);

        /*BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write("Happy birthday Ab de villiers ");
        bufferedWriter.append("\n");*/
        PrintWriter p = new PrintWriter(file);
        p.println(100);
        p.println("hgdhgd");
        p.println('f');

//        p.flush();
        p.close();

    }
}
