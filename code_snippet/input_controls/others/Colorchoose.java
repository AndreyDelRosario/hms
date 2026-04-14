import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Colorchoose extends JFrame implements ActionListener {
    JButton b;
    Container c;
    Colorchoose() {
        c = getContentPane();
        b = new JButton("Choose Color");
        b.addActionListener(this);
        c.setLayout(new FlowLayout());
        c.add(b);
    }
    public void actionPerformed(ActionEvent e) {
        Color color = JColorChooser.showDialog(this, "Select a Color", Color.RED);
        if (color != null) {
            c.setBackground(color);
        }
    }
    public static void main(String[] args) {
        Colorchoose ch = new Colorchoose();
        ch.setSize(400, 400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
