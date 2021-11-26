/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.guis;
//
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import root.datatypes.DtArtista;
import root.datatypes.DtEspectador;
import root.fabrica.Fabrica;
/**
 *
 * @author tecnologo
 */
public class AltaUsuario extends javax.swing.JFrame {
    
    String ruta="";
    
   
    /**
     * Creates new form AltaUsuario
     */
    public AltaUsuario() {
        initComponents();
            tfDescripcionGen.setEnabled(false);
            tfBrebeBiografia.setEnabled(false);
//        int i=1900;
//        while(i<2100)
//        {
//            cbAnio.addItem(Integer.toString(i));
//            i++;
//        }
        ruta="silueta.jpg";
        Image mImagen = new ImageIcon(ruta).getImage();
        ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_SMOOTH));
        lImagen.setIcon(mIcono);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCancelar = new javax.swing.JButton();
        btCrear = new javax.swing.JButton();
        btImagen = new javax.swing.JButton();
        lbNombre = new javax.swing.JLabel();
        lbApellido = new javax.swing.JLabel();
        lbCorreoElectronico = new javax.swing.JLabel();
        lbNickname = new javax.swing.JLabel();
        lbFechaNacimiento = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        tfNickname = new javax.swing.JTextField();
        tfCorreoElectronico = new javax.swing.JTextField();
        lbTipoUsuario = new javax.swing.JLabel();
        cbTipoUsuario = new javax.swing.JComboBox<>();
        lbFechaNacimiento1 = new javax.swing.JLabel();
        lbFechaNacimiento2 = new javax.swing.JLabel();
        lbLinkWeb = new javax.swing.JLabel();
        tfLinkWeb = new javax.swing.JTextField();
        lImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescripcionGen = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfBrebeBiografia = new javax.swing.JTextArea();
        fNacimiento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btCrear.setText("Crear");
        btCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearActionPerformed(evt);
            }
        });

        btImagen.setText("Imagen");
        btImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImagenActionPerformed(evt);
            }
        });

        lbNombre.setText("Nombre:");

        lbApellido.setText("Apellido:");

        lbCorreoElectronico.setText("Correo electrónico:");

        lbNickname.setText("Nickname:");

        lbFechaNacimiento.setText("Fecha de nacimiento:");

        lbTitulo.setText("Elija el tipo de usuario");

        tfNickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNicknameActionPerformed(evt);
            }
        });

        tfCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorreoElectronicoActionPerformed(evt);
            }
        });

        lbTipoUsuario.setText("Tipo de usuario:");

        cbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espectador", "Artista" }));
        cbTipoUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoUsuarioItemStateChanged(evt);
            }
        });
        cbTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoUsuarioActionPerformed(evt);
            }
        });

        lbFechaNacimiento1.setText("Breve biografia:");

        lbFechaNacimiento2.setText("Descripcion general:");

        lbLinkWeb.setText("Link sitio web:");

        tfLinkWeb.setEnabled(false);

        tfDescripcionGen.setColumns(20);
        tfDescripcionGen.setRows(5);
        jScrollPane1.setViewportView(tfDescripcionGen);

        tfBrebeBiografia.setColumns(20);
        tfBrebeBiografia.setRows(5);
        jScrollPane2.setViewportView(tfBrebeBiografia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCrear)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFechaNacimiento)
                            .addComponent(lbNombre)
                            .addComponent(lbTipoUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNombre)
                            .addComponent(tfApellido)
                            .addComponent(tfNickname)
                            .addComponent(tfCorreoElectronico)
                            .addComponent(cbTipoUsuario, 0, 276, Short.MAX_VALUE)
                            .addComponent(fNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFechaNacimiento2)
                            .addComponent(lbFechaNacimiento1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLinkWeb)
                        .addGap(62, 62, 62)
                        .addComponent(tfLinkWeb))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNickname)
                            .addComponent(lbApellido)
                            .addComponent(lbCorreoElectronico)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btImagen)
                                .addGap(42, 42, 42)
                                .addComponent(lImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTipoUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbNombre)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbApellido)
                            .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNickname)
                            .addComponent(tfNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCorreoElectronico)
                            .addComponent(tfCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbFechaNacimiento)
                    .addComponent(fNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFechaNacimiento2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFechaNacimiento1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbLinkWeb)
                    .addComponent(tfLinkWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btImagen)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCrear)
                    .addComponent(btCancelar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoUsuarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbTipoUsuarioActionPerformed

    private void cbTipoUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoUsuarioItemStateChanged
        // TODO add your handling code here:
        if( cbTipoUsuario.getSelectedItem().toString()=="Artista")
        {
            tfNombre.setEnabled(true);
            tfApellido.setEnabled(true);
            tfNickname.setEnabled(true);
            tfCorreoElectronico.setEnabled(true);
//            cbDia.setEnabled(true);
//            cbMes.setEnabled(true);
//            cbAnio.setEnabled(true);
            tfDescripcionGen.setEnabled(true);
            tfBrebeBiografia.setEnabled(true);
            tfLinkWeb.setEnabled(true);
            lbTitulo.setText("Ingrese los datos del artista");
            tfNombre.setText("");
            tfApellido.setText("");
            tfCorreoElectronico.setText("");
            tfNickname.setText("");
            tfLinkWeb.setText("");
            tfBrebeBiografia.setText(""); 
            tfDescripcionGen.setText("");
        }
        
        if( cbTipoUsuario.getSelectedItem().toString()=="Espectador")
        {
            tfNombre.setEnabled(true);
            tfApellido.setEnabled(true);
            tfNickname.setEnabled(true);
            tfCorreoElectronico.setEnabled(true);
//            cbDia.setEnabled(true);
//            cbMes.setEnabled(true);
//            cbAnio.setEnabled(true);
            tfDescripcionGen.setEnabled(false);
            tfBrebeBiografia.setEnabled(false);
            tfLinkWeb.setEnabled(false);
            lbTitulo.setText("Ingrese los datos del espectador");
            tfNombre.setText("");
            tfApellido.setText("");
            tfCorreoElectronico.setText("");
            tfNickname.setText("");
            tfLinkWeb.setText("");
            tfBrebeBiografia.setText(""); 
            tfDescripcionGen.setText("");
        }
    }//GEN-LAST:event_cbTipoUsuarioItemStateChanged

    private void btCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearActionPerformed
        // TODO add your handling code here:
            
        if(tfNickname.getText().isBlank()|| this.tfNickname.getText().length()<1 || this.tfNickname.getText().length()>254) {
            JOptionPane.showMessageDialog(null, "Nickname invalido","Usuarios", JOptionPane.ERROR_MESSAGE);            
        } else if(tfNombre.getText().isBlank()|| this.tfNombre.getText().length()<1 || this.tfNombre.getText().length()>254) {
            JOptionPane.showMessageDialog(null, "Nombre invalido","Usuarios", JOptionPane.ERROR_MESSAGE);            
        } else if(tfApellido.getText().isBlank()|| this.tfApellido.getText().length()<1 || this.tfApellido.getText().length()>254) {
            JOptionPane.showMessageDialog(null, "Apellido invalido","Usuarios", JOptionPane.ERROR_MESSAGE);    
        } else if(this.tfCorreoElectronico.getText().contains(".@")||this.tfCorreoElectronico.getText().contains("@.")||this.tfCorreoElectronico.getText().contains("@")==false ||this.tfCorreoElectronico.getText().contains(" ") || this.tfCorreoElectronico.getText().contains(".")==false || tfCorreoElectronico.getText().isBlank()|| this.tfCorreoElectronico.getText().length()<1 || this.tfCorreoElectronico.getText().length()>254|| this.tfCorreoElectronico.getText().length()==this.tfCorreoElectronico.getText().indexOf(".")/*|| this.tfCorreoElectronico.getText().indexOf("@")>this.tfCorreoElectronico.getText().indexOf(".")*/) {
            JOptionPane.showMessageDialog(null, "Correo electronico invalido","Usuarios", JOptionPane.ERROR_MESSAGE);
            
        } else if(Fabrica.getCrlUsuarios().existeUsuario(tfNickname.getText()))
        {
            JOptionPane.showMessageDialog(null, "Ya existe el nickname", "Usuarios", JOptionPane.WARNING_MESSAGE);
        }else if(Fabrica.getCrlUsuarios().existeCorreo(tfCorreoElectronico.getText()))
        {
            JOptionPane.showMessageDialog(null, "Ya existe el correo", "Usuarios", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            if("Espectador"==cbTipoUsuario.getSelectedItem().toString())
            {
                long miliseg = fNacimiento.getDate().getTime();
                java.sql.Date fecha = new java.sql.Date(miliseg);
//                Date fecha = new Date(Integer.parseInt(cbAnio.getSelectedItem().toString())-1900, 
//                Integer.parseInt(cbMes.getSelectedItem().toString())-1, 
//                Integer.parseInt(cbDia.getSelectedItem().toString()));
                long id = 0;
                DtEspectador es = new DtEspectador(0, id, tfNombre.getText().trim(), tfApellido.getText().trim(), tfCorreoElectronico.getText().trim(), tfNickname.getText().trim(), "http://raspberrypijulio.ddns.net/ImagenesLab/"+ruta, fecha, "pass");
                Fabrica.getCrlUsuarios().altaEspectador(es);
                JOptionPane.showMessageDialog(null, "El espectador fue creado", "Usuarios", JOptionPane.INFORMATION_MESSAGE);
                tfNombre.setText("");
                tfApellido.setText("");
                tfCorreoElectronico.setText("");
                tfNickname.setText("");
                ruta="silueta.jpg";
                Image mImagen = new ImageIcon(ruta).getImage();
                ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_SMOOTH));
                lImagen.setIcon(mIcono);
                
            }
            
            if("Artista"==cbTipoUsuario.getSelectedItem().toString())
            {
                
                if("".equals(this.tfLinkWeb.getText())|| (!"".equals(this.tfLinkWeb.getText())&&!(this.tfLinkWeb.getText().contains(" ") || this.tfLinkWeb.getText().contains(".")==false || this.tfLinkWeb.getText().length()>254))){
                    long miliseg = fNacimiento.getDate().getTime();
                    java.sql.Date fecha = new java.sql.Date(miliseg);
//                    Date fecha = new Date(Integer.parseInt(cbAnio.getSelectedItem().toString())-1900, 
//                    Integer.parseInt(cbMes.getSelectedItem().toString())-1, 
//                    Integer.parseInt(cbDia.getSelectedItem().toString()));
                    long id = 0;
                    DtArtista ar = new DtArtista(tfLinkWeb.getText().trim(), tfBrebeBiografia.getText().trim(), tfDescripcionGen.getText().trim(), id, tfNombre.getText().trim(), tfApellido.getText().trim(), tfCorreoElectronico.getText().trim(), tfNickname.getText().trim(), "http://raspberrypijulio.ddns.net/ImagenesLab/"+ruta, fecha, "pass");
                    Fabrica.getCrlUsuarios().altaArtista(ar);
                    JOptionPane.showMessageDialog(null, "El artista fue creado", "Usuarios", JOptionPane.INFORMATION_MESSAGE);
                    tfNombre.setText("");
                    tfApellido.setText("");
                    tfCorreoElectronico.setText("");
                    tfNickname.setText("");
                    tfLinkWeb.setText("");
                    tfBrebeBiografia.setText(""); 
                    tfDescripcionGen.setText("");
                    ruta="silueta.jpg";
                    Image mImagen = new ImageIcon(ruta).getImage();
                    ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_SMOOTH));
                    lImagen.setIcon(mIcono);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Lick invalida","Usuarios", JOptionPane.ERROR_MESSAGE);    
                }

                
            }
        }
    }//GEN-LAST:event_btCrearActionPerformed

    private void tfNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNicknameActionPerformed

    private void tfCorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorreoElectronicoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImagenActionPerformed
        // TODO add your handling code here:
        
        
        
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        jFileChooser.setFileFilter(filtrado);
        int respuesta = jFileChooser.showOpenDialog(this);
        if(respuesta==JFileChooser.APPROVE_OPTION)
        {
            ruta=jFileChooser.getSelectedFile().getPath();
            Path origen = jFileChooser.getSelectedFile().toPath();
            Path destino = Paths.get(this.tfNickname.getText()+".jpg");
            try {
                Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ex){
                Logger.getLogger(AltaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            ruta = destino.toString();
            subir(ruta);
            Image mImagen = new ImageIcon(destino.toString()).getImage();
            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_SMOOTH));
            lImagen.setIcon(mIcono);
        }
        
    }//GEN-LAST:event_btImagenActionPerformed

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
            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaUsuario().setVisible(true);
            }
        });
    }
        private void subir(String ruta){
     FTPClient client = new FTPClient();
            FileInputStream fis = null;

            try {
                client.connect("raspberrypijulio.ddns.net");
                client.login("pi", "kilocura2");
                client.changeWorkingDirectory("/DISCO1/ImagenesLab");

                //
                // Create an InputStream of the file to be uploaded
                //
                String filename = ruta;
                fis = new FileInputStream(filename);
//                client.setFileType(FTP.BINARY_FILE_TYPE);
                client.setFileType(FTP.BINARY_FILE_TYPE);
                        
                client.setFileTransferMode(FTP.BINARY_FILE_TYPE);

                client.enterLocalPassiveMode();
                //
                // Store file to server
                //
                client.storeFile(filename, fis);
                fis.close();
                client.logout();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                    client.disconnect();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCrear;
    private javax.swing.JButton btImagen;
    private javax.swing.JComboBox<String> cbTipoUsuario;
    private com.toedter.calendar.JDateChooser fNacimiento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lImagen;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbCorreoElectronico;
    private javax.swing.JLabel lbFechaNacimiento;
    private javax.swing.JLabel lbFechaNacimiento1;
    private javax.swing.JLabel lbFechaNacimiento2;
    private javax.swing.JLabel lbLinkWeb;
    private javax.swing.JLabel lbNickname;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbTipoUsuario;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextArea tfBrebeBiografia;
    private javax.swing.JTextField tfCorreoElectronico;
    private javax.swing.JTextArea tfDescripcionGen;
    private javax.swing.JTextField tfLinkWeb;
    private javax.swing.JTextField tfNickname;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
