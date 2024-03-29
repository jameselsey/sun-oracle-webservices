package chapter1.ts;

import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "chapter1.ts.TimeServer")
public class TimeServerImpl implements TimeServer {

    @Override
    public String getTimeAsString() {
        return new Date().toString();
    }

    @Override
    public long getTimeAsElapsed() {
        return new Date().getTime();
    }
}
