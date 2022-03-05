import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {
    JPanel loginForm;
    JButton login;
    JLabel userLabel, passwordLabel;
    JTextField username, password;
    LoginForm() {
        userLabel = new JLabel();
        userLabel.setText("UserName");

        passwordLabel = new JLabel();
        passwordLabel.setText("Password");

        username = new JTextField(15);
        password = new JPasswordField(15);

        login = new JButton("Submit");

        loginForm = new JPanel(new GridLayout(3, 1));
        loginForm.add(userLabel);
        loginForm.add(username);
        loginForm.add(passwordLabel);
        loginForm.add(password);
        loginForm.add(login);

        add(loginForm, BorderLayout.CENTER);

        login.addActionListener(this);
        setTitle("Login Form");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userNameVal = username.getText();
        String passwordVal = password.getText();

        if(userNameVal.equals("ahmad") && passwordVal.equals("123456")) {
            NewPage page = new NewPage();
            page.setVisible(true);

            JLabel welcome = new JLabel("Welcome" + userNameVal);
            page.getContentPane().add(welcome);
        } else {
            System.out.println("your username && password is incorrect");
        }
    }
}
