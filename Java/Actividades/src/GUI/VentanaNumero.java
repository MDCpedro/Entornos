package GUI;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaNumero extends JFrame {
    
    private int numero; 
    private JTextField campo1;

    public VentanaNumero(){
        this.setTitle("Actividad GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);

        Random random = new Random();
        int numero = random.nextInt(100) +1; 
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        JButton boton1 = new JButton("Adivinar");
        JLabel texto1 = new JLabel("Adivina el numero entre 1 y 100");
        campo1 = new JTextField(8);

        
        boton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {

                    int num_escrito = Integer.valueOf(campo1.getText());
                    if (num_escrito == numero) {
                        JOptionPane.showMessageDialog(null, "Numero correcto!!!");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "El numero es incorrecto");
                        campo1.setText("");
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "El numero es incorrecto");
                }
                
            }

        });

        panel.add(texto1);
        panel.add(campo1);
        panel.add(boton1);

        this.add(panel); 
        this.setVisible(true);
    }
}
