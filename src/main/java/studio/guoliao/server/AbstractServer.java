package studio.guoliao.server;

import studio.guoliao.listener.Listener;
import studio.guoliao.processor.Processor;
import studio.guoliao.task.Task;

/**
 * AbstractServer
 * @author guoliao
 * @date 2018-11-17
 * */
public abstract class AbstractServer implements Server {

    protected Listener listener;

    protected Processor processor;

    @Override
    public void init(){
        this.listener = initListener();
        this.processor = initProcessor();
    }

    @Override
    public void startup(){
        try{
            init();

            while(status()){
                Task task = listener.listen();
                processor.process(task);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void stop(){
        listener.stop();
    }

    @Override
    public boolean status(){
        return listener.status();
    }

    abstract Listener initListener();

    abstract Processor initProcessor();
}
