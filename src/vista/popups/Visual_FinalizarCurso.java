package vista.popups;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.*;
import modelo.Instituto;

/**
 * Esta clase es tratada como un popup para finalizar un curso. Permite
 * calificar alumnos y finalizar el estado del curso.
 */
public class Visual_FinalizarCurso extends javax.swing.JFrame {

    private Instituto insti;
    private Profesor usuario;
    private Curso curso;
    private DefaultListModel model_alumnos_a_calificar;
    private DefaultListModel model_alumnos_calificados;
    private int xMouse, yMouse;

    /**
     * Constructor de la clase Visual_FinalizarCurso.
     *
     * @param insti Instituto al que pertenece el curso.
     * @param usuario Profesor que esta utilizando la interfaz.
     * @param curso Curso que se esta gestionando.
     */
    public Visual_FinalizarCurso(Instituto insti, Profesor usuario, Curso curso) {
        initComponents();
        this.insti = insti;
        this.usuario = usuario;
        this.curso = curso;
        this.model_alumnos_a_calificar = new DefaultListModel();
        this.model_alumnos_calificados = new DefaultListModel();
        listaAlumnosACalificar.setModel(model_alumnos_a_calificar);
        listaAlumnosCalifcados.setModel(model_alumnos_calificados);

        cargarLista();
    }

    /**
     * Carga la lista de alumnos a calificar en el modelo correspondiente.
     */
    private void cargarLista() {
        model_alumnos_a_calificar.clear();
        ArrayList<Alumno> alumnos_cursando = this.curso.getAlumnosCursando();
        for (Alumno alu : alumnos_cursando) {
            if (!(model_alumnos_calificados.contains(alu))) {
                model_alumnos_a_calificar.addElement(alu);
            }
        }
    }

    /**
     * Levanta el alumno seleccionado de las listas.
     *
     * @return Alumno seleccionado, o null si no hay seleccion.
     */
    public Alumno levantarAlumno() {
        Alumno alumno_seleccionado = null;
        if (!(listaAlumnosACalificar.isSelectionEmpty()) && !(model_alumnos_a_calificar.get(listaAlumnosACalificar.getSelectedIndex()).equals(' '))) {
            alumno_seleccionado = (Alumno) model_alumnos_a_calificar.get(listaAlumnosACalificar.getSelectedIndex());
        }
        if (!(listaAlumnosCalifcados.isSelectionEmpty()) && !(model_alumnos_calificados.get(listaAlumnosCalifcados.getSelectedIndex()).equals(' '))) {
            alumno_seleccionado = (Alumno) model_alumnos_calificados.get(listaAlumnosCalifcados.getSelectedIndex());
        }
        return alumno_seleccionado;
    }

    /**
     * Imprime la informacion del alumno seleccionado en la interfaz.
     */
    public void imprimirAlumno() {
        Alumno alumno_seleccionado = levantarAlumno();
        if (alumno_seleccionado != null) {
            jLabel4.setText("Documento: " + alumno_seleccionado.getDocumento());
            label_nombre.setText("Nombre: " + alumno_seleccionado.getNombre());
            label_nota.setVisible(false);
            label_condicion.setVisible(false);
            if (model_alumnos_calificados.contains(alumno_seleccionado)) {
                int nota = alumno_seleccionado.getNotas().get(curso.getIdCurso());
                label_condicion.setVisible(true);
                label_nota.setVisible(true);
                label_nota.setText("Nota: " + nota);
                if (nota >= 4) {
                    label_condicion.setText("Condicion: APROBADO");
                } else {
                    label_condicion.setText("Condicion: DESAPROBADO");
                }
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        superiorTab = new javax.swing.JPanel();
        btn_Exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaAlumnosCalifcados = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAlumnosACalificar = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_nota = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        field_nota = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnFinalizarRevision = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_condicion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        superiorTab.setBackground(new java.awt.Color(255, 255, 255));
        superiorTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        superiorTab.setPreferredSize(new java.awt.Dimension(424, 17));
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
                .addContainerGap(836, Short.MAX_VALUE)
                .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        superiorTabLayout.setVerticalGroup(
            superiorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(superiorTabLayout.createSequentialGroup()
                .addComponent(btn_Exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(234, 230, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaAlumnosCalifcados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaAlumnosCalifcados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAlumnosCalifcadosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaAlumnosCalifcados);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 200, 310));

        listaAlumnosACalificar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaAlumnosACalificar.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAlumnosACalificarValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaAlumnosACalificar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 200, 310));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista alumnos calificados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 200, 22));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Informacion del alumno seleccionado");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        label_nota.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        label_nota.setText("Nota:");
        jPanel1.add(label_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 360, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Documento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ingrese la nota del alumno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        field_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_notaActionPerformed(evt);
            }
        });
        jPanel1.add(field_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 180, 30));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Establecer nota");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, -1, -1));

        btnFinalizarRevision.setBackground(new java.awt.Color(153, 204, 255));
        btnFinalizarRevision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinalizarRevisionMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Finalizar revision");

        javax.swing.GroupLayout btnFinalizarRevisionLayout = new javax.swing.GroupLayout(btnFinalizarRevision);
        btnFinalizarRevision.setLayout(btnFinalizarRevisionLayout);
        btnFinalizarRevisionLayout.setHorizontalGroup(
            btnFinalizarRevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
        );
        btnFinalizarRevisionLayout.setVerticalGroup(
            btnFinalizarRevisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel1.add(btnFinalizarRevision, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 320, 10));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Lista de alumnos a calificar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 22));

        label_nombre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        label_nombre.setText("Nombre:");
        jPanel1.add(label_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        label_condicion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        label_condicion.setText("Condicion:");
        jPanel1.add(label_condicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 360, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(superiorTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(superiorTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 373, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     /**
     * Maneja el evento de seleccion en la lista de alumnos a calificar.
     *
     * @param evt Evento de seleccion.
     */
    private void listaAlumnosACalificarValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAlumnosACalificarValueChanged
        listaAlumnosCalifcados.clearSelection();
        imprimirAlumno();
    }//GEN-LAST:event_listaAlumnosACalificarValueChanged

    /**
     * Verifica si una cadena es numerica.
     *
     * @param str Cadena a verificar.
     * @return true si es numerica, false en caso contrario.
     */
    public boolean esNumerico(String str) {
        String regex = "^[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    /**
     * boton para realizar la seleccion en la lista de alumnos calificados.
     *
     * @param evt Evento de seleccion.
     */
    private void listaAlumnosCalifcadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAlumnosCalifcadosValueChanged
        listaAlumnosACalificar.clearSelection();
        imprimirAlumno();
    }//GEN-LAST:event_listaAlumnosCalifcadosValueChanged

    /**
     * Mueve un alumno de la lista de alumnos a calificar a la lista de alumnos
     * calificados.
     *
     * @param alumno Alumno a mover.
     */
    private void moverCalificados(Alumno alumno) {
        if (model_alumnos_a_calificar.contains(alumno)) {
            model_alumnos_a_calificar.removeElement(alumno);
            model_alumnos_calificados.addElement(alumno);
            cargarLista();
        }
    }

    /**
     * Boton para determinar el final de la revision.
     *
     * @param evt Evento de click.
     */
    private void btnFinalizarRevisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarRevisionMouseClicked
        if (model_alumnos_a_calificar.size() != 0) {
            JOptionPane.showMessageDialog(rootPane, "Asegurese de calificar a todos los alumnos antes de finalizar", "ERROR AL CARGAR NOTA", JOptionPane.WARNING_MESSAGE);
        } else {
            this.curso.setEstadoCurso(0);
            this.curso.getAlumnosCursando().clear();
            removerAlumnos();
            this.insti.serealizar(Instituto.NOMBRE_ARCHIVO);
            JOptionPane.showMessageDialog(rootPane, "Curso finalizado correctamente");
            this.setVisible(false);
        }

    }//GEN-LAST:event_btnFinalizarRevisionMouseClicked
    /**
     * Boton para establecer nota.
     *
     * @param evt Evento de click.
     */
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Alumno alumno_seleccionado = levantarAlumno();
        if (alumno_seleccionado != null) {
            if ((field_nota.getText().equals("")) || !(esNumerico(field_nota.getText())) || (Integer.parseInt(field_nota.getText())) <= 0 || 10 < (Integer.parseInt(field_nota.getText()))) {
                JOptionPane.showMessageDialog(rootPane, "Por favor ingrese una nota valida", "ERRO AL CARGAR NOTA", JOptionPane.WARNING_MESSAGE);
            } else {
                int nota = Integer.parseInt(field_nota.getText());
                alumno_seleccionado.getNotas().put(curso.getIdCurso(), nota);
                if (nota >= 4) {
                    alumno_seleccionado.getCursosAprobados().add(curso);
                }

                alumno_seleccionado.getCursosCursando().remove(curso);

                moverCalificados(alumno_seleccionado);
                field_nota.setText("");
                listaAlumnosACalificar.clearSelection();
                listaAlumnosCalifcados.clearSelection();

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un alumno", "ERROR AL CARGAR NOTA", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jLabel6MouseClicked

    private void field_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_notaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_notaActionPerformed
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
     * Remueve alumnos del curso al finalizarlo.
     */
    private void removerAlumnos() {
        for (int i = 0; i < this.curso.getAlumnosCursando().size(); i++) {
            this.curso.getAlumnosCursando().get(i).removerCurso(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnFinalizarRevision;
    private javax.swing.JLabel btn_Exit;
    private javax.swing.JTextField field_nota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_condicion;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_nota;
    private javax.swing.JList<String> listaAlumnosACalificar;
    private javax.swing.JList<String> listaAlumnosCalifcados;
    private javax.swing.JPanel superiorTab;
    // End of variables declaration//GEN-END:variables
}
