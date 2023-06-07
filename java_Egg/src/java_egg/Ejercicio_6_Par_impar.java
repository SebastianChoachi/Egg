
package java_egg;

import java.util.Scanner;

public class Ejercicio_6_Par_impar {

  
    public static void main(String[] args) {
       
      Scanner leer = new Scanner(System.in);
      
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        if (num%2 != 0){
            System.out.println("El número " + num +" es Impar");
        }  else System.out.println("El número " + num + " es Par");
        
        
        
    }
  
}
