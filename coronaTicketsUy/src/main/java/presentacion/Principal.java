/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;


/**
 *
 * @author dexion
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        registroUsuarioFuncion = new javax.swing.JMenuItem();
        iAltaUsuario = new javax.swing.JMenuItem();
        iModificarUsuario = new javax.swing.JMenuItem();
        iListarArtistas = new javax.swing.JMenuItem();
        iListarEspectadores = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        plataformas = new javax.swing.JMenu();
        altaPlataformas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cargar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Usuarios");

        registroUsuarioFuncion.setText("Registrar usuario a función");
        registroUsuarioFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroUsuarioFuncionActionPerformed(evt);
            }
        });
        jMenu1.add(registroUsuarioFuncion);

        iAltaUsuario.setText("Alta Usuario");
        iAltaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iAltaUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(iAltaUsuario);

        iModificarUsuario.setText("Modificar Usuario");
        iModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iModificarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(iModificarUsuario);

        iListarArtistas.setText("Listar Artistas");
        iListarArtistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iListarArtistasActionPerformed(evt);
            }
        });
        jMenu1.add(iListarArtistas);

        iListarEspectadores.setText("Listar Espectadores");
        iListarEspectadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iListarEspectadoresActionPerformed(evt);
            }
        });
        jMenu1.add(iListarEspectadores);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Espectáculos");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Paquetes");

        jMenuItem1.setText("Alta de paquete");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Consulta de paquete");
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Añadir espectáculo");
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        plataformas.setText("Plataformas");

        altaPlataformas.setText("Alta de Plataforma");
        altaPlataformas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaPlataformasActionPerformed(evt);
            }
        });
        plataformas.add(altaPlataformas);

        jMenuBar1.add(plataformas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaPlataformasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaPlataformasActionPerformed
        // TODO add your handling code here:
        AltaPlataforma altPlat = new AltaPlataforma();
        altPlat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_altaPlataformasActionPerformed

    private void registroUsuarioFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroUsuarioFuncionActionPerformed
        // TODO add your handling code here:
        RegistroEspectadorFuncion rEspFunc = new RegistroEspectadorFuncion();
        rEspFunc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registroUsuarioFuncionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        iDatosDePrueba d = Fabrica.getDatosDePrueba();
        d.cargarDatos();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void iAltaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iAltaUsuarioActionPerformed
        // TODO add your handling code here:
        AltaUsuario au = new AltaUsuario();
        au.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iAltaUsuarioActionPerformed

    private void iModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iModificarUsuarioActionPerformed
        // TODO add your handling code here:
        ModificarUsuario mu = new ModificarUsuario();
        mu.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_iModificarUsuarioActionPerformed

    private void iListarArtistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iListarArtistasActionPerformed
        // TODO add your handling code here:
        ListarArtistas la = new ListarArtistas();
        la.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iListarArtistasActionPerformed

    private void iListarEspectadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iListarEspectadoresActionPerformed
        // TODO add your handling code here:
        ListarEspectadores le = new ListarEspectadores();
        le.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iListarEspectadoresActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem altaPlataformas;
    private javax.swing.JMenuItem iAltaUsuario;
    private javax.swing.JMenuItem iListarArtistas;
    private javax.swing.JMenuItem iListarEspectadores;
    private javax.swing.JMenuItem iModificarUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu plataformas;
    private javax.swing.JMenuItem registroUsuarioFuncion;
    // End of variables declaration//GEN-END:variables
}
