package studio.guoliao.listener;

import studio.guoliao.task.Task;

public interface Listener extends Runnable {

    Task listen() throws Exception;

    void stop();

    boolean status();
}
