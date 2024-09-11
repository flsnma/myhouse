package com.cxl.qm.demo3;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        System.out.println(student.getName());
        student.speak();
        student.study();
    }
}
