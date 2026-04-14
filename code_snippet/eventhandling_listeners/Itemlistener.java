import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Itemlistener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ItemListener Example");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox checkBox = new JCheckBox("Option");
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Selected");
                } else {
                    System.out.println("Deselected");
                }
            }
        });
        frame.add(checkBox);
        frame.setVisible(true);
    }
}
