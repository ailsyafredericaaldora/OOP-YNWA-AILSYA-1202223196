import java.util.ArrayList;

public class Student extends user{
    protected ArrayList<String> enrolledCourse;

    public Student(String name, int id) {
        super(name, id);
        this.enrolledCourse = new ArrayList<>();
    }
    public void enrollInCourse(String course) {
        this.enrolledCourse.add(course);
    }
    public String getUserDetails() {
        return super.getUserDetail() + ", Enrolled Course: " + this.enrolledCourse;
    }
}
    

