import java.util.ArrayList;

public class College {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
     College(String name,ArrayList<Student> students,ArrayList<Teacher> teachers){
         this.name=name;
         this.students=students;
         this.teachers=teachers;

     }
     //this code right below is  the setter and getter methods for the instance variable name
    public String getName() {

         return name;
    }

    public void setName(String name) {

         this.name = name;
    }
    //this code right below is  the setter and getter methods for the instance variable students

    public void setStudents(ArrayList<Student> students) {

         this.students = students;
    }

    public ArrayList<Student> getStudents() {

         return students;
    }
    //this code right below is  the setter and getter methods for the instance variable teachers

    public ArrayList<Teacher> getTeachers() {

         return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {

         this.teachers = teachers;
    }
}
