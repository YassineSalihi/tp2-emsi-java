package exercice2;

import java.util.Arrays;
import java.util.Scanner;

public class SommeTableau {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer la taille du tableau : ");
        int[] nombres = new int[sc.nextInt()];
        //System.out.println(nombres.length);
        int s = 0;
        for (int i = 0 ; i < nombres.length; i++){
            //Scanner sc = new Scanner(System.in);
            System.out.println("Enter element : " + i + "#");
            nombres[i] = sc.nextInt();
            System.out.println("You entered " + nombres[i]);
            s = s + nombres[i];
        }
        System.out.println("Somme de Tableau de " + Arrays.toString(nombres) + "element est : " + s);
    }
}
