package Main;

import Entities.Employe;
import Entities.SocieteArrayList;
import Entities.Departement;
import Entities.DepartementHashSet;
import Entities.AffectationHashMap;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        // Ajout d'employés
        Employe emp1 = new Employe(1, "Smith", "John", "Département1", 3);
        Employe emp2 = new Employe(2, "Doe", "Jane", "Département2", 2);
        Employe emp3 = new Employe(3, "Johnson", "Bob", "Département1", 1);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);

        // Affichage des employés
        System.out.println("Liste des employés :");
        societe.displayEmploye();

        // Recherche d'un employé par nom
        String nomRechercheE = "Smith";
        System.out.println("\nRecherche de l'employé avec le nom '" + nomRechercheE + "' : " + societe.rechercherEmploye(nomRechercheE));

        // Suppression d'un employé
        System.out.println("\nSuppression de l'employé : " + emp2);
        societe.supprimerEmploye(emp2);

        // Affichage de la liste mise à jour
        System.out.println("\nListe des employés après suppression :");
        societe.displayEmploye();

        // Tri par ID
        System.out.println("\nTri des employés par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri par nom, département et grade
        System.out.println("\nTri des employés par nom, département et grade :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();
        //*********************************Prosit 10*****************************************************************
        System.out.println("////////////////////prosit-10/////////////////////");
        // Création de quelques objets Departement
        Departement dep1 = new Departement(1, "Ressources Humaines", 20);
        Departement dep2 = new Departement(2, "Informatique", 50);
        Departement dep3 = new Departement(3, "Finance", 30);

        // Création de l'objet DepartementHashSet
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        // Ajout des départements à la gestion
        gestionDepartements.ajouterDepartement(dep1);
        gestionDepartements.ajouterDepartement(dep2);
        gestionDepartements.ajouterDepartement(dep3);

        // Affichage des départements
        System.out.println("Liste des départements :");
        gestionDepartements.displayDepartement();
        System.out.println();

        // Recherche d'un département par nom
        String nomRecherche = "Informatique";
        if (gestionDepartements.rechercherDepartement(nomRecherche)) {
            System.out.println("Le département " + nomRecherche + " existe.");
        } else {
            System.out.println("Le département " + nomRecherche + " n'existe pas.");
        }

        // Suppression d'un département
        System.out.println("Suppression du département : " + dep2);
        gestionDepartements.supprimerDepartement(dep2);

        // Affichage mis à jour des départements
        System.out.println("\nListe des départements après suppression :");
        gestionDepartements.displayDepartement();
        System.out.println();

        // Tri des départements par ID
        TreeSet<Departement> departementsTries = gestionDepartements.trierDepartementById();
        System.out.println("Liste des départements triés par ID :");
        for (Departement dep : departementsTries) {
            System.out.println(dep);
        }
        //*********************************Prosit 11*****************************************************************
        System.out.println("////////////////////prosit-11/////////////////////");
        AffectationHashMap affectationMap = new AffectationHashMap();

        // Affectation des employés aux départements
        affectationMap.ajouterEmployeDepartement(emp1, dep1);
        affectationMap.ajouterEmployeDepartement(emp2, dep2);

        // Affichage des employés et départements
        affectationMap.afficherEmployesEtDepartements();

        // Ajout du même employé à un autre département
        affectationMap.ajouterEmployeDepartement(emp1, dep2);

        // Affichage mis à jour
        affectationMap.afficherEmployesEtDepartements();

        // Suppression d'un employé
        //affectationMap.supprimerEmploye(emp1);

        // Affichage mis à jour après la suppression
        //affectationMap.afficherEmployesEtDepartements();

        // Suppression d'un employé dans un département spécifique
        //affectationMap.supprimerEmployeEtDepartement(emp2, dep2);

        // Affichage mis à jour après la suppression
        //affectationMap.afficherEmployesEtDepartements();

        // Affichage de la liste des employés
        affectationMap.afficherEmployes();

        // Affichage de la liste des départements
        affectationMap.afficherDepartements();

        System.out.println("Recherche de l'employé 3 : " + affectationMap.rechercherEmploye(emp1));
        System.out.println("Recherche du département 1 : " + affectationMap.rechercherDepartement(dep1));

        // Tri de la collection et affichage
        TreeMap<Employe, Departement> employesTries = affectationMap.trierMap();
        System.out.println("Liste des employés triés par identifiant :");
        for (Map.Entry<Employe, Departement> entry : employesTries.entrySet()) {
            System.out.println(entry.getKey().getId() + ": " + entry.getKey().getNom());
        }

    }
}