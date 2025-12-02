import java.util.Scanner;

public class funciones {


    //FUNCIONES
    //1ra funcion 

    public static void mostrarTitulo() {
        System.out.println("=======================");
        System.out.println("   F U N C I O N E S   ");
        System.out.println("=======================");

    }
        //2da funcion
    public static String saludarUsuario(Scanner sc) {
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Hola, " + nombre + " Bienvenido al sistema.");
        return nombre;
    }

    //3ra funcion

    public static int verificarMayorDeEdad(Scanner  sc) {
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println(">> ERES MAYOR PASE PA LANTE");
        }else {
            System.out.println(">> ERES MENOR. QUE HACES ACA");
        }

        return edad;
    }

    //4ta funcion

    public static int calcularAnoNacimiento(int edadActual) {
        int anoActual = 2025;
        int anoNacimiento = anoActual - edadActual;
        int resultado = 0;

        System.out.println("-----------------------------");
        System.out.println("Dato curioso: Naciste en el: " + anoNacimiento);

        return resultado;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        mostrarTitulo();
        String nombreUsuario = saludarUsuario(scanner);
        int edadUsuario = verificarMayorDeEdad(scanner);
        int anoNacimiento = calcularAnoNacimiento(edadUsuario);

        scanner.close();
    }

}
