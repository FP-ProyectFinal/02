/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojct;


public class Item {
    // Propiedades
    private String clave;
    private double precio;
    private int cantidad;
    private String description;

    // Obtiene la clave
    public String getClave() {
        return clave;
    }
    // Actualiza la clave
    public void setClave(String clave) {
        this.clave = clave;
    }
    // Obtiene el precio
    public double getPrecio() {
        return precio;
    }
    // Actualiza el precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    // Obtiene la cantidad
    public int getCantidad() {
        return cantidad;
    }
    // Actualiza la cantidad
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    // Obtiene la descripcion
    public String getDescription() {
        return description;
    }
    // Actualiza la descripcion
    public void setDescription(String description) {
        this.description = description;
    }
   
    // Constructor
   public Item (String clave, double precio, int cantidad, String description) {
       this.clave = clave;
       this.precio = precio;
       this.cantidad = cantidad;
       this.description = description;
   }
}
