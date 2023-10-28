public class Teacher {
    String name;
    String subject;

    // this is constructor
    Teacher(String name,String subject){
        this.name=name;
        this.subject=subject;

    }
    //this code right below is the setter and getter methods for instance variable name

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    //this code right below is the setter and getter methods for instance variable subject

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
