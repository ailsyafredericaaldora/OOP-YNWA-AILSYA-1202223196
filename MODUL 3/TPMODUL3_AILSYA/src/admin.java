public class admin extends user {
    public admin(String name, int id) {
        super(name, id);
    }
    public void manageSystem(String course) {
        System.out.println("Admin: " + this.name + ", Managing: " + course);
    }
    public String getUserDetails() {
        return super.getUserDetail() + ", Managing: " + this.name;
    }
}
