package org.example.ws;

import javax.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8090/ws/helloworld", new HelloWorldImpl());
    }
}
