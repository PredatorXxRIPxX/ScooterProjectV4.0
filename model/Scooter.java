package model;
import java.time.LocalDate;
import java.util.*;

public class Scooter {

    public int id;
    public String modele;
    public float kilometrage;
    public Parc parc;
    public Vector<Location> listLocation = new Vector<Location>();

    public Scooter(String model , float kilometrage) {
        this.modele = model;
        this.kilometrage = kilometrage;
        this.id = new Random().nextInt(Integer.MAX_VALUE);
    }
    public int getId() {
        return id;
    }
    public float getKilometrage() {
        return kilometrage;
    }
    public String getModele() {
        return modele;
    }
    public Parc getParc() {
        return parc;
    }

    public void addLocation (Location location){
        listLocation.add(location);
    }

    public void addLocation(LocalDate date_debut , LocalDate datefin,Client client){
        listLocation.add(new Location(client,this,date_debut,datefin));
    }
    
    public boolean isFree(LocalDate date_debut,LocalDate date_fin){

        for (Location element : listLocation) {
            if((element.getDateDebut().isAfter(date_debut)&&element.getDateDebut().isBefore(date_fin)) || (element.getDateFin().isAfter(date_debut)&&element.getDateFin().isBefore(date_fin))){
                return false;
            }
        }
        return true;
    }

}