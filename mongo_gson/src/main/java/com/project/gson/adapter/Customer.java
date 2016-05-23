package com.project.gson.adapter;

public class Customer {

    private Object _id;
    private String name;
    private int age;
    private String email;
    private String phone;

    public Customer(Object _id, String name, int age, String email, String phone) {

        this._id = _id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public Object getId() {
        return _id;
    }

    public void setId(Object _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" + "_id=" + _id + ", name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone + '}';
    }

}
