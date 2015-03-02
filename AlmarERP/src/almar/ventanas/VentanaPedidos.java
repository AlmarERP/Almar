package almar.ventanas;

import almar.listmodels.PedidosListModel;
import almar.controlador.PedidoController;
import almar.controlador.ClienteController;
import almar.controlador.EmpleadoController;
import almar.controlador.FormaPagoController;
import almar.controlador.LineasPedidoController;
import almar.excepciones.BussinessException;
import almar.excepciones.BussinessMessage;
import almar.entidades.Pedido;
import almar.entidades.Cliente;
import almar.entidades.Empleado;
import almar.entidades.FormaPago;
import almar.listmodels.LineasPedidoTableModel;
import com.toedter.calendar.JDateChooser;
import hibernate.util.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import patronObserver.Subject;

/**
 *
 * @author Alberto
 */
public class VentanaPedidos extends javax.swing.JDialog implements patronObserver.Observer {

    private PedidoController pedidoController;
    private LineasPedidoController lineasPedidoController;
    private ClienteController clienteController;
    private EmpleadoController empleadoController;
    private FormaPagoController formaPagoController;
    private PedidosListModel pedidosListModel;
    private List listaPedidos;
    private List listaClientes;
    private List listaEmpleados;
    private List listaFormaPago;
    private Set listaLineasPedido;
    private LineasPedidoTableModel lineasPedidoTableModel;

    public VentanaPedidos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        botonesVisibles(true, true, true, false, false);
        pedidoController = new PedidoController();
        pedidoController.registerObserver(this);
        lineasPedidoController = new LineasPedidoController();
        lineasPedidoController.registerObserver(this);
        clienteController = new ClienteController();
        empleadoController = new EmpleadoController();
        formaPagoController = new FormaPagoController();
        pedidosListModel = new PedidosListModel();
        jList1.setModel(pedidosListModel);
        lineasPedidoTableModel = new LineasPedidoTableModel();
        actualizarJlist();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTF_idPedido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox();
        jComboBoxEmpleado = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox_Presupuesto = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox_Pagado = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxFormaPago = new javax.swing.JComboBox();
        jDateChooser = new com.toedter.calendar.JDateChooser();
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
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButtonLineas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("id Pedido:");

        jTF_idPedido.setEditable(false);
        jTF_idPedido.setEnabled(false);

        jLabel2.setText("Fecha:");

        jLabel7.setText("Cliente:");

        jLabel8.setText("Empleado:");

        jComboBoxCliente.setEnabled(false);

        jComboBoxEmpleado.setEnabled(false);

        jLabel11.setText("Presupuesto:");

        jCheckBox_Presupuesto.setEnabled(false);

        jLabel13.setText("Pagado:");

        jCheckBox_Pagado.setEnabled(false);

        jLabel9.setText("Forma de pago:");

        jComboBoxFormaPago.setEnabled(false);

        jDateChooser.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox_Pagado)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTF_idPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox_Presupuesto))
                    .addComponent(jComboBoxEmpleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxCliente, 0, 170, Short.MAX_VALUE)
                    .addComponent(jComboBoxFormaPago, 0, 170, Short.MAX_VALUE)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTF_idPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_Presupuesto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jComboBoxEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jCheckBox_Pagado)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 390, 160));

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel12.setText("Lista de Pedidos");

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

        jButtonLimpiar.setText("Limpiar/Refrescar");
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
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnAtras)
                        .addGap(9, 9, 9)
                        .addComponent(btnSiguiente))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButtonLimpiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras)
                    .addComponent(btnSiguiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLimpiar)
                .addGap(26, 26, 26))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 170, 400));

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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 550, -1));

        jLabel14.setText("Lineas del pedido:");

        jButtonLineas.setText("Agregar/Modificar/Eliminar Lineas");
        jButtonLineas.setEnabled(false);
        jButtonLineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLineasActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Articulo", "Cantidad", "Precio Unidad", "Precio Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(102, 102, 102)
                        .addComponent(jButtonLineas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jButtonLineas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 500, 230));

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

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        jList1.clearSelection();
        activarCampos(true);
        limpiarCampos();
        cargarComboBoxClientes();
        cargarComboBoxEmpleados();
        cargarComboBoxFormaPago();
        botonesVisibles(false, false, false, true, true);
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        try {
            Pedido pedido;

            if (jTF_idPedido.getText().isEmpty()) {//Si es nuevo no lleva id porque se crea autoincrement en la bd:
                pedido = new Pedido((Cliente) listaClientes.get(jComboBoxCliente.getSelectedIndex()), (Empleado) listaEmpleados.get(jComboBoxEmpleado.getSelectedIndex()),
                        (FormaPago) listaFormaPago.get(jComboBoxFormaPago.getSelectedIndex()), jDateChooser.getDate(), jCheckBox_Presupuesto.isSelected(), jCheckBox_Pagado.isSelected(), null);

            } else {//Si es actualización lleva el id:
                pedido = new Pedido(Integer.parseInt(jTF_idPedido.getText()), (Cliente) listaClientes.get(jComboBoxCliente.getSelectedIndex()), (Empleado) listaEmpleados.get(jComboBoxEmpleado.getSelectedIndex()),
                        (FormaPago) listaFormaPago.get(jComboBoxFormaPago.getSelectedIndex()), jDateChooser.getDate(), jCheckBox_Presupuesto.isSelected(), jCheckBox_Pagado.isSelected());
            }
            pedidoController.guardar(pedido);
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
        if (jTF_idPedido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun pedido de la lista");
        } else {
            activarCampos(true);
            botonesVisibles(false, false, false, true, true);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        activarCampos(false);
        jList1ValueChanged(null);//Vuelve a poner en los campos el valor selecionado del jList.
        botonesVisibles(true, true, true, false, false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged

        if (jList1.isSelectionEmpty()) {
            limpiarCampos();
            jButtonLineas.setEnabled(false);
        } else {
            jButtonLineas.setEnabled(true);
            cargarComboBoxClientes();
            cargarComboBoxEmpleados();
            cargarComboBoxFormaPago();
            Pedido pedidoSelec = (Pedido) listaPedidos.get(jList1.getSelectedIndex());
            jTF_idPedido.setText(pedidoSelec.getIdPedido().toString());
            jComboBoxCliente.setSelectedItem(pedidoSelec.getCliente().getIdCliente() + "-" + pedidoSelec.getCliente().getNombre());
            jComboBoxEmpleado.setSelectedItem(pedidoSelec.getEmpleado().getIdEmpleado() + "-" + pedidoSelec.getEmpleado().getNombre());
            jComboBoxFormaPago.setSelectedItem(pedidoSelec.getFormaPago().getIdFormaPago() + "-" + pedidoSelec.getFormaPago().getDescripcion());
            jDateChooser.setDate(pedidoSelec.getFecha());
            jCheckBox_Pagado.setSelected(pedidoSelec.isPagado());
            jCheckBox_Presupuesto.setSelected(pedidoSelec.isPresupuesto());
            listaLineasPedido = pedidoSelec.getLineasPedidos();
            lineasPedidoTableModel.cargar(listaLineasPedido);
            jTable1.setModel(lineasPedidoTableModel);
            jTable1.setVisible(true);
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        try {
            if (jTF_idPedido.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun pedido de la lista");
            } else {
                int i = JOptionPane.showConfirmDialog(this, "¿Esta seguro de que quiere eliminar ese pedido?", "Eliminar Pedido", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (i == 0) {
                    pedidoController.eliminarPorId(Integer.parseInt(jTF_idPedido.getText()));
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

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        actualizarJlist();
        jList1.clearSelection();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonLineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLineasActionPerformed
        if (jTF_idPedido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun pedido de la lista");
        } else {
            VentanaLineasPedido ventanaLineasPedido = new VentanaLineasPedido(this, true, (Pedido) listaPedidos.get(jList1.getSelectedIndex()));
            ventanaLineasPedido.setVisible(true);
        }
    }//GEN-LAST:event_jButtonLineasActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        actualizarJlist();
        int index = jList1.getSelectedIndex();
        jList1.clearSelection();
        jList1.setSelectedIndex(index);
    }//GEN-LAST:event_formWindowActivated

    private void actualizarJlist() {
        HibernateUtil.openSessionAndBindToThread();
        try {
            listaPedidos = pedidoController.listaPedidos();
            pedidosListModel.cargar(listaPedidos);
        } catch (BussinessException be) {
            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {
                JOptionPane.showMessageDialog(null, bussinessMessage.toString());
            }
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }
    }

    private void cargarComboBoxClientes() {
        HibernateUtil.openSessionAndBindToThread();
        try {
            jComboBoxCliente.removeAllItems();
            listaClientes = clienteController.listaClientes();
            Iterator<Cliente> i = listaClientes.iterator();
            Cliente temp;
            while (i.hasNext()) {
                temp = i.next();
                jComboBoxCliente.addItem(temp.getIdCliente() + "-" + temp.getNombre());
            }
        } catch (BussinessException be) {
            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {
                JOptionPane.showMessageDialog(null, bussinessMessage.toString());
            }
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }
    }

    private void cargarComboBoxEmpleados() {
        HibernateUtil.openSessionAndBindToThread();
        try {
            jComboBoxEmpleado.removeAllItems();
            listaEmpleados = empleadoController.listaEmpleados();
            Iterator<Empleado> i = listaEmpleados.iterator();
            Empleado temp;
            while (i.hasNext()) {
                temp = i.next();
                jComboBoxEmpleado.addItem(temp.getIdEmpleado() + "-" + temp.getNombre());
            }
        } catch (BussinessException be) {
            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {
                JOptionPane.showMessageDialog(null, bussinessMessage.toString());
            }
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }
    }

    private void cargarComboBoxFormaPago() {
        HibernateUtil.openSessionAndBindToThread();
        try {
            jComboBoxFormaPago.removeAllItems();
            listaFormaPago = formaPagoController.listaFormaPagos();
            Iterator<FormaPago> i = listaFormaPago.iterator();
            FormaPago temp;
            while (i.hasNext()) {
                temp = i.next();
                jComboBoxFormaPago.addItem(temp.getIdFormaPago() + "-" + temp.getDescripcion());
            }
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
        jTable1.setEnabled(estado);
        for (Object obj : jPanel2.getComponents()) {
            if (obj instanceof JTextField) {
                JTextField temp = (JTextField) obj;
                if (temp != jTF_idPedido) {//El campo del id no quiero que se active.
                    temp.setEditable(estado);
                }
            }
            if (obj instanceof JComboBox) {
                JComboBox temp = (JComboBox) obj;
                temp.setEnabled(estado);
            }
            if (obj instanceof JCheckBox) {
                JCheckBox temp = (JCheckBox) obj;
                temp.setEnabled(estado);
            }
            if (obj instanceof JDateChooser) {
                JDateChooser temp = (JDateChooser) obj;
                temp.setEnabled(estado);
            }
        }
    }

    private void limpiarCampos() {
        jTable1.setVisible(false);
        for (Object obj : jPanel2.getComponents()) {
            if (obj instanceof JTextField) {
                JTextField temp = (JTextField) obj;
                temp.setText(null);
            }
            if (obj instanceof JComboBox) {
                JComboBox temp = (JComboBox) obj;
                temp.removeAllItems();
            }
            if (obj instanceof JCheckBox) {
                JCheckBox temp = (JCheckBox) obj;
                temp.setSelected(false);
            }
            if (obj instanceof JDateChooser) {
                JDateChooser temp = (JDateChooser) obj;
                temp.setDate(null);
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
            java.util.logging.Logger.getLogger(VentanaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaPedidos dialog = new VentanaPedidos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonLineas;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JCheckBox jCheckBox_Pagado;
    private javax.swing.JCheckBox jCheckBox_Presupuesto;
    private javax.swing.JComboBox jComboBoxCliente;
    private javax.swing.JComboBox jComboBoxEmpleado;
    private javax.swing.JComboBox jComboBoxFormaPago;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTF_idPedido;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Subject subject) {
        System.out.println("Por update: " + subject.getClass());
        if (subject instanceof PedidoController) {
            actualizarJlist();
        }
    }
}
