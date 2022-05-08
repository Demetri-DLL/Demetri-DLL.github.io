package game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel {
    public JPanel mainPanel;
    private JButton SpeedUpButton;
    private JButton slowDownButton;
    private JButton exitButton;

    private Game game;

    //public ControlPanel(Game game){this.game = game;}

    public ControlPanel() {
        SpeedUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("press 1 to apply");
                PlayerController.speedIncrement();
            }
        });
        slowDownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("press 1 to apply");
                PlayerController.speedDecrement();
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
