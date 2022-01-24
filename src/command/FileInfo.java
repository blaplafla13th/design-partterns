package command;

import java.io.File;
import java.util.Date;

public class FileInfo implements Command{
    private File file;

    public FileInfo(File file) {
        this.file = file;
    }

    @Override
    public void exec() {
        try {
            String type = (file.isFile())?"File":"Folder";
            Date lastModified = new Date(file.lastModified());
            System.out.println("Path: "+file.getAbsolutePath());
            System.out.println(type+" size: "+file.length()/1024+"KB");
            System.out.println("Last Modified: "+ lastModified);
            System.out.println("CanRead: "+file.canRead());
            System.out.println("CanWrite: "+file.canRead());
            System.out.println("CanExecute: "+file.canRead());
        } catch (Exception e) {
            System.out.println("File not Found");
        }
    }
}
