package command;

import java.io.File;

public class Program {
    private Command viewFile ;
    private Command fileInfo;
    private Command viewFolder;
    private File file;

    public Program(Command viewFile, Command fileInfo, Command viewFolder, File file) {
        this.viewFile = viewFile;
        this.fileInfo = fileInfo;
        this.viewFolder = viewFolder;
        this.file = file;
    }

    public void updatePath(File file){
        viewFolder.setFile(file);
        fileInfo.setFile(file);
        viewFile.setFile(file);
        this.file=file;
    }

    public void changeDirectory(String path){
        File tmpfile=new File(path);
        if (!tmpfile.exists()){
            System.out.println("Not Found");
            return;
        }
        updatePath(file);
    }
    public void select(String path){
        File tmpfile=new File(file.getAbsoluteFile()+File.separator+path);
        if (!tmpfile.exists()){
            System.out.println("Not Found");
            return;
        }
        updatePath(file);
    }
    public void view(){
        if (file.isFile()){
            viewFile.exec();
        } else if (file.isDirectory()){
            viewFolder.exec();
        } else if (!file.exists()){
            System.out.println("Not Found");
        }
    }
    public void getInfo(){
        fileInfo.exec();
    }
    public String getPath(){
        return file.getAbsolutePath();
    }
    public String[] listIn(){
        String[] list = null;
        if(file.isDirectory()){
            File[] listFiles = file.listFiles();
            if (listFiles==null){
                return list;
            }
            list = new String[listFiles.length];
            for (int i = 0; i < listFiles.length; i++) {
                String type =(listFiles[i].isDirectory())?"/":"";
                list[i]=type+listFiles[i].getName();
            }
        }
        return list;
    }
}
