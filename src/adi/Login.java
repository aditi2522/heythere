package adi;

import java.util.Arrays;
import java.util.Scanner;

public class Login {
    private static Student[] secG;
    private static int bottom;

    public static void insert(Student student) {
        if (bottom != secG.length - 1) {
            bottom++;
            secG[bottom] = student;
        }
    }

    public Login(int NOS) {
        secG = new Student[NOS];
        bottom = -1;
    }

    public void display() {
        for (Student student : secG) {
            if (student != null)
                System.out.println(student.getName());
        }

    }

    public static void main(String[] args) {
        Login list = new Login(37);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 37; i++) {
            Student student = new Student();
            student.setName("Guddu" + i);
            student.setRollno(i);
            list.insert(student);
        }
        list.display();
    }


    static class Student {
        private int rollno;
        private String name;

        public int getRollno() {
            return rollno;
        }

        public void setRollno(int rollno) {
            this.rollno = rollno;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "(" + rollno + "," + name + ")";
        }
    }
}

