public class User {
    private int password;
    public void setPassword(int password) {
        this.password = encryptPassword(password);
    }
    public int getPassword() {
        return decryptPassword();
    }
    private int encryptPassword(int password) {
        return password + 2;
    }
    private int decryptPassword() {
        return password - 2;
    }
} 