/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.guis;


import java.awt.Image;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
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
public class ModificarUsuario extends javax.swing.JFrame {
    private List<DtEspectador> espectadores=new ArrayList<DtEspectador>();
    private List<DtArtista> artistas=new ArrayList<DtArtista>();
    String ruta="";
    /**
     * Creates new form ModificarUsuario
     */
    public ModificarUsuario() {
        initComponents();
        
        List<String> nicknames = new ArrayList<String>();
        ruta="silueta.jpg";
        Image mImagen = new ImageIcon(ruta).getImage();
        ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_SMOOTH));
        lImagen.setIcon(mIcono);
        tfNombre.setEnabled(true);
        tfApellido.setEnabled(true);
//        tfCorreoElectronico.setEnabled(false);
        tfDescripcion.setEnabled(false);
        tfBiografia.setEnabled(false);
        tfLinkWeb.setEnabled(false);
        espectadores=Fabrica.getCrlUsuarios().getEspectadores();
        
        for (int i=0; i<espectadores.size(); i++)
        {
            nicknames.add(espectadores.get(i).getNickname());
        }
        if(espectadores.size()==0)
        {
            cbUsuario.setEnabled(false);
                 
        }
        else
        {
            tfNombre.setText(espectadores.get(0).getNombre());
            tfNickname.setText(espectadores.get(0).getNickname());
            tfApellido.setText(espectadores.get(0).getApellido());
//            tfCorreoElectronico.setText(espectadores.get(0).getCorreo());
            this.fechaNacimiento.setDate(espectadores.get(0).getFechaNacimiento());
            this.fechaNacimiento.setVisible(true);
            this.cbUsuario.setModel(new DefaultComboBoxModel(nicknames.toArray()));
            ruta=espectadores.get(0).getImagen();
            if(espectadores.get(0).getImagen()!="")
            {
                mImagen = new ImageIcon(espectadores.get(0).getImagen()).getImage();
                mIcono = new ImageIcon(mImagen.getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_SMOOTH));
                lImagen.setIcon(mIcono);
            }
        }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfLinkWeb = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        tfNickname = new javax.swing.JTextField();
        cbTipoUsuario = new javax.swing.JComboBox<>();
        lbTipoUsuario = new javax.swing.JLabel();
        lbFechaNacimiento1 = new javax.swing.JLabel();
        lbFechaNacimiento2 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btImagen = new javax.swing.JButton();
        lbNombre = new javax.swing.JLabel();
        lbApellido = new javax.swing.JLabel();
        lbNickname = new javax.swing.JLabel();
        lbLinkWeb = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbUsuario = new javax.swing.JComboBox<>();
        tfNombre = new javax.swing.JTextField();
        lImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfBiografia = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfLinkWeb.setEnabled(false);

        tfApellido.setEnabled(false);
        tfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidoActionPerformed(evt);
            }
        });

        tfNickname.setEnabled(false);

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

        lbTipoUsuario.setText("Tipo de usuario:");

        lbFechaNacimiento1.setText("Breve biografia:");

        lbFechaNacimiento2.setText("Descripcion general:");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
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

        lbNickname.setText("Nickname:");

        lbLinkWeb.setText("Link sitio web:");

        lbTitulo.setText("Elija el tipo de usuario");

        jLabel1.setText("Usuario:");

        cbUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbUsuarioItemStateChanged(evt);
            }
        });

        tfNombre.setEnabled(false);

        tfDescripcion.setColumns(20);
        tfDescripcion.setRows(5);
        jScrollPane1.setViewportView(tfDescripcion);

        tfBiografia.setColumns(20);
        tfBiografia.setRows(5);
        jScrollPane2.setViewportView(tfBiografia);

        jLabel2.setText("Fecha de nacimiento:");

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
                        .addComponent(btModificar)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombre)
                            .addComponent(lbTipoUsuario)
                            .addComponent(lbNickname)
                            .addComponent(lbApellido)
                            .addComponent(lbFechaNacimiento2)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfApellido)
                                    .addComponent(tfNickname)
                                    .addComponent(cbTipoUsuario, 0, 248, Short.MAX_VALUE)
                                    .addComponent(cbUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLinkWeb)
                        .addGap(55, 55, 55)
                        .addComponent(tfLinkWeb))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFechaNacimiento1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btImagen)
                                .addGap(38, 38, 38)
                                .addComponent(lImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTipoUsuario))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbApellido)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNickname)
                    .addComponent(tfNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFechaNacimiento2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbFechaNacimiento1)
                        .addGap(63, 63, 63))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btImagen)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCancelar)
                            .addComponent(btModificar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLinkWeb)
                            .addComponent(tfLinkWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(lImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                        .addGap(43, 43, 43))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoUsuarioItemStateChanged
        // TODO add your handling code here:
        List<String> nicknames = new ArrayList<String>();
        if( cbTipoUsuario.getSelectedItem().toString()=="Artista")
        {
            tfNombre.setText("");
            tfApellido.setText("");
//            tfCorreoElectronico.setText("");
            tfNickname.setText("");
            tfLinkWeb.setText("");
            tfBiografia.setText(""); 
            tfDescripcion.setText("");
            tfNombre.setEnabled(true);
            tfApellido.setEnabled(true);
//            tfCorreoElectronico.setEnabled(false);
            tfDescripcion.setEnabled(true);
            tfBiografia.setEnabled(true);
            tfLinkWeb.setEnabled(true);
            lbTitulo.setText("Ingrese los datos del artista");
            
            artistas=Fabrica.getCrlUsuarios().getArtistas();
            for (int i=0; i<artistas.size(); i++)
            {
                nicknames.add(artistas.get(i).getNickname());
            }
            if(artistas.size()==0)
            {
                cbUsuario.setEnabled(false);

            }
            else
            {
                tfNombre.setText(artistas.get(0).getNombre());
                tfNickname.setText(artistas.get(0).getNickname());
                tfApellido.setText(artistas.get(0).getApellido());
//                tfCorreoElectronico.setText(artistas.get(0).getCorreo());
                tfDescripcion.setText(artistas.get(0).getDescripcion());
                tfBiografia.setText(artistas.get(0).getBiografia());
                tfLinkWeb.setText(artistas.get(0).getLinkWeb());
                this.cbUsuario.setModel(new DefaultComboBoxModel(nicknames.toArray()));
                ruta=artistas.get(0).getImagen();
                       if (artistas.get(0).getImagen() != "PATH" && artistas.get(0).getImagen() != "") {
                        lImagen.setIcon(null);
                        lImagen.setText("<html><img src = \"" + artistas.get(0).getImagen() + "\" width="+lImagen.getWidth()+" height="+lImagen.getHeight()+"></html>");
                    } else {
                        lImagen.setText(null);
                        ruta = "silueta.jpg";
                        Image mImagen = new ImageIcon(ruta).getImage();
                        ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_SMOOTH));
                        lImagen.setIcon(mIcono);

                    }
            }
        }

        if( cbTipoUsuario.getSelectedItem().toString()=="Espectador")
        {
            tfNombre.setEnabled(true);
            tfApellido.setEnabled(true);
//            tfCorreoElectronico.setEnabled(false);
            
            tfDescripcion.setEnabled(false);
            tfBiografia.setEnabled(false);
            tfLinkWeb.setEnabled(false);
            lbTitulo.setText("Ingrese los datos del espectador");
            espectadores=Fabrica.getCrlUsuarios().getEspectadores();
            for (int i=0; i<espectadores.size(); i++)
            {
                nicknames.add(espectadores.get(i).getNickname());
            }
            if(espectadores.size()==0)
            {
                cbUsuario.setEnabled(false);

            }
            else
            {
                tfNombre.setText(espectadores.get(0).getNombre());
                tfNickname.setText(espectadores.get(0).getNickname());
                tfApellido.setText(espectadores.get(0).getApellido());
//                tfCorreoElectronico.setText(espectadores.get(0).getCorreo());
                this.cbUsuario.setModel(new DefaultComboBoxModel(nicknames.toArray()));
                ruta=espectadores.get(0).getImagen();
                    if (espectadores.get(0).getImagen().equals("PATH") == false && espectadores.get(0).getImagen().equals("") == false) {
                        lImagen.setIcon(null);
                        lImagen.setText("<html><img src = \"" + espectadores.get(0).getImagen() + "\" width="+lImagen.getWidth()+" height="+lImagen.getHeight()+"></html>");
                    } else {

                        lImagen.setText(null);
                            ruta="silueta.jpg";
                            Image mImagen = new ImageIcon(ruta).getImage();
                            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_SMOOTH));
                            lImagen.setIcon(mIcono);

                        }
            }
        }

    }//GEN-LAST:event_cbTipoUsuarioItemStateChanged

    private void cbTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoUsuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbTipoUsuarioActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        // TODO add your handling code here:
        
        
       if(tfNickname.getText().isBlank()|| this.tfNickname.getText().length()<1 || this.tfNickname.getText().length()>254) {
            JOptionPane.showMessageDialog(null, "Nickname invalido","Usuarios", JOptionPane.ERROR_MESSAGE);            
        } else if(tfNombre.getText().isBlank()|| this.tfNombre.getText().length()<1 || this.tfNombre.getText().length()>254) {
            JOptionPane.showMessageDialog(null, "Nombre invalido","Usuarios", JOptionPane.ERROR_MESSAGE);            
        } else if(tfApellido.getText().isBlank()|| this.tfApellido.getText().length()<1 || this.tfApellido.getText().length()>254) {
            JOptionPane.showMessageDialog(null, "Apellido invalido","Usuarios", JOptionPane.ERROR_MESSAGE);    
        } /*else if(this.tfCorreoElectronico.getText().contains(".@")||this.tfCorreoElectronico.getText().contains("@.")||this.tfCorreoElectronico.getText().contains("@")==false ||this.tfCorreoElectronico.getText().contains(" ") || this.tfCorreoElectronico.getText().contains(".")==false || tfCorreoElectronico.getText().isBlank()|| this.tfCorreoElectronico.getText().length()<1 || this.tfCorreoElectronico.getText().length()>254|| this.tfCorreoElectronico.getText().length()==this.tfCorreoElectronico.getText().indexOf(".")|| this.tfCorreoElectronico.getText().indexOf("@")>this.tfCorreoElectronico.getText().indexOf(".")) {
            JOptionPane.showMessageDialog(null, "Correo electronico invalido","Usuarios", JOptionPane.ERROR_MESSAGE);                    
        }*/ else if("Espectador"==cbTipoUsuario.getSelectedItem().toString())
        {
            for (int i=0; i<espectadores.size(); i++)
            {
                if(cbUsuario.getSelectedItem().toString()==espectadores.get(i).getNickname())
                {
                    long miliseg = fechaNacimiento.getDate().getTime();
                    java.sql.Date fecha = new java.sql.Date(miliseg);
                    DtEspectador es = new DtEspectador(espectadores.get(i).getCanjeables(), espectadores.get(i).getId(), tfNombre.getText(), tfApellido.getText(), espectadores.get(i).getCorreo(), tfNickname.getText(), "http://raspberrypijulio.ddns.net/ImagenesLab/"+espectadores.get(i).getNickname()+".jpg", fecha, "pass");
                    Fabrica.getCrlUsuarios().modificarEspectador(es);
                    JOptionPane.showMessageDialog(null, "El espectador fue modificado", "Usuarios", JOptionPane.INFORMATION_MESSAGE);
                    ModificarUsuario ventana = new ModificarUsuario();
                    ventana.setVisible(true);
                    this.dispose();
                }
            }
        }else if ("Artista"==cbTipoUsuario.getSelectedItem().toString()){
            for (int i=0; i<artistas.size(); i++)
            {
                if(cbUsuario.getSelectedItem().toString()==artistas.get(i).getNickname())
                {
                    if("".equals(this.tfLinkWeb.getText())|| (!"".equals(this.tfLinkWeb.getText())&&!(this.tfLinkWeb.getText().contains(" ") || this.tfLinkWeb.getText().contains(".")==false || this.tfLinkWeb.getText().length()>254))){
                        long miliseg = fechaNacimiento.getDate().getTime();
                        java.sql.Date fecha = new java.sql.Date(miliseg);
                        DtArtista ar = new DtArtista(tfLinkWeb.getText(), tfBiografia.getText(), tfDescripcion.getText(), artistas.get(i).getId(), tfNombre.getText(), tfApellido.getText(), artistas.get(i).getCorreo(), tfNickname.getText(), "http://raspberrypijulio.ddns.net/Imagenes/"+artistas.get(i).getNickname()+".jpg", fecha, "pass");
                        Fabrica.getCrlUsuarios().modificarArtista(ar);
                        JOptionPane.showMessageDialog(null, "El artista fue modificado", "Usuarios", JOptionPane.INFORMATION_MESSAGE);
                        ModificarUsuario ventana = new ModificarUsuario();
                        ventana.setVisible(true);
                        this.dispose();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Link invalida","Usuarios", JOptionPane.ERROR_MESSAGE);    
                    }
                }
            }
        } 
        
        
    }//GEN-LAST:event_btModificarActionPerformed

    private void cbUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbUsuarioItemStateChanged
        // TODO add your handling code here:
        
        if( cbTipoUsuario.getSelectedItem().toString()=="Artista")
        {
            for (int i=0; i<artistas.size(); i++)
            {
                if(cbUsuario.getSelectedItem().toString()==artistas.get(i).getNickname())
                {
                    tfNombre.setText(artistas.get(i).getNombre());
                    tfApellido.setText(artistas.get(i).getApellido());
                    this.fechaNacimiento.setDate(artistas.get(i).getFechaNacimiento());
                    this.fechaNacimiento.setVisible(true);
                    tfNickname.setText(artistas.get(i).getNickname());
//                    tfCorreoElectronico.setText(artistas.get(i).getCorreo());
                    if(!artistas.get(i).getDescripcion().isEmpty())
                    {
                        tfDescripcion.setText(artistas.get(i).getDescripcion());
                    }
                    if(!artistas.get(i).getBiografia().isEmpty())
                    {
                        tfBiografia.setText(artistas.get(i).getBiografia());
                    }
                    if(!artistas.get(i).getLinkWeb().isEmpty())
                    {
                        tfLinkWeb.setText(artistas.get(i).getLinkWeb());
                    }
                    ruta=artistas.get(i).getImagen();
                       if (artistas.get(i).getImagen() != "PATH" && artistas.get(i).getImagen() != "") {
                        lImagen.setIcon(null);
                        lImagen.setText("<html><img src = \"" + artistas.get(i).getImagen() + "\" width="+lImagen.getWidth()+" height="+lImagen.getHeight()+"></html>");
                    } else {
                        lImagen.setText(null);
                        ruta = "silueta.jpg";
                        Image mImagen = new ImageIcon(ruta).getImage();
                        ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_SMOOTH));
                        lImagen.setIcon(mIcono);

                    }

                }
            }
        }

        if (cbTipoUsuario.getSelectedItem().toString() == "Espectador") {
            for (int i = 0; i < espectadores.size(); i++) {
                if (cbUsuario.getSelectedItem().toString() == espectadores.get(i).getNickname()) {
                    this.fechaNacimiento.setDate(espectadores.get(i).getFechaNacimiento());
                    this.fechaNacimiento.setVisible(true);
                    tfNombre.setText(espectadores.get(i).getNombre());
                    tfNickname.setText(espectadores.get(i).getNickname());
                    tfApellido.setText(espectadores.get(i).getApellido());
//                    tfCorreoElectronico.setText(espectadores.get(i).getCorreo());
                    ruta = espectadores.get(i).getImagen();
                    if (espectadores.get(i).getImagen().equals("PATH") == false && espectadores.get(i).getImagen().equals("") == false) {
                        lImagen.setIcon(null);
                        lImagen.setText("<html><img src = \"" + espectadores.get(i).getImagen() + "\" width="+lImagen.getWidth()+" height="+lImagen.getHeight()+"></html>");
                    } else {

                        lImagen.setText(null);
                            ruta="silueta.jpg";
                            Image mImagen = new ImageIcon(ruta).getImage();
                            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_SMOOTH));
                            lImagen.setIcon(mIcono);

                        }
                           
                }
            }
        }


       
    }//GEN-LAST:event_cbUsuarioItemStateChanged

    private void tfApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidoActionPerformed

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
//            ruta=jFileChooser.getSelectedFile().getPath();
//            Image mImagen = new ImageIcon(ruta).getImage();
//            ImageIcon mIcono = new ImageIcon(mImagen.getScaledInstance(lImagen.getWidth(), lImagen.getHeight(), Image.SCALE_SMOOTH));
//            lImagen.setIcon(mIcono);
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
            lImagen.setText(null);
            lImagen.setIcon(mIcono);
        }
    }                                        

        private void subir(String ruta) {
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
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btImagen;
    private javax.swing.JButton btModificar;
    private javax.swing.JComboBox<String> cbTipoUsuario;
    private javax.swing.JComboBox<String> cbUsuario;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lImagen;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbFechaNacimiento1;
    private javax.swing.JLabel lbFechaNacimiento2;
    private javax.swing.JLabel lbLinkWeb;
    private javax.swing.JLabel lbNickname;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbTipoUsuario;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextArea tfBiografia;
    private javax.swing.JTextArea tfDescripcion;
    private javax.swing.JTextField tfLinkWeb;
    private javax.swing.JTextField tfNickname;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
