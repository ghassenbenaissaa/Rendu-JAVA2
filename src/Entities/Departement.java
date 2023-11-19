package Entities;

public class Departement implements Comparable<Departement>{
    int id;
    String nomdepartement;
    int nombredesemployes;

    public Departement() {
    }

    public Departement(int id, String nomdepartement, int nombredesemployes) {
        this.id = id;
        this.nomdepartement = nomdepartement;
        this.nombredesemployes = nombredesemployes;
    }

    public int getId() {
        return id;
    }

    public String getNomdepartement() {
        return nomdepartement;
    }

    public int getNombredesemployes() {
        return nombredesemployes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomdepartement(String nomdepartement) {
        this.nomdepartement = nomdepartement;
    }

    public void setNombredesemployes(int nombredesemployes) {
        this.nombredesemployes = nombredesemployes;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false; // Si c'est la même instance, elles sont égales
        if (obj == this) return true; // Si obj est nul ou n'est pas une instance d'Aquatic, elles ne sont pas égales
        if (obj instanceof Departement departement) {
            // Comparaison des propriétés : nom, âge et habitat
            return id==departement.getId() && nomdepartement.equals(departement.getNomdepartement());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomdepartement='" + nomdepartement + '\'' +
                ", nombredesemployes=" + nombredesemployes +
                '}';
    }

    public int compareTo(Departement other) {
        // Comparaison basée sur l'ID
        return Integer.compare(this.id, other.id);
    }
}