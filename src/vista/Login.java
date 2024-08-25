package vista;

import modelo.*;
import excepciones.*;
import javax.swing.JOptionPane;
import vista.popups.Visual_CambiarContraseña;

/**
 * La clase Login es la ventana de inicio de sesión de la aplicación. Permite a
 * los usuarios ingresar su documento (usuario) y contraseña para poder acceder
 * al sistema.
 */
public class Login extends javax.swing.JFrame {

    private Instituto insti;
    int xMouse, yMouse;

    /**
     * Constructor de la clase Login.
     *
     * @param insti El objeto Instituto que se deserealiza en el 'Main' de la
     * aplicacion, funciona como parte central del sistema
     */
    public Login(Instituto insti) {
        initComponents();
        this.insti = insti;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        superiorTab1 = new javax.swing.JPanel();
        btn_Exit1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fieldUsuario = new javax.swing.JTextField();
        fieldContra = new javax.swing.JPasswordField();
        labelUsuario = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        logoInstitucion = new javax.swing.JLabel();
        BotonIngresar = new javax.swing.JPanel();
        labelIngresar = new javax.swing.JLabel();

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        superiorTab1.setBackground(new java.awt.Color(255, 255, 255));
        superiorTab1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        superiorTab1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                superiorTab1MouseDragged(evt);
            }
        });
        superiorTab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                superiorTab1MousePressed(evt);
            }
        });

        btn_Exit1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_Exit1.setForeground(new java.awt.Color(255, 0, 51));
        btn_Exit1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Exit1.setText("X");
        btn_Exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Exit1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout superiorTab1Layout = new javax.swing.GroupLayout(superiorTab1);
        superiorTab1.setLayout(superiorTab1Layout);
        superiorTab1Layout.setHorizontalGroup(
            superiorTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, superiorTab1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        superiorTab1Layout.setVerticalGroup(
            superiorTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Exit1)
        );

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fieldUsuario.setBackground(new java.awt.Color(153, 204, 255));
        fieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsuarioActionPerformed(evt);
            }
        });

        fieldContra.setBackground(new java.awt.Color(153, 204, 255));
        fieldContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldContraActionPerformed(evt);
            }
        });

        labelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuario.setText("Ingrese el usuario:");

        labelContraseña.setBackground(new java.awt.Color(0, 0, 0));
        labelContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelContraseña.setText("Ingrese la contraseña:");

        logoInstitucion.setBackground(new java.awt.Color(153, 153, 153));
        logoInstitucion.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        logoInstitucion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoInstitucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgperf/FondoSinBg.png"))); // NOI18N
        logoInstitucion.setMaximumSize(new java.awt.Dimension(100, 50));
        logoInstitucion.setMinimumSize(new java.awt.Dimension(100, 50));
        logoInstitucion.setPreferredSize(new java.awt.Dimension(100, 50));

        BotonIngresar.setBackground(new java.awt.Color(255, 255, 255));
        BotonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIngresarMouseClicked(evt);
            }
        });

        labelIngresar.setBackground(new java.awt.Color(255, 255, 255));
        labelIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIngresar.setText("Ingresar");
        labelIngresar.setToolTipText("");
        labelIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelIngresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BotonIngresarLayout = new javax.swing.GroupLayout(BotonIngresar);
        BotonIngresar.setLayout(BotonIngresarLayout);
        BotonIngresarLayout.setHorizontalGroup(
            BotonIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonIngresarLayout.createSequentialGroup()
                .addComponent(labelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BotonIngresarLayout.setVerticalGroup(
            BotonIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonIngresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(fieldUsuario)
                    .addComponent(fieldContra)
                    .addComponent(BotonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoInstitucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelContraseña)
                .addGap(0, 0, 0)
                .addComponent(fieldContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(superiorTab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(superiorTab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUsuarioActionPerformed

    private void fieldContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldContraActionPerformed
    /**
     * Boton para cerrar la aplicacion.
     *
     * @param evt Evento de clic del mouse.
     */
    private void btn_Exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Exit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_Exit1MouseClicked
    /**
     * Método que permite que la ventana pueda ser arrastrada.
     *
     * @param evt Evento de movimiento del mouse.
     */
    private void superiorTab1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorTab1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_superiorTab1MouseDragged
    /**
     * Método para almacenar la posición del mouse cuando se presiona la
     * ventana. (Necesario para poder utilizar el metodo anterior)
     *
     * @param evt Evento de clic del mouse.
     */
    private void superiorTab1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorTab1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_superiorTab1MousePressed
    /**
     * Boton que dispara la el metodo Ingrear() para que iniciar la comprobacion
     * de usuario y contraseña.
     *
     * @param evt Evento de clic del mouse.
     */
    private void BotonIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIngresarMouseClicked
        Ingresar();
    }//GEN-LAST:event_BotonIngresarMouseClicked

    private void labelIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIngresarMouseClicked
        Ingresar();
    }//GEN-LAST:event_labelIngresarMouseClicked

    /**
     * Metodo que realiza la autenticacion de usuario y contraseña para luego
     * redirigir al usuario a la interfaz correspondiente segun su rol (alumno,
     * profesor o administrador).
     */
    private void Ingresar() {
        try {
            String usuario = fieldUsuario.getText();
            String pass = String.valueOf(fieldContra.getPassword());
            Usuario aux = insti.login(usuario, pass.hashCode());
            //Se elige que vista mostrar dependiendo del rol del Usuario

            if (!(aux.isCuentaSuspendida())) {
                if (aux.soyAlumno()) {

                    if (!(aux.isDebeCambiarContrasenia())) {
                        Visual_Alumno visual = new Visual_Alumno((Alumno) aux, insti);
                        visual.setVisible(true);
                        visual.setLocationRelativeTo(null);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Antes de usar la aplicacion debes cambiar la contraseña", "ATENCION", 2);
                        Visual_CambiarContraseña vista = new Visual_CambiarContraseña(aux, insti);
                        vista.setVisible(true);
                        vista.setLocationRelativeTo(null);
                    }
                }
                if (aux.soyProfesor()) {
                    if (!(aux.isDebeCambiarContrasenia())) {
                        Visual_Profesor visual = new Visual_Profesor((Profesor) aux, insti);
                        visual.setVisible(true);
                        visual.setLocationRelativeTo(null);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Antes de usar la aplicacion debes cambiar la contraseña", "ATENCION", 2);
                        Visual_CambiarContraseña vista = new Visual_CambiarContraseña(aux, insti);
                        vista.setVisible(true);
                        vista.setLocationRelativeTo(null);
                    }
                }
                if (aux.soyAdministrador()) {
                    Visual_Administrador visualAdmin = new Visual_Administrador((Administrador) aux, insti);
                    visualAdmin.setVisible(true);
                    visualAdmin.setLocationRelativeTo(null);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Su cuenta fue suspendida por un administrador bajo el motivo: \n" + aux.getMensajeDeSuspension(), "CUENTA SUSPENDIDA!", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
            this.setVisible(false);
        } catch (DatosIncorrectosException | UsuarioNoEncontradoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonIngresar;
    private javax.swing.JLabel btn_Exit1;
    private java.awt.Button button1;
    private javax.swing.JPasswordField fieldContra;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelIngresar;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel logoInstitucion;
    private javax.swing.JPanel superiorTab1;
    // End of variables declaration//GEN-END:variables
}
