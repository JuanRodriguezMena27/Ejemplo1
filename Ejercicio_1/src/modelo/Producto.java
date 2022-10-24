
package modelo;

import java.text.ParseException;
import java.util.logging.Logger;


public class Producto {
    protected String nombre;
    protected double precio;

    public Producto() {
        this.nombre="Luffy";
        this.precio=5000;
            
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    public double CalcularP(int numero) throws ParseException{
        
        
        return 0;
        
        
    }
    
    
    
    
    
}
