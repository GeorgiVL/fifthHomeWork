package com.fifthHomeWork;

public class main {
    public static void main(String[] args) {
        // call person instances
        Person person = new Person();
        person.setName("Robert");
        person.setAge(23);
        person.setHeight(1.73);
        person.setWeight(63);


        // call student instances
        Student student = new Student();
        String nameStudent = student.name = "Georgi";
        int ageStudent = student.age = 23;
        student.setStudentFakNo(16311014);
        System.out.println(nameStudent + " " + ageStudent + " fakNo--> " + student.getStudentFakNo());

        System.out.println("Person name: " + person.getName());
        System.out.println("Weight: " + person.getWeight());
        System.out.println("Height: " + person.getHeight());
        System.out.println("Age: " + person.getAge());



    }
}
