/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import javax.swing.JOptionPane;
/**
 *
 * @author emgallego
 */
public class Calculadora {
    private String id;
    private String nombre;
    private double notaDesarrollo;
    private double notaMatematica;
    private double definitiva;
    private int numeroDeEstudiantes;
    
    public Calculadora(String id, String nombre, double notad, double notam) {

    this.id = id;
    this.nombre = nombre;
    this.notaDesarrollo = notad;
    this.notaMatematica = notam;
    this.numeroDeEstudiantes= numeroDeEstudiantes;
    
       
}

    public double getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(double definitiva) {
        this.definitiva = definitiva;
    }

    public int getNumeroDeEstudiantes() {
        return numeroDeEstudiantes;
    }

    public void setNumeroDeEstudiantes(int numeroDeEstudiantes) {
        this.numeroDeEstudiantes = numeroDeEstudiantes;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaDesarrollo() {
        return notaDesarrollo;
    }

    public void setNotaDesarrollo(double notaDesarrollo) {
        this.notaDesarrollo = notaDesarrollo;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }
    
    public double calcularDefinitiva(){
        definitiva = notaMatematica * 0.4 + notaDesarrollo * 0.6;
        return definitiva;
    
    
    }
    
    public void mostrarNota(){
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre +"\nCodigo: " + id + "\nNota definitiva: " + definitiva);
    }
}

