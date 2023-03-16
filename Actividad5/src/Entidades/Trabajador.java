/**
 * La clase define un conjunto de métodos "getter" y "setter" para acceder y modificar 
 * los valores de los campos privados. Los métodos "getter" devuelven el valor del campo correspondiente, 
 * mientras que los métodos "setter" establecen el valor del campo correspondiente.
 */
package Entidades;

import Vista.Salarios1;

/**
 *
 * @author carlos
 */
public class Trabajador {
    private String sexo;
    private String nombre;
    private String numTrabajador;
    private String Puesto;
    private String sueldo;
    private int edad;
    

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumTrabajador() {
        return numTrabajador;
    }

    public void setNumTrabajador(String numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
    

