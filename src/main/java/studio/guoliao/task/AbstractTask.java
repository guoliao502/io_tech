package studio.guoliao.task;


import studio.guoliao.model.Request;
import studio.guoliao.model.Response;

import java.io.InputStream;
import java.io.OutputStream;

public abstract class AbstractTask implements Task {

    @Override
    public void run() {
        work();
    }

    @Override
    public void work() {
        try{
            InputStream in = gainInputStream();
            Request request = Request.read(in);
            Response response = doWork(request);
            OutputStream out = gainOutputStream();
            out.write(response.format());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public abstract Response doWork(Request request);
}
