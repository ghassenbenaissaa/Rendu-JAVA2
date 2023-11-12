package Entities;

import Interfaces.IGestion;
import java.util.ArrayList;

public class SocieteArrayList implements IGestion<Employe>{
    private final ArrayList<Employe> listeEmployes;

    public SocieteArrayList() {
        this.listeEmployes = new ArrayList<>();
    }
    @Override
    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : listeEmployes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : listeEmployes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        listeEmployes.sort((emp1, emp2) -> Integer.compare(emp1.getId(), emp2.getId()));
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        listeEmployes.sort((emp1, emp2) -> {
            if (emp1.getNom_ddepartement().equals(emp2.getNom_ddepartement())) {
                if (emp1.getGrade() == emp2.getGrade()) {
                    return emp1.getNom().compareTo(emp2.getNom());
                } else {
                    return Integer.compare(emp1.getGrade(), emp2.getGrade());
                }
            } else {
                return emp1.getNom_ddepartement().compareTo(emp2.getNom_ddepartement());
            }
        });
    }
}
