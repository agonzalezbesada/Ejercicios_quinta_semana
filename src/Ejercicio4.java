import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner calculo= new Scanner(System.in);

        double acumulacion=0;

        for (int i=1;i<11;i++){

            System.out.println("Introduce un número");
            int numero= calculo.nextInt();

            acumulacion= numero+acumulacion;

            double media= acumulacion/i;

            System.out.println("La media actual es: " +media);

            if (i==10){
                System.out.println("\n"+"La media total es: "+media);
            }

        }
    }
}
