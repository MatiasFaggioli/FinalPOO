package vista;

import java.awt.Color;
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
 * La clase Visual_Administrador es la interfaz visual que va a ver el
 * adminitrador del instituto una vez q ingrese al sistema. Permite al
 * adminitrados gestionar los usuarios y los cursos.
 */
public class Visual_Administrador extends javax.swing.JFrame {

    private Instituto insti;
    private Administrador usuario;
    int xMouse, yMouse;

    private DefaultListModel model_alumnos = new DefaultListModel<>();
    private DefaultListModel model_profesores = new DefaultListModel<>();
    private DefaultListModel model_suspendidos = new DefaultListModel<>();
    private DefaultListModel model_cursos = new DefaultListModel<>();
    private DefaultListModel model_cursos_propuestos = new DefaultListModel<>();

    /**
     * Constructor de la clase Visual_Administrador.
     *
     * @param usuario El administrador que utiliza la interfaz.
     * @param insti El instituto asociado.
     */
    public Visual_Administrador(Administrador usuario, Instituto insti) {
        initComponents();
        this.insti = insti;
        this.usuario = usuario;

        iniciarlizarVentana();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaAdministrador = new javax.swing.JPanel();
        MateriasVisual = new javax.swing.JPanel();
        panelMaterias = new javax.swing.JPanel();
        desplegableMaterias = new javax.swing.JComboBox<>();
        ScrollMaterias = new javax.swing.JScrollPane();
        listaCursos = new javax.swing.JList<>();
        labelCursosTitulos = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelNombre = new javax.swing.JLabel();
        labelDocente = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        labelCapacidad = new javax.swing.JLabel();
        labelCantidadInscriptos = new javax.swing.JLabel();
        btCancelarCurso = new javax.swing.JPanel();
        labelCancelar = new javax.swing.JLabel();
        scrollCursosporHabilitar = new javax.swing.JScrollPane();
        listaCursosPropuestos = new javax.swing.JList<>();
        labelCursosTitulo = new javax.swing.JLabel();
        btHabilitarCurso = new javax.swing.JPanel();
        labelbtnHabilitar = new javax.swing.JLabel();
        Usuario_info = new javax.swing.JPanel();
        CambiarContraBt = new javax.swing.JPanel();
        labelCambiarContra = new javax.swing.JLabel();
        CerrarSesionBt = new javax.swing.JPanel();
        labelbtnCerrrarSesion = new javax.swing.JLabel();
        ProfilePic = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        btnCambiarFoto = new javax.swing.JLabel();
        Logo8 = new javax.swing.JPanel();
        icon7 = new javax.swing.JLabel();
        superiorTab = new javax.swing.JPanel();
        btn_Exit = new javax.swing.JLabel();
        UsuariosBt = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        MateriasBt = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        UsuariosVisual = new javax.swing.JPanel();
        AlumnosJlist = new javax.swing.JScrollPane();
        listaAlumnos = new javax.swing.JList<>();
        ProfesoresJlist = new javax.swing.JScrollPane();
        listaProfesores = new javax.swing.JList<>();
        UsuariosSuspendidosJlist = new javax.swing.JScrollPane();
        listaSuspendidos = new javax.swing.JList<>();
        AgregarBt = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        GestionarBt = new javax.swing.JPanel();
        GestionarBtn = new javax.swing.JLabel();
        Logo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Alumnos_txt = new javax.swing.JLabel();
        Profesores_txt = new javax.swing.JLabel();
        UsuariosSuspendidos_txt = new javax.swing.JLabel();
        btnActualizarListas = new javax.swing.JPanel();
        btnActulabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setName("VisualAdministrador"); // NOI18N
        setUndecorated(true);

        ventanaAdministrador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ventanaAdministrador.setToolTipText("");
        ventanaAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ventanaAdministrador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MateriasVisual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panelMaterias.setBackground(new java.awt.Color(234, 230, 230));

        desplegableMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "FINALIZADO", "HABILITADO", "CERRADO", "CANCELADO" }));
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
        ScrollMaterias.setViewportView(listaCursos);

        labelCursosTitulos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCursosTitulos.setText("INFORMACION DEL CURSO");

        labelID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelID.setText("ID:");

        labelNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNombre.setText("Nombre:");

        labelDocente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDocente.setText("Docente a cargo:");

        labelEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEstado.setText("Estado:");

        labelCapacidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCapacidad.setText("Capacidad del curso:");

        labelCantidadInscriptos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCantidadInscriptos.setText("Cantidad de inscriptos:");

        btCancelarCurso.setBackground(new java.awt.Color(153, 204, 255));
        btCancelarCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCancelarCursoMouseClicked(evt);
            }
        });

        labelCancelar.setText("Cancelar");

        javax.swing.GroupLayout btCancelarCursoLayout = new javax.swing.GroupLayout(btCancelarCurso);
        btCancelarCurso.setLayout(btCancelarCursoLayout);
        btCancelarCursoLayout.setHorizontalGroup(
            btCancelarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btCancelarCursoLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(labelCancelar)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        btCancelarCursoLayout.setVerticalGroup(
            btCancelarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btCancelarCursoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCancelar)
                .addContainerGap())
        );

        listaCursosPropuestos.setBackground(new java.awt.Color(234, 230, 230));
        listaCursosPropuestos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listaCursosPropuestos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaCursosPropuestos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaCursosPropuestosValueChanged(evt);
            }
        });
        scrollCursosporHabilitar.setViewportView(listaCursosPropuestos);

        labelCursosTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCursosTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCursosTitulo.setText("Cursos por habilitar");

        btHabilitarCurso.setBackground(new java.awt.Color(153, 204, 255));
        btHabilitarCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btHabilitarCursoMouseClicked(evt);
            }
        });

        labelbtnHabilitar.setText("Habilitar");

        javax.swing.GroupLayout btHabilitarCursoLayout = new javax.swing.GroupLayout(btHabilitarCurso);
        btHabilitarCurso.setLayout(btHabilitarCursoLayout);
        btHabilitarCursoLayout.setHorizontalGroup(
            btHabilitarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btHabilitarCursoLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(labelbtnHabilitar)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        btHabilitarCursoLayout.setVerticalGroup(
            btHabilitarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btHabilitarCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelbtnHabilitar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMateriasLayout = new javax.swing.GroupLayout(panelMaterias);
        panelMaterias.setLayout(panelMateriasLayout);
        panelMateriasLayout.setHorizontalGroup(
            panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desplegableMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrollMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCursosTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollCursosporHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(197, 197, 197)
                .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMateriasLayout.createSequentialGroup()
                        .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCursosTitulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelMateriasLayout.createSequentialGroup()
                                .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelID)
                                    .addComponent(labelNombre)
                                    .addComponent(labelDocente)
                                    .addComponent(labelEstado)
                                    .addComponent(labelCapacidad)
                                    .addComponent(labelCantidadInscriptos)
                                    .addComponent(btHabilitarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)))
                        .addContainerGap())
                    .addGroup(panelMateriasLayout.createSequentialGroup()
                        .addComponent(btCancelarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        panelMateriasLayout.setVerticalGroup(
            panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMateriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desplegableMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCursosTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollCursosporHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMateriasLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labelCursosTitulos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDocente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCapacidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCantidadInscriptos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(btHabilitarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCancelarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout MateriasVisualLayout = new javax.swing.GroupLayout(MateriasVisual);
        MateriasVisual.setLayout(MateriasVisualLayout);
        MateriasVisualLayout.setHorizontalGroup(
            MateriasVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MateriasVisualLayout.setVerticalGroup(
            MateriasVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ventanaAdministrador.add(MateriasVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 910, 480));

        Usuario_info.setBackground(new java.awt.Color(9, 69, 108));
        Usuario_info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CambiarContraBt.setBackground(new java.awt.Color(255, 255, 255));
        CambiarContraBt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CambiarContraBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CambiarContraBtMouseClicked(evt);
            }
        });

        labelCambiarContra.setText("CAMBIAR CONTRASEÑAS");

        javax.swing.GroupLayout CambiarContraBtLayout = new javax.swing.GroupLayout(CambiarContraBt);
        CambiarContraBt.setLayout(CambiarContraBtLayout);
        CambiarContraBtLayout.setHorizontalGroup(
            CambiarContraBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiarContraBtLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelCambiarContra)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        CambiarContraBtLayout.setVerticalGroup(
            CambiarContraBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambiarContraBtLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCambiarContra)
                .addContainerGap())
        );

        CerrarSesionBt.setBackground(new java.awt.Color(255, 255, 255));
        CerrarSesionBt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CerrarSesionBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionBtMouseClicked(evt);
            }
        });

        labelbtnCerrrarSesion.setText("CERRAR SESION");

        javax.swing.GroupLayout CerrarSesionBtLayout = new javax.swing.GroupLayout(CerrarSesionBt);
        CerrarSesionBt.setLayout(CerrarSesionBtLayout);
        CerrarSesionBtLayout.setHorizontalGroup(
            CerrarSesionBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CerrarSesionBtLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelbtnCerrrarSesion)
                .addGap(51, 51, 51))
        );
        CerrarSesionBtLayout.setVerticalGroup(
            CerrarSesionBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CerrarSesionBtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelbtnCerrrarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProfilePic.setMaximumSize(new java.awt.Dimension(150, 150));
        ProfilePic.setMinimumSize(new java.awt.Dimension(150, 150));
        ProfilePic.setName(""); // NOI18N

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgperf/DefaultProfilePic.png"))); // NOI18N

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

        Logo8.setBackground(new java.awt.Color(9, 69, 108));

        icon7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgperf/FondoSinBg.png"))); // NOI18N

        javax.swing.GroupLayout Logo8Layout = new javax.swing.GroupLayout(Logo8);
        Logo8.setLayout(Logo8Layout);
        Logo8Layout.setHorizontalGroup(
            Logo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
            .addGroup(Logo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Logo8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(icon7)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Logo8Layout.setVerticalGroup(
            Logo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
            .addGroup(Logo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Logo8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(icon7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout Usuario_infoLayout = new javax.swing.GroupLayout(Usuario_info);
        Usuario_info.setLayout(Usuario_infoLayout);
        Usuario_infoLayout.setHorizontalGroup(
            Usuario_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Usuario_infoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Usuario_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Usuario_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Usuario_infoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Logo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Usuario_infoLayout.createSequentialGroup()
                        .addGroup(Usuario_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CerrarSesionBt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCambiarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Usuario_infoLayout.createSequentialGroup()
                                .addComponent(CambiarContraBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        Usuario_infoLayout.setVerticalGroup(
            Usuario_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Usuario_infoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCambiarFoto)
                .addGap(12, 12, 12)
                .addComponent(Logo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(CambiarContraBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CerrarSesionBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        ventanaAdministrador.add(Usuario_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 200, 480));

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

        UsuariosBt.setBackground(new java.awt.Color(204, 204, 204));
        UsuariosBt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UsuariosBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuariosBtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsuariosBtMouseEntered(evt);
            }
        });

        jLabel5.setText("USUARIOS");

        javax.swing.GroupLayout UsuariosBtLayout = new javax.swing.GroupLayout(UsuariosBt);
        UsuariosBt.setLayout(UsuariosBtLayout);
        UsuariosBtLayout.setHorizontalGroup(
            UsuariosBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuariosBtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UsuariosBtLayout.setVerticalGroup(
            UsuariosBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuariosBtLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MateriasBt.setBackground(new java.awt.Color(204, 204, 204));
        MateriasBt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MateriasBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MateriasBtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MateriasBtMouseEntered(evt);
            }
        });

        jLabel6.setText("MATERIAS");

        javax.swing.GroupLayout MateriasBtLayout = new javax.swing.GroupLayout(MateriasBt);
        MateriasBt.setLayout(MateriasBtLayout);
        MateriasBtLayout.setHorizontalGroup(
            MateriasBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MateriasBtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MateriasBtLayout.setVerticalGroup(
            MateriasBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MateriasBtLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout superiorTabLayout = new javax.swing.GroupLayout(superiorTab);
        superiorTab.setLayout(superiorTabLayout);
        superiorTabLayout.setHorizontalGroup(
            superiorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, superiorTabLayout.createSequentialGroup()
                .addComponent(UsuariosBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MateriasBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 958, Short.MAX_VALUE)
                .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        superiorTabLayout.setVerticalGroup(
            superiorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(superiorTabLayout.createSequentialGroup()
                .addGroup(superiorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(MateriasBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Exit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsuariosBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ventanaAdministrador.add(superiorTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 20));

        UsuariosVisual.setBackground(new java.awt.Color(51, 153, 255));
        UsuariosVisual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listaAlumnos.setBackground(new java.awt.Color(234, 230, 230));
        listaAlumnos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listaAlumnos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaAlumnos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaAlumnosValueChanged(evt);
            }
        });
        AlumnosJlist.setViewportView(listaAlumnos);

        listaProfesores.setBackground(new java.awt.Color(234, 230, 230));
        listaProfesores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listaProfesores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaProfesores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaProfesoresValueChanged(evt);
            }
        });
        ProfesoresJlist.setViewportView(listaProfesores);

        listaSuspendidos.setBackground(new java.awt.Color(234, 230, 230));
        listaSuspendidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listaSuspendidos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaSuspendidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaSuspendidosMouseClicked(evt);
            }
        });
        listaSuspendidos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaSuspendidosValueChanged(evt);
            }
        });
        UsuariosSuspendidosJlist.setViewportView(listaSuspendidos);

        AgregarBt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AgregarBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarBtMouseClicked(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("AGREGAR USUARIOS");

        javax.swing.GroupLayout AgregarBtLayout = new javax.swing.GroupLayout(AgregarBt);
        AgregarBt.setLayout(AgregarBtLayout);
        AgregarBtLayout.setHorizontalGroup(
            AgregarBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AgregarBtLayout.setVerticalGroup(
            AgregarBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarBtLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(10, 10, 10))
        );

        GestionarBt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        GestionarBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GestionarBtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GestionarBtMouseEntered(evt);
            }
        });

        GestionarBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GestionarBtn.setText("GESTIONAR USUARIO");

        javax.swing.GroupLayout GestionarBtLayout = new javax.swing.GroupLayout(GestionarBt);
        GestionarBt.setLayout(GestionarBtLayout);
        GestionarBtLayout.setHorizontalGroup(
            GestionarBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GestionarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GestionarBtLayout.setVerticalGroup(
            GestionarBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestionarBtLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(GestionarBtn)
                .addGap(10, 10, 10))
        );

        Logo.setBackground(new java.awt.Color(51, 153, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgperf/FondoSinBg.png"))); // NOI18N

        javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
        Logo.setLayout(LogoLayout);
        LogoLayout.setHorizontalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        LogoLayout.setVerticalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Alumnos_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Alumnos_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Alumnos_txt.setText("ALUMNOS");

        Profesores_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Profesores_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Profesores_txt.setText("PROFESORES");

        UsuariosSuspendidos_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UsuariosSuspendidos_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuariosSuspendidos_txt.setText("USUARIOS SUSPENDIDOS");

        btnActulabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActulabel.setText("ACTUALIZAR LISTAS");
        btnActulabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActulabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnActualizarListasLayout = new javax.swing.GroupLayout(btnActualizarListas);
        btnActualizarListas.setLayout(btnActualizarListasLayout);
        btnActualizarListasLayout.setHorizontalGroup(
            btnActualizarListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActulabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnActualizarListasLayout.setVerticalGroup(
            btnActualizarListasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActulabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout UsuariosVisualLayout = new javax.swing.GroupLayout(UsuariosVisual);
        UsuariosVisual.setLayout(UsuariosVisualLayout);
        UsuariosVisualLayout.setHorizontalGroup(
            UsuariosVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuariosVisualLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(UsuariosVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AlumnosJlist, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(Alumnos_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(UsuariosVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProfesoresJlist, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(Profesores_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(UsuariosVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UsuariosSuspendidosJlist, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(UsuariosSuspendidos_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(UsuariosVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizarListas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GestionarBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AgregarBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        UsuariosVisualLayout.setVerticalGroup(
            UsuariosVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuariosVisualLayout.createSequentialGroup()
                .addGroup(UsuariosVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(UsuariosVisualLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(AgregarBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(GestionarBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(btnActualizarListas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UsuariosVisualLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(UsuariosVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alumnos_txt)
                            .addComponent(Profesores_txt)
                            .addComponent(UsuariosSuspendidos_txt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UsuariosVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ProfesoresJlist, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(AlumnosJlist, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuariosSuspendidosJlist))))
                .addGap(40, 40, 40))
        );

        ventanaAdministrador.add(UsuariosVisual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 910, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ventanaAdministrador.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Boton para cerrar la aplicacion.
     *
     * @param evt Evento de clic del mouse.
     */
    private void btn_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ExitMouseClicked
        this.insti.serealizar(Instituto.NOMBRE_ARCHIVO);
        System.exit(0);
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

    private void UsuariosBtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosBtMouseEntered
        MateriasBt.setBackground(Color.lightGray);
        UsuariosBt.setBackground(Color.cyan);
    }//GEN-LAST:event_UsuariosBtMouseEntered

    private void MateriasBtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasBtMouseEntered
        UsuariosBt.setBackground(Color.lightGray);
        MateriasBt.setBackground(Color.cyan);
    }//GEN-LAST:event_MateriasBtMouseEntered
    /**
     * Boton que despliega la ventana para crear un agregar un nuevo usuario al
     * sistema
     *
     * @param evt Evento de clic del mouse.
     */
    private void AgregarBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarBtMouseClicked
        Visual_AgregarUsuario NuevoAlumno = new Visual_AgregarUsuario(this.insti);
        NuevoAlumno.setVisible(true);
        NuevoAlumno.setLocationRelativeTo(null);
    }//GEN-LAST:event_AgregarBtMouseClicked
    /**
     * Boton que despliega la ventana para gestionar un usuario seleccionado
     *
     * @param evt Evento de clic del mouse.
     */
    private void GestionarBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestionarBtMouseClicked
        Usuario usuario_seleccionado = null;
        if (!(listaAlumnos.isSelectionEmpty())) {
            usuario_seleccionado = (Usuario) model_alumnos.get(listaAlumnos.getSelectedIndex());
        }
        if (!(listaProfesores.isSelectionEmpty())) {
            usuario_seleccionado = (Usuario) model_profesores.get(listaProfesores.getSelectedIndex());
        }
        if (!(listaSuspendidos.isSelectionEmpty())) {
            usuario_seleccionado = (Usuario) model_suspendidos.get(listaSuspendidos.getSelectedIndex());
        }
        if (usuario_seleccionado != null) {
            Visual_GestionUsuario GestionUsuario = new Visual_GestionUsuario(usuario_seleccionado);
            GestionUsuario.setVisible(true);
            GestionUsuario.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_GestionarBtMouseClicked
    /**
     * Abre la pestaña de que permite ver los usuarios del sistema y
     * gestionarlos
     *
     * @param evt Evento de clic del mouse.
     */
    private void UsuariosBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosBtMouseClicked
        actualizarListas();
        MateriasVisual.setVisible(false);
        UsuariosVisual.setVisible(true);
    }//GEN-LAST:event_UsuariosBtMouseClicked
    /**
     * Abre la pestaña de que permite ver las materias cargadas al sistema y
     * gestionarlass
     *
     * @param evt Evento de clic del mouse.
     */
    private void MateriasBtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MateriasBtMouseClicked
        cargarCursosPropuestos();
        cargarCursos();
        MateriasVisual.setVisible(true);
        UsuariosVisual.setVisible(false);
    }//GEN-LAST:event_MateriasBtMouseClicked
    /**
     * Actualiza las listas de alumnos, profesores y suspendidos en la interfaz.
     */
    private void actualizarListas() {
        model_alumnos.removeAllElements();
        model_profesores.removeAllElements();
        model_suspendidos.removeAllElements();

        for (Usuario usu : this.insti.getUsuarios()) {
            if (usu.isCuentaDeshabilitada()) {
                model_suspendidos.addElement(usu);
            } else {
                if (usu.soyAlumno()) {
                    model_alumnos.addElement(usu);
                }
                if (usu.soyProfesor()) {
                    model_profesores.addElement(usu);
                }
            }
        }
    }

    /**
     * Controla la seleccion dentro de las listas, no permite que se seleccione
     * otro elemento de una lista distinta y muestra el boton de gestionar al
     * usuario
     *
     * @param evt Evento del estado del item.
     */
    private void listaAlumnosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaAlumnosValueChanged
        listaProfesores.clearSelection();
        listaSuspendidos.clearSelection();
        if (!(listaAlumnos.isSelectionEmpty())) {
            GestionarBt.setVisible(true);
        } else {
            GestionarBt.setVisible(false);
        }
    }//GEN-LAST:event_listaAlumnosValueChanged
    /**
     * Controla la seleccion dentro de las listas, no permite que se seleccione
     * otro elemento de una lista distinta y muestra el boton de gestionar al
     * usuario
     *
     * @param evt Evento del estado del item.
     */
    private void listaProfesoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProfesoresValueChanged
        listaAlumnos.clearSelection();
        listaSuspendidos.clearSelection();
        if (!(listaProfesores.isSelectionEmpty())) {
            GestionarBt.setVisible(true);
        } else {
            GestionarBt.setVisible(false);
        }
    }//GEN-LAST:event_listaProfesoresValueChanged
    /**
     * Controla la seleccion dentro de las listas, no permite que se seleccione
     * otro elemento de una lista distinta y muestra el boton de gestionar al
     * usuario
     *
     * @param evt Evento del estado del item.
     */
    private void listaSuspendidosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaSuspendidosValueChanged
        listaProfesores.clearSelection();
        listaAlumnos.clearSelection();
        if (!(listaSuspendidos.isSelectionEmpty())) {
            GestionarBt.setVisible(true);
        } else {
            GestionarBt.setVisible(false);
        }
    }//GEN-LAST:event_listaSuspendidosValueChanged

    /**
     * Carga las listas con los cursos segun el estado del curso.
     *
     * @param estado El estado de los cursos a cargar.
     */
    public void cargarCursos(int estado) {
        model_cursos.clear();
        ArrayList<Curso> cursos_totales = this.insti.getCursos();
        for (int i = 0; i < cursos_totales.size(); i++) {
            if (cursos_totales.get(i).getEstadoCurso() == estado) {
                model_cursos.addElement(cursos_totales.get(i));
            }
        }
        model_cursos.addElement(' ');
    }

    /**
     * Carga las listas con los cursos excluyendo aquellos con estado 4, el cual
     * indica que un curso esta propuesto y todavia falta la aprobacion del
     * administrador.
     */
    private void cargarCursos() {
        model_cursos.clear();
        ArrayList<Curso> cursos_totales = this.insti.getCursos();
        for (int i = 0; i < cursos_totales.size(); i++) {
            if (cursos_totales.get(i).getEstadoCurso() != 4) {
                model_cursos.addElement(cursos_totales.get(i));
            }
        }
        model_cursos.addElement(' ');
    }

    /**
     * Carga los cursos propuestos, son los que tengan el estado 4.
     */
    private void cargarCursosPropuestos() {
        model_cursos_propuestos.clear();
        ArrayList<Curso> cursos_totales = this.insti.getCursos();
        for (int i = 0; i < cursos_totales.size(); i++) {
            if (cursos_totales.get(i).getEstadoCurso() == 4) {
                model_cursos_propuestos.addElement(cursos_totales.get(i));
            }
        }
        model_cursos_propuestos.addElement(' ');
    }

    /**
     * Determina que materias se mostraran en la lista de cursos (Todos,
     * propuestos, habilitados, cancelados, finalizados, cerrados)
     *
     * @param evt Evento del estado del item.
     */
    private void desplegableMateriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_desplegableMateriasItemStateChanged
        int selected = desplegableMaterias.getSelectedIndex();
        if (selected != 0) {
            cargarCursos(selected - 1);
        } else {
            cargarCursos();
        }
        cargarCursosPropuestos();
    }//GEN-LAST:event_desplegableMateriasItemStateChanged

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

        if (!(listaCursosPropuestos.isSelectionEmpty())) {
            if (!(model_cursos_propuestos.get(listaCursosPropuestos.getSelectedIndex()).equals(' '))) {
                curso_seleccionado = (Curso) model_cursos_propuestos.get(listaCursosPropuestos.getSelectedIndex());
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
            labelDocente.setText("Docente: " + curso.getDocente().getNombre() + " " + curso.getDocente().getDocumento());
            labelEstado.setText("Estado: " + curso.getEstadoCurso());
            labelCapacidad.setText("Capacidad: " + curso.getTamanio_curso());
            labelCantidadInscriptos.setText("Cantidad: " + curso.getAlumnosCursando().size());
        }
    }

    /**
     * Determina que boton mostrar dependiendo del curso seleccionado en la
     * lista
     *
     * @param evt Evento de clic del mouse.
     */

    private void listaCursosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaCursosValueChanged
        listaCursosPropuestos.clearSelection();
        Curso curso_seleccionado = levantarCurso();
        imprimirCurso(curso_seleccionado);
        if (curso_seleccionado != null) {
            switch (curso_seleccionado.getEstadoCurso()) {
                case 0:
                    btCancelarCurso.setVisible(true);
                    btHabilitarCurso.setVisible(false);
                    break;
                case 4:
                    btCancelarCurso.setVisible(true);
                    btHabilitarCurso.setVisible(true);
                    break;
                default:
                    btCancelarCurso.setVisible(false);
                    btHabilitarCurso.setVisible(false);
                    break;
            }
        } else {
            btCancelarCurso.setVisible(false);
            btHabilitarCurso.setVisible(false);
        }


    }//GEN-LAST:event_listaCursosValueChanged
    /**
     * Determina que boton mostrar dependiendo del curso seleccionado en la
     * lista
     *
     * @param evt Evento de clic del mouse.
     */

    private void listaCursosPropuestosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaCursosPropuestosValueChanged
        listaCursos.clearSelection();
        Curso curso_seleccionado = levantarCurso();
        imprimirCurso(curso_seleccionado);
        if (curso_seleccionado != null) {
            switch (curso_seleccionado.getEstadoCurso()) {
                case 0:
                    btCancelarCurso.setVisible(true);
                    btHabilitarCurso.setVisible(false);
                    break;
                case 4:
                    btCancelarCurso.setVisible(true);
                    btHabilitarCurso.setVisible(true);
                    break;
                default:
                    btCancelarCurso.setVisible(false);
                    btHabilitarCurso.setVisible(false);
                    break;
            }
        } else {
            btCancelarCurso.setVisible(false);
            btHabilitarCurso.setVisible(false);
        }
    }//GEN-LAST:event_listaCursosPropuestosValueChanged
    /**
     * Boton que permite, en caso de ser posible, habilitar un curso propuesto
     * en caso contrario avisa con un OptionPane que se seleccione un curso
     * valido
     *
     * @param evt Evento de clic del mouse.
     */
    private void btHabilitarCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHabilitarCursoMouseClicked
        Curso curso_seleccionado = levantarCurso();
        if (curso_seleccionado == null || curso_seleccionado.getEstadoCurso() != 4) {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un curso valido para habilitar");
        } else {
            curso_seleccionado.setEstadoCurso(1);
            this.insti.serealizar(Instituto.NOMBRE_ARCHIVO);
            JOptionPane.showMessageDialog(rootPane, "El curso fue habilitado correctamente", "CURSO MODIFICADO", JOptionPane.INFORMATION_MESSAGE);
        }
        cargarCursos();
        cargarCursosPropuestos();
    }//GEN-LAST:event_btHabilitarCursoMouseClicked
    /**
     * Boton que permite, en caso de ser posible, cancelar un curso seleccionado
     * en caso contrario avisa con un OptionPane que se seleccione un curso
     * valido
     *
     * @param evt Evento de clic del mouse.
     */
    private void btCancelarCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarCursoMouseClicked
        Curso curso_seleccionado = levantarCurso();
        if (curso_seleccionado == null || (curso_seleccionado.getEstadoCurso() != 4 && curso_seleccionado.getEstadoCurso() != 0)) {
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un curso valido para cancelar");
        } else {
            curso_seleccionado.setEstadoCurso(3);
            JOptionPane.showMessageDialog(rootPane, "El curso fue cancelado correctamente", "CURSO MODIFICADO", JOptionPane.INFORMATION_MESSAGE);
            this.insti.serealizar(Instituto.NOMBRE_ARCHIVO);
        }
        cargarCursos();
        cargarCursosPropuestos();
    }//GEN-LAST:event_btCancelarCursoMouseClicked

    private void listaSuspendidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaSuspendidosMouseClicked

    }//GEN-LAST:event_listaSuspendidosMouseClicked
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
                } else {

                    String Direccion_Imagen_Perfil = this.usuario.getDocumento() + "ProfilePic.png";

                    BufferedImage ImagenRedimensionada = RedimensionarImagen(img);
                    ImageIO.write(ImagenRedimensionada, "png", new File(Direccion_Imagen_Perfil));
                    JOptionPane.showMessageDialog(null, "Imagen guardada exitosamente.");
                    ImageIcon icon = new ImageIcon(ImagenRedimensionada);
                    foto.setIcon(icon);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar la imagen.");
            }
        }

    }//GEN-LAST:event_btnCambiarFotoMouseClicked
    /**
     * Boton para actualizar las listas de usuarios
     *
     * @param evt Evento del mouse.
     */
    private void btnActulabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActulabelMouseClicked
        actualizarListas();
    }//GEN-LAST:event_btnActulabelMouseClicked

    private void GestionarBtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestionarBtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_GestionarBtMouseEntered
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
     * Inicializa los componentes necesarios para el correcto funcionamiento de
     * esta ventana grafica
     */
    private void iniciarlizarVentana() {
        //ventana usuarios
        listaAlumnos.setModel(model_alumnos);
        listaProfesores.setModel(model_profesores);
        listaSuspendidos.setModel(model_suspendidos);

        //ventana cursos
        listaCursos.setModel(model_cursos);
        listaCursosPropuestos.setModel(model_cursos_propuestos);

        MateriasVisual.setVisible(false);
        UsuariosVisual.setVisible(true);
        btCancelarCurso.setVisible(false);
        btHabilitarCurso.setVisible(false);

        cargarCursosPropuestos();
        cargarCursos();
        actualizarListas();

        CargarImagen();

        GestionarBt.setVisible(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarBt;
    private javax.swing.JScrollPane AlumnosJlist;
    private javax.swing.JLabel Alumnos_txt;
    private javax.swing.JPanel CambiarContraBt;
    private javax.swing.JPanel CerrarSesionBt;
    private javax.swing.JPanel GestionarBt;
    private javax.swing.JLabel GestionarBtn;
    private javax.swing.JPanel Logo;
    private javax.swing.JPanel Logo1;
    private javax.swing.JPanel Logo2;
    private javax.swing.JPanel Logo3;
    private javax.swing.JPanel Logo4;
    private javax.swing.JPanel Logo5;
    private javax.swing.JPanel Logo6;
    private javax.swing.JPanel Logo7;
    private javax.swing.JPanel Logo8;
    private javax.swing.JPanel MateriasBt;
    private javax.swing.JPanel MateriasVisual;
    private javax.swing.JScrollPane ProfesoresJlist;
    private javax.swing.JLabel Profesores_txt;
    private javax.swing.JPanel ProfilePic;
    private javax.swing.JScrollPane ScrollMaterias;
    private javax.swing.JPanel Usuario_info;
    private javax.swing.JPanel UsuariosBt;
    private javax.swing.JScrollPane UsuariosSuspendidosJlist;
    private javax.swing.JLabel UsuariosSuspendidos_txt;
    private javax.swing.JPanel UsuariosVisual;
    private javax.swing.JPanel btCancelarCurso;
    private javax.swing.JPanel btHabilitarCurso;
    private javax.swing.JPanel btnActualizarListas;
    private javax.swing.JLabel btnActulabel;
    private javax.swing.JLabel btnCambiarFoto;
    private javax.swing.JLabel btn_Exit;
    private javax.swing.JComboBox<String> desplegableMaterias;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JLabel icon6;
    private javax.swing.JLabel icon7;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCambiarContra;
    private javax.swing.JLabel labelCancelar;
    private javax.swing.JLabel labelCantidadInscriptos;
    private javax.swing.JLabel labelCapacidad;
    private javax.swing.JLabel labelCursosTitulo;
    private javax.swing.JLabel labelCursosTitulos;
    private javax.swing.JLabel labelDocente;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelbtnCerrrarSesion;
    private javax.swing.JLabel labelbtnHabilitar;
    private javax.swing.JList<String> listaAlumnos;
    private javax.swing.JList<String> listaCursos;
    private javax.swing.JList<String> listaCursosPropuestos;
    private javax.swing.JList<String> listaProfesores;
    private javax.swing.JList<String> listaSuspendidos;
    private javax.swing.JPanel panelMaterias;
    private javax.swing.JScrollPane scrollCursosporHabilitar;
    private javax.swing.JPanel superiorTab;
    private javax.swing.JPanel ventanaAdministrador;
    // End of variables declaration//GEN-END:variables
}
