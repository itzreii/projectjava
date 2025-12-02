import java.util.Scanner;

public  class whille {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String sabiduria = "La Paja es MALA";
        
        System.out.println("---Tu y Yo sabemos para que es Esto---");

        System.out.println("Cuantos anios tienes?: ");
        int edad = scanner.nextInt();

        while(edad < 18 ) {

            System.out.println("\n Menol que tu hace aqui?: ");

            System.out.print("De nuevo Cuantos anios tienes?: ");
            edad = scanner.nextInt();
        }
    System.out.println("Dizfrute mi elmano ;)");

    scanner.close();
            System.out.println("P.D: " + sabiduria);
    }
}
