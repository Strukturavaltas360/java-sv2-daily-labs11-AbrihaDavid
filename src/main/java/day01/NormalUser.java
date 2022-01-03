package day01;

public class NormalUser implements User {

    private String password;
    private String email;

    public NormalUser(String password, String email) {
        this.password = password;
        this.email = email;
    }

    @Override
    public String getUserEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
