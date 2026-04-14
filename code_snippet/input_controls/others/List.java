import javax.swing.*;
import java.awt.*;
public class List {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JList<String> list = new JList<>(items);
        JScrollPane scrollPane = new JScrollPane(list);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);        
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
