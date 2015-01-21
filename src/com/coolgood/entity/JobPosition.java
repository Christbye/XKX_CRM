package com.coolgood.entity;

import java.io.Serializable;

/**
 * Created by christ on 15/1/13.
 * Make move.
 */
public class JobPosition implements Serializable {
    private Serializable id;
    private String name;
    private int code;

    public JobPosition() {
    }

    public JobPosition(Serializable id, String name, int code) {
        this.id = id;
        this.name = name;
        this.code = code;
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

    public int getValue() {
        return code;
    }

    public void setValue(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobPosition)) return false;

        JobPosition that = (JobPosition) o;

        if (!id.equals(that.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
