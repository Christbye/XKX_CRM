package com.coolgood.entity;

import java.io.Serializable;

/**
 * Created by christ on 15/1/13.
 * Make move.
 */
public class Job {
    private Serializable id;
    private Company company;
    private Department department;
    private JobPosition jobPosition;


    public Job() {
    }

    public Job(Serializable id, Company company, Department department, JobPosition jobPosition) {
        this.id = id;
        this.company = company;
        this.department = department;
        this.jobPosition = jobPosition;
    }

    public Serializable getId() {
        return id;
    }

    public void setId(Serializable id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;

        Job job = (Job) o;

        if (!id.equals(job.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", company=" + company +
                ", department=" + department +
                ", jobPosition=" + jobPosition +
                '}';
    }
}
