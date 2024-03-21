package web.model;

import org.springframework.stereotype.Component;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", from='" + from + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(name, car.name) && Objects.equals(from, car.from);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, from);
    }
}
