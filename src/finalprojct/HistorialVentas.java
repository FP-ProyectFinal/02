/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojct;

import java.util.ArrayList;

public class HistorialVentas {
    // Propiedades
    private ArrayList<Venta> historial;
    //Constructores
    public HistorialVentas (){
        this.historial = new ArrayList();
    }
    public HistorialVentas (ArrayList<Venta> ventas){
        this.historial = ventas;
    }
    //agrega ventas
    public void agregarVenta (Venta v) {
        this.historial.add(v);
    }
    //Optiene una venta basado en un index
    public Venta getVentaAt (int index ) {
        return this.historial.get(index);
    }
    // optiene el tamaño del historial ventas
    public int size(){
        return this.historial.size();
    }
    // revisa si el historial de ventas esta vacio
    public boolean isEmpty() {
        return this.historial.isEmpty();
    }
    // resetea el historial de ventas
    public void clear(){
        this.historial.clear();
    }
    
    // clona el arraylist del historial
    public HistorialVentas clone () {
        return new HistorialVentas((ArrayList)this.historial.clone());
    }
}
