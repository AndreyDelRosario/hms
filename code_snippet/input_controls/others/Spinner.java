import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
public class Spinner {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JSpinner Example");
        SpinnerModel model = new SpinnerNumberModel(5, 0, 10, 1);
        JSpinner spinner = new JSpinner(model);
        JLabel label = new JLabel("Value: 5");
        spinner.addChangeListener(e -> {
            label.setText("Value: " + spinner.getValue());
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.add(new JLabel("Select Value:"));
        frame.add(spinner);
        frame.add(label);
        frame.setVisible(true);
    }
}
