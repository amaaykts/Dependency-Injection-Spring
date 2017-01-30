package server;

import client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutowiredDemo {
    @Autowired
    @Qualifier("client2")
    private Client client;

    @Autowired
    Service service;
    public String callClient(){
        return client.greet();
    }
}
