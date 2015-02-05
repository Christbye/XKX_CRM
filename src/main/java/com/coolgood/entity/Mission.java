package com.coolgood.entity;

import java.io.Serializable;

/**
 * Created by christ on 15/1/12.
 * Make move.
 */
public class Mission implements Serializable {
    private Serializable id;
    private String name;
    private int code;

    public Mission() {
    }

    public Mission(Serializable id, String name, int code) {
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mission)) return false;

        Mission mission = (Mission) o;

        if (!id.equals(mission.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Mission{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
