package almar.ventanas;

import almar.entidades.Usuario;
import almar.controlador.UsuarioController;
import almar.excepciones.BussinessException;
import almar.excepciones.BussinessMessage;
import hibernate.util.HibernateUtil;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto
 */
public class VentanaLogin extends javax.swing.JFrame {

    Usuario usuario;

    public VentanaLogin() {
        initComponents();
        HibernateUtil.buildSessionFactory();
        usuario = new Usuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelWeb = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Almar-ERP Login");
        setIconImage(new ImageIcon(this.getClass().getResource("/imagenes/icono.png")).getImage());
        setUndecorated(true);
        setResizable(false);

        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanelPrincipal.setOpaque(false);
        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(800, 533));
        jPanelPrincipal.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/qrcode .png"))); // NOI18N
        jPanelPrincipal.add(jLabel5);
        jLabel5.setBounds(40, 350, 100, 100);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Iniciar Sesión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 50, 70, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(75, 90, 90, 20);
        jPanel1.add(jTextFieldNombre);
        jTextFieldNombre.setBounds(180, 50, 120, 20);

        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(jPassword);
        jPassword.setBounds(180, 90, 120, 20);

        jLabel4.setFont(new java.awt.Font("Gautami", 0, 14)); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(82, 128, 235, 0);

        jButtonEntrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonEntrar.setContentAreaFilled(false);
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEntrar);
        jButtonEntrar.setBounds(100, 140, 80, 30);

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalir);
        jButtonSalir.setBounds(220, 140, 80, 30);

        jPanelPrincipal.add(jPanel1);
        jPanel1.setBounds(200, 170, 400, 200);

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 150));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 153, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 10, 200, 106);

        jPanelPrincipal.add(jPanel2);
        jPanel2.setBounds(300, 36, 210, 110);

        jPanel4.setOpaque(false);

        jLabelWeb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelWeb.setText("<html><a href=\\\"http://www.almar-erp.es/\\\" style=text-decoration:none;color:green>www.almar-erp.es</a></html> ");
        jLabelWeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelWebMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelWebMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelWebMouseExited(evt);
            }
        });
        jPanel4.add(jLabelWeb);

        jPanelPrincipal.add(jPanel4);
        jPanel4.setBounds(20, 450, 130, 30);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_cocina.jpg"))); // NOI18N
        jPanelPrincipal.add(fondo);
        fondo.setBounds(0, 0, 800, 533);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_jButtonEntrarActionPerformed


    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyPressed
        char car = evt.getKeyChar();//Obtenemos el caracter que pulsamos.
        if (car == (char) KeyEvent.VK_ENTER) {//Si es enter ejecutamos el metodo de inicio de sesión.
            iniciarSesion();
        }
    }//GEN-LAST:event_jPasswordKeyPressed

    private void jLabelWebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelWebMouseClicked
        lanzarWeb();
    }//GEN-LAST:event_jLabelWebMouseClicked

    private void jLabelWebMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelWebMouseEntered
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cambiarColorEnlaceWeb("cyan");
    }//GEN-LAST:event_jLabelWebMouseEntered

    private void jLabelWebMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelWebMouseExited
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        cambiarColorEnlaceWeb("green");
    }//GEN-LAST:event_jLabelWebMouseExited

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

    /**
     * Si el usuario es correcto inicia sesión si no muestra un mensaje.
     *
     * @throws HeadlessException
     */
    private void iniciarSesion() {
        if (validarUsuario(jTextFieldNombre.getText(), new String(jPassword.getPassword()))) {
            JOptionPane.showMessageDialog(this, "<html><p style=\"color:green\">Hola usuario " + usuario.getNombre() + "</p></html>", "Almar-ERP", JOptionPane.PLAIN_MESSAGE);
            lanzarVentanaPrincipal();
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el usuario o la contraseña es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            jPassword.setText(null);
        }
    }

    private void lanzarVentanaPrincipal() {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(usuario);
        ventanaPrincipal.setVisible(true);
    }

    /**
     * Valida que el nombre y password introducido esté correctamente.
     *
     * @param nombre
     * @param password
     * @return
     */
    private boolean validarUsuario(String nombre, String password) {
        HibernateUtil.openSessionAndBindToThread();
        UsuarioController usuarioController;
        this.usuario = null;
        try {
            usuarioController = new UsuarioController();
            this.usuario = usuarioController.buscarPorLogin(nombre, password);

            if (usuario != null) {
                return true;
            }

        } catch (BussinessException be) {
            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {

                JOptionPane.showMessageDialog(null, "<html><h3 style=\"color:green\">Se han producido los siguientes errores</h3></html> \n" + bussinessMessage.getMessage() + "\nLa aplicación se cerrará, pongase en contacto con el desarrollador.", "Excepción", JOptionPane.ERROR_MESSAGE);
                System.exit(-1);//Cerrar aplicación, se usa '-1' cuando se quiere indicar al S.O. que se ha producido un error de ejecución.
            }
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }
        return false;
    }

    private void lanzarWeb() throws HeadlessException {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    desktop.browse(new URI("http://localhost:8000/login/?next=/"));
                }
            }
        } catch (URISyntaxException | IOException e) {
            JOptionPane.showMessageDialog(null, "<html><h3 style=\"color:green\">Se han producido los siguientes errores</h3></html> \n" + e.getMessage(), "Excepción", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cambiarColorEnlaceWeb(String color) {
        jLabelWeb.setText("<html><a href=\"http://www.almar-erp.es/\" style=\"color:" + color + "\">www.almar-erp.es</a></html>");
    }

}
