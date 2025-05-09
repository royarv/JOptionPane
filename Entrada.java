import javax.swing.JOptionPane;
public class Entrada{
    public static void main(String[] arg){
        String nombreUsuario = JOptionPane.showInputDialog("¿Cual es su nombre?");
        String apellidoUsuario = JOptionPane.showInputDialog("¿Cual es su apeliido?");
        System.out.println("Tu nombre es: "+nombreUsuario +" " +apellidoUsuario);
    }
}