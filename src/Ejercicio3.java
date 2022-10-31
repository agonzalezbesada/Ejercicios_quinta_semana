import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner letras = new Scanner(System.in);


        System.out.println("Escribe una frase");

        String frase1 = letras.nextLine();

        int frase_length = frase1.length();


        for (int i = 0; i < frase_length; i++){
            System.out.println(frase1.charAt(i));
        }
    }
}
