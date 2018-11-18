package studio.guoliao.server;

/**
 * server's interface, include init, startup, stop, status method
 * do some init action in init method
 * start server listen and process in startup method
 * stop server listen in stop method
 * return server's running in status method
 * */
public interface Server {

    void init();

    void startup();

    void stop();

    boolean status();

}
