import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import javax.swing.event.*;
public class Search extends JFrame {
    public Search() {
        JTextField search = new JTextField();
        String[] cols = {"Item"};
        Object[][] data = {{"Apple"}, {"Banana"}, {"Grape"}};
        DefaultTableModel model = new DefaultTableModel(data, cols);
        JTable table = new JTable(model);
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);
        search.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { update(); }
            public void removeUpdate(DocumentEvent e) { update(); }
            public void changedUpdate(DocumentEvent e) { update(); }
            void update() {
                String t = search.getText();
                sorter.setRowFilter(t.isEmpty() ? null : RowFilter.regexFilter("(?i)" + t));
            }
        });
        setLayout(new BorderLayout());
        add(search, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) { new Search(); }
}
