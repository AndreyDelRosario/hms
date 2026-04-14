import javax.swing.*;
import java.awt.*;
public class Progressbar extends JFrame {
    JProgressBar progressBar;
    public Progressbar() {
        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        progressBar.setPreferredSize(new Dimension(300, 30));
        setLayout(new FlowLayout());
        add(progressBar);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 100);
        setVisible(true);
    }
    public void startProgress() {
        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                final int progress = i;
                SwingUtilities.invokeLater(() -> progressBar.setValue(progress));
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
    public static void main(String[] args) {
        Progressbar example = new Progressbar();
        example.startProgress();
    }
}
