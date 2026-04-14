import javax.swing.*;
import java.awt.*;
public class Myfont extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);        
        Font customFont = new Font("Serif", Font.BOLD | Font.ITALIC, 32);
        g.setFont(customFont);
        g.setColor(Color.BLUE);
        g.drawString("Hello, Java Font!", 50, 100);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Font Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Myfont());
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
