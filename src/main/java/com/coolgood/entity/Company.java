package com.coolgood.entity;

import java.io.Serializable;

/**
 * Created by christ on 15/1/12.
 * Make move.
 */
public class Company implements Serializable {
    private Serializable id;
    private String name;
    private String address;
    private String phone;
    private String fax;
    private CoProperty coProperty;

    public Company() {
    }

    public Company(Serializable id, String name, String address, CoProperty coProperty, String phone, String fax) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.fax = fax;
        this.coProperty = coProperty;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public CoProperty getCoProperty() {
        return coProperty;
    }

    public void setCoProperty(CoProperty coProperty) {
        this.coProperty = coProperty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;

        Company company = (Company) o;

        if (!id.equals(company.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", coProperty=" + coProperty +
                '}';
    }
}
