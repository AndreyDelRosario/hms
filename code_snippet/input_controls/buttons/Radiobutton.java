import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Radiobutton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JRadioButton Example");
        JRadioButton radio1 = new JRadioButton("Option 1");
        JRadioButton radio2 = new JRadioButton("Option 2");
        JRadioButton radio3 = new JRadioButton("Option 3");
        ButtonGroup group = new ButtonGroup();
        ActionListener actionListener = e -> {
            JRadioButton button = (JRadioButton) e.getSource();
            System.out.println(button.getText() + " selected");
        };
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        radio1.addActionListener(actionListener);
        radio2.addActionListener(actionListener);
        radio3.addActionListener(actionListener);
        frame.add(new JLabel("Select an option:"));
        frame.add(radio1);
        frame.add(radio2);
        frame.add(radio3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
