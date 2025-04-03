/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author Alumnos DAW
 */
public class Programador extends Empleado{
    private double bonusExperiencia=2000;

    public Programador(String nombre, int experiencia) {
        super(nombre, experiencia);
    }
    
    @Override
    public double calcularSalario(){
        Double salario;
        
        salario=Empresa.sueldoBaseProgramador+(this.bonusExperiencia*this.experiencia);
        
        return salario;
    }
    
    @Override
    public void trabajar(){
        System.out.printf("%5s -->estoy picando codigo\n",this.nombre);
    }

    public double getBonusExperiencia() {
        return bonusExperiencia;
    }

    public void setBonusExperiencia(double bonusExperiencia) {
        this.bonusExperiencia = bonusExperiencia;
    }

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
