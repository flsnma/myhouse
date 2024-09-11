package com.cxl.qm.demo3;

public class Student extends Person {
    private int sno;

    public void study(){
        System.out.println("学习");
    }

    public Student() {
    }

    public Student(int sno) {
        this.sno = sno;
    }

    public Student(String name, int age, int sno) {
        super(name, age);
        this.sno = sno;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }
    @Override
    public void speak(){
        //父类中的 name 字段是private这意味着它不能被子类直接访问
        System.out.println(getName() + "说话");
    }
}
