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
public class Empresa {
    private String nombre;
    private ArrayList<Departamento> listaDepartamentos;
    private ArrayList<Empleado> listaEmpleados;
    public static double sueldoBaseDirector;
    public static double sueldoBaseContable;
    public static double sueldoBaseProgramador;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaDepartamentos=new ArrayList();
        this.listaEmpleados=new ArrayList();
        this.sueldoBaseContable=30000;
        this.sueldoBaseProgramador=50000;
        this.sueldoBaseDirector=100000;
    }
    
    public void agregarDepartamento(Departamento d){
        listaDepartamentos.add(d);
    }
    
    public Departamento buscarDepartamento(String nombre){
        for (Departamento d : listaDepartamentos) {
            if (d.getNombre().equalsIgnoreCase(nombre)){
                return d;
            }
        }
        return null;
    }
    
    public void listarDepartamentos(){
        for (Departamento d : listaDepartamentos) {
            System.out.println(d);
        }
    }
    
    public void agregarEmpleado(Empleado e){
        listaEmpleados.add(e);
        
        if (e instanceof Director){
            Departamento d= this.buscarDepartamento("Direccion");
            d.agregarEmpleado(e);
        }
        
        if (e instanceof Contable){
            Departamento d=this.buscarDepartamento("Contabilidad");
            d.agregarEmpleado(e);
        }
        
        if (e instanceof Programador){
            Departamento d= this.buscarDepartamento("Programacion");
            d.agregarEmpleado(e);
        }
    }
    
    public void listarEmpleados(){
        for (Empleado e : listaEmpleados) {
            System.out.println(e);
        }
    }
    
    public void iniciarJornada(){
        for (Empleado e : listaEmpleados) {
            e.trabajar();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public double getSueldoBaseDirector() {
        return sueldoBaseDirector;
    }

    public void setSueldoBaseDirector(double sueldoBaseDirector) {
        Empresa.sueldoBaseDirector = sueldoBaseDirector;
    }

    public double getSueldoBaseContable() {
        return sueldoBaseContable;
    }

    public void setSueldoBaseContable(double sueldoBaseContable) {
        Empresa.sueldoBaseContable = sueldoBaseContable;
    }

    public double getSueldoBaseProgramador() {
        return sueldoBaseProgramador;
    }

    public void setSueldoBaseProgramador(double sueldoBaseProgramador) {
        Empresa.sueldoBaseProgramador = sueldoBaseProgramador;
    }
    
    
    
    
    
}
