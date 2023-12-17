public class user {
    protected String name;
    protected int id;

    public user(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getUserDetail(){
        return " user: "+ this.name + ", ID:"+ this.ID;
    }
}