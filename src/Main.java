import java.util.ArrayList;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {


        // Creating Student objects
        Student student1 = new Student("Yaredo", 2506, new int[]{90, 85, 88});
        Student student2 = new Student("amir", 1574, new int[]{95, 78, 85});


        // Creating Teacher objects
        Teacher teacher1 = new Teacher("Mr. Ergoye", "Data commmunication and Network");
        Teacher teacher2 = new Teacher("Ms. Andamlak", "Data structure and algorithm");

        // Creating College object
        College college = new College("CCI College", new ArrayList<>(), new ArrayList<>());

        // Adding Student and Teacher objects to the College
        ArrayList<Student> students = college.getStudents();
        students.add(student1);
        students.add(student2);
        college.setStudents(students);

        ArrayList<Teacher> teachers = college.getTeachers();
        teachers.add(teacher1);
        teachers.add(teacher2);
        college.setTeachers(teachers);

        // Print out details
        System.out.println("College Name: " + college.getName());
        System.out.println("Students:");
        for (Student student : college.getStudents()) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId() + ", Grades: " + Arrays.toString(student.getGrades()));
        }

        System.out.println("Teachers:");
        for (Teacher teacher : college.getTeachers()) {
            System.out.println("Name: " + teacher.getName() + ", Subject: " + teacher.getSubject());
        }
    }
    }






