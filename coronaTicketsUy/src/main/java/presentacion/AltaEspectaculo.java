/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author elinzar
 */
public class AltaEspectaculo extends javax.swing.JFrame {

    /**
     * Creates new form AltaEspectaculo
     */
    public AltaEspectaculo() {
        initComponents();
        int i=1900;
        while(i<2101)
        {
            cbAnio.addItem(Integer.toString(i));
            i++;
        }
        
        //listaPlataformas
        List<String> lPlataformas = new ArrayList<>();
        lPlataformas.add("--Seleccione Plataforma--");
        //Fabrica.getCtrlEspectaculos();
        List<DtPlataforma> dtPlataforma;
        dtPlataforma = Fabrica.getCtrlEspectaculos().listarPlataformas();
        dtPlataforma.forEach(iterator -> {
            lPlataformas.add(iterator.getNombre());
        });
        this.cbListaPlataformas.setModel(new DefaultComboBoxModel(lPlataformas.toArray()));
        
        
        //listaArtista
        List<String> lArtistas = new ArrayList<>();
        lArtistas.add("--Seleccione Artista--");
        List<DtArtista> dtArtista = Fabrica.getCrlUsuarios().getArtistas();
        dtArtista.forEach(iterator -> {
            lArtistas.add(iterator.getNickname());
        });
        this.cbListaArtistas.setModel(new DefaultComboBoxModel(lArtistas.toArray()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        lbTitulo = new javax.swing.JLabel();
        cbListaArtistas = new javax.swing.JComboBox<>();
        lbListarArtista = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbDuracion = new javax.swing.JLabel();
        lbEspectadoresMIN = new javax.swing.JLabel();
        lbEspectadoresMax = new javax.swing.JLabel();
        lbURL = new javax.swing.JLabel();
        lbCosto = new javax.swing.JLabel();
        lbFechaAlta = new javax.swing.JLabel();
        cbMes = new javax.swing.JComboBox<>();
        cbAnio = new javax.swing.JComboBox<>();
        cbDia = new javax.swing.JComboBox<>();
        tbNombre = new javax.swing.JTextField();
        tbDuracion = new javax.swing.JTextField();
        tbEspectadoresMin = new javax.swing.JTextField();
        tbEspectadoresMax = new javax.swing.JTextField();
        tbUrl = new javax.swing.JTextField();
        tbCosto = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btAceptar = new javax.swing.JButton();
        cbListaPlataformas = new javax.swing.JComboBox<>();
        lbListarPlataforma = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        tbDescripcion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setText("Alta Espectaculo");

        lbListarArtista.setText("Listar Artista");

        lbNombre.setText("Nombre");

        lbDuracion.setText("Duracion");

        lbEspectadoresMIN.setText("Espectadores Min");

        lbEspectadoresMax.setText("Espectadores Max");

        lbURL.setText("URL");

        lbCosto.setText("Costo");

        lbFechaAlta.setText("Fecha de Alta");

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMesActionPerformed(evt);
            }
        });

        cbAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnioActionPerformed(evt);
            }
        });

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiaActionPerformed(evt);
            }
        });

        tbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbNombreActionPerformed(evt);
            }
        });

        tbEspectadoresMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEspectadoresMinActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btAceptar.setText("Aceptar");
        btAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarActionPerformed(evt);
            }
        });

        lbListarPlataforma.setText("Listar Plataforma");

        lbDescripcion.setText("Descripcion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAceptar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbListarArtista)
                            .addComponent(lbListarPlataforma)
                            .addComponent(lbFechaAlta)
                            .addComponent(lbDuracion)
                            .addComponent(lbNombre)
                            .addComponent(lbEspectadoresMIN)
                            .addComponent(lbEspectadoresMax)
                            .addComponent(lbURL)
                            .addComponent(lbCosto))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(lbTitulo)
                                .addGap(149, 149, 149))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tbDuracion, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tbNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tbCosto, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tbUrl, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tbEspectadoresMax, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tbEspectadoresMin, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(124, 124, 124))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbListaArtistas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbListaPlataformas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDescripcion)
                        .addGap(64, 64, 64)
                        .addComponent(tbDescripcion)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbListaPlataformas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbListarPlataforma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbListaArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbListarArtista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFechaAlta)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescripcion)
                    .addComponent(tbDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDuracion)
                    .addComponent(tbDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEspectadoresMIN)
                    .addComponent(tbEspectadoresMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEspectadoresMax)
                    .addComponent(tbEspectadoresMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbURL)
                    .addComponent(tbUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCosto)
                    .addComponent(tbCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMesActionPerformed

    private void cbAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnioActionPerformed
        // TODO add your handling code here:
        cbMes.setEnabled(true);
        cbDia.setEnabled(true);
        if(Integer.parseInt(cbAnio.getSelectedItem().toString())%4 ==0&&Integer.parseInt(cbMes.getSelectedItem().toString()) ==2 )
        {
            List<String> dias = new ArrayList<>();
            int i=1;
            while(i<30)
            {
                dias.add(Integer.toString(i));
                
                i++;
            }
            cbDia.setModel(new DefaultComboBoxModel(dias.toArray()));
        }
        else if(Integer.parseInt(cbMes.getSelectedItem().toString()) ==2 )
        {
            List<String> dias = new ArrayList<String>();
            int i=1;
            while(i<29)
            {
                dias.add(Integer.toString(i));
                
                i++;
            }
            cbDia.setModel(new DefaultComboBoxModel(dias.toArray()));
        }
        else if(Integer.parseInt(cbMes.getSelectedItem().toString())%2 ==0 )
        {
            List<String> dias = new ArrayList<String>();
            int i=1;
            while(i<31)
            {
                dias.add(Integer.toString(i));
                
                i++;
            }
            cbDia.setModel(new DefaultComboBoxModel(dias.toArray()));
        }
        else 
        {
            List<String> dias = new ArrayList<String>();
            int i=1;
            while(i<32)
            {
                dias.add(Integer.toString(i));
                
                i++;
            }
            cbDia.setModel(new DefaultComboBoxModel(dias.toArray()));
        }
    }//GEN-LAST:event_cbAnioActionPerformed

    private void cbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDiaActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
        // TODO add your handling code here:
        if(Fabrica.getCtrlEspectaculos().existeEspectaculo(tbNombre.getText()))
        {
            JOptionPane.showMessageDialog(null, "Ya existe", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else if(tbNombre.getText().isBlank()|| this.tbNombre.getText().length()<1 || this.tbNombre.getText().length()>254) {
            JOptionPane.showMessageDialog(null, "Nombre invalido","Espectaculos", JOptionPane.ERROR_MESSAGE);            
        }
        else if(tbDescripcion.getText().isBlank()|| this.tbDescripcion.getText().length()<1 || this.tbDescripcion.getText().length()>254) {
            JOptionPane.showMessageDialog(null, "Descripcion","Espectaculos", JOptionPane.ERROR_MESSAGE);            
        }
        else if(this.tbUrl.getText().contains(" ") || this.tbUrl.getText().contains(".")==false || tbUrl.getText().isBlank()|| this.tbUrl.getText().length()<1 || this.tbUrl.getText().length()>254) {
            JOptionPane.showMessageDialog(null, "Url invalido","Espectaculos", JOptionPane.ERROR_MESSAGE);                    
        }
        else 
        {
            Date fecha = new Date(Integer.parseInt(cbAnio.getSelectedItem().toString())-1900, Integer.parseInt(cbMes.getSelectedItem().toString())-1, Integer.parseInt(cbDia.getSelectedItem().toString()));
            
            long id = 0;
            
            int duracion = 0;
            int espectadoresMin = 0;
            int espectadoresMax = 0;
            float costo = 0;
            
            boolean chequeo = true;
            
            try{
                duracion = Integer.valueOf(tbDuracion.getText());
                espectadoresMin = Integer.valueOf(tbEspectadoresMin.getText());
                espectadoresMax = Integer.valueOf(tbEspectadoresMax.getText());
                costo = Float.parseFloat(tbCosto.getText());
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, "Ingrese Numero", "Error", JOptionPane.WARNING_MESSAGE);
                chequeo = false;
            }
            
            
            //Falta Fecha del Espectaculo
            if(chequeo == true){
                DtEspectaculo dtEspectaculo = new DtEspectaculo(id,tbNombre.getText(), tbDescripcion.getText(),duracion,espectadoresMin,espectadoresMax,tbUrl.getText(),costo,fecha);
                Fabrica.getCtrlEspectaculos().altaEspectaculo(cbListaPlataformas.getSelectedItem().toString(), cbListaArtistas.getSelectedItem().toString(), dtEspectaculo);
            }
            chequeo = true;
        }
                    
    }//GEN-LAST:event_btAceptarActionPerformed

    private void tbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbNombreActionPerformed

    private void tbEspectadoresMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEspectadoresMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbEspectadoresMinActionPerformed

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
            java.util.logging.Logger.getLogger(AltaEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaEspectaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaEspectaculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JComboBox<String> cbAnio;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbListaArtistas;
    private javax.swing.JComboBox<String> cbListaPlataformas;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lbCosto;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbDuracion;
    private javax.swing.JLabel lbEspectadoresMIN;
    private javax.swing.JLabel lbEspectadoresMax;
    private javax.swing.JLabel lbFechaAlta;
    private javax.swing.JLabel lbListarArtista;
    private javax.swing.JLabel lbListarPlataforma;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbURL;
    private javax.swing.JTextField tbCosto;
    private javax.swing.JTextField tbDescripcion;
    private javax.swing.JTextField tbDuracion;
    private javax.swing.JTextField tbEspectadoresMax;
    private javax.swing.JTextField tbEspectadoresMin;
    private javax.swing.JTextField tbNombre;
    private javax.swing.JTextField tbUrl;
    // End of variables declaration//GEN-END:variables
}
