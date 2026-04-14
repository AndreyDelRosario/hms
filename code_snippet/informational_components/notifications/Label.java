import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Label extends JFrame {
    private JLabel notificationLabel;
    private Timer timer;
    public Label() {
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        notificationLabel = new JLabel("", SwingConstants.CENTER);
        notificationLabel.setOpaque(true);
        notificationLabel.setPreferredSize(new Dimension(400, 30));
        notificationLabel.setVisible(false);
        add(notificationLabel, BorderLayout.NORTH);
        JButton btn = new JButton("Perform Action");
        btn.addActionListener(e -> showNotification("Action Completed!", Color.GREEN));
        add(btn, BorderLayout.CENTER);
        timer = new Timer(3000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                notificationLabel.setVisible(false);
            }
        });
        timer.setRepeats(false);
    }
    private void showNotification(String message, Color color) {
        notificationLabel.setText(message);
        notificationLabel.setBackground(color);
        notificationLabel.setVisible(true);   
        if (timer.isRunning()) {
            timer.stop();
        }
        timer.start();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Label().setVisible(true));
    }
}
