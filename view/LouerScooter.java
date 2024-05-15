package view;
import view.components.HeadingText;
import view.components.Mybutton;
import view.components.Myframe;
import view.components.MytextField;
import java.awt.LayoutManager;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LouerScooter extends Myframe {
    
    public LouerScooter () {

        super("Louer Scooter",700,400);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.add(new HeadingText("Informations locataire"),BorderLayout.NORTH);
        JPanel tmp = new JPanel();
        LayoutManager layout = new FlowLayout(FlowLayout.CENTER, 20,5);
        tmp.setLayout(layout);
        MytextField nomField = new MytextField("nom", 20, 200,false);
        MytextField prenomField = new MytextField("prenom", 20, 200, false);
        MytextField telephoneField = new MytextField("tel", 20, 200, false);
        MytextField dateRetour = new MytextField("date de retour", 20, 200, false);
        tmp.add(nomField);
        tmp.add(prenomField);
        tmp.add(telephoneField);
        tmp.add(dateRetour);
        this.add(tmp,BorderLayout.CENTER);
        Mybutton tmpButton = new Mybutton("Valider", Color.WHITE, Color.ORANGE);
        tmpButton.addActionListener(e->{
            if(true){ // insert a condition to make sure that the data is valid
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
        this.add(tmpButton,BorderLayout.SOUTH);
        this.show();
    }    
}
