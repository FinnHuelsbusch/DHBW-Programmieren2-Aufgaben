package swing;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

public class Vorlesungsskript extends JFrame {

    public static void main(String[] args) {
        new Vorlesungsskript();
    }

    public Vorlesungsskript() {
        super("Logon");
        this.setLayout(new BorderLayout());


        JPanel roterRahmen = new JPanel();
        roterRahmen.setLayout(new FlowLayout());

        JPanel blauerRahmen = new JPanel();
        blauerRahmen.setLayout(new GridLayout(5,2,5,5));

        blauerRahmen.add(new JLabel("User:"));
        JPanel PanelUser = new JPanel(new FlowLayout(FlowLayout.LEFT));
        PanelUser.add(new JTextField(3));
        blauerRahmen.add(PanelUser);
        blauerRahmen.add(new JLabel("Passwort:"));
        JPanel passwortPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwortPanel.add(new JPasswordField(4));
        blauerRahmen.add(passwortPanel);
        blauerRahmen.add(new JLabel("Art:"));
        String[] s = {"FTP","Telnet","HTTP","SMTP"};
        JPanel PanelCombobox = new JPanel(new FlowLayout(FlowLayout.LEFT));
        PanelCombobox.add(new JComboBox<String>(s));
        blauerRahmen.add(PanelCombobox);
        blauerRahmen.add(new JLabel("Host:"));
        JPanel PanelHost = new JPanel(new FlowLayout(FlowLayout.LEFT));
        PanelHost.add(new JTextField(4));
        blauerRahmen.add(PanelHost);
        blauerRahmen.add(new JLabel("Port:"));
        JPanel PanelPort = new JPanel(new FlowLayout(FlowLayout.LEFT));
        PanelPort.add(new JTextField(1));
        blauerRahmen.add(PanelPort);







        JPanel blauerRahmenDateien = new JPanel();
        blauerRahmenDateien.setLayout(new GridLayout(2,2,5,5));

        blauerRahmenDateien.add(new JLabel("Quelle:     "));
        blauerRahmenDateien.add(new JTextField(8));
        blauerRahmenDateien.add(new JLabel("Ziel:"));
        blauerRahmenDateien.add(new JTextField(8));




        JPanel gruenerRahmen = new JPanel();
        gruenerRahmen.setLayout(new FlowLayout());
        JButton ok = new JButton("OK");
        ok.setActionCommand("OK");
        gruenerRahmen.add(ok);
        JButton cancel = new JButton("Cancel");
        cancel.setActionCommand("Cancel");
        gruenerRahmen.add(cancel);


        Border rahmen1 =
                BorderFactory.createEtchedBorder();
        Border rahmen2 = BorderFactory.createTitledBorder(rahmen1,"Verbindung");
        Border rahmen3 = BorderFactory.createTitledBorder(rahmen1, "Dateien");
        Border rahmen5 = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        blauerRahmen.setBorder(rahmen2);
        blauerRahmenDateien.setBorder(rahmen3);
        roterRahmen.setBorder(rahmen5);


        roterRahmen.add(blauerRahmen);
        roterRahmen.add(blauerRahmenDateien);


        this.add(roterRahmen, BorderLayout.CENTER);

        this.add(gruenerRahmen,BorderLayout.SOUTH);




        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }
}
