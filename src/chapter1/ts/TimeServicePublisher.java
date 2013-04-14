package chapter1.ts;

import javax.xml.ws.Endpoint;

public class TimeServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:9876/ts", new TimeServerImpl());
    }
}
