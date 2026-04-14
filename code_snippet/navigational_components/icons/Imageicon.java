import javax.swing.*;
import java.net.URL;
public class Imageicon {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Image Icon Demo");
            URL imgURL = Imageicon.class.getResource("open-source.png");
            if (imgURL != null) {
                ImageIcon icon = new ImageIcon(imgURL);
                frame.add(new JLabel(icon));
            } else {
                System.err.println("Image not found");
            }            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
