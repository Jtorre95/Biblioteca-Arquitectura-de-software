/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import com.entidades.Libros;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Deysi
 */
public class frmLibros extends javax.swing.JDialog {

    /**
     * Creates new form frmLibros
     */
    public frmLibros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         sessionHibernate(); 
       arranque();
        setLocationRelativeTo(null);
        
    }
    
     
    private Session st;
    private DefaultTableModel model;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHeader7 = new org.edisoncor.gui.label.LabelHeader();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        jPanel1 = new javax.swing.JPanel();
        labelHeader1 = new org.edisoncor.gui.label.LabelHeader();
        txtid = new org.edisoncor.gui.textField.TextFieldRound();
        labelHeader2 = new org.edisoncor.gui.label.LabelHeader();
        labelHeader3 = new org.edisoncor.gui.label.LabelHeader();
        labelHeader4 = new org.edisoncor.gui.label.LabelHeader();
        txtnombre = new org.edisoncor.gui.textField.TextFieldRound();
        txteditorial = new org.edisoncor.gui.textField.TextFieldRound();
        txtautor = new org.edisoncor.gui.textField.TextFieldRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        btnnuevo = new org.edisoncor.gui.button.ButtonTask();
        btnguardar = new org.edisoncor.gui.button.ButtonTask();
        btneditar = new org.edisoncor.gui.button.ButtonTask();
        btncancelar = new org.edisoncor.gui.button.ButtonTask();

        labelHeader7.setText("Pais:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNice1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de Libros"));

        labelHeader1.setText("ID");
        labelHeader1.setColor(new java.awt.Color(255, 255, 255));
        labelHeader1.setColorDeSombra(new java.awt.Color(255, 255, 255));
        labelHeader1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        labelHeader2.setText("Titulo:");

        labelHeader3.setText("Editorial:");

        labelHeader4.setText("Autor:");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreKeyReleased(evt);
            }
        });

        txteditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteditorialActionPerformed(evt);
            }
        });
        txteditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txteditorialKeyReleased(evt);
            }
        });

        txtautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtautorActionPerformed(evt);
            }
        });
        txtautor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtautorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelHeader4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelHeader3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(txteditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtautor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHeader3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txteditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHeader4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Editorial", "Autor", "Genero"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panelNice2.setBackground(new java.awt.Color(204, 204, 204));
        panelNice2.setForeground(new java.awt.Color(204, 204, 204));

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/1399150726_human-folder-new.png"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.setDescription("New");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/1399150686_stock_save-as.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setDescription("Save");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/1399150821_27-Edit Text.png"))); // NOI18N
        btneditar.setText("Editar");
        btneditar.setDescription("Edit");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/1399150921_Cancel.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.setDescription("Cancel");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNice2Layout = new javax.swing.GroupLayout(panelNice2);
        panelNice2.setLayout(panelNice2Layout);
        panelNice2Layout.setHorizontalGroup(
            panelNice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNice2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelNice2Layout.setVerticalGroup(
            panelNice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNice2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelNice1Layout = new javax.swing.GroupLayout(panelNice1);
        panelNice1.setLayout(panelNice1Layout);
        panelNice1Layout.setHorizontalGroup(
            panelNice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(panelNice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelNice1Layout.setVerticalGroup(
            panelNice1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNice1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelNice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        nuevo();
        
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
         guardarUno();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        arranque();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
        editar();
    }//GEN-LAST:event_btneditarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
       cargarCliente();
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
        
        txtnombre.transferFocus();
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyReleased
        // TODO add your handling code here:
        
         char c;
        c = evt.getKeyChar();
        if (!(c < '0' || c > '9')) {
            JOptionPane.showMessageDialog(null, "NO SE PERMITE EL INGRESO DE NUMEROS", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            evt.consume();
            txtnombre.setText("");
        }
    }//GEN-LAST:event_txtnombreKeyReleased

    private void txteditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteditorialActionPerformed
        // TODO add your handling code here:
        
        txteditorial.transferFocus();
    }//GEN-LAST:event_txteditorialActionPerformed

    private void txtautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtautorActionPerformed
        // TODO add your handling code here:
        
        txtautor.transferFocus();
    }//GEN-LAST:event_txtautorActionPerformed

    private void txteditorialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txteditorialKeyReleased
        // TODO add your handling code here:
         char c;
        c = evt.getKeyChar();
        if (!(c < '0' || c > '9')) {
            JOptionPane.showMessageDialog(null, "NO SE PERMITE EL INGRESO DE NUMEROS", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            evt.consume();
            txteditorial.setText("");
        }
        
    }//GEN-LAST:event_txteditorialKeyReleased

    private void txtautorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtautorKeyReleased
        // TODO add your handling code here:
         char c;
        c = evt.getKeyChar();
        if (!(c < '0' || c > '9')) {
            JOptionPane.showMessageDialog(null, "NO SE PERMITE EL INGRESO DE NUMEROS", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            evt.consume();
            txtautor.setText("");
        }
    }//GEN-LAST:event_txtautorKeyReleased

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

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
            java.util.logging.Logger.getLogger(frmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmLibros dialog = new frmLibros(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
     private void sessionHibernate(){
    st = HibernateUtil.getSessionFactory().openSession();
}
     
    
   private void arranque(){
    this.txtid .setEnabled(false);
    this.txtid.setText(null);
    this.txtnombre.setEnabled(false);
    this.txtnombre.setText(null);
    this.txteditorial.setEnabled(false);
    this.txteditorial.setText(null);
    this.txtautor.setEnabled(false);
    this.txtautor.setText(null);
    this.btnguardar.setEnabled(false);
    this.btneditar.setEnabled(false);
//    this.btneliminar.setEnabled(false);
    this.btnnuevo.setEnabled(true);
    this.btnguardar.setText("Guardar");
    this.jTable1.setEnabled(true);
    defaultTableModel();
    cargarTabla();
}
    
    public void defaultTableModel(){
    this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
    this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(20);
    model = (DefaultTableModel) this.jTable1.getModel();
    model.setNumRows(0);    
}  
    
   public void nuevo(){
    this.btnnuevo.setEnabled(false);
    this.btnguardar.setEnabled(true);
    this.txtnombre.setEnabled(true);
    this.txteditorial.setEnabled(true);
    this.txtautor.setEnabled(true);
    this.txtid.setText("Auto");
    
} 

   public void cargarTabla(){
    st.beginTransaction();
    List<Libros> lista = (List<Libros>)st.createQuery("From Libros").list();
    for (Iterator<Libros> it = lista.iterator(); it.hasNext();) {
        Libros lib = it.next();
        model.addRow(new Object[]{
               
                lib.getIdlibro(),lib.getNombre(),lib.getEditorial(),lib.getAutor()
                
        });
        
    }
    
   
}
   
public void guardarUno(){
    if(this.txtnombre.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Falta Nombre del Libro.");
    }
    else{
        if((this.txteditorial.getText().isEmpty()) || (this.txtautor.getText().isEmpty() )){
           this.txteditorial.setText("-");
           this.txtautor.setText("-");
               
           guardarDos();
        }
        else{
          guardarDos();  
        }
        
    }
} 

public void guardarDos(){
    if(this.btnguardar.getText().equals("Guardar")){
       st.beginTransaction();
       Libros li = new Libros();
       li.setNombre(this.txtnombre.getText());
       li.setEditorial(this.txteditorial.getText());
       li.setAutor(this.txtautor.getText());
       st.save(li);
       st.getTransaction().commit();
       JOptionPane.showMessageDialog(null, "Registro de Libros guardado.");
       cargarTabla();
       arranque();
    }
    else{
       st.beginTransaction();
       int selectedRow = this.jTable1.getSelectedRow();
       int idli = Integer.parseInt(String.valueOf(model.getValueAt(selectedRow, 0)));
       Libros li = (Libros)st.load(Libros.class, idli);
       li.setNombre(this.txtnombre.getText());
       li.setEditorial(this.txteditorial.getText());
       li.setAutor(this.txtautor.getText());
       st.update(li);
       st.getTransaction().commit();
      JOptionPane.showMessageDialog(null, "Registro de Libros actualizado.");
      cargarTabla();
      arranque();
    } 
}


public void cargarCliente(){
    if(this.jTable1.isEnabled()){
        int selectedRow = this.jTable1.getSelectedRow();
        int idli = Integer.parseInt(String.valueOf(model.getValueAt(selectedRow, 0)));
        Libros li = (Libros)st.load(Libros.class, idli);
        this.txtid.setText(String.valueOf(li.getIdlibro()));
        this.txtnombre.setText(li.getNombre());
        this.txteditorial.setText(li.getEditorial());
        this.txtautor.setText(li.getAutor());
        this.btneditar.setEnabled(true);
//        this.btneliminar.setEnabled(true);
        this.btnnuevo.setEnabled(false);        
    }
}


public void editar(){
    this.txtnombre.setEnabled(true);
    this.txteditorial.setEnabled(true);
    this.txtautor.setEnabled(true);
    this.btnnuevo.setEnabled(false);
//    this.btneliminar.setEnabled(false);
    this.btnguardar.setEnabled(true);
    this.btnguardar.setText("Actualizar");
    this.jTable1.setEnabled(false);
}


public void eliminar(){
   int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Eliminación de Registro", "Desea eliminar este registro.", JOptionPane.YES_NO_OPTION);
   if(showConfirmDialog == 1){
       JOptionPane.showMessageDialog(null, "Registro no eliminado.");
   }
   else{
       st.beginTransaction();
       int selectedRow = this.jTable1.getSelectedRow();
       Object valueAt = model.getValueAt(selectedRow, 0);
       int idli = Integer.parseInt(valueAt.toString());
      Libros li = (Libros)st.load(Libros.class, idli);
       st.delete(li);
       st.getTransaction().commit();
       JOptionPane.showMessageDialog(null, "Registro eliminado.");
       arranque();
   }

}
   
   
   
   
   
    
     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTask btncancelar;
    private org.edisoncor.gui.button.ButtonTask btneditar;
    private org.edisoncor.gui.button.ButtonTask btnguardar;
    private org.edisoncor.gui.button.ButtonTask btnnuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    private org.edisoncor.gui.label.LabelHeader labelHeader2;
    private org.edisoncor.gui.label.LabelHeader labelHeader3;
    private org.edisoncor.gui.label.LabelHeader labelHeader4;
    private org.edisoncor.gui.label.LabelHeader labelHeader7;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private org.edisoncor.gui.textField.TextFieldRound txtautor;
    private org.edisoncor.gui.textField.TextFieldRound txteditorial;
    private org.edisoncor.gui.textField.TextFieldRound txtid;
    private org.edisoncor.gui.textField.TextFieldRound txtnombre;
    // End of variables declaration//GEN-END:variables
}