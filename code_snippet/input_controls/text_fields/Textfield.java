import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Textfield {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField Example");
        JTextField textField = new JTextField(16);
        JButton button = new JButton("Submit");
        JLabel label = new JLabel("Enter text above");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get text from JTextField [2]
                String enteredText = textField.getText();
                label.setText("You entered: " + enteredText);
            }
        });
        frame.add(textField);
        frame.add(button);
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());
    }
}
