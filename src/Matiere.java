import java.util.ArrayList;

public class Matiere {
    String nom;
    ArrayList<Integer> notes;

    public Matiere(String nom) {
        this.nom = nom;
        this.notes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {

        this.nom = nom;
    }
    public ArrayList<Integer> getNote() {

        return notes;
    }
    public void setNote(int note) {
        notes.add(note);
    }
//    public static ArrayList<Matiere> creerMatieres() {
//        ArrayList<Matiere> matieres = new ArrayList<>();
//        matieres.add(new Matiere("math"));
//        matieres.add(new Matiere("info"));
//        matieres.add(new Matiere("pc"));
//        return matieres;
//    }
//    public void ajouterNote(int note) {
//
//        notes.add(note);
//    }

}
