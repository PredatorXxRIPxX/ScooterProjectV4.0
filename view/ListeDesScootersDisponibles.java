package view;
import view.components.Myframe;
import java.awt.Color;
import java.awt.GridLayout;
import java.time.LocalDate;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Parc;
import model.Scooter;
import javax.swing.border.Border;

public class ListeDesScootersDisponibles extends Myframe {
    int leftPadding = 5;
    public ListeDesScootersDisponibles (Parc parc){
        super("Liste des scooters en cour de location",500,600);

        JPanel mainShow = new JPanel();
        mainShow.setSize(1200, 500);
        mainShow.setLayout(new GridLayout(parc.getNbrScootersLoues(),1));

        for (int  i = 0 ; i < parc.Listscooter.size() ; i++){
            Scooter scooter = parc.Listscooter.get(i);
            if(scooter.isFree(LocalDate.now(), LocalDate.now())){
                JLabel info = new JLabel("ID scooter : "+scooter.getId());
                Border leftPaddingBorder = BorderFactory.createEmptyBorder(0, leftPadding, 0, 0);
                info.setBorder(leftPaddingBorder);
                if (i != parc.Listscooter.size() -1){
                    Border thinBottomBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK);
                    info.setBorder(BorderFactory.createCompoundBorder(info.getBorder(), thinBottomBorder));
                }
                 mainShow.add(info);
            }  
        }
        this.add(mainShow);
    }
}
