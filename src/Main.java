import javax.swing.*;
import java.awt.*;
class Main extends JFrame {

    Main() {
        this.setResizable(false);
        this.setVisible(true);
        
        getContentPane().setBackground(Color.WHITE);
        this.setBounds(0, 0, 800, (600 * 8 / 5) - 81);
        this.setSize(1300, (600 * 8 / 5) - 81);

        // Create the background panel and add it to the frame
        BackgroundPanel backgroundPanel = new BackgroundPanel();
        add(backgroundPanel);

        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add the Login panel
        Login login = new Login();
        backgroundPanel.add(login);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        // Repaint the label to make sure the background image is displayed
        backgroundPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Main();
        });
    }
}