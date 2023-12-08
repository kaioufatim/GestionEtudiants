import java.util.ArrayList;

public class Etudiant {
    String nom;
    ArrayList<Matiere> matieres;

    public Etudiant(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {

        this.nom = nom;
    }
    public ArrayList<Matiere> getMatieres() {

        return matieres;
    }
    public void setMatieres(Matiere matiere) {

        matieres.add(matiere);
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", matieres=" + matieres +
                '}';
    }
}
