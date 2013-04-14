package chapter1.ts;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;


public class TimeClient {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://localhost:9876/ts?wsdl");

        QName qname = new QName("http://ts.chapter1/", "TimeServerImplService");

        Service service = Service.create(url, qname);

        TimeServer eif = service.getPort(TimeServer.class);

        System.out.println(eif.getTimeAsString());
        System.out.println(eif.getTimeAsElapsed());
    }
}
