/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.guis;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import root.datatypes.DtArtista;
import root.datatypes.DtEspectaculo;
import root.datatypes.DtEspectador;
import root.datatypes.DtFuncion;
import root.datatypes.DtPlataforma;
import root.datatypes.DtRegistro;
import root.fabrica.Fabrica;
import root.interfaces.IEspectaculos;
import serviciosWeb.ManejadorUsuarios;
import root.entidades.Registro;
import root.interfaces.iUsuarios;

/**
 *
 * @author jsmat
 */
public class RegistroEspectadorFuncion extends javax.swing.JFrame {

    /**
     * Creates new form RegistroEspectadorFuncion
     */
    private IEspectaculos ie;
    private java.sql.Date fFuncion;
    public RegistroEspectadorFuncion() {
        initComponents();
        iUsuarios iu = Fabrica.getCrlUsuarios();
        iu.actualizarRegistros();
        List<String> l = new ArrayList<String>();
        l.add("--Seleccione una--");
        List<String> listaEspectaculos = new ArrayList<String>();
        listaEspectaculos.add("--Seleccione uno--");
        this.listadoDeEspectaculos.setModel(new DefaultComboBoxModel(listaEspectaculos.toArray()));
        List<String> listaFUnciones = new ArrayList<String>();
        listaFUnciones.add("--Seleccione una--");
        this.listadoFunciones.setModel(new DefaultComboBoxModel(listaFUnciones.toArray()));
        List<String> listaEspectadores = new ArrayList<String>();
        listaEspectadores.add("--Seleccione uno--");
        this.listadoDeEspectadores.setModel(new DefaultComboBoxModel(listaEspectadores.toArray()));
        canjeImposible.setVisible(false);
        DefaultListModel<String> modelo = new DefaultListModel<String>();
        this.seleccionarCanjeables.setModel(modelo);
        this.canjearOK.setSelected(false);
        this.cantCanjeables.setVisible(false);
        this.fechaFuncion.setVisible(false);
        this.artistasInvitados.setVisible(false);
        this.datosEsp.setVisible(false);
        IEspectaculos ie = Fabrica.getCtrlEspectaculos();
        List<DtPlataforma> dtP = ie.listarPlataformas();
        for (DtPlataforma i :dtP){
            l.add(i.getNombre());
        }
        this.listadoDePlataformas.setModel(new DefaultComboBoxModel(l.toArray()));
        this.ie = ie;
        this.canjeImposible.setVisible(false);
        this.botonRegistrar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioNoExiste = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listadoDePlataformas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        listadoDeEspectaculos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        listadoFunciones = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cantCanjeables = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        seleccionarCanjeables = new javax.swing.JList<>();
        canjearOK = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        listadoDeEspectadores = new javax.swing.JComboBox<>();
        canjeImposible = new javax.swing.JLabel();
        fechaFuncion = new javax.swing.JLabel();
        datosEsp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        artistasInvitados = new javax.swing.JLabel();
        selectorFecha = new com.toedter.calendar.JDateChooser();

        jLabel6.setText("Usuario no registrado!");

        javax.swing.GroupLayout usuarioNoExisteLayout = new javax.swing.GroupLayout(usuarioNoExiste.getContentPane());
        usuarioNoExiste.getContentPane().setLayout(usuarioNoExisteLayout);
        usuarioNoExisteLayout.setHorizontalGroup(
            usuarioNoExisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarioNoExisteLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        usuarioNoExisteLayout.setVerticalGroup(
            usuarioNoExisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarioNoExisteLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel6)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jButton1.setText("jButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Registrar un Espectador a una Funci??n de un Espect??culo");

        jLabel2.setText("Seleccione una Plataforma");

        listadoDePlataformas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listadoDePlataformas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listadoDePlataformasItemStateChanged(evt);
            }
        });
        listadoDePlataformas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoDePlataformasActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione un Espect??culo");

        listadoDeEspectaculos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listadoDeEspectaculosItemStateChanged(evt);
            }
        });

        jLabel4.setText("Seleccione una Funci??n");

        listadoFunciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listadoFuncionesItemStateChanged(evt);
            }
        });
        listadoFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoFuncionesActionPerformed(evt);
            }
        });

        jLabel7.setText("Este usuario tiene        ");

        jLabel9.setText("registros canjeables");

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(seleccionarCanjeables);

        canjearOK.setText("Canjear Registros");

        jLabel8.setText("Seleccione un Espectador");

        listadoDeEspectadores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listadoDeEspectadoresItemStateChanged(evt);
            }
        });

        canjeImposible.setForeground(new java.awt.Color(255, 0, 0));
        canjeImposible.setText("Imposible realizar canje!");

        jLabel5.setText("Presione control + click para seleccionar");

        jLabel10.setText("Ingrese la fecha de registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(listadoDePlataformas, 0, 295, Short.MAX_VALUE)
                                .addComponent(listadoDeEspectaculos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(listadoFunciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonCancelar))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cantCanjeables, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(canjeImposible)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(65, 65, 65)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(artistasInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listadoDeEspectadores, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datosEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(canjearOK, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(canjearOK))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(listadoDePlataformas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(listadoDeEspectaculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(listadoFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(artistasInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(listadoDeEspectadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(datosEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(cantCanjeables, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(canjeImposible))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addComponent(selectorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonRegistrar)
                            .addComponent(botonCancelar))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listadoDePlataformasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoDePlataformasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_listadoDePlataformasActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
//        int dia = Integer.parseInt(this.dia.getSelectedItem().toString());
//        int mes = Integer.parseInt(this.mes.getSelectedItem().toString());
//        int anio = Integer.parseInt(this.anio.getSelectedItem().toString());
        int dia = selectorFecha.getCalendar().get(Calendar.DATE)+1;
        int mes = selectorFecha.getCalendar().get(Calendar.MONTH)+1;
        int anio = selectorFecha.getCalendar().get(Calendar.YEAR);
        if((listadoDePlataformas.getSelectedItem()!=null && listadoDeEspectaculos.getSelectedItem()!=null && listadoFunciones.getSelectedItem()!=null && listadoDeEspectadores.getSelectedItem()!=null )&&(listadoDePlataformas.getSelectedItem().toString()!="--Seleccione una--" && listadoDeEspectaculos.getSelectedItem().toString()!="--Seleccione uno--" && listadoFunciones.getSelectedItem().toString()!="--Seleccione una--" && listadoDeEspectadores.getSelectedItem().toString()!="--Seleccione uno--")){
        float descuento = ie.getDescuento(this.listadoDeEspectadores.getSelectedItem().toString(), this.listadoFunciones.getSelectedItem().toString());
        float costo = ie.getCosto(this.listadoFunciones.getSelectedItem().toString());
        if(descuento!=0){costo = descuento*costo*(float)0.01;}
        List<String> listaSeleccionada = this.seleccionarCanjeables.getSelectedValuesList();
        java.sql.Date fecha = new java.sql.Date(anio-1899,mes-12,dia-31);
        if(((mes==4 || mes==6 || mes==9 || mes==11)&&dia==31) || (mes==2 && (dia==30 || dia==31)) || ((mes==2)&&dia==29)&&(anio%4!=0) || fecha.compareTo(fFuncion)>0){
            JOptionPane.showMessageDialog(null, "Fecha invalida", "Error", JOptionPane.WARNING_MESSAGE);
        }else if (canjearOK.isSelected()==true && listaSeleccionada.size()<3){
            JOptionPane.showMessageDialog(null, "No has seleccionado suficientes canjeables", "Error", JOptionPane.WARNING_MESSAGE);
        }else if(canjearOK.isSelected()==true && listaSeleccionada.size()>3){
            JOptionPane.showMessageDialog(null, "Debes seleccionar 3 canjeables para canjear un registro", "Error", JOptionPane.WARNING_MESSAGE);
        }else if(canjearOK.isSelected()==true){
            costo = 0;
            iUsuarios iu = Fabrica.getCrlUsuarios();
            iu.canjearRegistros(listaSeleccionada, this.listadoDeEspectadores.getSelectedItem().toString(), costo, this.listadoFunciones.getSelectedItem().toString(),dia,mes,anio);
            JOptionPane.showMessageDialog(null, "Registro exitoso", "Listo!", JOptionPane.DEFAULT_OPTION);
            RegistroEspectadorFuncion nuevo = new RegistroEspectadorFuncion();
            nuevo.setVisible(true);
            this.dispose();
        }else{
        iUsuarios iu = Fabrica.getCrlUsuarios();
        iu.registrarUsuario(this.listadoDeEspectadores.getSelectedItem().toString(), this.listadoFunciones.getSelectedItem().toString(), costo,dia,mes,anio);
        canjeImposible.setVisible(false);
        DefaultListModel<String> modelo = new DefaultListModel<String>();
        this.seleccionarCanjeables.setModel(modelo);
        this.canjearOK.setSelected(false);
        this.cantCanjeables.setVisible(false);
        this.fechaFuncion.setVisible(false);
        this.artistasInvitados.setVisible(false);
        this.datosEsp.setVisible(false);
        List<String> listaEspectaculos = new ArrayList<String>();
        listaEspectaculos.add("--Seleccione uno--");
        this.listadoDeEspectaculos.setModel(new DefaultComboBoxModel(listaEspectaculos.toArray()));
        List<String> listaFUnciones = new ArrayList<String>();
        listaFUnciones.add("--Seleccione una--");
        this.listadoFunciones.setModel(new DefaultComboBoxModel(listaFUnciones.toArray()));
        List<String> listaEspectadores = new ArrayList<String>();
        listaEspectadores.add("--Seleccione uno--");
        this.listadoDeEspectadores.setModel(new DefaultComboBoxModel(listaEspectadores.toArray()));
        JOptionPane.showMessageDialog(null, "Registro exitoso", "Listo!", JOptionPane.DEFAULT_OPTION);
        RegistroEspectadorFuncion nuevo = new RegistroEspectadorFuncion();
        nuevo.setVisible(true);
        this.dispose();
        //
        }}else{
            JOptionPane.showMessageDialog(null, "Datos erroneos!", "Error!", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
       // VentanaCanjear.setVisible(false);
    }//GEN-LAST:event_formComponentHidden

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void listadoDePlataformasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listadoDePlataformasItemStateChanged
        // TODO add your handling code here:
//        String seleccion = listadoDePlataformas.getSelectedItem().toString();
        List<String> listaEspectaculos = new ArrayList<String>();
        listaEspectaculos.add("--Seleccione uno--");
//        IEspectaculos ce = Fabrica.getCtrlEspectaculos();
        if (this.listadoDePlataformas.getSelectedItem().toString() != "--Seleccione una--"){
        List<String> listaFUnciones = new ArrayList<String>();
        listaFUnciones.add("--Seleccione una--");
        this.listadoFunciones.setModel(new DefaultComboBoxModel(listaFUnciones.toArray()));
        List<String> listaEspectadores = new ArrayList<String>();
        listaEspectadores.add("--Seleccione uno--");
        canjeImposible.setVisible(false);
        DefaultListModel<String> modelo = new DefaultListModel<String>();
        this.seleccionarCanjeables.setModel(modelo);
        this.canjearOK.setSelected(false);
        this.cantCanjeables.setVisible(false);
        this.fechaFuncion.setVisible(false);
        this.artistasInvitados.setVisible(false);
        this.datosEsp.setVisible(false);
        this.listadoDeEspectadores.setModel(new DefaultComboBoxModel(listaEspectadores.toArray()));
         List<DtEspectaculo> lEsp = this.ie.listarEspectaculos(listadoDePlataformas.getSelectedItem().toString());
        for (DtEspectaculo i :lEsp){
            listaEspectaculos.add(i.getNombre());
        }
        this.listadoDeEspectaculos.setModel(new DefaultComboBoxModel(listaEspectaculos.toArray()));}else{
            this.botonRegistrar.setVisible(false);
        }
    }//GEN-LAST:event_listadoDePlataformasItemStateChanged

    private void listadoDeEspectaculosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listadoDeEspectaculosItemStateChanged
        // TODO add your handling code here:
        List<String> listaFunciones = new ArrayList<String>();
        if(this.listadoDeEspectaculos.getSelectedItem().toString() != "--Seleccione uno--"){
        listaFunciones.add("--Seleccione una--");
        List<DtFuncion> lFunc = this.ie.listarFunciones(listadoDeEspectaculos.getSelectedItem().toString());
        for (DtFuncion i :lFunc){
            listaFunciones.add(i.getNombre());
        }
        this.listadoFunciones.setModel(new DefaultComboBoxModel(listaFunciones.toArray()));
        List<String> listaEspectadores = new ArrayList<String>();
        listaEspectadores.add("--Seleccione uno--");
        canjeImposible.setVisible(false);
        DefaultListModel<String> modelo = new DefaultListModel<String>();
        this.seleccionarCanjeables.setModel(modelo);
        this.canjearOK.setSelected(false);
        this.cantCanjeables.setVisible(false);
        this.fechaFuncion.setVisible(false);
        this.artistasInvitados.setVisible(false);
        this.datosEsp.setVisible(false);
        this.listadoDeEspectadores.setModel(new DefaultComboBoxModel(listaEspectadores.toArray()));}else{
            this.botonRegistrar.setVisible(false);
        }
//        List<String> listaEspectadores = new ArrayList<String>();
//        listaEspectadores.add("--Seleccione uno--");
//        iUsuarios iu = Fabrica.getCrlUsuarios();
//        List<DtEspectador> lEspect = iu.getEspectadores();
//        for (DtEspectador i :lEspect){
//            listaEspectadores.add(i.getNombre()+" "+i.getApellido()+"--"+i.getNickname());
//        }
//        this.listadoDeEspectadores.setModel(new DefaultComboBoxModel(listaEspectadores.toArray()));
    }//GEN-LAST:event_listadoDeEspectaculosItemStateChanged

    private void listadoFuncionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listadoFuncionesItemStateChanged
        // TODO add your handling code here:
        List<String> listaEspectadores = new ArrayList<String>();
                if (this.listadoFunciones.getSelectedItem().toString() != "--Seleccione una--"){
        listaEspectadores.add("--Seleccione uno--");
        iUsuarios iu = Fabrica.getCrlUsuarios();
        DtFuncion funcion = ie.getDatosFuncion(this.listadoFunciones.getSelectedItem().toString());
        List<DtArtista> invitados = ie.getInvitados(listadoFunciones.getSelectedItem().toString());
        String inv = " ";
        if(invitados.size()!=0){
            for(DtArtista a: invitados){
                inv = inv + a.getNombre() + " " +a.getApellido()+"; ";
            }
        }
        inv = "Artistas invitados: "+inv;
        boolean completa = ie.estaCompleta(listadoFunciones.getSelectedItem().toString());
        if(completa == true){
            JOptionPane.showMessageDialog(null, "Esta funcion ya esta llena. Elija otra", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
        fFuncion = funcion.getFecha();
        List<DtEspectador> lEspect = iu.getNoRegistrados(this.listadoFunciones.getSelectedItem().toString());
        for (DtEspectador i :lEspect){
            listaEspectadores.add(i.getNickname());
        }
        this.listadoDeEspectadores.setModel(new DefaultComboBoxModel(listaEspectadores.toArray()));
        this.fechaFuncion.setText("Fecha: "+funcion.getHoraInicio().toString());
        this.artistasInvitados.setText(inv);
        this.artistasInvitados.setVisible(true);
        this.fechaFuncion.setVisible(true);
        canjeImposible.setVisible(false);
        DefaultListModel<String> modelo = new DefaultListModel<String>();
        this.seleccionarCanjeables.setModel(modelo);
        this.canjearOK.setSelected(false);
        this.cantCanjeables.setVisible(false);
        this.datosEsp.setVisible(false);
        }
        }else{
            this.botonRegistrar.setVisible(false);
        }
        
    }//GEN-LAST:event_listadoFuncionesItemStateChanged

    private void listadoDeEspectadoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listadoDeEspectadoresItemStateChanged
        // TODO add your handling code here:
        if(this.listadoDeEspectadores.getSelectedItem().toString()!="--Seleccione uno--"){
        iUsuarios iu = Fabrica.getCrlUsuarios();
        DtEspectador esteMen = iu.getDatosEspectador(this.listadoDeEspectadores.getSelectedItem().toString());
        this.datosEsp.setText(esteMen.getNombre()+" "+esteMen.getApellido()+" "+esteMen.getCorreo());
        this.datosEsp.setVisible(true);
        int cantCanj = iu.getCanjeables(listadoDeEspectadores.getSelectedItem().toString());
        this.cantCanjeables.setText(cantCanj+"");
        this.cantCanjeables.setVisible(true);
        this.botonRegistrar.setVisible(true);
        if(cantCanj<3){
            this.canjeImposible.setVisible(true);
            DefaultListModel<String> modelo = new DefaultListModel<String>();
            modelo.add(0,"No hay suficientes registros canjeables");
            this.seleccionarCanjeables.setModel(modelo);
        }else{
            List<DtRegistro> canjeables = iu.listarCanjeables(this.listadoDeEspectadores.getSelectedItem().toString());
            DefaultListModel<String> modelo = new DefaultListModel<String>();
            int pos = 0;
            for(DtRegistro i :canjeables){
                modelo.add(pos, i.getNombreFuncion());
                pos++;
            }
            this.seleccionarCanjeables.setModel(modelo);
            this.seleccionarCanjeables.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        }
        }else{
            this.botonRegistrar.setVisible(false);
        }
    }//GEN-LAST:event_listadoDeEspectadoresItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void listadoFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoFuncionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listadoFuncionesActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroEspectadorFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEspectadorFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEspectadorFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEspectadorFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEspectadorFuncion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel artistasInvitados;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel canjeImposible;
    private javax.swing.JCheckBox canjearOK;
    private javax.swing.JLabel cantCanjeables;
    private javax.swing.JLabel datosEsp;
    private javax.swing.JLabel fechaFuncion;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listadoDeEspectaculos;
    private javax.swing.JComboBox<String> listadoDeEspectadores;
    private javax.swing.JComboBox<String> listadoDePlataformas;
    private javax.swing.JComboBox<String> listadoFunciones;
    private javax.swing.JList<String> seleccionarCanjeables;
    private com.toedter.calendar.JDateChooser selectorFecha;
    private javax.swing.JDialog usuarioNoExiste;
    // End of variables declaration//GEN-END:variables

}
