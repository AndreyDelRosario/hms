import javax.swing.*;
import java.awt.*; 
import java.awt.event.*; 
public class Button extends JFrame {
    public static void main(String args[]) { 
        JFrame frame = new JFrame("Button"); 
        JButton button = new JButton("Click me");//JButton(String text, Icon icon);
        button.addActionListener(e -> {
            System.out.println("Button was clicked!");
        });
        //button.setText(String s);
        //button.getText();
        //button.setIcon(Icon i);
        button.setMnemonic(KeyEvent.VK_S);//keyboard shortcut
        button.setBackground(Color.WHITE);
        button.setBounds(140,60,100,30);
        //button.setContentAreaFilled(false); // Prevents default square background
        button.setFocusPainted(false);      // Removes the dotted focus square
        //button.setBorderPainted(false);     // Removes the default border
        //button.setOpaque(false);            // Ensures transparency for rounded corners
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        frame.add(button);  
        frame.setSize(400, 200);
        frame.setLayout(null); 
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}