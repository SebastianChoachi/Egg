
package java_egg;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio_17_Vector_Contando_Digitos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("Ingrese la cantidad de elementos de su vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int cant1 = 0, cant2 = 0, cant3 = 0;
        int r = 0;
        for (int i = 0; i < n; i++) {

            vector[i] = aleatorio.nextInt(501);
            System.out.println("[" + vector[i] + "]");
            r = vector[i];
            int j = 0;
            do {
                r = r / 10;
                j++;
            } while (r > 0);
            System.out.println(j);
            if (j == 1) {
                cant1++;
            } else if (j == 2) {
                cant2++;
            } else if (j == 3) {
                cant3++;
            }

        }
        System.out.println("Cantidad de números con 1 dígitos: " + cant1);
        System.out.println("Cantidad de números con 2 dígitos: " + cant2);
        System.out.println("Cantidad de números con 3 dígitos: " + cant3);
        
    }
}