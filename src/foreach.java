import java.util.ArrayList;
public class foreach {

    public static void main (String[] args) {

       ArrayList<String> unefistas = new ArrayList<String>();

       unefistas.add("Cristhian");
       unefistas.add("Naudis");
       unefistas.add("Yoxel");
       unefistas.add("Luis");
       unefistas.add("Ramón");

        for(String U : unefistas){
            System.out.println(U);
        }
    }

}