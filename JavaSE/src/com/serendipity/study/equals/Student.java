package com.serendipity.study.equals;

import java.util.HashMap;

public class Student {
    private String name;
    private Integer age;


    public Student(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }



    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub

        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        if (name.equals(student.name) && age == student.age) {
            return true;
        }
        return false;
    }



    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        final int temp = 31;
        int result = 1;
        result = temp * result + ((name == null) ? 0 : name.hashCode());
        result = temp * result + age;
        return result;
    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student student = new Student("Tom", 10);
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put(student, "X001");
        System.out.println(hashMap.get(new Student("Tom", 10)));


    }

}
