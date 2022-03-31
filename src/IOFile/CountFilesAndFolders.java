package IOFile;

import java.io.File;

public class CountFilesAndFolders {
    public static void main(String[] args) {
        String path = "D:\\IpOp\\ipop";
        File file=new File(path);
        int count=0;
        int countfiles=0;
        File[] files=file.listFiles();

        for (File f:files) {
            if(f.isDirectory()){
                count++;
            }
            else if(f.isFile()){
                countfiles++;
            }


        }
        System.out.println("Folders number is "+count);
        System.out.println("Files number is "+countfiles);

    }
}
