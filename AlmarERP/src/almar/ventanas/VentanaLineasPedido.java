package almar.ventanas;

import almar.controlador.ArticuloController;
import almar.controlador.LineasPedidoController;
import almar.excepciones.BussinessException;
import almar.excepciones.BussinessMessage;
import almar.entidades.Articulo;
import almar.entidades.LineasPedido;
import almar.entidades.LineasPedidoId;
import almar.entidades.Pedido;
import almar.listmodels.LineasPedidoListModel;
import hibernate.util.HibernateUtil;
import java.awt.Dialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import patronObserver.Subject;

/**
 *
 * @author Alberto
 */
public class VentanaLineasPedido extends javax.swing.JDialog implements patronObserver.Observer {

    private LineasPedidoController lineasPedidoController;
    private ArticuloController articuloController;
    private LineasPedidoListModel lineasPedidoListModel;
    private List listaLineasPedidos;
    private List listaArticulos;
    private Pedido pedido;

    public VentanaLineasPedido(Dialog owner, boolean modal, Pedido pedido) {
        super(owner, modal);
        this.pedido = pedido;//Pedido al que pertenece estas líneas.
        listaLineasPedidos = new ArrayList();
        initComponents();
        botonesVisibles(true, true, true, false, false);
        lineasPedidoController = new LineasPedidoController();
        lineasPedidoController.registerObserver(this);
        articuloController = new ArticuloController();
        lineasPedidoListModel = new LineasPedidoListModel();
        jList1.setModel(lineasPedidoListModel);
        actualizarJlist();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTF_idLineasPedido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTF_NumArticulos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxArticulo = new javax.swing.JComboBox();
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

        jLabel1.setText("id Linea:");

        jTF_idLineasPedido.setEditable(false);
        jTF_idLineasPedido.setEnabled(false);

        jLabel6.setText("Número de artículos:");

        jTF_NumArticulos.setEditable(false);

        jLabel7.setText("Artículo:");

        jComboBoxArticulo.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_idLineasPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_NumArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_idLineasPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_NumArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 390, 90));

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel12.setText("Lineas del pedido");

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
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonLimpiar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(btnAtras)
                        .addGap(9, 9, 9)
                        .addComponent(btnSiguiente)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras)
                    .addComponent(btnSiguiente))
                .addGap(1, 1, 1)
                .addComponent(jButtonLimpiar)
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 590, 260));

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
        cargarComboBoxArticulos();
        botonesVisibles(false, false, false, true, true);
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        try {
            LineasPedido lineasPedido;
            Set lista = pedido.getLineasPedidos();
            if (jTF_idLineasPedido.getText().isEmpty()) {//Si es nuevo no lleva id porque se crea autoincrement en la bd:
                lineasPedido = new LineasPedido(new LineasPedidoId(pedido.getIdPedido()), (Articulo) listaArticulos.get(jComboBoxArticulo.getSelectedIndex()), pedido, Integer.parseInt(jTF_NumArticulos.getText()));

            } else {//Si es actualización lleva el id:
                lineasPedido = new LineasPedido(new LineasPedidoId(Integer.parseInt(jTF_idLineasPedido.getText()), pedido.getIdPedido()), (Articulo) listaArticulos.get(jComboBoxArticulo.getSelectedIndex()), pedido, Integer.parseInt(jTF_NumArticulos.getText()));
                lista.remove(listaLineasPedidos.get(jList1.getSelectedIndex()));
            }
            lista.add(lineasPedido);
            pedido.setLineasPedidos(lista);
            lineasPedidoController.guardar(lineasPedido);

            jList1.clearSelection();
            actualizarJlist();
            jList1ValueChanged(null);//Vuelve a poner en los campos el valor selecionado del jList.
            botonesVisibles(true, true, true, false, false);
            activarCampos(false);
        } catch (BussinessException be) {
            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {
                JOptionPane.showMessageDialog(null, bussinessMessage.toString());
            }
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, ne.getMessage() + "\nCompruebe el numero de articulos, tiene que ser de tipo entero");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        if (jTF_idLineasPedido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna lineaPedido de la lista");
        } else {
            activarCampos(true);
            botonesVisibles(false, false, false, true, true);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        try {
            if (jTF_idLineasPedido.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna lineaPedido de la lista");
            } else {
                int i = JOptionPane.showConfirmDialog(this, "¿Esta seguro de que quiere eliminar esa lineaPedido?", "Eliminar LineaPedido", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (i == 0) {
                    LineasPedido linea = (LineasPedido) listaLineasPedidos.get(jList1.getSelectedIndex());
                    LineasPedidoId lineaId = linea.getId();
                    Set lista = pedido.getLineasPedidos();
                    lista.remove(listaLineasPedidos.get(jList1.getSelectedIndex()));
                    pedido.setLineasPedidos(lista);
                    actualizarJlist();
                    lineasPedidoController.eliminarPorId(lineaId.getIdLinea());
                    //lineasPedidoController.eliminarPorId(Integer.parseInt(jTF_idLineasPedido.getText()));//Anterior....
                    jList1.clearSelection();
                    jList1ValueChanged(null);//Vuelve a poner en los campos el valor selecionado del jList.
                }
            }
        } catch (BussinessException be) {
            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {
                JOptionPane.showMessageDialog(null, bussinessMessage.toString());
            }
        } catch (org.hibernate.TypeMismatchException ex) {
            //No funciona eliminar linea de la bd.
            System.out.println(ex.getMessage());
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
            cargarComboBoxArticulos();
            LineasPedido lineaPedidoSelec = (LineasPedido) listaLineasPedidos.get(jList1.getSelectedIndex());
            jTF_idLineasPedido.setText(lineaPedidoSelec.getId().toString());
            jTF_NumArticulos.setText("" + lineaPedidoSelec.getNumArticulos());
            jComboBoxArticulo.setSelectedItem(lineaPedidoSelec.getArticulo().getIdArticulo() + "-" + lineaPedidoSelec.getArticulo().getNombre());
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void actualizarJlist() {
        listaLineasPedidos.clear();
        listaLineasPedidos.addAll(pedido.getLineasPedidos());
        lineasPedidoListModel.cargar(listaLineasPedidos);
    }

    private void cargarComboBoxArticulos() {
        HibernateUtil.openSessionAndBindToThread();
        try {
            jComboBoxArticulo.removeAllItems();
            listaArticulos = articuloController.listaArticulos();
            Iterator<Articulo> i = listaArticulos.iterator();

            Articulo temp;
            while (i.hasNext()) {
                temp = i.next();
                jComboBoxArticulo.addItem(temp.getIdArticulo() + "-" + temp.getNombre());
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
        for (Object obj : jPanel2.getComponents()) {
            if (obj instanceof JTextField) {
                JTextField temp = (JTextField) obj;
                if (temp != jTF_idLineasPedido) {//El campo del id no quiero que se active.
                    temp.setEditable(estado);
                }
            }
            if (obj instanceof JComboBox) {
                JComboBox temp = (JComboBox) obj;
                temp.setEnabled(estado);
            }
        }
    }

    private void limpiarCampos() {
        for (Object obj : jPanel2.getComponents()) {
            if (obj instanceof JTextField) {
                JTextField temp = (JTextField) obj;
                temp.setText(null);
            }
            if (obj instanceof JComboBox) {
                JComboBox temp = (JComboBox) obj;
                temp.removeAllItems();
            }
        }
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
    private javax.swing.JComboBox jComboBoxArticulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTF_NumArticulos;
    private javax.swing.JTextField jTF_idLineasPedido;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Subject subject) {
        if (subject instanceof LineasPedidoController) {
            actualizarJlist();
        }
    }
}
