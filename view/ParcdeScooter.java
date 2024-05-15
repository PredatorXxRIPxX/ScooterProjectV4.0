package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import view.components.DataDiv;
import view.components.HeadingText;
import view.components.Mybutton;
import view.components.Myframe;

import model.Parc;

public class ParcdeScooter extends Myframe {
    Parc currentParc = new Parc(100);

    public ParcdeScooter() {
        super("Parc de Scooter", 500, 1200);
        JPanel header = new JPanel();
        HeadingText headingText = new HeadingText("Saisir le parc des Scooters");
        header.setBackground(Color.DARK_GRAY);
        headingText.setFont(new Font("Arial",Font.BOLD,18));
        headingText.setBackground(Color.DARK_GRAY);
        headingText.setForeground(Color.WHITE);
        header.add(headingText,BorderLayout.CENTER);

        JPanel mainHome = new JPanel();
        mainHome.setLayout(new GridLayout(5, 1,20,20));

        JPanel container1 = new JPanel();
        container1.setLayout(new GridLayout(2,1));
        JPanel container2 = new JPanel();
        container2.setLayout(new GridLayout(2,1));
        JPanel container3 = new JPanel();
        container3.setLayout(new GridLayout(2,1));

        Mybutton visualiserLocation = new Mybutton("Visualiser", Color.white, Color.BLUE);
        visualiserLocation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                ListeDeScootersEnLocation listeDeScootersEnLocationPage = new ListeDeScootersEnLocation(currentParc);
            }
        });


        Mybutton visualiserDispo = new Mybutton("Visualiser", Color.WHITE, Color.BLUE);
        visualiserDispo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                ListeDesScootersDisponibles listeDesScootersDisponiblesPage = new ListeDesScootersDisponibles(currentParc);
            }
        });

        Mybutton ajouterScooterBtn = new Mybutton("Ajouter un scooter", Color.white, Color.BLUE);
        ajouterScooterBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                AjouterScooterPage ajouterScooterPage = new AjouterScooterPage();
            }
        });

        Mybutton supprimerScooterBtn = new Mybutton("Supprimer un scooter", Color.white, Color.RED);
        supprimerScooterBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                SupprimerScooterPage supprimerScooterPage = new SupprimerScooterPage();
            }
        });

        visualiserDispo.setPreferredSize(new Dimension(200,150));
        visualiserLocation.setPreferredSize(new Dimension(200,150));

        DataDiv nombreScooter = new DataDiv("nombre des scooter", "12500");

        DataDiv scooterEnLocation = new DataDiv("nombre de Scooter en Locations", "500");
        container1.add(scooterEnLocation);
        container1.add(visualiserLocation);

        DataDiv scooterDispo = new DataDiv("nombre de scooter en Dispo", "12000");
        container2.add(scooterDispo);
        container2.add(visualiserDispo);

        DataDiv moyenKilo = new DataDiv("le Kilometrage Moyen", "750.2548");

        container3.add(ajouterScooterBtn);
        container3.add(supprimerScooterBtn);



        mainHome.add(nombreScooter);
        mainHome.add(container1);
        mainHome.add(container2);
        mainHome.add(moyenKilo);
        mainHome.add(container3);
        
        this.add(header,BorderLayout.NORTH);
        this.add(mainHome,BorderLayout.CENTER);
    }
}
