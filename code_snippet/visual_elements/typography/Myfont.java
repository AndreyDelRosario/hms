import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Myfont extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Correct AWT Font requires: (Name, Style, Size)
        Font customFont = new Font("Serif", Font.BOLD, 24);
        g.setFont(customFont);
        g.drawString("Hello, Java Font!", 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Font Test");
        // Add your CUSTOM PANEL (MyFontApp), not the Font object
        frame.add(new Myfont()); 
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
