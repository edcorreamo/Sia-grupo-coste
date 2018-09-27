/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Prometeo
 */
public class ArticulosElectronicos {
   
    private String marca;
    private float precio;
    private String color;
    
    public ArticulosElectronicos(String color,String marca,float precio){
    setPrecio(precio);
    setMarca(marca);
    setColor(color);
    }
    public ArticulosElectronicos(){
    setPrecio(-1);
    setMarca("artuculo sin asignacion");
    setColor("campo no agregado");
    }
    
    
    public void setMarca(String marca){
    this.marca=marca;
     }
    public void setPrecio(float precio ){
    this.precio=precio;
    }
    public void setColor(String color){
    this.color=color;
    }
    public String getMarca(){
    return this.marca;
    }
    public float getPrecio(){
    return this.precio;
    }
    public String getColor(){
    return this.color;
    }
    @Override
    public String toString(){
        String cadena="marca: "+getMarca()+"precio: "+getPrecio()+"color: "+getColor();
      return cadena; 
}
  
   }
    
    
