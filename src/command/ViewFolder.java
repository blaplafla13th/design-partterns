package command;

import java.io.File;

public class ViewFolder implements Command{
    private File file;

    public ViewFolder(File file) {
        this.file = file;
    }

    @Override
    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void exec() {
        try {
            File[] list = file.listFiles();
            if (list == null){
                System.out.println("Empty folder");
                return;
            }
            for (File file1:list) {
                String type =(file1.isDirectory())?"/":"";
                System.out.println(type+file1.getName());
            }
        } catch (Exception e){
            System.out.println("Folder not found");
        }
    }
}
