package IOFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DuplicateAdd {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = "D:\\IpOp\\ipop\\";

        System.out.println("Enter the name of the file");
        String name = scanner.next();

        boolean flag = true;
        File file = new File(path);

        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                if (name.equals(f.getName())) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag == false) {
            System.out.println("File already exists");
        } else {
            String newpath = path.concat(name);
            File file1 = new File(newpath);
            file1.createNewFile();
            System.out.println("New file " + name + " has been successfully created");
        }
    }

}
