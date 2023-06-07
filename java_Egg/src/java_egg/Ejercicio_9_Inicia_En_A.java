
package java_egg;

import java.util.Scanner;

public class Ejercicio_9_Inicia_En_A {
    
    public static void main (String[] args){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra");
        String texto = leer.nextLine();
        if (texto.toLowerCase().substring(0, 1).equals("a")){
                       System.out.println("CORRECTO");
        } else System.out.println("INCORRECTO");
        
        if (texto.startsWith("b")){
            System.out.println("INICIA CON B y el análisis se hizo de manera mas sencilla utilizando texto.startsWith(´b´)");
        }
    }
}
