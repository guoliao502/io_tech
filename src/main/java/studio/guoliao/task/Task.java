package studio.guoliao.task;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface Task extends Runnable {

    InputStream gainInputStream() throws IOException;

    OutputStream gainOutputStream() throws IOException;

    void work();
}
