/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.guis;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import root.entidades.DtArtista;
import root.datatypes.DtEspectaculo;
import root.datatypes.DtFuncion;
import root.datatypes.DtPlataforma;
import root.fabrica.Fabrica;
import root.interfaces.IEspectaculos;

/**
 *
 * @author osiris
 */
public class AltaFuncion extends javax.swing.JFrame {
    
    List<String> artConf = new ArrayList();
    
    /**
     * Creates new form AltaFuncion
     */
    public AltaFuncion() {
        initComponents();
        //Aqui voy a cargar las plataformas
        
         List<String> li= new ArrayList<String>();
        li.add("--Seleccione una--");
       
        List<DtPlataforma> dtPlataformas = Fabrica.getCtrlEspectaculos().listarPlataformas();
         for (DtPlataforma i :dtPlataformas){
             li.add(i.getNombre());
         }
        this.ComboBoxPlat.setModel(new DefaultComboBoxModel(li.toArray()));
            
          List<String> liart= new ArrayList<String>();
        liart.add("--Artista--");
        
           List<DtArtista> dtArtistas=Fabrica.getCrlUsuarios().getArtistas();
         for (DtArtista i :dtArtistas){
             liart.add(i.getNombre());
         }
        this.CBArtInvi.setModel(new DefaultComboBoxModel(liart.toArray()));
        
        
        int i=1900;
        while(i<2100)
        {
            CBF1Anio.addItem(Integer.toString(i));
            i++;
        }
         int i2=1900;
        while(i2<2100)
        {
            CBFAAnio.addItem(Integer.toString(i2));
            i2++;
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

        ComboBoxPlat = new javax.swing.JComboBox<>();
        ComboBoxEsp = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CBF1Dia = new javax.swing.JComboBox<>();
        CBF1Mes = new javax.swing.JComboBox<>();
        CBF1Anio = new javax.swing.JComboBox<>();
        CBHHora = new javax.swing.JComboBox<>();
        CBHMin = new javax.swing.JComboBox<>();
        CBArtInvi = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        BConfirArtistas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CBFADia = new javax.swing.JComboBox<>();
        CBFAMes = new javax.swing.JComboBox<>();
        CBFAAnio = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboBoxPlat.setFocusCycleRoot(true);
        ComboBoxPlat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxPlatItemStateChanged(evt);
            }
        });
        ComboBoxPlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxPlatActionPerformed(evt);
            }
        });

        ComboBoxEsp.setEnabled(false);
        ComboBoxEsp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxEspItemStateChanged(evt);
            }
        });

        jLabel1.setText("Listar Espectaculos");

        TextoNombre.setEnabled(false);
        TextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNombreActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Alta Funcion");

        jLabel3.setText("Listar Plataformas");

        jLabel4.setText("Nombre");

        jLabel5.setText("Fecha");

        jLabel6.setText("Hora inicio");

        CBF1Dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        CBF1Dia.setEnabled(false);

        CBF1Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "" }));
        CBF1Mes.setEnabled(false);
        CBF1Mes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBF1MesItemStateChanged(evt);
            }
        });
        CBF1Mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBF1MesActionPerformed(evt);
            }
        });

        CBF1Anio.setEnabled(false);
        CBF1Anio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBF1AnioItemStateChanged(evt);
            }
        });
        CBF1Anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBF1AnioActionPerformed(evt);
            }
        });

        CBHHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", " " }));
        CBHHora.setEnabled(false);

        CBHMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", " " }));
        CBHMin.setEnabled(false);

        CBArtInvi.setEnabled(false);
        CBArtInvi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBArtInviItemStateChanged(evt);
            }
        });
        CBArtInvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBArtInviActionPerformed(evt);
            }
        });

        jLabel7.setText("Confirmar artistas invitados");

        BConfirArtistas.setText("Confirmar Artista");
        BConfirArtistas.setEnabled(false);
        BConfirArtistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConfirArtistasActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha de Alta");

        CBFADia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        CBFADia.setEnabled(false);

        CBFAMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        CBFAMes.setEnabled(false);
        CBFAMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBFAMesItemStateChanged(evt);
            }
        });

        jLabel9.setText("Ingrese datos de la funcion:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(211, 211, 211))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3))
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ComboBoxPlat, 0, 166, Short.MAX_VALUE)
                                            .addComponent(ComboBoxEsp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(342, 342, 342)
                                .addComponent(jButton2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(156, 156, 156)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(89, 89, 89)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(CBFADia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(CBHHora, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(CBHMin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(CBFAMes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(CBF1Dia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(CBF1Mes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(CBF1Anio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(CBFAAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGap(79, 79, 79)
                                    .addComponent(CBArtInvi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BConfirArtistas))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboBoxPlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBF1Dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBF1Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBF1Anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBHHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBHMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CBArtInvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BConfirArtistas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CBFADia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBFAMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBFAAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        Principal p = new Principal();
        p.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            String nombre = TextoNombre.getText();
             long id = 0;
            Date fechaInicio = new Date(Integer.parseInt(CBF1Anio.getSelectedItem().toString())-1900, 
                Integer.parseInt(CBF1Mes.getSelectedItem().toString())-1, 
                Integer.parseInt(CBF1Dia.getSelectedItem().toString()));
            Date fechaAlta = new Date(Integer.parseInt(CBFAAnio.getSelectedItem().toString())-1900, 
                Integer.parseInt(CBFAMes.getSelectedItem().toString())-1, 
                Integer.parseInt(CBFADia.getSelectedItem().toString()));           
            java.sql.Timestamp fhinicio = new java.sql.Timestamp(Integer.parseInt(CBF1Anio.getSelectedItem().toString())-1899,Integer.parseInt(CBF1Mes.getSelectedItem().toString())-12,Integer.parseInt(CBF1Dia.getSelectedItem().toString())-31,Integer.parseInt(CBHHora.getSelectedItem().toString()),Integer.parseInt(CBHMin.getSelectedItem().toString()),0,0);
            DtFuncion fun=new DtFuncion(id,nombre,fhinicio,fechaInicio,fechaAlta);
            
           
            
            if(this.TextoNombre.getText().length()<1|| this.TextoNombre.getText().length()>254) {
            JOptionPane.showMessageDialog(null, "Nickname invalido","Usuarios", JOptionPane.ERROR_MESSAGE);}    
            else {
                    boolean resp = Fabrica.getCtrlEspectaculos().existeFuncion(nombre);
                    if (resp==true){
                        JOptionPane.showMessageDialog(null, "Una funcion con ese nombre ya existe");
                        TextoNombre.setText("");
                        
                    }
                    else{
                    Fabrica.getCtrlEspectaculos().crearFuncion(ComboBoxEsp.getSelectedItem().toString(), fun, artConf);
                    JOptionPane.showMessageDialog(null, "Funcion creada");
                    artConf.clear();
                    AltaFuncion af2 = new AltaFuncion();
                    af2.setVisible(true);
                    this.dispose();
                    }
                    }
       
        
            
            




        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CBF1AnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBF1AnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBF1AnioActionPerformed

    private void ComboBoxPlatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxPlatItemStateChanged

      ComboBoxEsp.setEnabled(true);
        
        
        List<String> liesp= new ArrayList<String>();
        liesp.add("--Seleccione un--");
        IEspectaculos ifu = Fabrica.getCtrlEspectaculos();
        List<DtEspectaculo> dtEspectaculos = ifu.listarEspectaculos(ComboBoxPlat.getSelectedItem().toString());
         for (DtEspectaculo i :dtEspectaculos){
             liesp.add(i.getNombre());
         }
        this.ComboBoxEsp.setModel(new DefaultComboBoxModel(liesp.toArray()));

       
    }//GEN-LAST:event_ComboBoxPlatItemStateChanged

    private void ComboBoxPlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxPlatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxPlatActionPerformed

    private void CBF1MesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBF1MesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBF1MesActionPerformed

    private void TextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNombreActionPerformed

    private void ComboBoxEspItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxEspItemStateChanged
        // TODO add your handling code here:
        TextoNombre.setEnabled(true);
        CBF1Dia.setEnabled(true);
        CBF1Mes.setEnabled(true);
        CBF1Anio.setEnabled(true);
        CBHHora.setEnabled(true);
        CBHMin.setEnabled(true);
        CBArtInvi.setEnabled(true);
        CBFADia.setEnabled(true);
        CBFAMes.setEnabled(true);
        CBFAAnio.setEnabled(true);
        
    }//GEN-LAST:event_ComboBoxEspItemStateChanged

    private void CBArtInviItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBArtInviItemStateChanged
        // TODO add your handling code here:
        BConfirArtistas.setEnabled(true);
    }//GEN-LAST:event_CBArtInviItemStateChanged

    private void CBArtInviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBArtInviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBArtInviActionPerformed

    private void BConfirArtistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConfirArtistasActionPerformed
        // TODO add your handling code here:
        boolean existe= false;
        for(String i: artConf){
           if(CBArtInvi.getSelectedItem().toString()== i){
               existe= true;          
           }
       }
       if(existe==true){

            JOptionPane.showMessageDialog(null, "El Artista ya esta agregado");              
       }
       else {
           JOptionPane.showMessageDialog(null, "Artista agregado");
           artConf.add(CBArtInvi.getSelectedItem().toString());

       }
        
        
    }//GEN-LAST:event_BConfirArtistasActionPerformed

    private void CBF1AnioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBF1AnioItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CBF1AnioItemStateChanged

    private void CBF1MesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBF1MesItemStateChanged
        // TODO add your handling code here:
        
        CBF1Dia.setEnabled(true);
        if(Integer.parseInt(CBF1Anio.getSelectedItem().toString())%4 ==0&&Integer.parseInt(CBF1Mes.getSelectedItem().toString()) ==2 )
        {
            List<String> dias = new ArrayList<String>();
            int i=1;
            while(i<30)
            {
                dias.add(Integer.toString(i));
                
                i++;
            }
            CBF1Dia.setModel(new DefaultComboBoxModel(dias.toArray()));
        }
        else if(Integer.parseInt(CBF1Mes.getSelectedItem().toString()) ==2 )
        {
            List<String> dias = new ArrayList<String>();
            int i=1;
            while(i<29)
            {
                dias.add(Integer.toString(i));
                
                i++;
            }
            CBF1Dia.setModel(new DefaultComboBoxModel(dias.toArray()));
        }
        else if(Integer.parseInt(CBF1Mes.getSelectedItem().toString())==4 ||Integer.parseInt(CBF1Mes.getSelectedItem().toString())==6 || Integer.parseInt(CBF1Mes.getSelectedItem().toString())==9 || Integer.parseInt(CBF1Mes.getSelectedItem().toString())==11)
        {
            List<String> dias = new ArrayList<String>();
            int i=1;
            while(i<31)
            {
                dias.add(Integer.toString(i));
                
                i++;
            }
            CBF1Dia.setModel(new DefaultComboBoxModel(dias.toArray()));
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
            CBF1Dia.setModel(new DefaultComboBoxModel(dias.toArray()));
        }
        
    }//GEN-LAST:event_CBF1MesItemStateChanged

    private void CBFAMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBFAMesItemStateChanged
            CBFADia.setEnabled(true);
        if(Integer.parseInt(CBFAAnio.getSelectedItem().toString())%4 ==0&&Integer.parseInt(CBFAMes.getSelectedItem().toString()) ==2 )
        {
            List<String> dias = new ArrayList<String>();
            int i=1;
            while(i<30)
            {
                dias.add(Integer.toString(i));
                
                i++;
            }
            CBFADia.setModel(new DefaultComboBoxModel(dias.toArray()));
        }
        else if(Integer.parseInt(CBFAAnio.getSelectedItem().toString()) ==2 )
        {
            List<String> dias = new ArrayList<String>();
            int i=1;
            while(i<29)
            {
                dias.add(Integer.toString(i));
                
                i++;
            }
            CBFADia.setModel(new DefaultComboBoxModel(dias.toArray()));
        }
        else if(Integer.parseInt(CBFAMes.getSelectedItem().toString())%2 ==0 )
        {
            List<String> dias = new ArrayList<String>();
            int i=1;
            while(i<31)
            {
                dias.add(Integer.toString(i));
                
                i++;
            }
            CBFADia.setModel(new DefaultComboBoxModel(dias.toArray()));
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
            CBFADia.setModel(new DefaultComboBoxModel(dias.toArray()));
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_CBFAMesItemStateChanged

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
            java.util.logging.Logger.getLogger(AltaFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaFuncion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BConfirArtistas;
    private javax.swing.JComboBox<String> CBArtInvi;
    private javax.swing.JComboBox<String> CBF1Anio;
    private javax.swing.JComboBox<String> CBF1Dia;
    private javax.swing.JComboBox<String> CBF1Mes;
    private javax.swing.JComboBox<String> CBFAAnio;
    private javax.swing.JComboBox<String> CBFADia;
    private javax.swing.JComboBox<String> CBFAMes;
    private javax.swing.JComboBox<String> CBHHora;
    private javax.swing.JComboBox<String> CBHMin;
    private javax.swing.JComboBox<String> ComboBoxEsp;
    private javax.swing.JComboBox<String> ComboBoxPlat;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
