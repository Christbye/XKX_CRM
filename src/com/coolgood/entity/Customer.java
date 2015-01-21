package com.coolgood.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by christ on 15/1/12.
 * Make move.
 */
public class Customer implements Serializable {
    private Serializable id;
    private String name;
    private String address;
    private int age;
    private Date birthday;
    private double salary;
    private Job job;
    private boolean hasPet;

    public Customer() {
    }

    public Customer(Serializable id, String name, String address, int age, Date birthday, double salary, Job job, boolean hasPet) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.birthday = birthday;
        this.salary = salary;
        this.job = job;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (!id.equals(customer.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", salary=" + salary +
                ", job=" + job +
                '}';
    }
}
