package exercice1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Création des profils (chaque profil = un utilisateur)
        List<Profil> utilisateurs = new ArrayList<>();
        utilisateurs.add(new Profil("Yassine", "Salihi", "yassine@mail.com", "0600000001", 10000, "yassine", "1234", "IT", "CP", "Chef de projet"));
        utilisateurs.add(new Profil("Soufiane", "Amrani", "soufiane@mail.com", "0600000002", 12000, "soufiane", "1234", "RH", "MN", "Manager"));
        utilisateurs.add(new Profil("Imane", "Zahraoui", "imane@mail.com", "0600000003", 15000, "imane", "1234", "IT", "DP", "Directeur de projet"));
        utilisateurs.add(new Profil("Sara", "Benali", "sara@mail.com", "0600000004", 13000, "sara", "1234", "Admin", "DRH", "Directrice RH"));
        utilisateurs.add(new Profil("Khalid", "El Idrissi", "khalid@mail.com", "0600000005", 20000, "khalid", "1234", "Direction", "DG", "Directeur général"));

        // Afficher tous les utilisateurs
        System.out.println("===== Liste complète des utilisateurs =====");
        for (Profil u : utilisateurs) {
            u.afficher();
            System.out.println();
        }

        // Filtrer les managers
        System.out.println("===== Liste des Managers =====");
        List<Profil> managers = utilisateurs.stream()
                .filter(u -> u.getCode().equalsIgnoreCase("MN"))
                .collect(Collectors.toList());

        for (Profil m : managers) {
            m.afficher();
            System.out.println();
        }
    }
}
