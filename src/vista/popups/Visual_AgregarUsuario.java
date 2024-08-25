package vista.popups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import modelo.Alumno;
import modelo.Instituto;
import modelo.Profesor;
import modelo.Usuario;

/**
 * Esta clase es tratada como un popup para agregar un nuevo usuario al sistema,
 * ya sea un profesor o un alumno. Permite ingresar los detalles del usuario,
 * incluyendo el tipo de usuario, nombre, documento y correo electrónico. Esta
 * ventana se genera por medio del uso de la ventana principal del administrador
 *
 */
public class Visual_AgregarUsuario extends javax.swing.JFrame {

    int xMouse, yMouse;
    private Instituto insti;

    /**
     * Crea una nueva instancia de la ventana para agregar un usuario.
     *
     * @param insti El instituto al que se va a agregar el usuario.
     */
    public Visual_AgregarUsuario(Instituto insti) {
        initComponents();
        this.insti = insti;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        superiorTab = new javax.swing.JPanel();
        btn_Exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        desplegableTipoUsuario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        labelDocumento = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setName("AgregarAlumno"); // NOI18N
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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tipo de usuario");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 37, 190, -1));

        desplegableTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "PROFESOR", "ALUMNO" }));
        jPanel1.add(desplegableTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 53, 190, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, 190, -1));

        labelCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelCorreo.setMinimumSize(new java.awt.Dimension(102, 22));
        labelCorreo.setPreferredSize(new java.awt.Dimension(102, 22));
        labelCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(labelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 180, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Documento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 125, 190, -1));

        labelDocumento.setColumns(8);
        labelDocumento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        labelDocumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelDocumentoActionPerformed(evt);
            }
        });
        jPanel1.add(labelDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 141, 190, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Direccion de correo electronico");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 169, 202, -1));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Aceptar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, -1));

        labelNombre1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        labelNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelNombre1ActionPerformed(evt);
            }
        });
        jPanel1.add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 97, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(superiorTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(superiorTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelCorreoActionPerformed
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
    /**
     * Verifica si una cadena esta compuesta solo por caracteres alfabeticos.
     *
     * @param str La cadena a verificar.
     * @return true si la cadena es alfabetica false en caso contrario.
     */
    public boolean esAlfabetico(String str) {
        String regex = "^[a-zA-Z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    /**
     * Verifica si una cadena esta compuesta solo por caracteres numericos.
     *
     * @param str La cadena a verificar.
     * @return true si la cadena es alfabetica false en caso contrario.
     */
    public boolean esNumerico(String str) {
        // Definir la expresión regular para caracteres numéricos
        String regex = "^[0-9]+$";
        // Crear un patrón a partir de la expresión regular
        Pattern pattern = Pattern.compile(regex);
        // Crear un matcher para el string de entrada
        Matcher matcher = pattern.matcher(str);
        // Devolver si el string de entrada coincide con el patrón
        return matcher.matches();
    }

    /**
     * Verifica si una direccion de correo electrónico es valida.
     *
     * @param correo La dirección de correo a verificar.
     * @return true si la dirección de correo es válida false en caso contrario.
     */
    public boolean verificarCorreo(String correo) {
        boolean es_valido = false;
        correo = correo.toUpperCase();
        int pos_arroba = correo.indexOf("@");
        int pos_punto = correo.indexOf(".");
        int pos_final = correo.length() - 1;
        if ((pos_arroba > 0) && (pos_punto > 0)) {
            if (correo.charAt(pos_final) >= 65 && correo.charAt(pos_final) <= 90) {
                if ((correo.indexOf("@", pos_arroba + 1)) != -1 || (pos_punto == pos_arroba + 1) || correo.indexOf(".", pos_arroba + 1) == -1) {
                    es_valido = false;
                } else {
                    if (correo.indexOf(".", pos_punto + 1) != pos_punto + 1) {
                        pos_punto = correo.indexOf(".", pos_punto + 1);
                        if (pos_punto > 1 && pos_punto != pos_final) {
                            es_valido = true;
                        } else if (pos_punto == -1) {
                            es_valido = true;
                        }
                    }
                }
            }
        }
        return es_valido;
    }

    /**
     * Valida que los campos de entrada sean correctos.
     *
     * @return true si todos los campos son validos false en caso contrario.
     */
    private boolean validarCampos() {
        boolean validacion = true;
        String nombre_usuario = labelNombre1.getText();
        String documento_usuario = labelDocumento.getText();
        String correo_usuario = labelCorreo.getText();
        if ((nombre_usuario.equals("")) || (esNumerico(nombre_usuario))) {
            validacion = false;
        }
        if ((documento_usuario.equals("")) || !(esNumerico(documento_usuario))) {
            validacion = false;
        } else if (Integer.parseInt(documento_usuario) <= 0) {
            validacion = false;
        }
        if ((correo_usuario.equals("")) || !(verificarCorreo(correo_usuario))) {
            validacion = false;
        }
        return validacion;
    }

    /**
     * Boton que acepta lo ingresado, creando un nuevo usuario si todos los
     * campos son validos.
     *
     * @param evt El evento de clic del mouse.
     */
    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        Usuario usuario_a_agregar = null;

        if (validarCampos()) {
            if ((this.insti.getUsuario(labelDocumento.getText())) != null) {
                JOptionPane.showMessageDialog(rootPane, "El usuario ya existe", "ERROR AL AGREGAR USUARIO", 2);
            } else {
                String nombre_usuario = labelNombre1.getText();
                String documento_usuario = labelDocumento.getText();
                String correo_usuario = labelCorreo.getText();
                if ((desplegableTipoUsuario.getSelectedIndex() == 1) && (validarCampos())) {
                    usuario_a_agregar = new Profesor(nombre_usuario, documento_usuario, documento_usuario, correo_usuario);
                }
                if ((desplegableTipoUsuario.getSelectedIndex() == 2) && (validarCampos())) {
                    usuario_a_agregar = new Alumno(nombre_usuario, documento_usuario, documento_usuario, correo_usuario);
                }

                this.insti.agregarUsuario(usuario_a_agregar);
                JOptionPane.showMessageDialog(rootPane, "Usuario creado con exito");
                this.insti.serealizar(Instituto.NOMBRE_ARCHIVO);
                labelNombre1.setText("");
                labelCorreo.setText("");
                labelDocumento.setText("");

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor, rellene los campos de manera correcta", "ERROR AL AGREGAR USUARIO", 2);
        }

    }//GEN-LAST:event_jPanel2MouseClicked

    private void labelDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelDocumentoActionPerformed

    private void labelNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelNombre1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Exit;
    private javax.swing.JComboBox<String> desplegableTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField labelCorreo;
    private javax.swing.JFormattedTextField labelDocumento;
    private javax.swing.JTextField labelNombre1;
    private javax.swing.JPanel superiorTab;
    // End of variables declaration//GEN-END:variables
}
