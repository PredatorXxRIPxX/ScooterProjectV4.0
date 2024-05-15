package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JPanel;

import view.components.HeadingText;
import view.components.Mybutton;
import view.components.Myframe;
import view.components.MytextField;


public class Authentification extends Myframe {

    public Authentification (Welcome welcomePage){
        super("Authentification",400,400);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.add(new HeadingText("please fill in information"),BorderLayout.NORTH);
        JPanel tmp = new JPanel();
        LayoutManager layout = new FlowLayout(FlowLayout.CENTER, 20,5);
        tmp.setLayout(layout);
        MytextField userName = new MytextField("username", 20, 200,false);
        MytextField password = new MytextField("password", 20, 200, false);
        tmp.add(userName);
        tmp.add(password);
        this.add(tmp,BorderLayout.CENTER);
        Mybutton tmpButton = new Mybutton("Connect", Color.WHITE, Color.ORANGE);
        tmpButton.addActionListener(e->{
            if(userName.getText().equals("admin")&&password.getText().equals("admin")){
                HomePage home = new HomePage();
                this.dispose();
                welcomePage.dispose();
            }else{
                this.dispose();
                NotificationPage failed = new NotificationPage("Connection Failed","The user name or the password are wrong, try again !",2);
                failed.setResizable(false);
                failed.show();
            }
        });
        this.add(tmpButton,BorderLayout.SOUTH);
    }
}
