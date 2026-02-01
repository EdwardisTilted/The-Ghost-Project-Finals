import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class StartScreen {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Philippine Peso Exchange System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 350);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.setBackground(Color.WHITE);
            panel.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(Color.BLACK, 2),
                    new EmptyBorder(40, 40, 40, 40)
            )
            );

            JLabel title = new JLabel("Philippine Peso Exchange System");
            title.setAlignmentX(Component.CENTER_ALIGNMENT);
            title.setFont(new Font("SansSeriff", Font.PLAIN, 22));

            JButton startButton = new JButton("Start");
            startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            startButton.setBackground(new Color(0, 200, 120));
            startButton.setForeground(Color.BLACK);
            startButton.setFocusPainted(false);
            startButton.setFont(new Font("SansSeriff", Font.PLAIN, 22));
            startButton.setPreferredSize(new Dimension(120, 40));

            panel.add(Box.createRigidArea(new Dimension(0, 60)));
            panel.add(title);
            panel.add(Box.createRigidArea(new Dimension(0, 20)));
            panel.add(startButton);

            frame.add(panel);
            frame.setVisible(true);
        }
        );
    }
}
