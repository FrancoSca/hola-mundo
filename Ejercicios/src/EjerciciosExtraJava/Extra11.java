/
11. Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package EjerciciosExtraJava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        int cont=1;
        while (num>10) {            
            num = num/10;
            cont ++;
        }
         System.out.println("El numero tiene " +cont+ " digitos.");
    }
    
}