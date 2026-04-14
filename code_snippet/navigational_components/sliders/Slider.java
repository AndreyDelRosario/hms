import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class Slider extends JFrame {
    private JSlider slider;
    private JLabel label;
    public Slider() {
        setTitle("JSlider Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        label = new JLabel("Value: " + slider.getValue());
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                label.setText("Value: " + slider.getValue());
            }
        });
        add(slider);
        add(label);
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Slider();
            }
        });
    }
}
