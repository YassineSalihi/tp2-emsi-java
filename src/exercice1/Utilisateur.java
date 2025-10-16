package exercice1;

public class Utilisateur extends Personne {
    protected String login;
    protected String password;
    protected String service;
    protected Profil profil;

    public Utilisateur(String nom, String prenom, String mail, String telephone, double salaire,
                       String login, String password, String service, Profil profil) {
        super(nom, prenom, mail, telephone, salaire);
        this.login = login;
        this.password = password;
        this.service = service;
        this.profil = profil;
    }

    @Override
    public double calculerSalaire() {
        if (profil.getCode().equalsIgnoreCase("MN")) {
            return salaire * 1.10;  // +10% pour Manager
        } else if (profil.getCode().equalsIgnoreCase("DG")) {
            return salaire * 1.40;  // +40% pour Directeur Général
        } else {
            return salaire;  // pas d’augmentation
        }
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Login      : " + login);
        System.out.println("Service    : " + service);
        System.out.println("Profil     : " + profil);
        System.out.println("Salaire net: " + calculerSalaire() + " DH");
    }

    public Profil getProfil() {
        return profil;
    }
}
