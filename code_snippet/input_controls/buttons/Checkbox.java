import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Checkbox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JCheckBox Example");
        JCheckBox checkBox1 = new JCheckBox("Java");
        JCheckBox checkBox2 = new JCheckBox("Python", true); // Pre-selected
        JCheckBox checkBox3 = new JCheckBox("C++");
        JLabel label = new JLabel("Select languages:");
        ItemListener listener = e -> {
            String selected = "";
            if (checkBox1.isSelected()) selected += "Java ";
            if (checkBox2.isSelected()) selected += "Python ";
            if (checkBox3.isSelected()) selected += "C++ ";
            label.setText("Selected: " + selected);
        };
        label.setPreferredSize(new Dimension(250, 20));
        checkBox1.addItemListener(listener);
        checkBox2.addItemListener(listener);
        checkBox3.addItemListener(listener);
        frame.add(label);
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
