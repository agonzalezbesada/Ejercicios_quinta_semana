import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner calculador = new Scanner(System.in);

        double n1;
        double n2;

        System.out.println("Elija una opción" + "\n" + "\n Suma" + "\n Resta" + "\n Multiplicación" + "\n División" + "\n" + "\nElección:");
        String eleccion = calculador.nextLine();


        switch (eleccion) {

            case "Suma":
                System.out.println("Introduzca un número");
                n1 = calculador.nextDouble();
                System.out.println("Introduzca otro número");
                n2 = calculador.nextDouble();
                double resultado_suma = n1 + n2;
                System.out.println("Resultado:" + "\n" + resultado_suma);

            case "Resta":
                System.out.println("Introduzca un número");
                n1 = calculador.nextDouble();
                System.out.println("Introduzca otro número");
                n2 = calculador.nextDouble();
                double resultado_resta = n1 - n2;
                System.out.println("Resultado:" + "\n" + resultado_resta);

            case "Multiplicación":
                System.out.println("Introduzca un número");
                n1 = calculador.nextDouble();
                System.out.println("Introduzca otro número");
                n2 = calculador.nextDouble();
                double resultado_multiplicacion = n1 * n2;
                System.out.println("Resultado:" + "\n" + resultado_multiplicacion);

            case "División":
                System.out.println("Introduzca un número");
                n1 = calculador.nextDouble();
                System.out.println("Introduzca otro número");
                n2 = calculador.nextDouble();
                double resultado_division = n1 / n2;
                System.out.println("Resultado:" + "\n" + resultado_division);

            default:
                System.out.println("Elección erronea, revise la ortografía");
        }
    }
}