
package java_egg;

import java.util.Scanner;

public class Ejercicio_7_Frase_eureka {
    
    public static void main (String[] args){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String texto = leer.nextLine();
        if (texto.toLowerCase().equals("eureka")){
            System.out.println("EUREKA!!!");
    }
        
        
    }
    
}
