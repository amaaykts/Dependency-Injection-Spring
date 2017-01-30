package client;


import server.Service;

public class Client{
    private Service service;
    public Client() {
    }

    public Client(Service service) {
        this.service = service;
        System.out.println("Constructor");
    }

    public void setService(Service service) {
        this.service = service;
        System.out.println("Setter");
    }

    public String greet(){
        return "Hello " + service.getName();
    }
}

