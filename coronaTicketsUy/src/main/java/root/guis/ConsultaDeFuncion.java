/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.guis;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import root.datatypes.DtEspectaculo;
import root.datatypes.DtFuncion;
import root.datatypes.DtPlataforma;
import root.entidades.DtArtista;
import root.fabrica.Fabrica;
import root.interfaces.IEspectaculos;

/**
 *
 * @author osiris
 */
public class ConsultaDeFuncion extends javax.swing.JFrame {
 List<String> li= new ArrayList<String>();
 List<DtEspectaculo> dtEspectaculos= new ArrayList<DtEspectaculo>();
    /**
     * Creates new form ConsultaDeCasos
     */
    public ConsultaDeFuncion() {
        initComponents();
        
        li.add("--Seleccione una--");
       
        List<DtPlataforma> dtPlataformas = Fabrica.getCtrlEspectaculos().listarPlataformas();
         for (DtPlataforma i :dtPlataformas){
             li.add(i.getNombre());
         }
        this.ComboBoxConsDPlat.setModel(new DefaultComboBoxModel(li.toArray()));
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxConsDPlat = new javax.swing.JComboBox<>();
        CombBoxConsLisEsp = new javax.swing.JComboBox<>();
        TablaConsDatosFun = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Consulta de casos");

        jLabel2.setText("Listar Plataformas");

        jLabel3.setText("Listar Espectaculos");

        jLabel4.setText("Listar Funciones");

        ComboBoxConsDPlat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxConsDPlatItemStateChanged(evt);
            }
        });

        CombBoxConsLisEsp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CombBoxConsLisEspItemStateChanged(evt);
            }
        });
        CombBoxConsLisEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombBoxConsLisEspActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setEnabled(false);
        TablaConsDatosFun.setViewportView(jTable2);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CombBoxConsLisEsp, 0, 347, Short.MAX_VALUE)
                            .addComponent(ComboBoxConsDPlat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TablaConsDatosFun, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboBoxConsDPlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CombBoxConsLisEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(TablaConsDatosFun, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxConsDPlatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxConsDPlatItemStateChanged
        // TODO add your handling code here:
        ComboBoxConsDPlat.setEnabled(true);
        CombBoxConsLisEsp.setEnabled(true);
        TablaConsDatosFun.setEnabled(true);
        
        CombBoxConsLisEsp.setEnabled(true);
        List<String> liesp= new ArrayList<String>();
        liesp.add("--Seleccione un--");
        IEspectaculos ifu = Fabrica.getCtrlEspectaculos();
        dtEspectaculos = ifu.listarEspectaculos(ComboBoxConsDPlat.getSelectedItem().toString());
         for (DtEspectaculo i :dtEspectaculos){
             liesp.add(i.getNombre());
         }
        this.CombBoxConsLisEsp.setModel(new DefaultComboBoxModel(liesp.toArray()));

    }//GEN-LAST:event_ComboBoxConsDPlatItemStateChanged

    private void CombBoxConsLisEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombBoxConsLisEspActionPerformed
      

        // TODO add your handling code here:
    }//GEN-LAST:event_CombBoxConsLisEspActionPerformed

    private void CombBoxConsLisEspItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CombBoxConsLisEspItemStateChanged

        int indexE = jTable2.getSelectedRow();
        List<DtFuncion> funciones=Fabrica.getCtrlEspectaculos().listarFunciones(CombBoxConsLisEsp.getSelectedItem().toString());
        String matrisF[][] = new String [funciones.size()][4];
      
        
        for(int i=0; i<funciones.size(); i++)
        {

            matrisF [i][0]=funciones.get(i).getNombre();
            IEspectaculos ie = Fabrica.getCtrlEspectaculos();
            List<DtArtista> invitados = ie.getInvitados(funciones.get(i).getNombre());
            String inv = "";
            for (DtArtista j :invitados){
                inv = inv + j.getNombre()+" "+j.getApellido()+", ";
            }
            matrisF[i][1] = inv;
            matrisF [i][2]=funciones.get(i).getHoraInicio().toString();
            matrisF [i][3] = funciones.get(i).getFechaDeRegistro().toString();
            
        }
        
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            matrisF,
            new String [] {
                "Nombre ", "Invitados", "Fecha y hora","Fecha de Registro"
            }
        ));
        
      
     
      

        // TODO add your handling code here:
    }//GEN-LAST:event_CombBoxConsLisEspItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Principal p = new Principal();
        p.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaDeFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaDeFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaDeFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaDeFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaDeFuncion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CombBoxConsLisEsp;
    private javax.swing.JComboBox<String> ComboBoxConsDPlat;
    private javax.swing.JScrollPane TablaConsDatosFun;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
