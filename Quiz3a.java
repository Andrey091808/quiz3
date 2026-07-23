/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz3a;
import javax.swing.JOptionPane;
/**
 *
 * @author yorle
 */
public class Quiz3a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] listaProductos={"Arroz",   "Azúcar",  "Leche"};
       
       
    TiendaMatriz tienda=new TiendaMatriz(listaProductos);

        tienda.generarVentasAleatorias();

       
        String reporte = tienda.obtenerMatrizTexto() + "\n" +
                         "--------------------------------------------------\n" +
                         tienda.calcularVentasPorProducto() + "\n" +
                         tienda.determinarDiaMayorVentas();

        JOptionPane.showMessageDialog(null, reporte);
    }
}
    
    

