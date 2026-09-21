/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;
import Logica.Calculadora;
import javax.swing.JOptionPane;
/**
 *
 * @author emgallego
 */
public class CalculadoraDeNotas {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int numeroDeEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("digite a cuantos estudiantes se va a colocar"));
        String nombre=JOptionPane.showInputDialog("Ingrese su Nombre");
        String id=JOptionPane.showInputDialog("Ingrese su id");
        double notad = Double.parseDouble(JOptionPane.showInputDialog("digite la nota de Desarrollo"));
        double notam = Double.parseDouble(JOptionPane.showInputDialog("digite la nota de Matemáticas"));
        Calculadora miComparador=new Calculadora(id,nombre,notad,notam);
        
        double definitiva=miComparador.calcularDefinitiva();
        
        miComparador.mostrarNota();
    }
}
