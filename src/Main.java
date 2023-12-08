import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String [] matieres={"math","arabic","infos"};
       GestionServices gestionnaire=new GestionServices();
       manage:
       while (true ) {
           System.out.print("bonjour dans votre gestionnaire des notes ");
           System.out.println("les operations disponibles:");
           System.out.println("1. ajouter un nouveau etudiant");
           System.out.println("2.affichage des etudiants");
           System.out.println("3.suppression ");
           System.out.println("4.calculer moyenne");
           System.out.println("5.sortir du programme");
           int choix = s.nextInt();
           switch (choix) {
               case 1:
                   System.out.println("entrer le nom:");
                   String name = s.next();
                   gestionnaire.ajouterEtudiant(name);

           }


       }

//        String nomEtudiant = s.nextLine();
//        GestionServices gestionnaire = new GestionServices();
//        Etudiant etudiant = gestionnaire.chercherEtudiant(nomEtudiant);
//        if (etudiant != null) {
//
//            System.out.println("Étudiant trouvé : " + etudiant.getNom());
//        } else {
//            System.out.println("Étudiant non trouvé.");
//
//        }

    }
}