import java.util.ArrayList;
import java.util.Scanner;

public class GestionServices implements Services {
    Scanner s = new Scanner(System.in);

    ArrayList<Etudiant> etudiants = new ArrayList<>();

    @Override
    public void ajouterEtudiant(String nom) {
        Etudiant nvEtudiant = new Etudiant(nom);
        etudiants.add(nvEtudiant);
    }

    @Override
    public void supprimerEtudiant() {
        System.out.print("Veuillez entrer le nom de l'étudiant à supprimer : ");
        String nomEtudiant = s.nextLine();

        Etudiant etudiantASupprimer = chercherEtudiant(nomEtudiant);
        if (etudiantASupprimer != null) {
            etudiants.remove(etudiantASupprimer);
            System.out.println("Étudiant supprimé avec succès !");
        }
    }


    @Override
    public Etudiant chercherEtudiant(String nom) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.nom.equals(nom)) {
                return etudiant;
            }
        }
        return null;
    }

    @Override
    public void saisirNotes() {
        ArrayList<Matiere> matieres = new ArrayList<>();
        //ArrayList<Integer> notes;
        String continuer=null;

        do {
            System.out.print("Veuillez choisir le nom de la matière : ");
            String nomMatiere = s.nextLine();
            Matiere matiere2 = null;
            for (Matiere m : matieres) {
                if (m.getNom().equals(nomMatiere)) {
                    matiere2 = m;
                }
            }
            System.out.print("Combien de notes voulez-vous saisir pour la matière '" + nomMatiere + "' ? ");
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Veuillez entrer la note (entre 0 et 20) : ");
                int note = s.nextInt();
                if (note >= 0 && note <= 20) {
                    matiere2.setNote(note);
                }
                System.out.print("oui si vous souhaite ajouter une autre note ");
                continuer = s.nextLine();
            }
        } while (continuer.equalsIgnoreCase("oui")) ;
    }
//    public double calculerParMatiere(Etudiant etudiant){
//        System.out.println("entrer le nom de la matiere ");
//        ArrayList<Integer> notes = matiere.getNote();
//
//
//
////        int somme = 0;
////        for (int note : notes) {
////            somme += note;
////        }
//
//        return (double) somme / notes.size();
//    }

}
