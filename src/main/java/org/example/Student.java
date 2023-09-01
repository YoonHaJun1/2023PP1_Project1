package org.example;

public class Student {
    String hno;
    String name;

    public String getHno() {
        return hno;
    }

    public String getName() {
        return name;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Student(String hno, String name) {
        this.hno = hno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hno='" + hno + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
