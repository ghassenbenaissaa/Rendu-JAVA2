package Entities;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private final Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (!affectations.containsKey(e)) {
            affectations.put(e, d);
        } else {
            System.out.println("L'employé est déjà affecté à un département.");
        }
    }

    public void afficherEmployesEtDepartements() {
        System.out.println("Employés et leurs départements :");
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println("Employé : " + entry.getKey().getNom() +
                    ", Département : " + entry.getValue().getNomdepartement());
        }
    }

    public void supprimerEmploye(Employe e) {
        if (affectations.containsKey(e)) {
            affectations.remove(e);
            System.out.println("L'employé " + e.getNom() + " a été supprimé de la collection.");
        } else {
            System.out.println("L'employé " + e.getNom() + " n'a pas été trouvé dans la collection.");
        }
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("L'employé " + e.getNom() + " a été supprimé du département " +
                    d.getNomdepartement() + " dans la collection.");
        } else {
            System.out.println("L'association employé-département n'a pas été trouvée dans la collection.");
        }
    }

    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employe e : affectations.keySet()) {
            System.out.println(e.getNom());
        }
    }

    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement d : affectations.values()) {
            System.out.println(d.getNomdepartement());
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement departement) {
        return affectations.containsValue(departement);
    }

    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> treeMap = new TreeMap<>((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
        treeMap.putAll(affectations);
        return treeMap;
    }
}
