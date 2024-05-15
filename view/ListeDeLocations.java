package view;

import view.components.Myframe;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Scooter;
import model.Location;
import javax.swing.border.Border;

public class ListeDeLocations extends Myframe {
    int leftPadding = 5;
    public ListeDeLocations (Scooter sctr){
        
        super("Liste des lcoations du scooter "+sctr.getId(),500,700);

        JPanel mainShow = new JPanel();
        mainShow.setLayout(new GridLayout(sctr.listLocation.size(),1));

        for (int  i =0 ; i < sctr.listLocation.size() ; i++){
            Location location = sctr.listLocation.get(i);
            JLabel info = new JLabel("Location N°"+(i+1)+": De "+location.getDateDebut()+" jusqu'à "+location.getDateFin());
          
            Border leftPaddingBorder = BorderFactory.createEmptyBorder(0, leftPadding, 0, 0);
            info.setBorder(leftPaddingBorder);
            if (i != sctr.listLocation.size() -1){
                Border thinBottomBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
                info.setBorder(BorderFactory.createCompoundBorder(info.getBorder(), thinBottomBorder));
            }
            mainShow.add(info);
        }
        this.add(mainShow);
    }
}
