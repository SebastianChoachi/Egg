
package java_egg;

import java.util.Scanner;

public class Ejercicio_10_Suma_limite {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el límite deseado de la suma");
        int limite = leer.nextInt();
        int suma = 0;
        int num;
        do {
            System.out.println("Ingrese un número a sumar");
            num = leer.nextInt();
            suma += num;
            System.out.println("La sumatoria de los números ingresados es: " + suma + ". Límite: " + limite);
        } while (suma <= limite);

    }

}
