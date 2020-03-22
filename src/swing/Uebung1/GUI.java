package swing.Uebung1;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

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
        JRadioButton jRadioButtonLedig = new JRadioButton("ledig",true);
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
        jPanelButtonRow.add(new JButton("Hinzufügen"));
        jPanelButtonRow.add(new JButton("Anzeigen"));
        jPanelButtonRow.add(new JButton("Suchen"));
        jPanelButtonRow.add(new JButton("Löschen"));
        jPanelButtonRow.add(new JButton("Liste anzeigen"));

        this.add(jPanelButtonRow, BorderLayout.SOUTH);




        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
