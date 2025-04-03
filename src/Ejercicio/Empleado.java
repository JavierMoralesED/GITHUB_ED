/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author Alumnos DAW
 */
public abstract class Empleado {
    protected int codigo;
    protected String nombre;
    protected int experiencia;
    protected double sueldoBase;
    protected Departamento departamento;
    protected static int contID=1001;

    public Empleado(String nombre, int experiencia) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.codigo=Empleado.contID;
        Empleado.contID++;
        
        
    }
    
    @Override
    public String toString(){
        return String.format("id:%d %5s(%d) [%5s] %.2f", this.codigo,this.nombre,this.experiencia,this.departamento.getNombre(),calcularSalario());
    }
    
    public abstract double calcularSalario();
    public abstract void trabajar();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    
}
