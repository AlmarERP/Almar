package almar.ventanas;

import almar.entidades.Usuario;
import javax.swing.ImageIcon;

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
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemEmpleados = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuItemProveedoresç = new javax.swing.JMenuItem();
        jMenuItemCategorias = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

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

        jMenu1.setText("Archivo");

        jMenuItemEmpleados.setText("Empleados");
        jMenuItemEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmpleadosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemEmpleados);

        jMenuItemUsuarios.setText("Usuarios");
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemUsuarios);

        jMenuItemProveedoresç.setText("Proveedores");
        jMenuItemProveedoresç.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProveedoresçActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemProveedoresç);

        jMenuItemCategorias.setText("Categorias");
        jMenuItemCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoriasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCategorias);

        jMenuItem1.setText("Artículos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Formas de pago");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Pedidos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");
        jMenuBar1.add(jMenu3);

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
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmpleadosActionPerformed
        VentanaEmpleados ventanaEmpleados = new VentanaEmpleados(this, true);
        ventanaEmpleados.setVisible(true);
    }//GEN-LAST:event_jMenuItemEmpleadosActionPerformed

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
        VentanaUsuarios ventanaUsuarios = new VentanaUsuarios(this, true);
        ventanaUsuarios.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void jMenuItemProveedoresçActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProveedoresçActionPerformed
        VentanaProveedores ventanaProveedores = new VentanaProveedores(this, true);
        ventanaProveedores.setVisible(true);
    }//GEN-LAST:event_jMenuItemProveedoresçActionPerformed

    private void jMenuItemCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoriasActionPerformed
        VentanaCategorias ventanaCategorias = new VentanaCategorias(this, true);
        ventanaCategorias.setVisible(true);
    }//GEN-LAST:event_jMenuItemCategoriasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VentanaArticulos ventanaArticulos = new VentanaArticulos(this, true);
        ventanaArticulos.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VentanaClientes ventanaClientes = new VentanaClientes(this, true);
        ventanaClientes.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        VentanaFormasDePago ventanaFormasDePago = new VentanaFormasDePago(this, true);
        ventanaFormasDePago.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        VentanaPedidos ventanaPedidos = new VentanaPedidos(this, true);
        ventanaPedidos.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemCategorias;
    private javax.swing.JMenuItem jMenuItemEmpleados;
    private javax.swing.JMenuItem jMenuItemProveedoresç;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
