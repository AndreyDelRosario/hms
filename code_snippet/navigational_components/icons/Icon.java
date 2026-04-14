import javax.swing.*;
import java.awt.*;
import java.net.URL;
public class Icon {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Icon Example");
            URL iconUrl = Icon.class.getResource("open-source.png");
            if (iconUrl != null) {
                ImageIcon icon = new ImageIcon(iconUrl);
                JLabel label = new JLabel("Label with Icon", icon, JLabel.CENTER);
                frame.add(label);
            } else {
                System.err.println("Icon not found.");
            }
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());
            frame.setSize(300, 200);
            frame.setVisible(true);
        });
    }
}
