
package Clases;

import java.util.ArrayList;


public class Consolas {

    
    public String codigo;
    public String modelo;
    public String marca;
    public double precio;
    public ArrayList<Consolas> listaConsola;

    
    public Consolas(String codigo, String modelo, String marca, double precio) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }
    
    public Consolas() {
        listaConsola = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void Ingresar(String _codigo,String _modelo, String _marca, double _precio){
       this.listaConsola.add(new Consolas(_codigo,_modelo,_marca,_precio));
    }
    
    

    public ArrayList<Consolas> ordenarSort(){
       Ordenamiento ordenar = new Ordenamiento();
       this.listaConsola.sort(ordenar);
       return this.listaConsola;
   }
    
    public void ordenarBurbujaDoble(){
        double pTemp;
        double pTempSig;
        
       for(int i = 0; i < this.listaConsola.size() - 1; i++){
            for(int j = 0; j < this.listaConsola.size() - 1; j++){
                if (this.listaConsola.get(j).getPrecio()> this.listaConsola.get(j+1).getPrecio()){
                    pTempSig = this.listaConsola.get(j+1).getPrecio();
                    pTemp= this.listaConsola.get(j).getPrecio();
                    this.listaConsola.get(j+1).setPrecio(pTemp);
                    this.listaConsola.get(j).setPrecio(pTempSig);                    

                }if (this.listaConsola.get(this.listaConsola.size()-1-j).getPrecio()
                    < this.listaConsola.get(this.listaConsola.size()-2-j).getPrecio()){
                    pTempSig = this.listaConsola.get(this.listaConsola.size()-2-j).getPrecio();
                    pTemp= this.listaConsola.get(this.listaConsola.size()-1-j).getPrecio();
                    this.listaConsola.get(this.listaConsola.size()-2-j).setPrecio(pTemp);
                    this.listaConsola.get(this.listaConsola.size()-1-j).setPrecio(pTempSig);    
                }
            }
        }
        
    }
    
    public void limpiar(){
        this.listaConsola.removeAll(listaConsola);
    }
}
        

