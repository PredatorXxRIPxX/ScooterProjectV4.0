package view;

import view.components.HeadingText;
import view.components.Mybutton;
import view.components.Myframe;
import view.components.MytextField;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;


import javax.swing.JLabel;
import javax.swing.JPanel;


public class RetournerScooter extends Myframe {
    public RetournerScooter() {
        super("Retourner Scooter",700,400);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        LayoutManager layout = new FlowLayout(FlowLayout.CENTER, 20,5);
        LayoutManager innerLayout = new GridLayout(8,1);

        JPanel tmp1 = new JPanel();
        tmp1.setLayout(innerLayout);
        MytextField nomField = new MytextField("nom", 20, 200,false);
        MytextField prenomField = new MytextField("prenom", 20, 200, false);
        MytextField telephoneField = new MytextField("tel", 20, 200, false);
        MytextField dateRetour = new MytextField("date retour", 20, 200, false);

        MytextField scooterIdField = new MytextField("id", 20, 200,false);
        MytextField scooterKiloField = new MytextField("kilo", 20, 200, false);

        
        this.add(new HeadingText("Informations locataire"),BorderLayout.NORTH);
        tmp1.add(nomField);
        tmp1.add(prenomField);
        tmp1.add(telephoneField);
        tmp1.add(dateRetour);
        tmp1.add(new HeadingText("Informations Scooter"),BorderLayout.NORTH);
        tmp1.add(scooterIdField);
        tmp1.add(scooterKiloField);

        Mybutton tmpButton = new Mybutton("Valider", Color.WHITE, Color.ORANGE);
        tmpButton.addActionListener(e->{
            if(true ){ // insert a condition to make sure that the data is valid
                NotificationPage locationSuccess = new NotificationPage("Operation validée", "Le scooter a bien été loué",1);
                this.dispose();
                locationSuccess.setResizable(false);
                locationSuccess.show();
            }else{
                this.dispose();
                NotificationPage failed = new NotificationPage("Connection Failed","Le scooter n'a bien été loué ! ",2);
                failed.setResizable(false);
                failed.show();
            }
        });
        this.add(tmp1);
        this.add(tmpButton,BorderLayout.SOUTH);
    }
 
}

