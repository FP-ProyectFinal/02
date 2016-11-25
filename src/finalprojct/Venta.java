/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojct;


public class Venta {
    // Propiedades
    private String clave;
    private double precio;
    private int cantidad;

    private String descripcion;
    private double importe;
    
    // Constructor
    public Venta(String clave, double precio, String descripcion, int cantidad, double importe){
        this.clave = clave;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.importe = importe;
    }
    // Obtiene la cantidad
    public int getCantidad() {
        return cantidad;
    }
    // actualiza la cantidad
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    // Obtiene la clave
    public String getClave() {
        return clave;
    }
    // actualiza la clave
    public void setClave(String clave) {
        this.clave = clave;
    }
    // obtiene el precio
    public double getPrecio() {
        return precio;
    }
    // Actualiza el precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    // Optiene la description
    public String getDescripcion() {
        return descripcion;
    }
    //Actualiza la descripcion
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    // optiene el importe
    public double getImporte() {
        return importe;
    }
    // actualiza el importe
    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
