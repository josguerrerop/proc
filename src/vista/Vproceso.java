/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author john
 */
public class Vproceso extends javax.swing.JFrame implements ActionListener{
   
   private final JButton recurso1= new JButton();
   private final JButton recurso2= new JButton();
   private final JButton recurso3= new JButton();
   private final JButton recurso4= new JButton();
   private final JButton recurso5= new JButton();
   private final JButton recurso6= new JButton();
   private ArrayList<String> arr = new ArrayList<>();

   //private Proceso  proceso;
  private final ArrayList<JButton> recursos = new ArrayList<>();

    public JButton getBOK() {
        return BOK;
    }

    public ArrayList<String> getArr() {
        return arr;
    }
 
    
    public Vproceso() {
        recursos.add(recurso1);
        recursos.add(recurso2);
        recursos.add(recurso3);
        recursos.add(recurso4);
        recursos.add(recurso5);
        recursos.add(recurso6);
        this.setUndecorated(true);
        this.setLocation(280,492);
         this.setTitle("Crear proceso");
        // this.setVisible(true);
         initComponents();
         this.jPanel1.setLayout(new GridLayout(3,3));
             for(int i=0;i<this.recursos.size();i++){
             this.recursos.get(i).setText("R"+(i+1));
             this.recursos.get(i).setSize(30, 30);
             this.recursos.get(i).addActionListener(this);
             this.jPanel1.add(this.recursos.get(i));
        }
    }

    public JComboBox<String> getComboTamaño() {
        return ComboTamaño;
    }

    public JTextField getLabelNombre() {
        return LabelNombre;
    }

    
    
    public JLabel getLabelIDP() {
        return LabelIDP;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboTamaño = new javax.swing.JComboBox<>();
        LabelNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BOK = new javax.swing.JButton();
        LabelIDP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Pid.setText("id :");

        jLabel3.setText("nombre:");

        ComboTamaño.setFont(new java.awt.Font("Mukti Narrow", 0, 12)); // NOI18N
        ComboTamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100kb", "200kb" }));
        ComboTamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTamañoActionPerformed(evt);
            }
        });

        LabelNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LabelNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("tamaño:");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel1.setText("recursos:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BOK.setText("ok");
        BOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BOKMouseClicked(evt);
            }
        });
        BOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOKActionPerformed(evt);
            }
        });

        LabelIDP.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(Pid))
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BOK, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboTamaño, 0, 104, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(LabelIDP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pid)
                            .addComponent(LabelIDP)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ComboTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BOK)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTamañoActionPerformed

    private void LabelNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LabelNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LabelNombreActionPerformed

    private void BOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BOKMouseClicked
            
    }//GEN-LAST:event_BOKMouseClicked

    private void BOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOKActionPerformed
     
    }//GEN-LAST:event_BOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vproceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vproceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vproceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vproceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Vproceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOK;
    private javax.swing.JComboBox<String> ComboTamaño;
    private javax.swing.JLabel LabelIDP;
    private javax.swing.JTextField LabelNombre;
    private javax.swing.JLabel Pid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==recurso1){
          this.arr.add(recurso1.getText());
       this.recurso1.setEnabled(false);
      }
       if(e.getSource()==recurso2){
            this.arr.add(recurso2.getText());
       this.recurso2.setEnabled(false);
      }
       if(e.getSource()==recurso3){
            this.arr.add(recurso3.getText());
       this.recurso3.setEnabled(false);
      }
       if(e.getSource()==recurso4){
            this.arr.add(recurso4.getText());
       this.recurso4.setEnabled(false);
      }
       if(e.getSource()==recurso5){
      this.arr.add(recurso5.getText());
      this.recurso5.setEnabled(false);
      }
       
       if(e.getSource()==recurso6){
            this.arr.add(recurso6.getText());
      this.recurso6.setEnabled(false);
      }
    }
}
