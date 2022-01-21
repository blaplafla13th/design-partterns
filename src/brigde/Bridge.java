package brigde;

public abstract class Bridge {
    public final char seperate;

    protected Bridge(char seperate) {
        this.seperate = seperate;
    }

    public abstract void clear();
}
