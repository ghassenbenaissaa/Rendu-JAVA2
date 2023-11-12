package Entities;

public class Employe {
    int id;
    String nom;
    String prenom;
    String nom_ddepartement;
    int grade;

    public int getId() {return id;}
    public void setId(int id) { this.id = id;}
    public String getNom() {return nom;}
    public void setNom(String nom) { this.nom = nom;}
    public String getNom_ddepartement() {return nom_ddepartement;}
    public void setNom_ddepartement(String nom_ddepartement) { this.nom_ddepartement = nom_ddepartement;}
    public int getGrade() {return grade;}
    public void setGrade(int grade) { this.grade = grade;}

    public Employe() {
    }

    public Employe(int id, String nom, String prenom, String nom_ddepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_ddepartement = nom_ddepartement;
        this.grade = grade;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false; // Si c'est la même instance, elles sont égales
        if (obj == this) return true; // Si obj est nul ou n'est pas une instance d'Aquatic, elles ne sont pas égales
        if (obj instanceof Employe employe) {
            // Comparaison des propriétés : nom, âge et habitat
            return id==employe.getId() && nom.equals(employe.getNom());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Entities.Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom_ddepartement='" + nom_ddepartement + '\'' +
                ", grade=" + grade +
                '}';
    }

}
