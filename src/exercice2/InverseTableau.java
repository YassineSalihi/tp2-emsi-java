package exercice2;

import java.util.*;

public class InverseTableau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer la taille du tableau : ");
        int taille = sc.nextInt();

        int[] nombre = new int[taille];

        for (int i = 0; i < taille; i++) {
            System.out.print("Entrer l'élément #" + (i + 1) + " : ");
            nombre[i] = sc.nextInt();
        }

        System.out.println("\nTableau inversé : ");
        for (int i = taille - 1; i >= 0; i--) {
            System.out.print(nombre[i] + " ");
        }

        sc.close();
    }
}
