import javax.swing.*;
import java.io.File;
public class Filechooser {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select a File"); 
            int result = fileChooser.showOpenDialog(null);            
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            }
        });
    }
}
