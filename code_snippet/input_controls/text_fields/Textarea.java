import javax.swing.*;
import java.awt.*;
public class Textarea {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea Example");
        JTextArea textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);        
        textArea.setText("Enter text here...");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
