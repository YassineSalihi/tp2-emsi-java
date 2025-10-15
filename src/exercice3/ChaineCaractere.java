package exercice3;

import javax.swing.text.DefaultEditorKit;
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
        System.out.println("==== 4 ====");


    }
}
