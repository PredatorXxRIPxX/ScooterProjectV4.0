package view;
import view.components.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;



public class AjouterScooterPage extends Myframe {
    public AjouterScooterPage (){
        // super("Ajouter un scooter au parc", 500, 1200);
        // this.setLayout(getLayout());

        // JLabel heading = new JLabel("Ajouter un scooter");
        // heading.setFont(new Font("Arial", Font.BOLD, 18));

        // Mybutton exitBtn = new Mybutton("annuler", Color.white, Color.red);
        // Mybutton valider = new Mybutton("valider", Color.white, Color.blue);

        // JPanel footer = new JPanel();
        // footer.setLayout(new FlowLayout());
        // footer.add(exitBtn);
        // footer.add(valider);

        // JPanel headingDiv = new JPanel();
        // headingDiv.add(new HeadingText("Information Scooter"));

        // JPanel mainPanel = new JPanel(new GridLayout(3, 1));

        // JPanel secondDiv = new JPanel();
        // secondDiv.setLayout(new GridLayout(3, 2, 10, 20));

        // MytextField modelField = new MytextField("Modele", 80, 120, false);
        // MytextField kiloField = new MytextField("Kilometrage", 80, 120, false);

        // secondDiv.add(modelField);
        // secondDiv.add(kiloField);

        // mainPanel.add(headingDiv);
        // mainPanel.add(secondDiv);

        // this.add(mainPanel, BorderLayout.CENTER);
        // this.add(heading, BorderLayout.NORTH);
        // this.add(footer, BorderLayout.SOUTH);

        super("Ajouter un scooter",400,400);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.add(new HeadingText("please fill in information"),BorderLayout.NORTH);
        JPanel tmp = new JPanel();
        LayoutManager layout = new FlowLayout(FlowLayout.CENTER, 20,5);
        tmp.setLayout(layout);
        MytextField modelField = new MytextField("model", 20, 200,false);
        MytextField kilometrageField = new MytextField("kilometrage", 20, 200, false);
        tmp.add(modelField);
        tmp.add(kilometrageField);
        this.add(tmp,BorderLayout.CENTER);
        Mybutton tmpButton = new Mybutton("Valider", Color.WHITE, Color.BLUE);
        tmpButton.addActionListener(e->{
            if(!(modelField.getText().equals("")&&kilometrageField.getText().equals(""))){ //  conditions pour voir si les informations données sont valides - à faire
                NotificationPage ajouterSuccess = new NotificationPage("Operation validée", "Le scooter a bien été ajouté",1);
                this.dispose();
                ajouterSuccess.setResizable(false);
                ajouterSuccess.show();
            }else{
                NotificationPage ajouterFailed = new NotificationPage("Operation non validée", "Le scooter ,'a pas été ajouté",2);
                this.dispose();
                ajouterFailed.setResizable(false);
                ajouterFailed.show();
            }
        });
        this.add(tmpButton,BorderLayout.SOUTH);
    }
}
