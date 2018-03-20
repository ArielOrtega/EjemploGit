/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Pablo
 */
public class Organo {
    
    private String nombre;
    private String funcion;

    public Organo() {
    }

    public Organo(String nombre, String funcion) {
        this.nombre = nombre;
        this.funcion = funcion;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "Organo{" + "nombre=" + nombre + ", funcion=" + funcion + '}';
    }
     
    
}
