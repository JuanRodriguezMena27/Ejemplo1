
package modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;



public class Perecedero extends Producto {
    protected String fCaducacion;
    protected Date fActual;
    protected int dias;
//    protected ArrayList<Producto> Vendidos;

    public Perecedero() {
        this.fCaducacion="25/10/2022";
        
    }

    public Perecedero(String fCaducacion, Date fActual, int dias, String nombre, float precio) {
        super(nombre, precio);
        this.fCaducacion = fCaducacion;
        this.fActual = fActual;
        this.dias = dias;
    }

    public String getfCaducacion() {
        return fCaducacion;
    }

    public void setfCaducacion(String fCaducacion) {
        this.fCaducacion = fCaducacion;
    }

    public Date getfActual() {
        return fActual;
    }

    public void setfActual(Date fActual) {
        this.fActual = fActual;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Perecedero{" + "fCaducacion=" + fCaducacion + ", fActual=" + fActual + ", dias=" + dias + '}';
    }

    @Override
    public double CalcularP(int numero) throws ParseException {
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendaria = Calendar.getInstance();
        Date fActual = calendaria.getTime();
        
        Date fechav = fecha.parse(this.fCaducacion);   
        long calc = fechav.getTime()-fActual.getTime();
        TimeUnit unidad = TimeUnit.DAYS;
        this.dias= (int)unidad.convert(calc, TimeUnit.MILLISECONDS);
        
       
        
        super.precio = (numero*super.precio);
        
        switch(this.dias){
            case 1:
                super.precio=(super.precio/4);
                break;
            case 2:
                super.precio= (super.precio/3);
                break;
            case 3:
                super.precio= (super.precio/2);
                break;
        }
        return super.precio;
        
    
    }
    
//    public ArrayList<Producto> ListaDeVentas(Perecedero x){
//        ArrayList<Producto> listVentas = new ArrayList();
//        listVentas.add(x);
//        return listVentas;
//        
//    }
    }
    
    
    
    
    

