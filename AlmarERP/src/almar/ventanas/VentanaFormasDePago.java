package almar.ventanas;

import almar.controlador.FormaPagoController;
import almar.excepciones.BussinessException;
import almar.excepciones.BussinessMessage;
import almar.entidades.FormaPago;
import hibernate.util.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import patronObserver.Subject;

/**
 *
 * @author Alberto
 */
public class VentanaFormasDePago extends javax.swing.JDialog implements patronObserver.Observer {

    private FormaPagoController formaPagoController;
    private DefaultListModel listModel;
    private List listaFormaPagos;

    public VentanaFormasDePago(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        botonesVisibles(true, true, true, false, false);
        this.formaPagoController = new FormaPagoController();
        formaPagoController.registerObserver(this);
        listModel = new DefaultListModel();
        actualizarJlist();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTF_idFormaPago = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF_Descripcion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel12 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonNuevo = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("id FormaPago:");

        jTF_idFormaPago.setEditable(false);
        jTF_idFormaPago.setEnabled(false);

        jLabel3.setText("Descripción:");

        jTF_Descripcion.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTF_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_idFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTF_idFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 310, 80));

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel12.setText("Lista de Formas de Pago");

        btnAtras.setText("<");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnSiguiente.setText(">");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAtras)
                                .addGap(9, 9, 9)
                                .addComponent(btnSiguiente))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras)
                    .addComponent(btnSiguiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 170, 310));

        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButtonNuevo)
                .addGap(30, 30, 30)
                .addComponent(jButtonModificar)
                .addGap(32, 32, 32)
                .addComponent(jButtonEliminar)
                .addGap(31, 31, 31)
                .addComponent(jButtonGuardar)
                .addGap(30, 30, 30)
                .addComponent(jButtonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 550, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if (jList1.getSelectedIndex() > 0) {
            jList1.setSelectedIndex(jList1.getSelectedIndex() - 1);
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (jList1.getSelectedIndex() != jList1.getLastVisibleIndex()) {
            jList1.setSelectedIndex(jList1.getSelectedIndex() + 1);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jList1.clearSelection();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        activarCampos(true);
        limpiarCampos();
        botonesVisibles(false, false, false, true, true);
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        try {
            FormaPago formaPago;
            if (jTF_idFormaPago.getText().isEmpty()) {//Si es nuevo no lleva id porque se crea autoincrement en la bd:
                formaPago = new FormaPago(jTF_Descripcion.getText());

            } else {//Si es actualización lleva el id:
                formaPago = new FormaPago(Integer.parseInt(jTF_idFormaPago.getText()), jTF_Descripcion.getText());
            }
            formaPagoController.guardar(formaPago);
            jList1.clearSelection();
            jList1ValueChanged(null);//Vuelve a poner en los campos el valor selecionado del jList.
            botonesVisibles(true, true, true, false, false);
            activarCampos(false);
        } catch (BussinessException be) {
            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {
                JOptionPane.showMessageDialog(null, bussinessMessage.toString());
            }
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        if (jTF_idFormaPago.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun formaPago de la lista");
        } else {
            activarCampos(true);
            botonesVisibles(false, false, false, true, true);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if (jList1.isSelectionEmpty()) {
            limpiarCampos();
        } else {
            FormaPago formaPagoSelec = (FormaPago) listaFormaPagos.get(jList1.getSelectedIndex());
            jTF_idFormaPago.setText(formaPagoSelec.getIdFormaPago().toString());
            jTF_Descripcion.setText(formaPagoSelec.getDescripcion());
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        try {
            if (jTF_idFormaPago.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna forma de pago de la lista");
            } else {
                int i = JOptionPane.showConfirmDialog(this, "¿Esta seguro de que quiere eliminar esa forma de pago?", "Eliminar FormaPago", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (i == 0) {
                    formaPagoController.eliminarPorId(Integer.parseInt(jTF_idFormaPago.getText()));
                    jList1.clearSelection();
                    jList1ValueChanged(null);//Vuelve a poner en los campos el valor selecionado del jList.
                }
            }
        } catch (BussinessException be) {
            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {
                JOptionPane.showMessageDialog(null, bussinessMessage.toString());
            }
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        activarCampos(false);
        jList1ValueChanged(null);//Vuelve a poner en los campos el valor selecionado del jList.
        botonesVisibles(true, true, true, false, false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void actualizarJlist() {
        HibernateUtil.openSessionAndBindToThread();
        try {
            listModel.clear();
            listaFormaPagos = formaPagoController.listaFormaPagos();
            Iterator<FormaPago> i = listaFormaPagos.iterator();
            FormaPago temp;
            while (i.hasNext()) {
                temp = i.next();
                listModel.addElement(temp.getDescripcion());
            }
            jList1.setModel(listModel);
        } catch (BussinessException be) {
            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {
                JOptionPane.showMessageDialog(null, bussinessMessage.toString());
            }
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }
    }

    private void botonesVisibles(boolean nuevo, boolean modificar, boolean eliminar, boolean guardar, boolean cancelar) {
        jButtonNuevo.setVisible(nuevo);
        jButtonModificar.setVisible(modificar);
        jButtonEliminar.setVisible(eliminar);
        jButtonGuardar.setVisible(guardar);
        jButtonCancelar.setVisible(cancelar);
    }

    private void activarCampos(boolean estado) {
        for (Object obj : jPanel2.getComponents()) {
            if (obj instanceof JTextField) {
                JTextField temp = (JTextField) obj;
                if (temp != jTF_idFormaPago) {//El campo del id no quiero que se active.
                    temp.setEditable(estado);
                }
            }
        }
    }

    private void limpiarCampos() {
        for (Object obj : jPanel2.getComponents()) {
            if (obj instanceof JTextField) {
                JTextField temp = (JTextField) obj;
                temp.setText(null);
            }
        }
    }

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaFormasDePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFormasDePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFormasDePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFormasDePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaFormasDePago dialog = new VentanaFormasDePago(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTF_Descripcion;
    private javax.swing.JTextField jTF_idFormaPago;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Subject subject) {
        if (subject instanceof FormaPagoController) {
            actualizarJlist();
        }
    }

}
