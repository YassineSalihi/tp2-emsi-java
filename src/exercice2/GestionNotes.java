package exercice2;

import java.util.Scanner;

public class GestionNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Combien d'étudiants : ");
        int nbEtud = sc.nextInt();
        sc.nextLine();

        String[] etudiants = new String[nbEtud];
        double[][] notes = new double[nbEtud][3];

        for (int i = 0; i < nbEtud; i++) {
            System.out.println("\nÉtudiant " + (i + 1) + " :");
            System.out.print("Nom : ");
            etudiants[i] = sc.nextLine();

            for (int j = 0; j < 3; j++) {
                String typeNote = switch (j) {
                    case 0 -> "Examen";
                    case 1 -> "Devoir";
                    default -> "Projet";
                };
                System.out.print("Note " + typeNote + " : ");
                notes[i][j] = sc.nextDouble();
            }
            sc.nextLine();
        }

        System.out.println("\n=== Résultats ===");
        double sommeTotale = 0;

        for (int i = 0; i < nbEtud; i++) {
            double sommeEtud = 0;
            System.out.print("\n" + etudiants[i] + " → Notes : ");
            for (int j = 0; j < 3; j++) {
                System.out.print(notes[i][j] + " ");
                sommeEtud += notes[i][j];
            }
            double moyenneEtud = sommeEtud / 3;
            sommeTotale += moyenneEtud;
            System.out.printf(" | Moyenne : %.2f", moyenneEtud);
        }

        double moyenneClasse = sommeTotale / nbEtud;
        System.out.printf("\n\nMoyenne générale de la classe : %.2f\n", moyenneClasse);

        sc.close();
    }
}
