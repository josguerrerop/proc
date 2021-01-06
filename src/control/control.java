package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Proceso;
import vista.Vproceso;
import vista.ventanaP;

public class control implements ActionListener{
    private  int id =1;
    private ventanaP ventanaPrincipal;
    private Vproceso ventanaProceso;
    private Proceso proceso ;
    private ArrayList<Proceso> arrP ;
    private  Set<String> arrR ;
  
    control(){
    this.ventanaPrincipal = new ventanaP();
    this.ventanaPrincipal.getBcrear().addActionListener(this);
    this.ventanaPrincipal.getBEjecutar().addActionListener(this);
    this.arrP = new ArrayList<>();
    this.arrR = new HashSet<>(fun());
    }
    
    private Set<String> fun(){
        this.arrR = new HashSet<>();
        this.arrR.add("R1");
        this.arrR.add("R2");
        this.arrR.add("R3");
        this.arrR.add("R4");
        this.arrR.add("R5");
        this.arrR.add("R6");
        return this.arrR;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.ventanaPrincipal.getBcrear()){
            ventanaProceso = new Vproceso();
            this.ventanaProceso.setVisible(true);
            this.ventanaProceso.getLabelIDP().setText(id+"");
            this.ventanaProceso.getBOK().addActionListener(this);
            id++;
        }
         if(e.getSource()==this.ventanaProceso.getBOK()){
         this.proceso=  new Proceso
         (id,
         this.ventanaProceso.getLabelNombre().getText(),
         this.ventanaProceso.getComboTamaño().getSelectedIndex(),
         this.ventanaProceso.getArr()
         );
         this.ventanaPrincipal.getEstadoNuevo().setText("  "+proceso.getNombre());
         pasarListo(proceso);
         this.ventanaProceso.dispose();
         }
         
         if(e.getSource()==this.ventanaPrincipal.getBEjecutar()){
                ejecutar();
         }
    }

      private void pasarListo(Proceso proceso) {
         proceso.setEstado("Listo");
         this.ventanaPrincipal.getEstadoListo().append(proceso.getNombre());
         this.arrP.add(proceso);
    }
      
    public static void main(String args[]) {
    control control = new control();
    }
    
    public boolean  devolverRecurso(){
        int n = (int) (Math.random()*2);
        if(n==1){
            System.out.println(n);
          this.arrR.add("R1");
          return true;
        }
        return false;
     }
    
   public void  show(){
       this.ventanaPrincipal.getEstadoListo().setText("");
        this.ventanaPrincipal.getEstadoBloqueado().setText("");
       for(int i=0;i<this.arrP.size();i++){
       if(this.arrP.get(i).getEstado().equals("Listo")){
       this.ventanaPrincipal.getEstadoListo().append(this.arrP.get(i).getNombre());
       }else if(this.arrP.get(i).getEstado().equals("Bloqueado")){
        this.ventanaPrincipal.getEstadoBloqueado().append(this.arrP.get(i).getNombre());
       }
       }
    }
    
   public void Thread(){
   try { Thread.sleep(5000);} 
           catch (InterruptedException ex)
           { Logger.getLogger(control.class.getName()).log(Level.SEVERE, null, ex);}
   }
   
   public void pasarBloqueado(int i){
    this.arrP.get(i).setEstado("Bloqueado");
    this.ventanaPrincipal.getEstadoBloqueado().append(arrP.get(i).getNombre());
   }
   
   public void pasarListo(int i){
   this.arrP.get(i).setEstado("Listo");
   }
 public void llenarEstadistica(){
 DefaultTableModel model = (DefaultTableModel) this.ventanaPrincipal.getEstadisticasProcesos().getModel();
 model.setRowCount(0);
 for(int i=0;i<this.arrP.size();i++){
   Object[] rowdata = new Object[] {
       this.arrP.get(i).getId()-1, 
       this.arrP.get(i).getNombre(),
       this.arrP.get(i).getTamaño(),
       this.arrP.get(i).getArr(),
       this.arrP.get(i).getEstado()
       };
   model.addRow(rowdata);
 }
 }
 
    public void ejecutar(){
    new Thread() { @Override public void run(){   
     while(tamaño()){
      for(int i=0;i<arrP.size();i++){
       if(tieneRecurso(arrP,i) && arrP.get(i).getEstado().equals("Listo")){
        ejecucion(i);
        Thread();
        Terminado(i);
       } 
       if(!(tieneRecurso(arrP,i)) && arrP.get(i).getEstado().equals("Listo")){
              pasarBloqueado(i);
              limpiar();
       }else if(arrP.get(i).getEstado().equals("Bloqueado") && devolverRecurso()){
           pasarListo(i);
           Thread();
          }
        }
        show();
       llenarEstadistica();
      }
       limpiar();
    }
  }.start();       
}
    
    
   public void limpiar(){
    this.ventanaPrincipal.getEstadoEjecucion().setText(" ");
   }
    
     private boolean tamaño() {
        for(int i=0;i<this.arrP.size();i++){
        if(this.arrP.get(i).getTamaño()>0 && (this.arrP.get(i).getEstado().equals("Listo")
                || this.arrP.get(i).getEstado().equals("Bloqueado"))){
         return true;
        }
        }
        return false;
        }
    
    
    public void ejecucion(int i){
    this.ventanaPrincipal.getEstadoEjecucion().setText(this.arrP.get(i).getNombre());
      arrR.remove(arrP.get(i).getArr().get(0));
    
    }
    
    public void Terminado(int i){
        this.arrP.get(i).setTamaño(this.arrP.get(i).getTamaño()-100);
        if(this.arrP.get(i).getTamaño()==0){
        this.arrP.get(i).setEstado("Terminado");
        this.arrR.add("R1");
        this.ventanaPrincipal.getEstadoTerminado().append(this.arrP.get(i).getNombre());
        }
    }
  
    private boolean tieneRecurso(ArrayList<Proceso> arrP , int i) {
       for(int j=0;j<arrP.get(i).getArr().size();j++){
           if(arrR.contains(arrP.get(i).getArr().get(j))){
                 return true;
           }
         }
        return false;
    }
}

