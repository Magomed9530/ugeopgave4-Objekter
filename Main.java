/*Opgave 1
public class Main {

    // Finder den ældste student
    public static Student findOldest(Student[] students) {
        Student oldest = students[0];

        for (Student s : students) {
            if (s.age > oldest.age) {
                oldest = s;
            }
        }

        return oldest;
    }

    // Finder en student ud fra ID
    public static Student findById(Student[] students, String id) {
        for (Student s : students) {
            if (s.studentId != null && s.studentId.equals(id)) {
                return s;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        // Opretter 3 studerende
        Student s1 = new Student("Anna", 21);
        Student s2 = new Student("Peter", 19);
        Student s3 = new Student("Maria", 23);

        // Gemmer studerende i et array
        Student[] students = {s1, s2, s3};

        System.out.println("Alle studerende:");

        // Udskriver alle studerende
        for (Student s : students) {
            s.printInfo();
        }

        // Finder den ældste
        Student oldest = findOldest(students);

        System.out.println("\nÆldste studerende:");
        oldest.printInfo();


        System.out.println("\n=== Med student ID ===");

        // Opretter studerende med ID
        Student st1 = new Student("Anna", 21, "S001");
        Student st2 = new Student("Peter", 19, "S002");
        Student st3 = new Student("Maria", 23, "S003");

        Student[] studentsWithId = {st1, st2, st3};

        // Søger efter ID S002
        Student found = findById(studentsWithId, "S002");

        if (found != null) {
            System.out.println("Fundet studerende med ID S002:");
            found.printInfo();
        }
    }
}

 */