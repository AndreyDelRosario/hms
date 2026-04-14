import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Itemevent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ItemEvent Example");
        JCheckBox checkBox = new JCheckBox("Toggle Option");
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Selected");
                } else {
                    System.out.println("Deselected");
                }
            }
        });
        frame.setLayout(new FlowLayout());
        frame.add(checkBox);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}