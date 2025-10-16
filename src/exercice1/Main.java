package exercice1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Création des profils
        Profil cp = new Profil("CP", "Chef de projet");
        Profil mn = new Profil("MN", "Manager");
        Profil dp = new Profil("DP", "Directeur de projet");
        Profil drh = new Profil("DRH", "Directeur des ressources humaines");
        Profil dg = new Profil("DG", "Directeur général");

        // Création des utilisateurs
        List<Utilisateur> utilisateurs = new ArrayList<>();
        utilisateurs.add(new Utilisateur("Yassine", "Salihi", "yassine@mail.com", "0600000001", 10000, "yassine", "1234", "IT", cp));
        utilisateurs.add(new Utilisateur("Soufiane", "Amrani", "soufiane@mail.com", "0600000002", 12000, "soufiane", "1234", "RH", mn));
        utilisateurs.add(new Utilisateur("Imane", "Zahraoui", "imane@mail.com", "0600000003", 15000, "imane", "1234", "IT", dp));
        utilisateurs.add(new Utilisateur("Sara", "Benali", "sara@mail.com", "0600000004", 13000, "sara", "1234", "Admin", drh));
        utilisateurs.add(new Utilisateur("Khalid", "El Idrissi", "khalid@mail.com", "0600000005", 20000, "khalid", "1234", "Direction", dg));

        // Affichage complet
        System.out.println("===== Liste complète des utilisateurs =====");
        for (Utilisateur u : utilisateurs) {
            u.afficher();
            System.out.println();
        }

        // Filtrer les managers
        System.out.println("===== Liste des Managers =====");
        List<Utilisateur> managers = utilisateurs.stream()
                .filter(u -> u.getProfil().getCode().equalsIgnoreCase("MN"))
                .collect(Collectors.toList());

        for (Utilisateur m : managers) {
            m.afficher();
            System.out.println();
        }
    }
}
