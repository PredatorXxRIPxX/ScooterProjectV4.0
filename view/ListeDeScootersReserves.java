package view;

import view.components.Myframe;
import java.awt.Color;
import java.awt.Dimension;
import java.time.LocalDate;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Parc;
import model.Scooter;

public class ListeDeScootersReserves extends Myframe {
    public ListeDeScootersReserves (Parc parc){
        super("Liste des scooters avec des reservations dans le futur",500,600);

        JPanel mainShow = new JPanel();
        mainShow.setSize(1200, 500);
        mainShow.setLayout(new BoxLayout(mainShow, BoxLayout.Y_AXIS));

        if (parc.getNbrScootersReserves() == 0){
            JLabel infos = new JLabel("Ce parc n'a pas des scooters avec des reservations dans le futur");
            infos.setAlignmentX(infos.CENTER_ALIGNMENT);
            infos.setAlignmentY(infos.CENTER_ALIGNMENT);
            mainShow.add(infos);
            this.add(mainShow);
        }else{
            for (Scooter scooter: parc.getListeScooters()){
                if((scooter.getListeLocations().size() >= 2)||(scooter.getListeLocations().size() == 1 && scooter.getListeLocations().get(0).getDateDebut().isAfter(LocalDate.now()))){
                    JLabel info = new JLabel("ID scooter : "+scooter.getId()+" | Modele : "+scooter.getModele()+" , Kilometrage : "+scooter.getKilometrage());
                    JPanel tmp = new JPanel(new FlowLayout());
                    tmp.add(info);
                    tmp.setMaximumSize(new Dimension(560, 40)); 
                    tmp.setPreferredSize(new Dimension(560, 40));
                    tmp.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
                    mainShow.add(tmp);
                }
            }
            JScrollPane scrollPanel = new JScrollPane(mainShow);
            this.add(scrollPanel);
        }

        this.setResizable(false);
    }
}
