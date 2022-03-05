import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
            LoginForm loginForm = new LoginForm();
            loginForm.setSize(300, 100);
            loginForm.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
