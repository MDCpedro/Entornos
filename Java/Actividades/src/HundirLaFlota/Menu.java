package HundirLaFlota;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Menu extends JFrame {
        public Menu() {
            this.setTitle("Hundir la Flota");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(300, 200);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3,1));
            panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
            JButton boton1 = new JButton("Test");

            boton1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                    new HundirFlota();
               }
            });
            
            this.add(panel);
            panel.add(boton1);
            this.setVisible(true);
        }
    }

