/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Producto;

/**
 *
 * @author HP
 */
public class DProducto {
    
    private ArrayList<Producto> listProducto = new ArrayList<>() ;

    public ArrayList<Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }

  /**
    Permite agregar un nuevo producto
    */

    public int agregarProducto(int id, String nom, double precio, int existencia){
       
        int b=0;
        Producto prod = new Producto(id, nom, precio, existencia);
        listProducto.add(prod);
        b=1;
     return b;
     }  
    
    
    /**
Devuelve una tabla con los registros
almacenados en el listado de productos
*/
       public DefaultTableModel gelListProd(){

       DefaultTableModel dtm = new DefaultTableModel();
       String titulo [] = {"ID", "NOMBRE", "PRECIO", "EXISTENCIA"};
//Asigna los encabezados a mi tabla
       dtm.setColumnIdentifiers(titulo);
//Estoy usando for each
          for (Producto pro: listProducto){
           String reg[] = new String[5];
           reg[0] = ""+pro.getId();
           reg[1] = pro.getNombre();
           reg[2] = ""+pro.getPrecio();
           reg[3] = ""+pro.getExistencia();
           dtm.addRow(reg);
          }
        return dtm;

       }
    
    
}
