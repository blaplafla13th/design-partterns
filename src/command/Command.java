package command;

import java.io.File;

public interface Command {
    void exec();
    void setFile(File file);
}
