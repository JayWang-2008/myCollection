package com.JayWang;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<>();
        c.add(new Student("汪斌斌",40));
        c.add(new Student("于飞",43));
        c.add(new Student("汪泽翀",13));
        for(Student student : c){
            System.out.println("姓名："+student.getName());
            System.out.println("年龄："+student.getAge());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
