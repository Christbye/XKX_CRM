package com.coolgood.entity;

import java.io.Serializable;

/**
 * Created by christ on 15/1/12.
 * Make move.
 */
public class Department implements Serializable {
    private Serializable id;
    private String name;
    private DeProperty deProperty;

    public Department() {
    }

    public Department(Serializable id, String name, DeProperty deProperty) {
        this.id = id;
        this.name = name;
        this.deProperty = deProperty;
    }

    public Serializable getId() {
        return id;
    }

    public void setId(Serializable id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeProperty getDeProperty() {
        return deProperty;
    }

    public void setDeProperty(DeProperty deProperty) {
        this.deProperty = deProperty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;

        Department that = (Department) o;

        if (!id.equals(that.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deProperty=" + deProperty +
                '}';
    }
}
