package IOFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class DemoFile {
    public static void main(String[] args) throws IOException {
        String path="D:\\IpOp";

        File file = new File(path);
//        file.createNewFile();
       /* System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParent());
        System.out.println(file.getName());
        System.out.println(file.getTotalSpace());
        System.out.println(file.getUsableSpace());
        System.out.println(file.hashCode());
        System.out.println(file.isFile());*/

//        System.out.println(file.listFiles());
        File[] files=file.listFiles();
        for (File f:files) {
            System.out.println(f);

        }

        //        System.out.println(file.delete());
//        file.mkdir();
       /* System.out.println(file.canWrite());
        FileWriter write=new FileWriter(file);
        write.write("Welcome to ABC \n");
        char[] s={'a','b','c'};


        write.write(33);
        write.append('\n');

        write.write(s);
        write.append('\n');

        write.write(path);
        write.append('\n');
        write.write("Welcome to Abc",0,5);
        write.append('\n');

        write.flush();
        write.close();*/


    }
}
