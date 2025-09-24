package es.iesjuanbosco.roberto;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            Menu ventana = new Menu();
            ventana.setVisible(true);
        });
    }
}