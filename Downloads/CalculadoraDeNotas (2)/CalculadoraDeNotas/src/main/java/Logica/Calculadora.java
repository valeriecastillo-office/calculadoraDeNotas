/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import javax.swing.JOptionPane;

public class Calculadora {
    
    // Atributos declarados como arreglos para coincidir con tu Vista
    private String[] nombre;
    private String[] id;
    private double[] notaDesarrollo;
    private double[] notaMatematica;
    private double[] definitiva;

    // Constructor que recibe los 5 arreglos
    public Calculadora(String[] nombre, String[] id, double[] notaDesarrollo, double[] notaMatematica, double[] definitiva) {
        this.nombre = nombre;
        this.id = id;
        this.notaDesarrollo = notaDesarrollo;
        this.notaMatematica = notaMatematica;
        this.definitiva = definitiva;
    }

    // Método que recorre los arreglos para calcular las definitivas
    public double[] calcularDefinitiva() {
        for (int i = 0; i < notaMatematica.length; i++) {
            definitiva[i] = (notaMatematica[i] * 0.4) + (notaDesarrollo[i] * 0.6);
        }
        return definitiva;
    }

    // Método que recorre los arreglos para mostrar los resultados de todos
    public void mostrarNota() {
        for (int i = 0; i < nombre.length; i++) {
            JOptionPane.showMessageDialog(null, 
                "Nombre: " + nombre[i] + 
                "\nCódigo: " + id[i] + 
                "\nNota definitiva: " + definitiva[i]
            );
        }
    }
}