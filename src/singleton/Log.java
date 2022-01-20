package singleton;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Log {
    private static Log INSTANCE = new Log();
    private static final SimpleDateFormat time = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    private File logFile;
    private Log() {
    }

    public static Log getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Log();
        }
        return INSTANCE;
    }

    public boolean check(String logFilePath) {
        try {
            logFile = new File(logFilePath);
            if (!logFile.isFile()) {
                logFile.createNewFile();
                System.out.println("Log file not found. Created new file");
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void write(String info, String logFilePath) {
        Date now = new Date();
        if(!check(logFilePath))
            return;
        try {
            FileWriter logWriter = new FileWriter(logFile, true);
            String mess = String.format("%s: %s%n", time.format(now), info);
            logWriter.write(mess);
            logWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File cant write");
        }
    }

    public void read(String logFilePath) {
        if(!check(logFilePath))
            return;
        try {
            Scanner logReader = new Scanner(logFile);
            while (logReader.hasNextLine()) {
                System.out.println(logReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}