package com.example.Data;
public class UserClass{
    private String UserName;
    private int ClassNumber;
    private String ClassName;
    private int ClassTime;

    public UserClass(String userName, int classNumber, String className, int classTime) {
        UserName = userName;
        ClassNumber = classNumber;
        ClassName = className;
        ClassTime = classTime;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getClassNumber() {
        return ClassNumber;
    }

    public void setClassNumber(int classNumber) {
        ClassNumber = classNumber;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public int getClassTime() {
        return ClassTime;
    }

    public void setClassTime(int classTime) {
        ClassTime = classTime;
    }

    @Override
    public String toString() {
        return "UserClass [ClassName=" + ClassName + ", ClassNumber=" + ClassNumber + ", ClassTime=" + ClassTime
                + ", UserName=" + UserName + "]";
    }

    
}