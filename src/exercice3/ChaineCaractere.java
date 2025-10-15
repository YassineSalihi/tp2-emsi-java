package exercice3;

//import javax.swing.text.DefaultEditorKit;
import java.util.Scanner;

public class ChaineCaractere {
    public static void arretSaisie(){
        Scanner sc = new Scanner(System.in);
        String chaine;

        while (true){
            System.out.print("Entrez une chaîne de caractères (ou 'end' pour arrêter) : ");
            chaine = sc.nextLine();

            if (chaine.equalsIgnoreCase("end")){
                System.out.println("I go bye bye...");
                break;
            }else {
                System.out.println("Votre chaîne est : " + chaine);
            }
        }

    }

    public static void presenceCara(char c) {
        String savedChaine = "cogito ergo sum";
        int count = 0;

        // On parcourt chaque caractère de la chaîne
        for (int i = 0; i < savedChaine.length(); i++) {
            if (savedChaine.charAt(i) == c) {
                count++;
            }
        }

        System.out.println("Occurrence de '" + c + "' est : " + count);
    }

    public static void inverseChaine(){

        // cogito = otigoc
        // last
        String chaine;
        String inChaine = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer une chaine de charactere : ");
        chaine = sc.nextLine();
        for (int i = chaine.length() - 1; i >= 0; i--){
            inChaine += chaine.charAt(i);
        }
        System.out.println(inChaine);


    }

    public static void sousChaine(String s1, String s2){
        //informatique
        //tiq
        //s1.substring(s2.indexOf(0), (s2.length() - 1));
        boolean result = false;
        if (s1.contains(s2) == true){
            result = true;
            System.out.println(result);

        }else{
            System.out.println(result);
        }
    }

    public static void compteLettre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer une phrase : ");
        String phrase = sc.nextLine();
        System.out.println("Entrer un charactere quelconque : ");
        char cara = (sc.next().charAt(0));
        System.out.println("La phrase \"" +  phrase + "\" en miniscule : " + phrase.toLowerCase());
        int count = 0;

        // On parcourt chaque caractère de la chaîne
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == cara) {
                count++;
            }
        }

        System.out.println("Occurrence de '" + cara + "' est : " + count);
    }

    public static void presenceVoyelle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer une phrase : ");
        String phrase = sc.nextLine().toLowerCase();
        int count = 0;
        String[] voy = {"a", "e", "u", "i", "o", "y"};

        // On parcourt chaque caractère de la chaîne
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                count++;
            }
        }

        System.out.println("Nombre total de voyelles : " + count);

    }


    static void main() {

        Scanner sc = new Scanner(System.in);
        // System.out.println("==== 1 ====");
        // System.out.println("entrer une chaine de caractere : ");
        // arretSaisie();
        //System.out.println("==== 2 ====");
        //System.out.println("Entrer un seul charactere : ");
        //char a = sc.next().charAt(0);
        //presenceCara(a);
        //System.out.println("==== 3 ====");
        //inverseChaine();
//        System.out.println("==== 4 ====");
//        System.out.println("Enter string 1");
//        String s1 = sc.nextLine();
//        System.out.println("Enter string 2");
//        String s2 = sc.nextLine();
//        sousChaine(s1, s2);
//        System.out.println("==== 5 ====");
//        compteLettre();
        System.out.println("==== 6 ====");
        presenceVoyelle();


    }
}
