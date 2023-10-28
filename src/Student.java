public class Student {
    private String name;
    private int id;
    private int[] grades;

    // This Code right below is Constructor to initialize the attributes
    public Student(String name, int id, int[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    // This Code right below is Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //This Code right below is Getter and Setter methods for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // This Code right below is Getter and Setter methods for grades
    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}

