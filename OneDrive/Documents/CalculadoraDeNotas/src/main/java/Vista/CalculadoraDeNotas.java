/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Vista;

import Logica.Calculadora;
import javax.swing.JOptionPane;


public class CalculadoraDeNotas {

    public static void main(String[] args) {

        int numeroDeEstudiantes = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "¿A cuántos estudiantes se va a calificar?"
                )
        );

        String[] nombres = new String[numeroDeEstudiantes];
        String[] ids = new String[numeroDeEstudiantes];
        double[] notasDesarrollo = new double[numeroDeEstudiantes];
        double[] notasMatematicas = new double[numeroDeEstudiantes];
        double[] definitivas = new double[numeroDeEstudiantes];

        for (int i = 0; i < numeroDeEstudiantes; i++) {

            nombres[i] = JOptionPane.showInputDialog(
                    "Ingrese el nombre del estudiante " + (i + 1)
            );

            ids[i] = JOptionPane.showInputDialog(
                    "Ingrese el id del estudiante " + (i + 1)
            );

            notasDesarrollo[i] = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Digite la nota de Desarrollo"
                    )
            );

            notasMatematicas[i] = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Digite la nota de Matemáticas"
                    )
            );
        }

        Calculadora calculadora = new Calculadora(
                nombres,
                ids,
                notasDesarrollo,
                notasMatematicas,
                definitivas
        );

        calculadora.calcularDefinitiva();
        calculadora.mostrarNota();
    }
}