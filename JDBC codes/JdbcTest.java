public class JdbcTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            System.out.println("✅ All drivers loaded successfully!");
        } catch (ClassNotFoundException e) {
            System.err.println("❌ Driver loading failed:");
            e.printStackTrace();
        }
    }
}