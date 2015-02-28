package almar.ventanas;

import almar.listmodels.ClientesListModel;
import almar.controlador.ClienteController;
import almar.excepciones.BussinessException;
import almar.excepciones.BussinessMessage;
import almar.entidades.Cliente;
import hibernate.util.HibernateUtil;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import patronObserver.Subject;

/**
 *
 * @author Alberto
 */
public class VentanaClientes extends javax.swing.JDialog implements patronObserver.Observer {

    private ClienteController clienteController;
    private ClientesListModel clientesListModel;
    private List listaClientes;

    public VentanaClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        botonesVisibles(true, true, true, false, false);
        this.clienteController = new ClienteController();
        clienteController.registerObserver(this);
        clientesListModel = new ClientesListModel();
        jList1.setModel(clientesListModel);
        actualizarJlist();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTF_idCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTF_Nif = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF_Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTF_Apellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTF_Telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTF_Direccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTF_Ciudad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTF_Provincia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTF_CP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTF_Email = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel12 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonNuevo = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("id Cliente:");

        jTF_idCliente.setEditable(false);
        jTF_idCliente.setEnabled(false);

        jLabel2.setText("Nif:");

        jTF_Nif.setEditable(false);

        jLabel3.setText("Nombre:");

        jTF_Nombre.setEditable(false);

        jLabel4.setText("Apellidos:");

        jTF_Apellidos.setEditable(false);

        jLabel5.setText("Teléfono:");

        jTF_Telefono.setEditable(false);

        jLabel6.setText("Dirección:");

        jTF_Direccion.setEditable(false);

        jLabel7.setText("Ciudad:");

        jTF_Ciudad.setEditable(false);

        jLabel8.setText("Provincia:");

        jTF_Provincia.setEditable(false);

        jLabel9.setText("CP:");

        jTF_CP.setEditable(false);

        jLabel10.setText("Email:");

        jTF_Email.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_CP, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTF_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTF_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTF_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Nif, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTF_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jTF_Nif, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTF_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTF_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jTF_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addComponent(jTF_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTF_Provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTF_CP, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 390, -1));

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel12.setText("Lista de Clientes");

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

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
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
                                .addComponent(jButtonLimpiar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAtras)
                                .addGap(9, 9, 9)
                                .addComponent(btnSiguiente))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
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
                .addComponent(jButtonLimpiar)
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

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jList1.clearSelection();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        activarCampos(true);
        limpiarCampos();
        botonesVisibles(false, false, false, true, true);
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        try {
            Cliente cliente;
            if (jTF_idCliente.getText().isEmpty()) {//Si es nuevo no lleva id porque se crea autoincrement en la bd:
                cliente = new Cliente(jTF_Nif.getText(), jTF_Nombre.getText(), jTF_Apellidos.getText(), jTF_Telefono.getText(), jTF_Email.getText(), jTF_Direccion.getText(), jTF_Ciudad.getText(), jTF_Provincia.getText(), jTF_CP.getText(), null);

            } else {//Si es actualización lleva el id:
                cliente = new Cliente(Integer.parseInt(jTF_idCliente.getText()), jTF_Nif.getText(), jTF_Nombre.getText(), jTF_Apellidos.getText(), jTF_Telefono.getText(), jTF_Email.getText(), jTF_Direccion.getText(), jTF_Ciudad.getText(), jTF_Provincia.getText(), jTF_CP.getText());
            }
            clienteController.guardar(cliente);
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
        if (jTF_idCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun cliente de la lista");
        } else {
            activarCampos(true);
            botonesVisibles(false, false, false, true, true);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        try {
            if (jTF_idCliente.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun cliente de la lista");
            } else {
                int i = JOptionPane.showConfirmDialog(this, "¿Esta seguro de que quiere eliminar a ese cliente?", "Eliminar Cliente", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (i == 0) {
                    clienteController.eliminarPorId(Integer.parseInt(jTF_idCliente.getText()));
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

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if (jList1.isSelectionEmpty()) {
            limpiarCampos();
        } else {
            Cliente clienteSelec = (Cliente) listaClientes.get(jList1.getSelectedIndex());
            jTF_idCliente.setText(clienteSelec.getIdCliente().toString());
            jTF_Nif.setText(clienteSelec.getNif());
            jTF_Nombre.setText(clienteSelec.getNombre());
            jTF_Apellidos.setText(clienteSelec.getApellidos());
            jTF_Telefono.setText(clienteSelec.getTelefono());
            jTF_Direccion.setText(clienteSelec.getDireccion());
            jTF_Ciudad.setText(clienteSelec.getCiudad());
            jTF_Provincia.setText(clienteSelec.getProvincia());
            jTF_CP.setText(clienteSelec.getCp());
            jTF_Email.setText(clienteSelec.getEmail());
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void actualizarJlist() {
        HibernateUtil.openSessionAndBindToThread();
        try {
            listaClientes = clienteController.listaClientes();
            clientesListModel.cargar(listaClientes);

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
                if (temp != jTF_idCliente) {//El campo del id no quiero que se active.
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
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaClientes dialog = new VentanaClientes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTF_Apellidos;
    private javax.swing.JTextField jTF_CP;
    private javax.swing.JTextField jTF_Ciudad;
    private javax.swing.JTextField jTF_Direccion;
    private javax.swing.JTextField jTF_Email;
    private javax.swing.JTextField jTF_Nif;
    private javax.swing.JTextField jTF_Nombre;
    private javax.swing.JTextField jTF_Provincia;
    private javax.swing.JTextField jTF_Telefono;
    private javax.swing.JTextField jTF_idCliente;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Subject subject) {
        if (subject instanceof ClienteController) {
            actualizarJlist();
        }
    }
}
