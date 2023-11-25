import javax.swing.*;
import java.awt.*;

class BackgroundPanel extends JPanel {
    private JLabel backgroundLabel;  

    BackgroundPanel() {
        setLayout(null);
        setBounds(0, 0, 800, (600 * 8 / 5) - 81);
        setSize(1300, (600 * 8 / 5) - 81);

        backgroundLabel = new JLabel();
        backgroundLabel.setBounds(100, 10, 700, 800);

        // Load and set the background image
        ImageIcon backgroundImage = new ImageIcon("images/title.png");
        backgroundLabel.setIcon(backgroundImage);

        // Make the label opaque so it displays the background image
        backgroundLabel.setOpaque(false);

        // Add the background label to this panel
        add(backgroundLabel);

        // Set the background color of the panel
        setBackground(Color.white);
    }
}