package exercice1;

public class Profil {
    private String code;
    private String libelle;

    public Profil(String code, String libelle) {
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
    public String toString() {
        return libelle + " (" + code + ")";
    }
}
