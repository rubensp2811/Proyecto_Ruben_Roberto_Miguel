package es.iesjuanbosco.roberto;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    public Menu() {
        setTitle("Buscaminas - Menu Principal");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridBagLayout());
        panelPrincipal.setBackground(new Color(220, 220, 220));

         GridBagConstraints gbc = new GridBagConstraints();
         gbc.insets = new Insets(15, 0, 15, 0);

         JLabel tituloJuego = new JLabel("Buscaminas");
         tituloJuego.setFont(new Font("Arial", Font.BOLD, 36));
    }
}
