package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;

import view.components.GridCard;
import view.components.Mybutton;
import view.components.Myframe;

import model.Parc;

public class HomePage extends Myframe {
    public HomePage() {
        super("HomePage",500,1200);
        JLabel header = new JLabel("Welcome to LOOSCOOTER", JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 18));
        header.setForeground(Color.WHITE);

        JPanel heading = new JPanel(new BorderLayout());
        heading.add(header, BorderLayout.CENTER);
        heading.setBackground(Color.GRAY);
        
        
        JPanel footer = new JPanel(new FlowLayout());
        footer.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        Mybutton exitBtn = new Mybutton("Quittez le Programme", Color.white, Color.RED);
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        footer.add(exitBtn);  
        
        JPanel mainShow = new JPanel();
        mainShow.setSize(1200, 500);
        mainShow.setLayout(new FlowLayout());
        GridCard louerScooter = new GridCard("Louer Scooter", Color.white, Color.DARK_GRAY);
        louerScooter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // insert la page qui vas afficher tous les scooters dans le parc
            }
            
        });
        mainShow.add(louerScooter);
        GridCard retournerScooter = new GridCard("Retourner \n Scooter", Color.WHITE, Color.DARK_GRAY);
        retournerScooter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                RetournerScooter retourner = new RetournerScooter();
            }
        });
        mainShow.add(retournerScooter);
        GridCard afficherParc = new GridCard("Afficher \n Parc des \nScooter", Color.white, Color.DARK_GRAY);
        afficherParc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                ParcdeScooter parcView = new ParcdeScooter();
            }
        });
        mainShow.add(afficherParc);

        this.add(mainShow,BorderLayout.CENTER);
        this.add(footer,BorderLayout.SOUTH);
        this.add(heading, BorderLayout.NORTH);
    }
}
