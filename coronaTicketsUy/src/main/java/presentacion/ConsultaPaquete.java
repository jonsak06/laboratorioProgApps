/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dexion
 */
public class ConsultaPaquete extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaPaquete
     */
    public ConsultaPaquete() {
        initComponents();
        comboPaquetes.setModel(new DefaultComboBoxModel(ctPaq.listarPaquetes().toArray()));
    }
    
    private iPaquetes ctPaq = Fabrica.getCtrlPaquetes();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboPaquetes = new javax.swing.JComboBox<>();
        buttonConsultarPaquete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboEspectaculos = new javax.swing.JComboBox<>();
        buttonConsultarEspectaculo = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePaquete = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableEspectaculo = new javax.swing.JTable();

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
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Consulta de paquetes de espectáculos");

        jLabel2.setText("Seleccione el paquete:");

        comboPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPaquetesActionPerformed(evt);
            }
        });

        buttonConsultarPaquete.setText("Consultar");
        buttonConsultarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarPaqueteActionPerformed(evt);
            }
        });

        jLabel3.setText("Información del paquete:");

        jLabel4.setText("Espectáculos del paquete:");

        comboEspectaculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEspectaculosActionPerformed(evt);
            }
        });

        buttonConsultarEspectaculo.setText("Consultar espectáculo");
        buttonConsultarEspectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarEspectaculoActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        tablePaquete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripcion", "Fecha inicio", "Fecha fin", "Descuento", "Fecha alta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablePaquete);

        tableEspectaculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción", "Duración", "Max. espectadores", "Min. espectadores", "URL", "Costo", "Fecha alta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableEspectaculo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                                .addComponent(buttonConsultarPaquete))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(14, 14, 14)
                                .addComponent(comboEspectaculos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonConsultarEspectaculo)
                                    .addComponent(buttonCancelar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(comboPaquetes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonConsultarPaquete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEspectaculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(buttonConsultarEspectaculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(buttonCancelar)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void comboPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPaquetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPaquetesActionPerformed

    private void buttonConsultarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarPaqueteActionPerformed
        // TODO add your handling code here:
        String nombrePaquete = comboPaquetes.getSelectedItem().toString();
        List<String> espectaculos = ctPaq.listarEspectaculosIncluidos(nombrePaquete);
        DtPaqueteDeEspectaculos dvPaq = ctPaq.mostrarInfoPaquete(nombrePaquete);
        
        String nombre = dvPaq.getNombre();
        String descripcion = dvPaq.getDescripcion();
        String fechaInicio = dvPaq.getFechaInicio().toString();
        String fechaFin = dvPaq.getFechaFin().toString();
        String descuento = Float.toString(dvPaq.getDescuento());
        String fechaAlta = dvPaq.getFechaAlta().toString();
        
        Object[] row = {nombre, descripcion, fechaInicio, fechaFin, descuento, fechaAlta};
        DefaultTableModel model = (DefaultTableModel) tablePaquete.getModel();
        model.addRow(row);
        comboEspectaculos.setModel(new DefaultComboBoxModel(espectaculos.toArray()));
    }//GEN-LAST:event_buttonConsultarPaqueteActionPerformed

    private void buttonConsultarEspectaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarEspectaculoActionPerformed
        // TODO add your handling code here:
        String nombreEspectaculo = comboEspectaculos.getSelectedItem().toString();
        DtEspectaculo dvEsp = ctPaq.mostarInfoEspectaculo(nombreEspectaculo);
        
        String nombre = dvEsp.getNombre();
        String descripcion = dvEsp.getDescripcion();
        String duracion = Integer.toString(dvEsp.getDuracion());
        String maxEsp = Integer.toString(dvEsp.getCantidadMaximaEspectadores());
        String minEsp = Integer.toString(dvEsp.getCantidadMinimaEspectadores());
        String url = dvEsp.getUrl();
        String costo = Float.toString(dvEsp.getCosto());
        String fechaAlta = dvEsp.getFechaDeRegistro().toString();
        
        Object[] row = {nombre, descripcion, duracion, maxEsp, minEsp, url, costo, fechaAlta};
        DefaultTableModel model = (DefaultTableModel) tableEspectaculo.getModel();
        model.addRow(row);
    }//GEN-LAST:event_buttonConsultarEspectaculoActionPerformed

    private void comboEspectaculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEspectaculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEspectaculosActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaPaquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonConsultarEspectaculo;
    private javax.swing.JButton buttonConsultarPaquete;
    private javax.swing.JComboBox<String> comboEspectaculos;
    private javax.swing.JComboBox<String> comboPaquetes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tableEspectaculo;
    private javax.swing.JTable tablePaquete;
    // End of variables declaration//GEN-END:variables
}
