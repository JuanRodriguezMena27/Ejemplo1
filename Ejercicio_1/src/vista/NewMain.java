
package vista;

import java.text.ParseException;
import java.util.ArrayList;
import modelo.Noperecedero;
import modelo.Perecedero;
import modelo.Producto;


public class NewMain {

    public static void main(String[] args) throws ParseException {
       Perecedero p1= new Perecedero();
      
       System.out.println("produtos que perecen multiplicado por el numero de productos: "+p1.CalcularP(5));
       
       Noperecedero np1= new Noperecedero();
       System.out.println("producto que no son perecederos: "+np1.CalcularP(5));
       
       
       
//       Perecedero p2= new Perecedero();
//       p2.CalcularP(2);
//       Perecedero p3= new Perecedero();
//       p3.CalcularP(2);
//       Perecedero p4= new Perecedero();
//       p4.CalcularP(2);
//       Perecedero p5= new Perecedero();
//       p5.CalcularP(2);
//       
//       ArrayList<Producto> listPerecedero = new ArrayList(5);
//       listPerecedero.add(p1);
//       listPerecedero.add(p2);
//       listPerecedero.add(p3);
//       listPerecedero.add(p4);
//       listPerecedero.add(p5);
//       
//       for(int i=0;i<listPerecedero.size();i++){
//           System.out.println(listPerecedero);
//           
//           
//       }
//       
//       
//      
//       Noperecedero np2= new Noperecedero();
//       Noperecedero np3= new Noperecedero();
//       Noperecedero np4= new Noperecedero();
//       Noperecedero np5= new Noperecedero();
//       ArrayList<Producto> listNperecedero = new ArrayList(5);
//       listNperecedero.add(np1);
//       listNperecedero.add(np2);
//       listNperecedero.add(np3);
//       listNperecedero.add(np4);
//       listNperecedero.add(np5);
//       
//       
//       
//       
//           
       }
       
       
       
       
    
    
}
