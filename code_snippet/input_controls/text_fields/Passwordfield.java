import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Passwordfield {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Password Field Example");
        JPanel panel = new JPanel();
        JPasswordField passwordField = new JPasswordField(15);
        JButton submitButton = new JButton("Submit");
        JLabel label = new JLabel("Enter Password:");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                char[] input = passwordField.getPassword();
                String password = new String(input);
                System.out.println("Password: " + password);
                java.util.Arrays.fill(input, '0');
            }
        });
        passwordField.setEchoChar('*');
        panel.add(label);
        panel.add(passwordField);
        panel.add(submitButton);        
        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
