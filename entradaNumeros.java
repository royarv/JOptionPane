import javax.swing.JOptionPane;
public class entradaNumeros{
    public static void main(String[] arg){
        //Enteros
        String numero1 = JOptionPane.showInputDialog("Ingresa numero 1");
        String numero2 = JOptionPane.showInputDialog("Ingresa Numero 2");

        int numeroEntero1 = Integer.parseInt(numero1);
        int numeroEntero2 = Integer.parseInt(numero2);
        System.out.println(numeroEntero1 + numeroEntero2);

        //Decimales
        String numero3 = JOptionPane.showInputDialog("Ingresa numero decimal 1");
        String numero4 = JOptionPane.showInputDialog("Ingresa numero decimal 2");

        double numeroDecimal1 = Double.parseDouble(numero3);
        double numeroDecimal2 = Double.parseDouble(numero4);
        System.out.println(numeroDecimal1 + numeroDecimal2);
    }
}