package exercice1;

public class Profil extends Utilisateur {
    private String code;
    private String libelle;

    public Profil(String nom, String prenom, String mail, String telephone, double salaire,
                  String login, String password, String service,
                  String code, String libelle) {
        super(nom, prenom, mail, telephone, salaire, login, password, service);
        this.code = code;
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    @Override
    public double calculerSalaire() {
        if (code.equalsIgnoreCase("MN")) {
            return salaire * 1.10; // +10% pour manager
        } else if (code.equalsIgnoreCase("DG")) {
            return salaire * 1.40; // +40% pour directeur général
        } else {
            return salaire;
        }
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Profil     : " + libelle + " (" + code + ")");
        System.out.println("Salaire net: " + calculerSalaire() + " DH");
    }
}
