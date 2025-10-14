package exercice2;

import java.util.Scanner;

public class MaxTableau {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer la taille du tableau : ");
        float[] nombres = new float[sc.nextInt()];
        //System.out.println(nombres.length);
        float max = 0;
        for (int i = 0 ; i < nombres.length; i++){
            //Scanner sc = new Scanner(System.in);
            System.out.println("Enter element : " + i + "#");
            nombres[i] = sc.nextFloat();
            System.out.println("You entered " + nombres[i]);

            if (max < nombres[i]){
                max = nombres[i];
            }
        }
        System.out.println("Maximum is " + max);
    }
}
