/*Opgave 1
public class Student {

    String name;
    int age;
    String studentId;

    // Constructor uden student ID
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor med student ID
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Udskriver studentens information
    public void printInfo() {
        System.out.println(name + " er " + age + " år");

        if (studentId != null) {
            System.out.println("  ID: " + studentId);
        }
    }
}
/*