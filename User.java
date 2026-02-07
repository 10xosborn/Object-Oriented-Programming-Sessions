public class User {
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getusername(){
        return username;
    }

    public void setusername(String newUsername){
        username = newUsername;
    }
    
    public void setpassword(String newPassword){
        password = newPassword;
    }

    public boolean verifyPassword(String inputPassword){
        return password.equals(inputPassword);
    }
}