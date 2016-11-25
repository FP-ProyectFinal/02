/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojct;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Note {
    /**
     * Propiedades
     */
    private PrintWriter writer;
    private DateFormat dateFormat;
    private Date date;
    
    /**
     * Constructor
     */
    public Note(){
        // Se define el formato de fecha (https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // Se crea el objecto Date
        this.date = new Date();
    }
    /**
     * Genera un archivo .txt con las ventas temporales
     * @param ventas 
     */
    public void crearNotaDeVenta (HistorialVentas ventas){
        // Optenemos la fecha actual
        String currentDate = this.dateFormat.format(this.date);
        // Inicializamos el total
        double total = 0;
        try{
            this.writer = new PrintWriter("cierre_" + currentDate + "_" + System.currentTimeMillis() + ".txt", "UTF-8");
            this.writer.println("Historial ventas");
            for(int i = 0; i < ventas.size(); i++) {
                this.writer.println( (i+1) + ") Clave de venta: " + ventas.getVentaAt(i).getClave());
                this.writer.println("Precio: " + ventas.getVentaAt(i).getPrecio() + "\t" + "Cantidad: " + ventas.getVentaAt(i).getCantidad());
                this.writer.println("Importe: " + ventas.getVentaAt(i).getImporte());
                this.writer.println("Descripción: ");
                this.writer.println(ventas.getVentaAt(i).getDescripcion());
                this.writer.println("----------------------------------------------------------------");
                // Acumulamos los importes
                total += ventas.getVentaAt(i).getImporte();
            }
            this.writer.println("Total: " + total);
            this.writer.println("----------------------------------------------------------------");
            this.writer.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Whoops something went horribly wrong");
        }
    }
    
    public void crearNotaDeVentasDelDia (ArrayList<HistorialVentas> ventasGlobales) {
        // Optenemos la fecha actual
        String currentDate = this.dateFormat.format(this.date);
        // Inicializamos totalGlobal
        double totalGlobal = 0;
        try{
            this.writer = new PrintWriter("cierre_" + currentDate + "_" + System.currentTimeMillis() + ".txt", "UTF-8");
            this.writer.println("Historial Globales ventas");
            for ( int  i = 0; i < ventasGlobales.size(); i++) {
                double total = 0;
                this.writer.println( (i+1) + ") Venta Realizada");
                this.writer.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                for(int j = 0; j < ventasGlobales.get(i).size(); j++) {
                    this.writer.println( (j+1) + ") Clave de venta: " + ventasGlobales.get(i).getVentaAt(j).getClave());
                    this.writer.println("Precio: " + ventasGlobales.get(i).getVentaAt(j).getPrecio());
                    this.writer.println("Cantidad: " + ventasGlobales.get(i).getVentaAt(j).getCantidad());
                    this.writer.println("Importe: " + ventasGlobales.get(i).getVentaAt(j).getImporte());
                    this.writer.println("----------------------------------------------------------------");
                    // Acumulamos los importes
                    total += ventasGlobales.get(i).getVentaAt(j).getImporte();
                }
                this.writer.println("Total: " + total);
                this.writer.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                totalGlobal += total;
            }
            this.writer.println("TOTAL Global: " + totalGlobal);
            this.writer.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Whoops something went horribly wrong");
        }
    }
    
}
