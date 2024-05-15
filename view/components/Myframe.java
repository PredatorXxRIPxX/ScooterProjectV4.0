package view.components;
import java.awt.*;

import javax.swing.JFrame;

public class Myframe extends JFrame{
    public Myframe(String title ,int height , int width){
        setTitle(title);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        show();
    }
}
