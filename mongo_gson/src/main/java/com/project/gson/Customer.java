package com.project.gson;

public class Customer {

    private String name;
    private int age;
    private String email;
    private String phone;

    public Customer(String name, int age, String email, String phone) {
        
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
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
        return "Customer [name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone + "]";
    }
}
