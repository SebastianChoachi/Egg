
package java_egg;

import java.util.Scanner;

public class Ejercicio_11_Menu {
    
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        double numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        double numero2 = leer.nextInt();
        int resp;

        do {
            System.out.println("MENU \n Ingrese el número de la acción que desea ejecutar:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            resp = leer.nextInt();

            switch (resp) {
                case 1: System.out.println("La suma es " + (numero1+numero2));
                    break;
                case 2: System.out.println("La resta es " + (numero1-numero2));
                    break;
                case 3: System.out.println("La multiplicación es " + (numero1*numero2));
                    break;
                case 4: double division = numero1/numero2; 
                    System.out.println("La división es " + division);
                    break;
                case 5: System.out.println("Gracias por usar el programa");
                break;
            }
        } while (resp != 5);

    }

}
