/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

import java.util.ArrayList;

/**
 *
 * @author Alumnos DAW
 */
public class Departamento {
    private String nombre;
    private ArrayList<Empleado> listaEmpleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.listaEmpleados=new ArrayList();
        
    }
    
    public void agregarEmpleado(Empleado e){
        listaEmpleados.add(e);
        e.setDepartamento(this);
        
    }
    
    @Override
    public String toString(){
        int contador=0;
        for (Empleado e : listaEmpleados) {
            contador++;
        }
        return String.format("[%s] %5d empleados - %.2f€ salario total", this.nombre,contador,this.calcularSalarioTotal());
    }
    
    private double calcularSalarioTotal(){
        double salarioTotal=0;
        for (Empleado e : listaEmpleados) {
            salarioTotal=salarioTotal+e.calcularSalario();
        }
        
        return salarioTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    
    
    
    
}
