import javax.swing.*;
import java.awt.*;
public class Scrollbar {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollBar Example");
        JTextArea textArea = new JTextArea("Scroll down...", 10, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JScrollBar verticalBar = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 100);
        verticalBar.addAdjustmentListener(e -> {
            System.out.println("Value: " + e.getValue());
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(verticalBar, BorderLayout.EAST);        
        frame.setVisible(true);
    }
}
