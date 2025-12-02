import java.util.Scanner;
import java.util.Random; // Si, busque en internet como se usa esta madre

public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random nose = new Random();

        int numero = 0;
        int numeroAleatorio = nose.nextInt(70) + 1;

        System.out.println("Adivina un numero entre 1 al 70, piensa en un numero");

        do {
            System.out.println("Introduce el numero que pensastes: ");
            numero = sc.nextInt();

            if (numero < numeroAleatorio) {
                System.out.println("Intenta con un numero mayor");
            } else if (numero > numeroAleatorio) {
                System.out.println("Intenta con un numero menor");
            }
        } while (numero != numeroAleatorio);
        System.out.println("Adivinastes el numero nigga! (" + numeroAleatorio + ")" );
        sc.close(); // esto existe solo para que java no se coma la ram de tu canaima
    }
}
