//TIP
// Project: Bruchrechner_GUI |
// 2aAPC / 2024 |
// Schloffer Lisa <br>
// Last Change:
//    by:   Schloffer |
//    date: 01.10.2024 <br>
// Copyright (c): LBS Eibiswald, 2024

package BruchrechnerView;

import javax.swing.*;
import java.awt.*;

public class BruchrechnerView {
    private JTextField zaehler1;
    private JTextField nenner1;
    private JTextField zaehler2;
    private JTextField nenner2;
    private JComboBox<String> rechenoperant;
    private JLabel istGleich;
    private JLabel zaehlerErgebnis;
    private JLabel nennerErgebnis;
    private JButton berechnenBtn;
    private JPanel View;

    public BruchrechnerView() {
        View = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Größere Abstände

        zaehler1 = new JTextField(10); // Größere Textfelder
        nenner1 = new JTextField(10);
        zaehler2 = new JTextField(10);
        nenner2 = new JTextField(10);
        rechenoperant = new JComboBox<>(new String[]{"+", "-", "*", "/"});
        istGleich = new JLabel("=");
        zaehlerErgebnis = new JLabel("0");
        nennerErgebnis = new JLabel("1");
        berechnenBtn = new JButton("Berechnen");

        // Erste Spalte: Zähler1 und Nenner1
        gbc.gridx = 0;
        gbc.gridy = 0;
        View.add(zaehler1, gbc);

        gbc.gridy = 1;
        View.add(nenner1, gbc);

        // Zweite Spalte: Rechenoperant
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        View.add(rechenoperant, gbc);
        gbc.gridheight = 1; // Reset height

        // Dritte Spalte: Zähler2 und Nenner2
        gbc.gridx = 2;
        gbc.gridy = 0;
        View.add(zaehler2, gbc);

        gbc.gridy = 1;
        View.add(nenner2, gbc);

        // Vierte Spalte: IstGleich
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        View.add(istGleich, gbc);
        gbc.gridheight = 1; // Reset height

        // Fünfte Spalte: ZählerErgebnis und NennerErgebnis
        gbc.gridx = 4;
        gbc.gridy = 0;
        View.add(zaehlerErgebnis, gbc);

        gbc.gridy = 1;
        View.add(nennerErgebnis, gbc);

        // Berechnen Button
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        View.add(berechnenBtn, gbc);
    }

    public static void main(String[] args) {
        // Erstelle ein JFrame mit Titel "BruchrechnerView"
        JFrame frame = new JFrame("BruchrechnerView");
        // Setze den Inhalt des Frames auf die View der BruchrechnerView-Klasse
        frame.setContentPane(new BruchrechnerView().View);
        // Setze die Fenstergröße auf 600x400 Pixel
        frame.setSize(600, 400); // Größere JFrame-Größe
        // Mache das Fenster sichtbar
        frame.setVisible(true);
    }

}
