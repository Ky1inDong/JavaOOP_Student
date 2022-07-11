package model;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String id;

    public Student(String n, int a, String g, String i) {
        this.name = n;
        this.age = a;
        this.gender = g;
        this.id = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String g) {
        this.gender = g;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String i) {
        this.id = i;
    }
}
