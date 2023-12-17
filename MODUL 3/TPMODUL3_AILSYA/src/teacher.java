public class teacher extends user {
    public teacher(String name, int id) {
        super(name, id);
    }
    public void teachClass(String course) {
        System.out.println("Teacher: " + this.name + ", Teaching: " + course);
    }
    
    public String getUserDetails() {
        return super.getUserDetail() + ", Teaching: " + this.name;
    }
}
