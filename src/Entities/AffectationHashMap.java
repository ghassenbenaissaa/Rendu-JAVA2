package Entities;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private final Map<Employe, Departement> affectations = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e,d);
    }

    public void afficherEmployesEtDepartements() {
        System.out.println("Employés et leurs départements :");
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println("Employé : " + entry.getKey().getNom() +
                    ", Département : " + entry.getValue().getNomdepartement());
        }
    }

    public void supprimerEmploye(Employe e) {
            affectations.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        Departement dep = affectations.get(e);
        if (dep.equals(d)){
            supprimerEmploye(e);
        }
    }

    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement d : affectations.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        // Comparator<Employe> idCompator =new Comparator<Employe>() {
        //    @Override
        //     public int compare(Employe o1, Employe o2) {
        //         return 0;
        //    }
        // };
        //TreeMap<Employe,Departement> myTree = new TreeMap<>(idCompator);
        // myTree.putAll(affectations);
        // return myTree;
        return new TreeMap<>(affectations);
    }
}
