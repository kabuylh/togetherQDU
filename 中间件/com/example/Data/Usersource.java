package com.example.Data;

public class Usersource{
    private String name;
    private String address;
    public Usersource(){
        name="suhuyuan";
        address="QingDao University";
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

    @Override
    public String toString() {
        return "Usersource [address=" + address + ", name=" + name + "]";
    }
    
}