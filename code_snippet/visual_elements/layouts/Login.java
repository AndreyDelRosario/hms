import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame {
    private JLabel userLabel = new JLabel("Username:");
    private JLabel passLabel = new JLabel("Password:");
    private JTextField userText = new JTextField(20);
    private JPasswordField passText = new JPasswordField(20);
    private JButton loginButton = new JButton("Login");
    public Login() {
        super("Login Page");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(userLabel);
        container.add(userText);
        container.add(passLabel);
        container.add(passText);
        container.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passText.getPassword());

                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Credentials");
                }
            }
        });
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Login();
    }
}
