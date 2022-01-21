package brigde;

import java.io.File;

public abstract class Bridge {
    public final char SEPARATE;
    protected final Program program;
    protected Bridge(char seperate,Program program) {
        this.SEPARATE = seperate;
        this.program=program;
    }

    public abstract void clear();
    public abstract void readFile(File file);
}
