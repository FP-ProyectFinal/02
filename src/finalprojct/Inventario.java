/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojct;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Item> items;
    
    public Inventario(){
        this.items = new ArrayList();
    }
    
    /**
     * Agrega un Item a el arraylist de items
     * @param newItem 
     * @return  boolean (true si se agrego el item y false si no)
     */
    public boolean addItem (Item newItem) {
        boolean result;
        if (this.isEmpty()) {
            this.items.add(newItem);
            result = true;
        } else {
            if (this.findClave(newItem.getClave()) > -1) {
                result = false;
            } else {
                this.items.add(newItem);
                result = true;
            }
        }
        return result;
    }
    /**
     * Obtiene un item del arraylist basado en un index
     * @param index
     * @return Item
     */
    public Item getItemAt (int index) {
        return this.items.get(index);
    }
    
    /**
     * 
     * @param clave
     * @return boolean (true si la clave existe, false si no)
     */
    public int findClave (String clave) {
        int result = -1;
        if (this.isEmpty()) return result;
        
        for( int i = 0; i < this.size(); i++) {
            if(this.getItemAt(i).getClave().equals(clave)){
                result = i;
                break;
            }
        }
        
        return result;
    } 
    /**
     * Obtiene el tamaño del inventario (los Items agregados, pero no la cantidad total de items)
     * @return int
     */
    public int size () {
        return this.items.size();
    }
    /**
     * Revisa si el araylist esta vacio
     * @return boolean (true si esta vacio y false si no)
     */
    public boolean isEmpty () {
        return this.items.isEmpty();
    }
    
}
