package vista;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.*;
import vista.popups.*;

/**
 * La clase Visual_Alumno es la interfaz visual que van a ver los alumnos una
 * vez q ingrese al sistema. Permite al alumno gestionar su perfil, cambiar su
 * contraseña, inscribirse en cursos y visualizar los detalles de los cursos.
 */
public class Visual_Alumno extends javax.swing.JFrame {

    private Instituto insti;
    private Alumno usuario;

    int xMouse, yMouse;

    private DefaultListModel model_cursos = new DefaultListModel<>();
    private DefaultListModel model_cursos_cursando = new DefaultListModel<>();

    /**
     * Constructor de la clase Visual_Alumno.
     *
     * @param usuario El alumno que ha iniciado sesión.
     * @param insti La institución que gestiona los cursos.
     */
    public Visual_Alumno(Alumno usuario, Instituto insti) {
        initComponents();
        this.insti = insti;
        this.usuario = usuario;

        InicializarVentana();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaAlumno = new javax.swing.JPanel();
        superiorTab4 = new javax.swing.JPanel();
        btn_Exit4 = new javax.swing.JLabel();
        Usuario_info = new javax.swing.JPanel();
        CambiarContraBt = new javax.swing.JPanel();
        LabelCambiarContra = new javax.swing.JLabel();
        CerrarSesionBt = new javax.swing.JPanel();
        LabelCerrarSesion = new javax.swing.JLabel();
        ProfilePic = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        btnCambiarFoto = new javax.swing.JLabel();
        Logo = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        MateriasVisual = new javax.swing.JPanel();
        PanelMaterias = new javax.swing.JPanel();
        desplegableMaterias = new javax.swing.JComboBox<>();
        scrollCursosPropios = new javax.swing.JScrollPane();
        listaCursos = new javax.swing.JList<>();
        scrollCursosDisponibles = new javax.swing.JScrollPane();
        listaCursosDisponibles = new javax.swing.JList<>();
        labelInfoCursosTitulo = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelNombre = new javax.swing.JLabel();
        labelCantidadMaxCurso = new javax.swing.JLabel();
        labelCantidadInscriptos = new javax.swing.JLabel();
        labelCursosDisponiblesTitulo = new javax.swing.JLabel();
        btnInscribirCurso = new javax.swing.JPanel();
        labelInscribirCursante = new javax.swing.JLabel();
        labelDocente = new javax.swing.JLabel();
        labelCursosPrevios = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ventanaAlumno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        superiorTab4.setBackground(new java.awt.Color(255, 255, 255));
        superiorTab4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        superiorTab4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                superiorTab4MouseDragged(evt);
            }
        });
        superiorTab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                superiorTab4MousePressed(evt);
            }
        });

        btn_Exit4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_Exit4.setForeground(new java.awt.Color(255, 0, 51));
        btn_Exit4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Exit4.setText("X");
        btn_Exit4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Exit4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Exit4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout superiorTab4Layout = new javax.swing.GroupLayout(superiorTab4);
        superiorTab4.setLayout(superiorTab4Layout);
        superiorTab4Layout.setHorizontalGroup(
            superiorTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, superiorTab4Layout.createSequentialGroup()
                .addGap(0, 1048, Short.MAX_VALUE)
                .addComponent(btn_Exit4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        superiorTab4Layout.setVerticalGroup(
            superiorTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(superiorTab4Layout.createSequentialGroup()
                .addComponent(btn_Exit4)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        ventanaAlumno.add(superiorTab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 20));

        Usuario_info.setBackground(new java.awt.Color(9, 69, 108));
        Usuario_info.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        CambiarContraBt.setBackground(new java.awt.Color(255, 255, 255));
        CambiarContraBt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CambiarContraBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CambiarContraBtMouseClicked(evt);
            }
        });

        LabelCambiarContra.setText("CAMBIAR CONTRASEÑAS");

        javax.swing.GroupLayout CambiarContraBtLayout = new javax.swing.GroupLayout(CambiarContraBt);
        CambiarContraBt.setLayout(CambiarContraBtLayout);
        CambiarContraBtLayout.setHorizontalGroup(
            CambiarContraBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiarContraBtLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(LabelCambiarContra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CambiarContraBtLayout.setVerticalGroup(
            CambiarContraBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambiarContraBtLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelCambiarContra)
                .addContainerGap())
        );

        CerrarSesionBt.setBackground(new java.awt.Color(255, 255, 255));
        CerrarSesionBt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CerrarSesionBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionBtMouseClicked(evt);
            }
        });

        LabelCerrarSesion.setText("CERRAR SESION");

        javax.swing.GroupLayout CerrarSesionBtLayout = new javax.swing.GroupLayout(CerrarSesionBt);
        CerrarSesionBt.setLayout(CerrarSesionBtLayout);
        CerrarSesionBtLayout.setHorizontalGroup(
            CerrarSesionBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CerrarSesionBtLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelCerrarSesion)
                .addGap(51, 51, 51))
        );
        CerrarSesionBtLayout.setVerticalGroup(
            CerrarSesionBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CerrarSesionBtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCerrarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProfilePic.setMaximumSize(new java.awt.Dimension(150, 150));
        ProfilePic.setMinimumSize(new java.awt.Dimension(150, 150));
        ProfilePic.setName(""); // NOI18N
        ProfilePic.setPreferredSize(new java.awt.Dimension(150, 150));

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgperf/DefaultProfilePic.png"))); // NOI18N
        foto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout ProfilePicLayout = new javax.swing.GroupLayout(ProfilePic);
        ProfilePic.setLayout(ProfilePicLayout);
        ProfilePicLayout.setHorizontalGroup(
            ProfilePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ProfilePicLayout.setVerticalGroup(
            ProfilePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnCambiarFoto.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCambiarFoto.setText("CAMBIAR FOTO");
        btnCambiarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarFotoMouseClicked(evt);
            }
        });

        Logo.setBackground(new java.awt.Color(9, 69, 108));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgperf/FondoSinBg.png"))); // NOI18N

        javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
        Logo.setLayout(LogoLayout);
        LogoLayout.setHorizontalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LogoLayout.setVerticalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout Usuario_infoLayout = new javax.swing.GroupLayout(Usuario_info);
        Usuario_info.setLayout(Usuario_infoLayout);
        Usuario_infoLayout.setHorizontalGroup(
            Usuario_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Usuario_infoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(Usuario_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CerrarSesionBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CambiarContraBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Usuario_infoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Usuario_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCambiarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Usuario_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Usuario_infoLayout.setVerticalGroup(
            Usuario_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Usuario_infoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnCambiarFoto)
                .addGap(18, 18, 18)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(CambiarContraBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CerrarSesionBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        ventanaAlumno.add(Usuario_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 200, 480));

        PanelMaterias.setBackground(new java.awt.Color(234, 230, 230));
        PanelMaterias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        desplegableMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "APROBADOS", "CURSANDO" }));
        desplegableMaterias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                desplegableMateriasItemStateChanged(evt);
            }
        });

        listaCursos.setBackground(new java.awt.Color(234, 230, 230));
        listaCursos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listaCursos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaCursos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaCursosValueChanged(evt);
            }
        });
        scrollCursosPropios.setViewportView(listaCursos);

        listaCursosDisponibles.setBackground(new java.awt.Color(234, 230, 230));
        listaCursosDisponibles.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listaCursosDisponibles.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaCursosDisponibles.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaCursosDisponibles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaCursosDisponiblesValueChanged(evt);
            }
        });
        scrollCursosDisponibles.setViewportView(listaCursosDisponibles);

        labelInfoCursosTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labelInfoCursosTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelInfoCursosTitulo.setText("INFORMACION DEL CURSO");

        labelID.setBackground(new java.awt.Color(0, 0, 0));
        labelID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelID.setText("ID:");

        labelNombre.setBackground(new java.awt.Color(0, 0, 0));
        labelNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNombre.setText("Nombre:");

        labelCantidadMaxCurso.setBackground(new java.awt.Color(0, 0, 0));
        labelCantidadMaxCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCantidadMaxCurso.setText("Capacidad del curso:");

        labelCantidadInscriptos.setBackground(new java.awt.Color(0, 0, 0));
        labelCantidadInscriptos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCantidadInscriptos.setText("Cantidad de inscriptos:");

        labelCursosDisponiblesTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCursosDisponiblesTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCursosDisponiblesTitulo.setText("Cursos disponibles");

        btnInscribirCurso.setBackground(new java.awt.Color(255, 255, 255));
        btnInscribirCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInscribirCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInscribirCursoMouseClicked(evt);
            }
        });

        labelInscribirCursante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInscribirCursante.setText("Inscribirme al curso");

        javax.swing.GroupLayout btnInscribirCursoLayout = new javax.swing.GroupLayout(btnInscribirCurso);
        btnInscribirCurso.setLayout(btnInscribirCursoLayout);
        btnInscribirCursoLayout.setHorizontalGroup(
            btnInscribirCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelInscribirCursante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnInscribirCursoLayout.setVerticalGroup(
            btnInscribirCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInscribirCursoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelInscribirCursante)
                .addContainerGap())
        );

        labelDocente.setBackground(new java.awt.Color(0, 0, 0));
        labelDocente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDocente.setText("Docente a cargo:");

        labelCursosPrevios.setBackground(new java.awt.Color(0, 0, 0));
        labelCursosPrevios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCursosPrevios.setText("Cursos previos necesarios:");

        labelDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDescripcion.setText("Descripcion:");

        javax.swing.GroupLayout PanelMateriasLayout = new javax.swing.GroupLayout(PanelMaterias);
        PanelMaterias.setLayout(PanelMateriasLayout);
        PanelMateriasLayout.setHorizontalGroup(
            PanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMateriasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desplegableMaterias, 0, 200, Short.MAX_VALUE)
                    .addComponent(scrollCursosPropios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCursosDisponiblesTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(scrollCursosDisponibles))
                .addGap(126, 126, 126)
                .addGroup(PanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMateriasLayout.createSequentialGroup()
                        .addGroup(PanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelInfoCursosTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(labelID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCantidadMaxCurso, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCantidadInscriptos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDocente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInscribirCurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelMateriasLayout.createSequentialGroup()
                        .addGroup(PanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCursosPrevios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDescripcion))
                        .addContainerGap())))
        );
        PanelMateriasLayout.setVerticalGroup(
            PanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMateriasLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(desplegableMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCursosDisponiblesTitulo))
                    .addComponent(labelInfoCursosTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMateriasLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(labelCantidadMaxCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCantidadInscriptos)
                        .addGap(6, 6, 6)
                        .addComponent(labelCursosPrevios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(165, 165, 165)
                        .addComponent(btnInscribirCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollCursosPropios, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollCursosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout MateriasVisualLayout = new javax.swing.GroupLayout(MateriasVisual);
        MateriasVisual.setLayout(MateriasVisualLayout);
        MateriasVisualLayout.setHorizontalGroup(
            MateriasVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MateriasVisualLayout.setVerticalGroup(
            MateriasVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ventanaAlumno.add(MateriasVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 870, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Boton para cerrar la aplicacion.
     *
     * @param evt Evento de clic del mouse.
     */
    private void btn_Exit4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Exit4MouseClicked
        this.insti.serealizar(Instituto.NOMBRE_ARCHIVO);
        System.exit(0);
    }//GEN-LAST:event_btn_Exit4MouseClicked
    /**
     * Metodo que permite que la ventana pueda ser arrastrada.
     *
     * @param evt Evento de movimiento del mouse.
     */
    private void superiorTab4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorTab4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_superiorTab4MouseDragged
    /**
     * Metodo para almacenar la posición del mouse cuando se presiona la
     * ventana. (Necesario para poder utilizar el metodo anterior)
     *
     * @param evt Evento de clic del mouse.
     */
    private void superiorTab4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_superiorTab4MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_superiorTab4MousePressed
    /**
     * Abre la ventana para cambiar la contraseña del usuario.
     *
     * @param evt Evento del mouse.
     */
    private void CambiarContraBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambiarContraBtMouseClicked
        Visual_CambiarContraseña CambiarContra = new Visual_CambiarContraseña(usuario, insti);
        CambiarContra.setVisible(true);
        CambiarContra.setLocationRelativeTo(null);
    }//GEN-LAST:event_CambiarContraBtMouseClicked
    /**
     * Cierra la sesion del usuario actual y regresa a la pantalla de inicio de
     * sesión.
     *
     * @param evt Evento del mouse.
     */
    private void CerrarSesionBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionBtMouseClicked
        this.insti.serealizar(Instituto.NOMBRE_ARCHIVO);
        this.setVisible(false);
        Login login = new Login(insti);
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_CerrarSesionBtMouseClicked
    /**
     * Determina que materias se mostraran en la lista de cursos (Aprobados,
     * cursando o todos)
     *
     * @param evt Evento del estado del item.
     */
    private void desplegableMateriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_desplegableMateriasItemStateChanged
        int selected = desplegableMaterias.getSelectedIndex();
        model_cursos.clear();
        model_cursos_cursando.clear();

        cargarCursos(selected);
        cargarCursosDictando();
    }//GEN-LAST:event_desplegableMateriasItemStateChanged
    /**
     * Controla la seleccion dentro de las listas, no permite que se seleccione
     * otro elemento de una lista distinta y muestra el boton de inscribirse si
     * el curso seleccionado permite inscribirse
     *
     * @param evt Evento del estado del item.
     */
    private void listaCursosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaCursosValueChanged
        listaCursosDisponibles.clearSelection();
        Curso curso_seleccionado = levantarCurso();
        imprimirCurso(curso_seleccionado);
        if (curso_seleccionado != null) {
            if (curso_seleccionado.getEstadoCurso() != 1) {
                btnInscribirCurso.setVisible(false);
            } else {
                btnInscribirCurso.setVisible(true);
            }
        }
    }//GEN-LAST:event_listaCursosValueChanged
    /**
     * Controla la seleccion dentro de las listas, no permite que se seleccione
     * otro elemento de una lista distinta y muestra el boton de inscribirse si
     * el curso seleccionado permite inscribirse
     *
     * @param evt Evento del estado del item.
     */
    private void listaCursosDisponiblesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaCursosDisponiblesValueChanged
        listaCursos.clearSelection();
        Curso curso_seleccionado = levantarCurso();
        imprimirCurso(curso_seleccionado);
        if (curso_seleccionado != null) {
            if (curso_seleccionado.getEstadoCurso() != 1) {
                btnInscribirCurso.setVisible(false);
            } else {
                btnInscribirCurso.setVisible(true);
            }
        }
    }//GEN-LAST:event_listaCursosDisponiblesValueChanged
    /**
     * Permite al alumno inscribirse en el curso seleccionado.
     *
     * @param evt Evento del mouse.
     */
    private void btnInscribirCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInscribirCursoMouseClicked
        Curso curso_seleccionado = levantarCurso();
        if (curso_seleccionado != null && !(usuario.getCursando(curso_seleccionado.getIdCurso())) && !(usuario.getCursoAprobado(curso_seleccionado.getIdCurso()))) {
            curso_seleccionado.agregarCursante(usuario);
            this.usuario.agregarCursoCursando(curso_seleccionado);
            cargarCursos(0);
            cargarCursosDictando();
            JOptionPane.showMessageDialog(rootPane, "Usted se inscribio correctamente al curso");
            this.insti.serealizar(Instituto.NOMBRE_ARCHIVO);
        } else {
            if (curso_seleccionado != null) {
                JOptionPane.showMessageDialog(rootPane, "Usted no pudo inscribirse a " + levantarCurso().getNombreCurso(), "ERROR AL INSCRIBIRSE", JOptionPane.WARNING_MESSAGE);
            }
        }


    }//GEN-LAST:event_btnInscribirCursoMouseClicked
    /**
     * Permite al usuario seleccionar una nueva foto de perfil.
     *
     * @param evt Evento del mouse.
     */
    private void btnCambiarFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarFotoMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File ArchivoSeleccionado = fileChooser.getSelectedFile();
            try {
                BufferedImage img = ImageIO.read(ArchivoSeleccionado);

                if (img == null) {
                    JOptionPane.showMessageDialog(null, "El archivo seleccionado no es una imagen válida.");
                    return;
                }

                String Direccion_Imagen_Perfil = this.usuario.getDocumento() + "ProfilePic.png";

                BufferedImage ImagenRedimensionada = RedimensionarImagen(img);
                ImageIO.write(ImagenRedimensionada, "png", new File(Direccion_Imagen_Perfil));
                JOptionPane.showMessageDialog(null, "Imagen guardada exitosamente.");
                ImageIcon icon = new ImageIcon(ImagenRedimensionada);
                foto.setIcon(icon);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar la imagen.");
            }
        }


    }//GEN-LAST:event_btnCambiarFotoMouseClicked
    /**
     * Metodo que permite cambiar la imagen de perfil del usuario desde el
     * archivo con el nombre '(Documento del usuario)ProfilePic.png'.
     */
    private void CargarImagen() {
        String Direccion_Imagen_Perfil = this.usuario.getDocumento() + "ProfilePic.png";

        File DireccionDeImagen = new File(Direccion_Imagen_Perfil);
        if (DireccionDeImagen.exists()) {
            try {
                BufferedImage img = ImageIO.read(DireccionDeImagen);
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
     * Redimensiona la imagen a un tamaño de 150x150 píxeles.
     *
     * @param ImagenOriginal La imagen original que se va a redimensionar.
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

    /*-------------------------------------------------------------------------------------------------------------------------------*/
    /**
     * Carga los cursos en funcion de los seleccionado en el desplegable de
     * cursos propios:
     *
     * '0' equivale a mostrar todos los cursos. 
     * '1' equivale a mostrar loscursos aprobados. 
     * '2' equivale a mostrar los cursos que esta cursando.
     *
     *
     * @param s El filtro para cargar los cursos (0: Todos, 1: Aprobados, 2:
     * Cursando).
     */
    private void cargarCursos(int s) {
        model_cursos.clear();
        model_cursos.addElement(' ');
        ArrayList<Curso> cursos_totales = this.insti.getCursos();
        switch (s) {
            case 2:
                cursos_totales = usuario.getCursosCursando();
                for (int i = 0; i < cursos_totales.size(); i++) {
                    if (usuario.getCursando((cursos_totales.get(i).getIdCurso()))) {
                        if (model_cursos.contains(' ')) {
                            model_cursos.insertElementAt(cursos_totales.get(i), model_cursos.indexOf(' '));
                        } else {
                            model_cursos.addElement(cursos_totales.get(i));
                        }
                    }
                }
                break;
            case 1:
                for (int i = 0; i < cursos_totales.size(); i++) {
                    if (usuario.getCursoAprobado((cursos_totales.get(i).getIdCurso()))) {
                        if (model_cursos.contains(' ')) {
                            model_cursos.insertElementAt(cursos_totales.get(i), model_cursos.indexOf(' '));
                        } else {
                            model_cursos.addElement(cursos_totales.get(i));
                        }
                    }
                }
                break;
            case 0:
                for (int i = 0; i < cursos_totales.size(); i++) {
                    if ((usuario.getCursando(cursos_totales.get(i).getIdCurso())) || (usuario.getCursoAprobado(cursos_totales.get(i).getIdCurso()))) {
                        if (model_cursos.contains(' ')) {
                            model_cursos.insertElementAt(cursos_totales.get(i), model_cursos.indexOf(' '));
                        } else {
                            model_cursos.addElement(cursos_totales.get(i));
                        }
                    }
                }
                break;
            default:
                break;
        }
    }

    /**
     * Carga los cursos disponibles para el alumno.
     */
    private void cargarCursosDictando() {
        model_cursos_cursando.clear();
        model_cursos_cursando.addElement(' ');
        ArrayList<Curso> cursos_totales = this.insti.getCursos();
        for (int i = 0; i < cursos_totales.size(); i++) {
            if (cursos_totales.get(i).getEstadoCurso() == 1 && (cursos_totales.get(i).alumnoApto(usuario)) && !(usuario.getCursando(cursos_totales.get(i).getIdCurso())) && !(usuario.getCursoAprobado(cursos_totales.get(i).getIdCurso()))) {
                cursos_totales.get(i).getAlumnosCursando();

                if (model_cursos_cursando.contains(' ')) {
                    model_cursos_cursando.insertElementAt(cursos_totales.get(i), model_cursos_cursando.indexOf(' '));
                } else {
                    model_cursos_cursando.addElement(cursos_totales.get(i));
                }

            }
        }
    }

    /**
     * Levanta el curso seleccionado de las listas de cursos.
     *
     * @return El curso seleccionado, o null si no hay ninguno.
     */
    public Curso levantarCurso() {
        Curso curso_seleccionado = null;
        if (!(listaCursos.isSelectionEmpty())) {
            if (!(model_cursos.get(listaCursos.getSelectedIndex()).equals(' '))) {
                curso_seleccionado = (Curso) model_cursos.get(listaCursos.getSelectedIndex());
            }
        }

        if (!(listaCursosDisponibles.isSelectionEmpty())) {
            if (!(model_cursos_cursando.get(listaCursosDisponibles.getSelectedIndex()).equals(' '))) {
                curso_seleccionado = (Curso) model_cursos_cursando.get(listaCursosDisponibles.getSelectedIndex());
            }
        }
        return curso_seleccionado;
    }

    /**
     * Modifica los labels para mostrar la informacion del curso que se le pasa
     * por parametro
     *
     * @param curso El curso cuyo detalle se va a imprimir.
     */
    public void imprimirCurso(Curso curso) {
        if (curso != null) {
            labelID.setText("Id: " + curso.getIdCurso());
            labelNombre.setText("Nombre: " + curso.getNombreCurso());
            labelDocente.setText("Docente a cargo: " + curso.getDocente().getNombre() + " " + curso.getDocente().getDocumento());
            labelCantidadMaxCurso.setText("Capacidad: " + curso.getTamanio_curso());
            labelCantidadInscriptos.setText("Cantidad: " + curso.getAlumnosCursando().size());
            labelDescripcion.setText("Descripcion: " + curso.getDescripcion());
            actualizarCursosPrevios();
        }
    }

    /**
     * Actualiza la visualización de los cursos previos necesarios para el curso
     * seleccionado.
     */
    public void actualizarCursosPrevios() {
        Curso aux = levantarCurso();
        if (aux.getCurso_previo1() == 0 && aux.getCurso_previo2() == 0) {
            labelCursosPrevios.setVisible(false);
        } else {
            labelCursosPrevios.setVisible(true);
            if (aux.getCurso_previo1() != 0 && aux.getCurso_previo2() != 0) {
                labelCursosPrevios.setText("Cursos necesarios: " + insti.getCurso(aux.getCurso_previo1()).getNombreCurso() + " " + insti.getCurso(aux.getCurso_previo2()).getNombreCurso());
            } else if (aux.getCurso_previo1() != 0 && aux.getCurso_previo2() == 0) {
                labelCursosPrevios.setText("Cursos necesarios: " + insti.getCurso(aux.getCurso_previo1()).getNombreCurso());
            } else if (aux.getCurso_previo1() == 0 && aux.getCurso_previo2() != 0) {
                labelCursosPrevios.setText("Cursos necesarios: " + insti.getCurso(aux.getCurso_previo2()).getNombreCurso());
            }

        }

    }

    /*---------------------------------------------------------------------------------------------------------------------------------------------------*/
    /**
     * Inicializa los componentes necesarios para el correcto funcionamiento de
     * esta ventana grafica
     */
    private void InicializarVentana() {
        //ventana cursos
        listaCursos.setModel(model_cursos);
        listaCursosDisponibles.setModel(model_cursos_cursando);
        cargarCursosDictando();
        cargarCursos(0);
        CargarImagen();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CambiarContraBt;
    private javax.swing.JPanel CerrarSesionBt;
    private javax.swing.JLabel LabelCambiarContra;
    private javax.swing.JLabel LabelCerrarSesion;
    private javax.swing.JPanel Logo;
    private javax.swing.JPanel MateriasVisual;
    private javax.swing.JPanel PanelMaterias;
    private javax.swing.JPanel ProfilePic;
    private javax.swing.JPanel Usuario_info;
    private javax.swing.JLabel btnCambiarFoto;
    private javax.swing.JPanel btnInscribirCurso;
    private javax.swing.JLabel btn_Exit4;
    private javax.swing.JComboBox<String> desplegableMaterias;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel icon;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCantidadInscriptos;
    private javax.swing.JLabel labelCantidadMaxCurso;
    private javax.swing.JLabel labelCursosDisponiblesTitulo;
    private javax.swing.JLabel labelCursosPrevios;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelDocente;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelInfoCursosTitulo;
    private javax.swing.JLabel labelInscribirCursante;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JList<String> listaCursos;
    private javax.swing.JList<String> listaCursosDisponibles;
    private javax.swing.JScrollPane scrollCursosDisponibles;
    private javax.swing.JScrollPane scrollCursosPropios;
    private javax.swing.JPanel superiorTab4;
    private javax.swing.JPanel ventanaAlumno;
    // End of variables declaration//GEN-END:variables
}
