/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz3a;
 import java.util.Random;
/**
 *
 * @author yorle
 */
public class TiendaMatriz {
   
    private String[]productos;
    private int[][]matrizVentas;
    private String[]dias={"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

    
    public TiendaMatriz(String[] productos){
        this.productos=productos;
        this.matrizVentas=new int[7][productos.length];
        generarVentasAleatorias();
    }
    
    public String[] getProductos(){
        return productos; 
    }
    public void setProductos(String[] productos){ 
        this.productos=productos; 
    }

    public int[][] getMatrizVentas(){ 
        return matrizVentas; 
    }
    public void setMatrizVentas(int[][] matrizVentas){ 
        this.matrizVentas=matrizVentas; 
    }

    public void generarVentasAleatorias() {
        Random generador= new Random();
        for (int i=0;i<7;i++) {
            for (int j=0;j<productos.length; j++) {
                matrizVentas[i][j]=generador.nextInt(10); 
            }
        }
    }

    public String calcularVentasPorProducto(){
        String resultado="Total de ventas por producto:\n";
        for (int j=0;j<productos.length; j++){
            int sumaColumna=0;
            for (int i=0;i<7;i++){
                sumaColumna +=matrizVentas[i][j];
            }
            resultado += "- " + productos[j] + ": " + sumaColumna + "\n";
        }
        return resultado;
    }

    public String determinarDiaMayorVentas(){
        int mayorVentaDia=-1;
        int indiceDia=0;

        for (int i=0;i<7;i++){
            int sumaFila=0;
            for (int j=0;j<productos.length;j++){
                sumaFila +=matrizVentas[i][j];
            }
            if (sumaFila>mayorVentaDia) {
                mayorVentaDia=sumaFila;
                indiceDia=i;
            }
        }
        return "El día con mayores ventas totales es " + dias[indiceDia] + "con un total de " + mayorVentaDia + " ventas.";
    }
    
    public String obtenerMatrizTexto() {
        String si="Matriz de Ventas :\n\"   ";
        for (String p:productos){
            si +=p+"   ";
        }
        si +="\n";

        for (int i=0;i<7;i++) {
            si +=dias[i]+"   ";
            for (int j=0;j<productos.length;j++) {
                si +=matrizVentas[i][j]+"   ";
            }
            si +="\n";
        }
        return si;
    }
}
    
    

