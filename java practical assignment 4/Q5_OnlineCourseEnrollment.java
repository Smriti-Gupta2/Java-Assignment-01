import java.util.*;

class CourseEnrollment {
    LinkedHashSet<String> students = new LinkedHashSet<>();

    void enrollStudent(String name) {
        if (students.add(name))
            System.out.println("Enrolled: " + name);
        else
            System.out.println(name + " is already enrolled");
    }

    void displayEnrolledStudents() {
        System.out.println("Enrolled Students: " + students);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseEnrollment c = new CourseEnrollment();

        System.out.print("Enroll: ");
        c.enrollStudent(sc.nextLine());

        System.out.print("Enroll: ");
        c.enrollStudent(sc.nextLine());

        System.out.print("Enroll: ");
        c.enrollStudent(sc.nextLine());

        c.displayEnrolledStudents();
    }
}