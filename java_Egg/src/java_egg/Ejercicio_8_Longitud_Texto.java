
package java_egg;

import java.util.Scanner;

public class Ejercicio_8_Longitud_Texto {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra de 8 caracteres");
        String texto = leer.nextLine();
        if (texto.length() != 8) {
            System.out.println("INCORRECTO");
        } else {
            System.out.println("CORRECTO");
        }
    }
}
