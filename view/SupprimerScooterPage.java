package view;
import view.components.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;


public class SupprimerScooterPage extends Myframe {
    public SupprimerScooterPage (){
        super("Supprimer un scooter",400,400);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.add(new HeadingText("please fill in information"),BorderLayout.NORTH);
        JPanel tmp = new JPanel();
        LayoutManager layout = new FlowLayout(FlowLayout.CENTER, 20,5);
        tmp.setLayout(layout);
        MytextField IDField = new MytextField("ID", 20, 200,false);
        tmp.add(IDField);
        this.add(tmp,BorderLayout.CENTER);
        Mybutton tmpButton = new Mybutton("Valider", Color.WHITE, Color.RED);
        tmpButton.addActionListener(e->{
            if(IDField.getText().equals("123")){ //condition pour voir si le scooter avec l'id donnée existe dans le parc - à faire
                NotificationPage supprimerSuccess = new NotificationPage("Operation validée", "Le scooter a bien été supprimé",1);
                this.dispose();
                supprimerSuccess.setResizable(false);
                supprimerSuccess.show();
            }else{
                NotificationPage supprimerFailed = new NotificationPage("Operation non validée", "Le scooter n'existe pas dans le parc",2);
                this.dispose();
                supprimerFailed.setResizable(false);
                supprimerFailed.show();
            }
        });
        this.add(tmpButton,BorderLayout.SOUTH);
    }
}
