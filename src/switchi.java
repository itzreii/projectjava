/* programa que simula un cajero  automatico con 1000$ de saldo inicial
y el siguiente menu de opciones:
1.-ingresar dinero a la cuenta
2.-retirar dinero
3.-salir                                                                 */

import javax.swing.JOptionPane;

public class switchi {
    public static void main(String[] args) {
        final int saldo_inicial=1000;
        int opcion;
        float ingreso,saldoActual,retiro;
       
       
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su Cajero Automatico\n"
        + "1.-ingresar dinero a la cuenta\n"
        + "2.-retirar dinero\n"
        + "3.-salir"));
        switch (opcion) {
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad a depositar: "));
                saldoActual=saldo_inicial+ingreso;
                JOptionPane.showMessageDialog(null, "Saldo Actual: "+saldoActual);
                break;
            
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la Cantidad que desea retirar"));
             
            if (retiro > saldo_inicial) {
                    JOptionPane.showMessageDialog(null, "El saldo a retirar es mayor que el disponible la transaccion no es posible");                

                }
            else{
                saldoActual = saldo_inicial- retiro;
                JOptionPane.showMessageDialog(null, "Retiro exitoso, saldo actual: "+saldoActual);
            }
            break;

            case 3: JOptionPane.showMessageDialog(null, "Adios.");
            break;
        
            default: JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
        }



    }
    
}
