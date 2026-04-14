import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Combobox {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("JComboBox Complete Example");
        String[] languages = {"Java", "Python", "C++", "JavaScript", "Go"};
        JComboBox<String> comboBox = new JComboBox<>(languages);
        JLabel label = new JLabel("Selected: " + comboBox.getSelectedItem());
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                label.setText("Selected: " + selected);
            }
        });
        comboBox.setSelectedIndex(0);
        frame.add(comboBox);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}