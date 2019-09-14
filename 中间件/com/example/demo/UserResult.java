package com.example.demo;
public class UserResult{
    private String name;
    private String password;
    private String address;
    private String className;
    private int classNumber;
    
    public UserResult() {
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



    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "UserResult [address=" + address + ", className=" + className + ", classNumber=" + classNumber
                + ", name=" + name + ", password=" + password + "]";
    }
}