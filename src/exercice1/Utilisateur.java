package exercice1;

public class Utilisateur extends Personne {
    protected String login;
    protected String password;
    protected String service;

    public Utilisateur(String nom, String prenom, String mail, String telephone, double salaire,
                       String login, String password, String service) {
        super(nom, prenom, mail, telephone, salaire);
        this.login = login;
        this.password = password;
        this.service = service;
    }

    public Utilisateur() {}

    @Override
    public double calculerSalaire() {
        return salaire;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Login      : " + login);
        System.out.println("Service    : " + service);
    }
}
