import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner operacion = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Ingrese un número");
        n1= operacion.nextInt();

        System.out.println("Ingrese un segundo número");
        n2= operacion.nextInt();

        int n3= n1%=n2;

        System.out.println(n3==0);
    }
}