package web.model;

import org.springframework.stereotype.Component;

public class Car {
    private int id;
    private String name;
    private String from;

    public Car(int id, String name, String from) {
        this.id = id;
        this.name = name;
        this.from = from;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
