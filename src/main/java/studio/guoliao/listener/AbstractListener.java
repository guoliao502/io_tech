package studio.guoliao.listener;


public abstract class AbstractListener implements Listener {

    protected volatile boolean running = true;

    @Override
    public void run() {
        try {
            this.listen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
