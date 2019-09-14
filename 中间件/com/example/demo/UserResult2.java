package com.example.demo;
public class UserResult2{
    private String name;
    private String password;
    private String address;

    
    public UserResult2() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserResult2 [address=" + address + ", name=" + name + ", password=" + password + "]";
    }


}