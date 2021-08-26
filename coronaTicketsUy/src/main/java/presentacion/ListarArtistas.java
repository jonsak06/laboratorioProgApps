/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tecnologo
 */
public class ListarArtistas extends javax.swing.JFrame {
    private List<DtArtista> artistas=new ArrayList<DtArtista>();
    private List<DtEspectaculo> espectaculos=new ArrayList<DtEspectaculo>();
    /** Creates new form ListarArtistas */
    public ListarArtistas() {
        initComponents();
        artistas=Fabrica.getCrlUsuarios().getArtistas();
        String matris[][] = new String [artistas.size()][8];
        for(int i=0; i<artistas.size(); i++)
        {
            matris [i][0]=artistas.get(i).getNombre();
            matris [i][1]=artistas.get(i).getApellido();
            matris [i][2]=artistas.get(i).getNickname();
            matris [i][3]=artistas.get(i).getCorreo();
            matris [i][4]=artistas.get(i).getFechaNacimiento().toString();
            matris [i][5]=artistas.get(i).getDescripcion();
            matris [i][6]=artistas.get(i).getLinkWeb();
            matris [i][7]=artistas.get(i).getBiografia();
        }
        tArtistas.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Nombre", "Apellido", "Nickname", "Correo Electonico", "Fecha de Nacimiento", "Descripcion", "Link Web", "Biografia"
            }
        ));
    
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tArtistas = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tFunciones = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tEspectaculos = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tPaquetes = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tPlataformas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tArtistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Nickname", "Correo Electonico", "Fecha de Nacimiento", "Descripcion", "Link Web", "Biografia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tArtistas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tArtistasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tArtistas);

        tFunciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre ", "Fecha y hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tFunciones);

        tEspectaculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Esp Max", "Esp Min", "Costo", "URL", "Fecha de Registro"
            }
        ));
        jScrollPane5.setViewportView(tEspectaculos);

        tPaquetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Inicio", "Fin", "Descuento"
            }
        ));
        jScrollPane8.setViewportView(tPaquetes);

        tPlataformas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "URL"
            }
        ));
        jScrollPane9.setViewportView(tPlataformas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
                        .addComponent(jScrollPane5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tArtistasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tArtistasMouseClicked
        // TODO add your handling code here:

        int index = tArtistas.getSelectedRow();
        espectaculos=Fabrica.getCrlUsuarios().listarEspectaculosDeArtista(artistas.get(index).getNickname());
        String matris[][] = new String [espectaculos.size()][7];
        
        for(int i=0; i<espectaculos.size(); i++)
        {

            matris [i][0]=espectaculos.get(i).getNombre();
            matris [i][1]=espectaculos.get(i).getDescripcion();
            matris [i][2]=Integer.toString(espectaculos.get(i).getCantidadMaximaEspectadores());
            matris [i][3]=Integer.toString(espectaculos.get(i).getCantidadMinimaEspectadores());
            matris [i][4]=Float.toString(espectaculos.get(i).getCosto());
            matris [i][5]=espectaculos.get(i).getUrl();
            matris [i][5]=espectaculos.get(i).getFechaDeRegistro().toString();

        }
        tEspectaculos.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Nombre", "Descripcion", "Esp Max", "Esp Min", "Costo", "URL", "Fecha de Registro"
            }
        ));
    }//GEN-LAST:event_tArtistasMouseClicked

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
            java.util.logging.Logger.getLogger(ListarArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarArtistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable tArtistas;
    private javax.swing.JTable tEspectaculos;
    private javax.swing.JTable tFunciones;
    private javax.swing.JTable tPaquetes;
    private javax.swing.JTable tPlataformas;
    // End of variables declaration//GEN-END:variables

}