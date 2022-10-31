import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner comprobacion = new Scanner(System.in);

        int n1;


        System.out.println("Ingrese un número");
        n1 = comprobacion.nextInt();


        if (n1 > 100) {
            System.out.println("El número debe ser menor que 100");
        } else {

            boolean esPrimo = true;

            for (int contador = 2; contador < n1; contador++){
            if (n1%contador == 0) {
                esPrimo = false;
                }
            }
            if (esPrimo==true) {
                System.out.println("Es primo");
            }else{
                System.out.println("No es primo");
            }


        }
    }
}