public class Test{ 
   public static void main(String[] args) {
        Log log = Log.getInstance();
        final String LOG_PATH = "log.txt";
        try {
            Integer.parseInt("a"); //loi vi du
        } catch (Exception e) {
            log.write(e.toString(), LOG_PATH);
        }
        log.read(LOG_PATH);
    }
}