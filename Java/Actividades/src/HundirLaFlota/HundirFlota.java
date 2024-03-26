package HundirLaFlota;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HundirFlota extends JFrame {
    public HundirFlota() {
            this.setTitle("Hundir la Flota");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(900, 800);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3,3));
            panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
            JButton boton1 = new JButton("Test");

            this.add(panel);
            panel.add(boton1);
            this.setVisible(true);
    }
}
