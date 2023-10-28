import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the number of teachers: ");
        int numberOfTeachers = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[numberOfStudents];
        Teacher[] teachers = new Teacher[numberOfTeachers];

        College college = new College("CCI College", new ArrayList<>(), new ArrayList<>());

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter 3 grades (space-separated): ");
            String[] gradesStr = scanner.nextLine().split(" ");
            int[] grades = new int[3];
            for (int j = 0; j < 3; j++) {
                grades[j] = Integer.parseInt(gradesStr[j]);
            }
            students[i] = new Student(name, id, grades);
        }

        for (int i = 0; i < numberOfTeachers; i++) {
            System.out.println("Enter details for teacher " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Subject: ");
            String subject = scanner.nextLine();
            teachers[i] = new Teacher(name, subject);
        }

        college.setStudents(new ArrayList<>(Arrays.asList(students)));
        college.setTeachers(new ArrayList<>(Arrays.asList(teachers)));

        System.out.println("College Name: " + college.getName());
        System.out.println("Students:");
        for (Student student : college.getStudents()) {
            System.out.2println("Name: " + student.getName() + ", ID: " + student.getId() + ", Grades: " + Arrays.toString(student.getGrades()));
        }

        System.out.println("Teachers:");
        for (Teacher teacher : college.getTeachers()) {
            System.out.println("Name: " + teacher.getName() + ", Subject: " + teacher.getSubject());
        }
    }
}






