package vista.popups;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 * Esta clase es tratada como un popup la gestion de un usuario
 */
public class Visual_GestionUsuario extends javax.swing.JFrame {

    int xMouse, yMouse;
    private Usuario usuario;

    /**
     * Constructor de la clase.
     *
     * @param usuario El usuario a gestionar.
     */
    public Visual_GestionUsuario(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        informacionUsuario();
        CargarImagen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        superiorTab = new javax.swing.JPanel();
        btn_Exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBlanquearContra = new javax.swing.JPanel();
        txtBlanquearContra = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        superiorTab.setBackground(new java.awt.Color(255, 255, 255));
        superiorTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        superiorTab.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                superiorTabMouseDragged(evt);
            }
        });
        superiorTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                superiorTabMousePressed(evt);
            }
        });

        btn_Exit.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_Exit.setForeground(new java.awt.Color(255, 0, 51));
        btn_Exit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Exit.setText("X");
        btn_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout superiorTabLayout = new javax.swing.GroupLayout(superiorTab);
        superiorTab.setLayout(superiorTabLayout);
        superiorTabLayout.setHorizontalGroup(
            superiorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, superiorTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        superiorTabLayout.setVerticalGroup(
            superiorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Exit)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(120, 120));

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgperf/DefaultProfilePic.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Documento:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Correo electronico:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Estado:");

        btnBlanquearContra.setBackground(new java.awt.Color(153, 204, 255));
        btnBlanquearContra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBlanquearContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBlanquearContraMouseClicked(evt);
            }
        });

        txtBlanquearContra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBlanquearContra.setText("Blanquear Contraseña");

        javax.swing.GroupLayout btnBlanquearContraLayout = new javax.swing.GroupLayout(btnBlanquearContra);
        btnBlanquearContra.setLayout(btnBlanquearContraLayout);
        btnBlanquearContraLayout.setHorizontalGroup(
            btnBlanquearContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBlanquearContraLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtBlanquearContra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        btnBlanquearContraLayout.setVerticalGroup(
            btnBlanquearContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBlanquearContraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBlanquearContra)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cambiar estado del usuario");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jLabel8.setBackground(new java.awt.Color(234, 230, 230));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("GESTION DE USUARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBlanquearContra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBlanquearContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(superiorTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(superiorTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo para mostrar la informacion del usuario en la interfaz.
     */
    private void informacionUsuario() {
        jLabel3.setText("Documento: " + usuario.getDocumento());
        jLabel2.setText("Nombre: " + usuario.getNombre());
        jLabel4.setText("Correo: " + usuario.getMail());
        if (usuario.isCuentaDeshabilitada()) {
            jLabel5.setText("Estado: DESHABILITADO");
        } else {
            jLabel5.setText("Estado: HABILITADO");
        }
    }

    /**
     * Boton para cerrar la ventana.
     *
     * @param evt Evento de clic del mouse.
     */
    private void btn_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExitMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btn_ExitMouseClicked
    /**
     * Metodo que permite que la ventana pueda ser arrastrada.
     *
     * @param evt Evento de movimiento del mouse.
     */
    private void superiorTabMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorTabMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_superiorTabMouseDragged
    /**
     * Metodo para almacenar la posición del mouse cuando se presiona la
     * ventana. (Necesario para poder utilizar el metodo anterior)
     *
     * @param evt Evento de clic del mouse.
     */
    private void superiorTabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorTabMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_superiorTabMousePressed
    /**
     * Boton para cambiar el estado del usuario.
     *
     * @param evt El evento de clic.
     */
    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        Gestion_CambiarEstadoUsuario AgregarComentario = new Gestion_CambiarEstadoUsuario(this.usuario);
        AgregarComentario.setVisible(true);
        AgregarComentario.setLocationRelativeTo(null);
    }//GEN-LAST:event_jPanel3MouseClicked
    /**
     * Boton para blanquear la contraseña.
     *
     * @param evt El evento de clic.
     */
    private void btnBlanquearContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBlanquearContraMouseClicked
        int resp = JOptionPane.showConfirmDialog(rootPane, "Si usted continua, la contraseña se restaurara a su valor por defecto", "Atencion", JOptionPane.OK_CANCEL_OPTION, 2);
        if (JOptionPane.OK_OPTION == resp) {
            usuario.setDebeCambiarContrasenia(true);
            usuario.setPass(usuario.getDocumento());
            JOptionPane.showMessageDialog(null, "Contraseña blanqueada correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBlanquearContraMouseClicked
    /**
     * Metodo para cargar la imagen de perfil del usuario.
     */
    private void CargarImagen() {
        String Direccion_Imagen_Perfil = this.usuario.getDocumento() + "ProfilePic.png";

        File DireccionDeImagen = new File(Direccion_Imagen_Perfil);
        if (DireccionDeImagen.exists()) {
            try {
                BufferedImage img = RedimensionarImagen(ImageIO.read(DireccionDeImagen));
                if (img != null) {
                    ImageIcon icon = new ImageIcon(img);
                    foto.setIcon(icon);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(rootPane, "Error al cargar la imagen de perfil", "ERROR", 2);
            }
        }
    }

    /**
     * Metodo para redimensionar una imagen a un tamaño especifico.
     *
     * @param ImagenOriginal La imagen original a redimensionar.
     * @return La imagen redimensionada.
     */
    private BufferedImage RedimensionarImagen(BufferedImage ImagenOriginal) {
        Image ImagenFinal = ImagenOriginal.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        BufferedImage ImagenDeSalida = new BufferedImage(150, 150, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = ImagenDeSalida.createGraphics();
        g2d.drawImage(ImagenFinal, 0, 0, null);
        g2d.dispose();
        return ImagenDeSalida;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBlanquearContra;
    private javax.swing.JLabel btn_Exit;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel superiorTab;
    private javax.swing.JLabel txtBlanquearContra;
    // End of variables declaration//GEN-END:variables
}
