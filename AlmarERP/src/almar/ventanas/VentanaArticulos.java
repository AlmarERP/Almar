package almar.ventanas;

import almar.listmodels.ArticulosListModel;
import almar.controlador.ArticuloController;
import almar.controlador.CategoriaController;
import almar.controlador.ProveedorController;
import almar.excepciones.BussinessException;
import almar.excepciones.BussinessMessage;
import almar.entidades.Articulo;
import almar.entidades.Categoria;
import almar.entidades.Proveedor;
import hibernate.util.HibernateUtil;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import patronObserver.Subject;

/**
 *
 * @author Alberto
 */
public class VentanaArticulos extends javax.swing.JDialog implements patronObserver.Observer {

    private ArticuloController articuloController;
    private CategoriaController categoriaController;
    private ProveedorController proveedorController;
    private ArticulosListModel articulosListModel;
    private List listaArticulos;
    private List listaCategorias;
    private List listaProveedores;

    private int longitudBytes;
    private FileInputStream fis;
    private JFileChooser fc;

    public VentanaArticulos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        botonesVisibles(true, true, true, false, false, false);
        articuloController = new ArticuloController();
        articuloController.registerObserver(this);
        categoriaController = new CategoriaController();
        proveedorController = new ProveedorController();
        articulosListModel = new ArticulosListModel();
        jList1.setModel(articulosListModel);
        actualizarJlist();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTF_idArticulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTF_CodFab = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF_Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTF_Precio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTF_Stock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxCategoria = new javax.swing.JComboBox();
        jComboBoxProveedor = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTA_Descripcion = new javax.swing.JTextArea();
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
        jButtonBuscar = new javax.swing.JButton();
        jTextBuscar = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jBtnSubirFoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("id Artículo:");

        jTF_idArticulo.setEditable(false);
        jTF_idArticulo.setEnabled(false);

        jLabel2.setText("Cod. Fabricante:");

        jTF_CodFab.setEditable(false);

        jLabel3.setText("Nombre:");

        jTF_Nombre.setEditable(false);

        jLabel4.setText("Precio:");

        jTF_Precio.setEditable(false);

        jLabel5.setText("Descripción:");

        jLabel6.setText("Stock:");

        jTF_Stock.setEditable(false);

        jLabel7.setText("Categoría:");

        jLabel8.setText("Proveedor:");

        jComboBoxCategoria.setEnabled(false);

        jComboBoxProveedor.setEnabled(false);

        jTA_Descripcion.setEditable(false);
        jTA_Descripcion.setColumns(20);
        jTA_Descripcion.setRows(5);
        jScrollPane2.setViewportView(jTA_Descripcion);

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
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTF_idArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.Alignment.LEADING, 0, 170, Short.MAX_VALUE)
                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTF_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_CodFab, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
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
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTF_idArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_CodFab, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTF_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTF_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 400, 320));

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel12.setText("Lista de Artículos");

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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel12))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButtonLimpiar))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnAtras)
                                        .addGap(9, 9, 9)
                                        .addComponent(btnSiguiente)))))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLimpiar)
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 180, 400));

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
                .addContainerGap(28, Short.MAX_VALUE))
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

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 550, -1));

        jPanel5.setLayout(new java.awt.GridLayout(1, 2, 40, 0));

        jButtonBuscar.setText("Buscar Por Nombre");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonBuscar);

        jTextBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextBuscarKeyPressed(evt);
            }
        });
        jPanel5.add(jTextBuscar);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 360, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 530));

        jBtnSubirFoto.setText("Subir Foto");
        jBtnSubirFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubirFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jBtnSubirFoto)
                        .addGap(70, 70, 70))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnSubirFoto)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, 190));

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
        cargarComboBoxCategorias();
        cargarComboBoxProveedores();
        botonesVisibles(false, false, false, true, true, true);
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        try {
            Articulo articulo;
            if (jTF_idArticulo.getText().isEmpty()) {//Si es nuevo no lleva id porque se crea autoincrement en la bd:
                articulo = new Articulo((Categoria) listaCategorias.get(jComboBoxCategoria.getSelectedIndex()), (Proveedor) listaProveedores.get(jComboBoxProveedor.getSelectedIndex()), jTF_CodFab.getText(), Integer.parseInt(jTF_Stock.getText()), jTF_Nombre.getText(), Integer.parseInt(jTF_Precio.getText()), jTA_Descripcion.getText(), null);

            } else {//Si es actualización lleva el id:
                articulo = new Articulo(Integer.parseInt(jTF_idArticulo.getText()), (Categoria) listaCategorias.get(jComboBoxCategoria.getSelectedIndex()), (Proveedor) listaProveedores.get(jComboBoxProveedor.getSelectedIndex()), jTF_CodFab.getText(), Integer.parseInt(jTF_Stock.getText()), jTF_Nombre.getText(), Integer.parseInt(jTF_Precio.getText()), jTA_Descripcion.getText());
            }
            articuloController.guardar(articulo);
            if (jLabelFoto.getIcon() != null && fc != null) {
                copiarImagen(articulo.getIdArticulo());
            }

            jList1.clearSelection();
            jList1ValueChanged(null);//Vuelve a poner en los campos el valor selecionado del jList.
            botonesVisibles(true, true, true, false, false, false);
            activarCampos(false);
        } catch (BussinessException be) {
            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {
                JOptionPane.showMessageDialog(null, bussinessMessage.toString());
            }
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, ne.getMessage() + "\nCompruebe el precio y el stock, son obligatorios y tienen que ser de tipo enteros");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        if (jTF_idArticulo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun articulo de la lista");
        } else {
            activarCampos(true);
            botonesVisibles(false, false, false, true, true, true);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        try {
            if (jTF_idArticulo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun articulo de la lista");
            } else {
                int i = JOptionPane.showConfirmDialog(this, "¿Esta seguro de que quiere eliminar ese articulo?", "Eliminar Articulo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (i == 0) {
                    articuloController.eliminarPorId(Integer.parseInt(jTF_idArticulo.getText()));
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
        botonesVisibles(true, true, true, false, false, false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        if (jList1.isSelectionEmpty()) {
            limpiarCampos();
        } else {
            cargarComboBoxCategorias();
            cargarComboBoxProveedores();
            Articulo articuloSelec = (Articulo) listaArticulos.get(jList1.getSelectedIndex());
            jTF_idArticulo.setText(articuloSelec.getIdArticulo().toString());
            jTF_CodFab.setText(articuloSelec.getCodFabricante());
            jTF_Nombre.setText(articuloSelec.getNombre());
            jTF_Precio.setText("" + articuloSelec.getPrecio());
            jTA_Descripcion.setText(articuloSelec.getDescripcion());
            jTF_Stock.setText("" + articuloSelec.getStock());
            jComboBoxCategoria.setSelectedItem(articuloSelec.getCategoria().getIdCategoria() + "-" + articuloSelec.getCategoria().getNombre());
            jComboBoxProveedor.setSelectedItem(articuloSelec.getProveedor().getIdProveedor() + "-" + articuloSelec.getProveedor().getNombre());
            mostrarImagen(articuloSelec);
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void mostrarImagen(Articulo articuloSelec) {
        try {
            //Para que cambie la imagen según el id
            String ruta = System.getProperty("user.dir") + "\\img\\articulos\\" + articuloSelec.getIdArticulo() + ".jpg";
            System.out.println("Ruta cambia imagen= " + ruta);
            //Redimensionar la imagen para mostrarla en el label
            File archivo = new File(ruta);
            if (archivo.isFile()) {
                Image imagen = ImageIO.read(archivo).getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_DEFAULT);
                jLabelFoto.setIcon(new ImageIcon(imagen));
                jLabelFoto.updateUI();
            } else {
                //si no tiene imagen asociada limpia el label
                jLabelFoto.setIcon(null);
            }
        } catch (IOException ex) {
            Logger.getLogger(VentanaArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        if (jTextBuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de búsqueda está vacío");
        } else {
            buscarArticulo();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void buscarArticulo() {
        try {
            int index = articuloController.buscarArticulo(listaArticulos, jTextBuscar.getText());//Obtenemos el indice del artículo a buscar si es -1 es que no existe.
            if (index == -1) {
                JOptionPane.showMessageDialog(this, "No se ha encontrado el artículo " + jTextBuscar.getText());
            } else {//Muestra el articulo.
                jList1.setSelectedIndex(index);
            }
            jTextBuscar.setText("");
        } catch (BussinessException ex) {
            for (BussinessMessage bussinessMessage : ex.getBussinessMessages()) {
                JOptionPane.showMessageDialog(null, bussinessMessage.toString());
            }
        }
    }

    private void jBtnSubirFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubirFotoActionPerformed
        fc = new JFileChooser(System.getProperty("user.dir") + "\\imgPruebas");// Creo el seleccionador de archivos y le digo la ruta que quiero que aparezca por defecto al abrirlo.
        //Un filtro para que solo podamos subir imagenes jpg
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de imagen", "jpg");
        fc.setFileFilter(filtro);

        //Que solo pueda coger archivos y no carpetas
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int opcion = fc.showOpenDialog(this);

        //Si le da a aceptar
        if (opcion == JFileChooser.APPROVE_OPTION) {
            //Guardar imagen en la ruta especificada:
            try {
                //Capturamos el archivo
                fis = new FileInputStream(fc.getSelectedFile());
                //y la longitud en bytes
                this.longitudBytes = (int) fc.getSelectedFile().length();
                //Redimensionar la imagen para mostrarla en el label
                Image icono = ImageIO.read(fc.getSelectedFile()).getScaledInstance(jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_DEFAULT);
                jLabelFoto.setIcon(new ImageIcon(icono));
                jLabelFoto.updateUI();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error, no se encuentra el archivo");

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_jBtnSubirFotoActionPerformed

    private void jTextBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarKeyPressed

        char car = evt.getKeyChar();//Obtenemos el caracter que pulsamos.
        if (car == (char) KeyEvent.VK_ENTER) {//Si es enter ejecutamos el boton buscar.
            jButtonBuscarActionPerformed(null);
            evt.consume();//Para que no haga salto de línea al pulsar enter.
        }
    }//GEN-LAST:event_jTextBuscarKeyPressed
    private void copiarImagen(int id) {

        //Si se ha seleccionado una imagen la guarda
        if (fc.getSelectedFile().getPath() != null) {
            //Ruta a donde se va a copiar la imagen seleccionada en el jFileChooser
            String ruta = System.getProperty("user.dir") + "\\img\\articulos\\" + id + ".jpg";
            System.out.println("Ruta donde se guardará la imagen: " + ruta);

            File origen = new File(fc.getSelectedFile().getPath());
            File destino = new File(ruta);

            System.out.println("Origen de la imagen: " + origen);
            System.out.println("Destino: " + destino);

            InputStream in;
            OutputStream out;
            byte[] buf;
            int len;
            try {
                in = new FileInputStream(origen);
                out = new FileOutputStream(destino);
                buf = new byte[1024];
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                in.close();
                out.close();

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Archivo no encontrado");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error de entrada o salida");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Artículo guardado sin imagen");
        }
    }

    private void actualizarJlist() {
        HibernateUtil.openSessionAndBindToThread();
        try {
            listaArticulos = articuloController.listaArticulos();
            articulosListModel.cargar(listaArticulos);

        } catch (BussinessException be) {
            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {
                JOptionPane.showMessageDialog(null, bussinessMessage.toString());
            }
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }
    }

    private void cargarComboBoxCategorias() {
        HibernateUtil.openSessionAndBindToThread();
        try {
            jComboBoxCategoria.removeAllItems();
            listaCategorias = categoriaController.listaCategorias();
            Iterator<Categoria> i = listaCategorias.iterator();

            Categoria temp;
            while (i.hasNext()) {
                temp = i.next();
                jComboBoxCategoria.addItem(temp.getIdCategoria() + "-" + temp.getNombre());
            }
        } catch (BussinessException be) {
            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {
                JOptionPane.showMessageDialog(null, bussinessMessage.toString());
            }
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }
    }

    private void cargarComboBoxProveedores() {
        HibernateUtil.openSessionAndBindToThread();
        try {
            jComboBoxProveedor.removeAllItems();
            listaProveedores = proveedorController.listaProveedores();
            Iterator<Proveedor> i = listaProveedores.iterator();

            Proveedor temp;
            while (i.hasNext()) {
                temp = i.next();
                jComboBoxProveedor.addItem(temp.getIdProveedor() + "-" + temp.getNombre());
            }
        } catch (BussinessException be) {
            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {
                JOptionPane.showMessageDialog(null, bussinessMessage.toString());
            }
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }
    }

    private void botonesVisibles(boolean nuevo, boolean modificar, boolean eliminar, boolean guardar, boolean cancelar, boolean foto) {
        jButtonNuevo.setVisible(nuevo);
        jButtonModificar.setVisible(modificar);
        jButtonEliminar.setVisible(eliminar);
        jButtonGuardar.setVisible(guardar);
        jButtonCancelar.setVisible(cancelar);
        jBtnSubirFoto.setVisible(foto);
    }

    private void activarCampos(boolean estado) {
        jTA_Descripcion.setEditable(estado);
        for (Object obj : jPanel2.getComponents()) {
            if (obj instanceof JTextField) {
                JTextField temp = (JTextField) obj;
                if (temp != jTF_idArticulo) {//El campo del id no quiero que se active.
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
        jLabelFoto.setIcon(null);
        jTA_Descripcion.setText(null);
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
    private javax.swing.JButton jBtnSubirFoto;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JComboBox jComboBoxCategoria;
    private javax.swing.JComboBox jComboBoxProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTA_Descripcion;
    private javax.swing.JTextField jTF_CodFab;
    private javax.swing.JTextField jTF_Nombre;
    private javax.swing.JTextField jTF_Precio;
    private javax.swing.JTextField jTF_Stock;
    private javax.swing.JTextField jTF_idArticulo;
    private javax.swing.JTextField jTextBuscar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Subject subject) {
        if (subject instanceof ArticuloController) {
            actualizarJlist();
        }
    }
}
