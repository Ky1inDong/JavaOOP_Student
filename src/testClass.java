import model.Student;

public class testClass {
    public static void main(String[] args) {
        Student he = new Student("Tom", 20, "male", "1145141919810");
        System.out.println(he.getName());
        System.out.println(he.getAge());
        System.out.println(he.getGender());
        System.out.println(he.getId());
    }
}
