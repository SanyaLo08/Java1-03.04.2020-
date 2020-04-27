package Lesson5_HW5;

public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + this.position + this.email + this.phone + this.salary + ", " + this.age + ".";
    }

    public int getAge() {
        return this.age;
    }
    public void printPerson() {
        System.out.println("Имя " + name + "должность " + position + email + "телефон "
                + phone + "зарплата" + salary + "возраст сотркдника " + age);
    }
}
