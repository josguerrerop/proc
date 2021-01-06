package modelo;
import java.util.ArrayList;

public class Proceso {
  private String estado;
  private final int id;
  private final String nombre;
  private  int tamaño;
  private final ArrayList<String> arr ;

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
  public String mostrarRecursos(){
      String recursos="";
  for(int i=0;i<this.arr.size();i++){
  recursos+=this.arr.get(i)+" ";
  }
  return recursos;
  }
  
  public int getId() {
   
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getTamaño() {
        return tamaño;
    }
    public ArrayList<String> getArr() {
        return arr;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Proceso(int id, String nombre, int tamaño ,ArrayList<String> arr) {
        this.estado="Listo";
        this.id = id;
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.arr =arr;
        if(this.tamaño==0){
        this.tamaño=100;
        }else{
        this.tamaño=200;
        }
        
       
    }
    
     public String toString(){
        return this.nombre;
        }
}