package swing.Uebung1;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    public static void main(String[] args) {
        new GUI();
    }
    public GUI() {



        super("Einwohnermeldeamt");
        this.setLayout(new BorderLayout());

        JPanel center = new JPanel(new FlowLayout(FlowLayout.CENTER,20,10));
        center.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));




        JPanel kontaktdaten = new JPanel();
        kontaktdaten.setLayout(new GridLayout(5, 2,5,5));
        JLabel anrede = new JLabel("Anrede");
        kontaktdaten.add(anrede);
        String[] comboBoxSelection = {"Frau", "Herr", "---"};
        JComboBox<String> comboBoxAnrede = new JComboBox(comboBoxSelection);
        kontaktdaten.add(comboBoxAnrede);
        JLabel name = new JLabel("Name");
        kontaktdaten.add(name);
        JTextField textFieldName  = new JTextField();
        kontaktdaten.add(textFieldName);
        JLabel vorname = new JLabel("Vorname");
        kontaktdaten.add(vorname);
        JTextField textFieldVorname  = new JTextField();
        kontaktdaten.add(textFieldVorname);
        JLabel geburtsname = new JLabel("Geburtsname");
        kontaktdaten.add(geburtsname);
        JTextField textFieldGeburtsname  = new JTextField();
        kontaktdaten.add(textFieldGeburtsname);
        JLabel eMail = new JLabel("E-Mail");
        kontaktdaten.add(eMail);
        JTextField textFieldeMail  = new JTextField(14);
        kontaktdaten.add(textFieldeMail);
        kontaktdaten.setBorder(BorderFactory.createTitledBorder("Kontaktdaten"));
        center.add(kontaktdaten);


        JPanel familienstand = new JPanel(new GridLayout(0,1));
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton jRadioButtonLedig = new JRadioButton("ledig",false );
        JRadioButton jRadioButtonVerheiratet =new JRadioButton("verheiratet",false);
        JRadioButton jRadioButtonVerwitwet =new JRadioButton("verwitwet",false);
        JRadioButton jRadioButtonGeschieden =new JRadioButton("geschieden",false);


        buttonGroup.add(jRadioButtonLedig);
        buttonGroup.add(jRadioButtonVerheiratet);
        buttonGroup.add(jRadioButtonVerwitwet);
        buttonGroup.add(jRadioButtonGeschieden);

        familienstand.add(jRadioButtonLedig);
        familienstand.add(jRadioButtonVerheiratet);
        familienstand.add(jRadioButtonVerwitwet);
        familienstand.add(jRadioButtonGeschieden);


        familienstand.setBorder(BorderFactory.createTitledBorder("Familienstand"));
        center.add(familienstand);
        this.add(center,BorderLayout.CENTER);

        JPanel jPanelButtonRow = new JPanel(new FlowLayout());
        JButton jButtonHinzufuegen =new JButton("Hinzufügen") ;
        JButton jButtonAnzeigen =new JButton("Anzeigen") ;
        JButton jButtonSuchen = new JButton("Suchen");
        JButton jButtonLoeschen = new JButton("Löschen");
        JButton jButtonListeAnzeigen = new JButton("Liste anzeigen");


        jPanelButtonRow.add(jButtonHinzufuegen);
        jPanelButtonRow.add(jButtonAnzeigen);
        jPanelButtonRow.add(jButtonSuchen);
        jPanelButtonRow.add(jButtonLoeschen);
        jPanelButtonRow.add(jButtonListeAnzeigen);

        this.add(jPanelButtonRow, BorderLayout.SOUTH);

        ActionListener actionListenerRadioButtons = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("ledig")) {
                    textFieldGeburtsname.setVisible(false);
                    geburtsname.setVisible(false);
                    textFieldGeburtsname.setText(null);
                } else {
                    textFieldGeburtsname.setVisible(true);
                    geburtsname.setVisible(true);
                }
            }
        };

        jRadioButtonGeschieden.addActionListener(actionListenerRadioButtons);
        jRadioButtonLedig.addActionListener(actionListenerRadioButtons);
        jRadioButtonVerheiratet.addActionListener(actionListenerRadioButtons);
        jRadioButtonVerwitwet.addActionListener(actionListenerRadioButtons);



        ActionListener actionListenerButtons = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("Hinzufügen")) {
                    if(Listenoperationen.hinzufuegen(comboBoxAnrede.getSelectedItem().toString(),textFieldName.getText(),textFieldVorname.getText(),textFieldGeburtsname.getText(),textFieldeMail.getText(),buttonGroup.getSelection().getActionCommand())){
                        JPanel north = new JPanel(new FlowLayout(FlowLayout.LEFT));
                        north.add(new JLabel("Bürger erfolgreich hinzugefügt"));
                        GUI.this.add(north, BorderLayout.NORTH);
                        GUI.this.pack();
                    }

                } else if (e.getActionCommand().equals("Anzeigen")) {
                    if ((Listenoperationen.anzeigen(textFieldName.getText(), textFieldVorname.getText()))) {
                        JPanel north = new JPanel(new FlowLayout(FlowLayout.LEFT));
                        north.add(new JLabel("Bürger erfolgreich angezeigt"));
                        GUI.this.add(north, BorderLayout.NORTH);
                        GUI.this.pack();
                    }
                }else if (e.getActionCommand().equals("Suchen")) {
                    if (Listenoperationen.suchen(textFieldName.getText(), textFieldVorname.getText())) {
                        JPanel north = new JPanel(new FlowLayout(FlowLayout.LEFT));
                        north.add(new JLabel("Bürger erfolgreich gefunden"));
                        GUI.this.add(north, BorderLayout.NORTH);
                        GUI.this.pack();
                    }
                }else if (e.getActionCommand().equals("Löschen")) {
                    if (Listenoperationen.loeschen(textFieldName.getText(), textFieldVorname.getText())) {
                        JPanel north = new JPanel(new FlowLayout(FlowLayout.LEFT));
                        north.add(new JLabel("Bürger erfolgreich gelöscht"));
                        GUI.this.add(north, BorderLayout.NORTH);
                        GUI.this.pack();
                    }
                } else {
                    Listenoperationen.listeAusgeben();
                }
            }
        };

        jButtonHinzufuegen.addActionListener(actionListenerButtons);
        jButtonAnzeigen.addActionListener(actionListenerButtons);
        jButtonSuchen.addActionListener(actionListenerButtons);
        jButtonLoeschen.addActionListener(actionListenerButtons);
        jButtonListeAnzeigen.addActionListener(actionListenerButtons);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
