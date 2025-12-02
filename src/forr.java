public class forr {
   public static void main(String[] args) {
    String[] libros = {"Cien años de seriedad", "crepúsculo", "mi jardin", "la biblia", "el principito"};
    System.out.println("la parte con For:");
    for (int i = 0; i < libros.length; i++) {
        System.out.println((i + 1) + "." + libros[i]);
        }
    }
}
