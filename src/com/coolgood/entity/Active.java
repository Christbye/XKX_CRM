package com.coolgood.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by christ on 15/1/12.
 * Make move.
 */
public class Active implements Serializable {
    private Serializable id;
    private String name;
    private int duration;
    private double price;
    private int quantity;
    private Date date;
    private int amount;//人数
    private List<Customer> customerList;

    public Active() {
    }

    public Active(Serializable id, String name, int duration, double price, int quantity, Date date, int amount) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
        this.amount = amount;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Active)) return false;

        Active active = (Active) o;

        if (!id.equals(active.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Active{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", quantity=" + quantity +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}
