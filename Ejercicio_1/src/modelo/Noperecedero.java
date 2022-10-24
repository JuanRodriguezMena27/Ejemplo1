
package modelo;

import java.text.ParseException;


public class Noperecedero extends Producto {
    protected double iva;

    public Noperecedero() {
        this.iva=1.4;
    }

    public Noperecedero(double iva, String nombre, float precio) {
        super(nombre, precio);
        this.iva = iva;
    }

    @Override
    public double CalcularP(int numero) throws ParseException {
        this.iva=((super.precio*this.iva)/100);
        super.precio=(numero*(super.precio+this.iva));
        
        return super.precio; 
    }
    
    
    
}
