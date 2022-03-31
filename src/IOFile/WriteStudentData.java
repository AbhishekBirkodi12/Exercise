package IOFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteStudentData {
    public static void main(String[] args) throws IOException {
        String path="D:\\IpOp\\ipop\\student.txt";
        File file=new File(path);
        file.createNewFile();
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("Student Name: Abhishek \n");
        fileWriter.write("Roll no: 1MS13IT002 \n");
        fileWriter.write("Marks:100");
        fileWriter.flush();


    }


}
