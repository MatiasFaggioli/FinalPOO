package vista.popups;

import modelo.Usuario;
import javax.swing.JOptionPane;
import vista.*;
import modelo.*;

/**
 * Esta clase es tratada como un popup para que un usuario pueda cambiar su
 * contraseña. Extiende JFrame y contiene componentes para la entrada de la
 * nueva contraseña y su confirmación.
 *
 */
public class Visual_CambiarContraseña extends javax.swing.JFrame {

    private final Usuario usuario;
    private final Instituto insti;
    int xMouse, yMouse;

    /**
     * Constructor que inicializa la interfaz y los datos del usuario.
     *
     * @param usuario Usuario que cambiará su contraseña.
     * @param insti Instituto asociado al usuario.
     */
    public Visual_CambiarContraseña(Usuario usuario, Instituto insti) {
        initComponents();
        this.usuario = usuario;
        this.insti = insti;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        superiorTab = new javax.swing.JPanel();
        btn_Exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nuevaPassField = new javax.swing.JPasswordField();
        confirmarPassField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        jPanel1.setBackground(new java.awt.Color(234, 230, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nuevaPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaPassFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Nueva Contraseña");

        jLabel2.setText("Confirmar contraseña");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Confirmar");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(nuevaPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(confirmarPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(nuevaPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(confirmarPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(superiorTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(superiorTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     /**
     * Muestra la vista correspondiente al usuario despues de cambiar la
     * contraseña.
     *
     * @param aux Usuario que se va a mostrar en la vista correspondiente.
     */
    public void mostrarVisual(Usuario aux) {
        if (aux.soyAlumno()) {
            Visual_Alumno visual = new Visual_Alumno((Alumno) aux, insti);
            visual.setVisible(true);
            visual.setLocationRelativeTo(null);
        } else if (aux.soyProfesor()) {
            Visual_Profesor visual = new Visual_Profesor((Profesor) aux, insti);
            visual.setVisible(true);
            visual.setLocationRelativeTo(null);
        }
    }

    /**
     * Cambia la contraseña del usuario.
     *
     * @param nuevaPass Nueva contraseña ingresada por el usuario.
     * @param confirmarPass Contraseña confirmada por el usuario.
     */
    private void cambiarContraseña(String nuevaPass, String confirmarPass) {
        long contraseñaVieja = usuario.getPass();
        if (nuevaPass.hashCode() != contraseñaVieja) {
            if (!nuevaPass.equals(confirmarPass)) {
                JOptionPane.showMessageDialog(rootPane, "La contraseñas no coinciden", "ERROR", 0);
            } else {
                usuario.setPass(nuevaPass);
                JOptionPane.showMessageDialog(rootPane, "Contraseña Cambiada con exito", "CONTRASEÑA CAMBIADA", 1);
                if (usuario.isDebeCambiarContrasenia()) {
                    usuario.setDebeCambiarContrasenia(false);
                    mostrarVisual(usuario);
                }
                this.insti.serealizar(Instituto.NOMBRE_ARCHIVO);

                this.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "La contraseñas no puede ser igual a la anterior", "ERROR", 0);
        }
    }

    /**
     * Valida que los campos de entrada no esten vacios.
     *
     * @return true si los campos son válidos, false si alguno está vacío.
     */
    private boolean validarCampos() {
        if (String.valueOf(nuevaPassField.getPassword()).equals("") && String.valueOf(confirmarPassField.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(rootPane, "No pueden dejarse campos vacios", "ERROR", 0);
            return false;
        } else {
            return true;
        }
    }
    private void nuevaPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevaPassFieldActionPerformed
    /**
     * Boton para cerrar la aplicacion.
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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (validarCampos()) {
            String nuevaPass = String.valueOf(nuevaPassField.getPassword());
            String confirmarPass = String.valueOf(confirmarPassField.getPassword());
            cambiarContraseña(nuevaPass, confirmarPass);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked

    }//GEN-LAST:event_jPanel2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Exit;
    private javax.swing.JPasswordField confirmarPassField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField nuevaPassField;
    private javax.swing.JPanel superiorTab;
    // End of variables declaration//GEN-END:variables
}
