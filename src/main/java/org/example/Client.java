package org.example;

public class Client {
    String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean receive(Message message) {
        return true;
    }
}
