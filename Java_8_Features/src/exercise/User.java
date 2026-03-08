package exercise;

public class User implements IValidate{
    private String userId;
    private String password;

    public void addUser(String userid,String password){
        this.userId = userid;
        this.password = password;
    }

    public boolean IsAuthenticated(String userid,String password){
        if(userid.equals(this.userId) && password.equals(this.password)){
            return true;
        }
        return false;
    }
}
