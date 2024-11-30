package Oops;

class Student {
    String name;
    int age;

    public void Student() {
        System.out.println(name);
    }

    Student() {
        this.name

    }
}

public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Om";
        s1.age = 77;
        s1.Student();
    }
}
