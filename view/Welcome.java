package view;
import view.components.GridCard;
import view.components.HeadingText;
import view.components.Mybutton;
import view.components.Myframe;
import view.components.MytextField;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Welcome extends Myframe {
    public Welcome (){
        super("Welcome Page",500,1200);
        JLabel header = new JLabel("Bienvenue chez LOUSCOOT", JLabel.CENTER);
        header.setFont(new Font("Arial", Font.BOLD, 18));
        header.setForeground(Color.WHITE);

        JPanel heading = new JPanel(new BorderLayout());
        heading.add(header, BorderLayout.CENTER);
        heading.setBackground(Color.GRAY);
        
        JPanel mainShow = new JPanel();
        mainShow.setSize(1200, 500);
        mainShow.setLayout(new FlowLayout());
        
        Welcome currentWelcomePage = this;
        GridCard commencer = new GridCard("commencer", Color.black, Color.DARK_GRAY);
        commencer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Authentification authentificationPage = new Authentification(currentWelcomePage);
            }
        });
        mainShow.add(commencer);

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

        this.add(heading, BorderLayout.NORTH);
        this.add(mainShow, BorderLayout.CENTER);
        this.add(footer, BorderLayout.SOUTH);
        this.setVisible(true);
        this.show();
    }
}
