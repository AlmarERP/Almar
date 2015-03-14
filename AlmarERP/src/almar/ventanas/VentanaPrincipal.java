package almar.ventanas;

import almar.entidades.Usuario;
import java.awt.HeadlessException;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Usuario usuario;

    public VentanaPrincipal(Usuario usuario) {
        this.usuario = usuario;
        this.setExtendedState(MAXIMIZED_BOTH);//Iniciar maximizado
        initComponents();
        if (!usuario.isAdmin()) {//Si no es admin oculta usuarios.
            jMenuItemUsuarios.setVisible(false);
            jMenuItemEmpleados.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemEmpleados = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuItemCategorias = new javax.swing.JMenuItem();
        jMenuItemFormasDePago = new javax.swing.JMenuItem();
        jMenuMantenimiento = new javax.swing.JMenu();
        jMenuItemArticulos = new javax.swing.JMenuItem();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemProveedores = new javax.swing.JMenuItem();
        jMenuProcesos = new javax.swing.JMenu();
        jMenuItemPedidos = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Almar-ERP");
        setIconImage(new ImageIcon(this.getClass().getResource("/imagenes/icono.png")).getImage());
        setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(740, 320, 200, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_empresa.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 11, 1440, 743);

        jMenuArchivo.setText("Archivo");

        jMenuItemEmpleados.setText("Empleados");
        jMenuItemEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmpleadosActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemEmpleados);

        jMenuItemUsuarios.setText("Usuarios");
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemUsuarios);

        jMenuItemCerrarSesion.setText("Cerrar Sesión");
        jMenuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemCerrarSesion);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuEditar.setText("Editar");

        jMenuItemCategorias.setText("Categorias");
        jMenuItemCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoriasActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemCategorias);

        jMenuItemFormasDePago.setText("Formas de pago");
        jMenuItemFormasDePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFormasDePagoActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemFormasDePago);

        jMenuBar1.add(jMenuEditar);

        jMenuMantenimiento.setText("Mantenimiento");

        jMenuItemArticulos.setText("Artículos");
        jMenuItemArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemArticulosActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemArticulos);

        jMenuItemClientes.setText("Clientes");
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemClientes);

        jMenuItemProveedores.setText("Proveedores");
        jMenuItemProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProveedoresActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemProveedores);

        jMenuBar1.add(jMenuMantenimiento);

        jMenuProcesos.setText("Procesos");

        jMenuItemPedidos.setText("Pedidos");
        jMenuItemPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPedidosActionPerformed(evt);
            }
        });
        jMenuProcesos.add(jMenuItemPedidos);

        jMenuBar1.add(jMenuProcesos);

        jMenuAyuda.setText("Ayuda");
        jMenuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAyudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Se cerrará el programa ¿Está seguro?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (i == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmpleadosActionPerformed
        VentanaEmpleados ventanaEmpleados = new VentanaEmpleados(this, true);
        ventanaEmpleados.setVisible(true);
    }//GEN-LAST:event_jMenuItemEmpleadosActionPerformed

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
        VentanaUsuarios ventanaUsuarios = new VentanaUsuarios(this, true);
        ventanaUsuarios.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void jMenuItemProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProveedoresActionPerformed
        VentanaProveedores ventanaProveedores = new VentanaProveedores(this, true);
        ventanaProveedores.setVisible(true);
    }//GEN-LAST:event_jMenuItemProveedoresActionPerformed

    private void jMenuItemCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoriasActionPerformed
        VentanaCategorias ventanaCategorias = new VentanaCategorias(this, true);
        ventanaCategorias.setVisible(true);
    }//GEN-LAST:event_jMenuItemCategoriasActionPerformed

    private void jMenuItemArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemArticulosActionPerformed
        VentanaArticulos ventanaArticulos = new VentanaArticulos(this, true);
        ventanaArticulos.setVisible(true);
    }//GEN-LAST:event_jMenuItemArticulosActionPerformed

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesActionPerformed
        VentanaClientes ventanaClientes = new VentanaClientes(this, true);
        ventanaClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    private void jMenuItemFormasDePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFormasDePagoActionPerformed
        VentanaFormasDePago ventanaFormasDePago = new VentanaFormasDePago(this, true);
        ventanaFormasDePago.setVisible(true);
    }//GEN-LAST:event_jMenuItemFormasDePagoActionPerformed

    private void jMenuItemPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPedidosActionPerformed
        VentanaPedidos ventanaPedidos = new VentanaPedidos(this, true);
        ventanaPedidos.setVisible(true);
    }//GEN-LAST:event_jMenuItemPedidosActionPerformed

    private void jMenuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarSesionActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "Se cerrará la sesión actual, ¿Está seguro?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (i == 0) {
            new VentanaLogin().setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jMenuItemCerrarSesionActionPerformed

    private void jMenuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAyudaMouseClicked
        abrirDocumentacion();
    }//GEN-LAST:event_jMenuAyudaMouseClicked

    private void abrirDocumentacion() throws HeadlessException {
        String ruta = System.getProperty("user.dir") + "\\doc\\ayuda.pdf";
        File f = new File(ruta);
        if (f.exists()) {
            try {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + ruta);
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "No existe\n" + ruta, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenuItem jMenuItemArticulos;
    private javax.swing.JMenuItem jMenuItemCategorias;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemEmpleados;
    private javax.swing.JMenuItem jMenuItemFormasDePago;
    private javax.swing.JMenuItem jMenuItemPedidos;
    private javax.swing.JMenuItem jMenuItemProveedores;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenu jMenuMantenimiento;
    private javax.swing.JMenu jMenuProcesos;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
