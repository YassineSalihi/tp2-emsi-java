package exercice1;

public class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected String mail;
    protected String telephone;
    protected double salaire;

    private static int compteur = 0;

    public Personne(String nom, String prenom, String mail, String telephone, double salaire) {
        this.id = ++compteur; // auto-incrémentation
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public Personne() {}

    public double calculerSalaire() {
        return salaire;
    }

    public void afficher() {
        System.out.println("--------------------------------");
        System.out.println("ID         : " + id);
        System.out.println("Nom        : " + nom);
        System.out.println("Prénom     : " + prenom);
        System.out.println("Mail       : " + mail);
        System.out.println("Téléphone  : " + telephone);
        System.out.println("Salaire brut : " + salaire + " DH");
    }
}
