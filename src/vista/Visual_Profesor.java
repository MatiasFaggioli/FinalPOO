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
 * La clase Visual_Profesor es la interfaz visual que van a ver los docentes del
 * instituto una vez q ingrese al sistema. Permite al docente sus cursos.
 */
public class Visual_Profesor extends javax.swing.JFrame {

    private Instituto insti;
    private Profesor usuario;
    int xMouse, yMouse;

    private ArrayList<Alumno> array_alumnos;
    private DefaultListModel model_cursos = new DefaultListModel<>();
    private DefaultListModel model_alumnos_inscriptos = new DefaultListModel<>();

    /**
     * Constructor de la clase Visual_Profesor.
     *
     * @param usuario El profesor que utiliza la interfaz.
     * @param insti El instituto al que pertenece el profesor.
     */
    public Visual_Profesor(Profesor usuario, Instituto insti) {
        initComponents();
        this.insti = insti;
        this.usuario = usuario;

        this.array_alumnos = new ArrayList<>();

        inicializarVentana();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        superiorTab4 = new javax.swing.JPanel();
        btn_Exit4 = new javax.swing.JLabel();
        Usuario_info = new javax.swing.JPanel();
        CambiarContraBt = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CerrarSesionBt = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ProfilePic1 = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Logo = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        desplegableMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCursos = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        IDlabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaInscriptios = new javax.swing.JList<>();
        jLabel21 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnProponerCurso = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        btn_Exit4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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
                .addContainerGap(1056, Short.MAX_VALUE)
                .addComponent(btn_Exit4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        superiorTab4Layout.setVerticalGroup(
            superiorTab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(superiorTab4Layout.createSequentialGroup()
                .addComponent(btn_Exit4)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel1.add(superiorTab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 20));

        Usuario_info.setBackground(new java.awt.Color(9, 69, 108));
        Usuario_info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CambiarContraBt.setBackground(new java.awt.Color(255, 255, 255));
        CambiarContraBt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CambiarContraBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CambiarContraBtMouseClicked(evt);
            }
        });

        jLabel1.setText("CAMBIAR CONTRASEÑAS");

        javax.swing.GroupLayout CambiarContraBtLayout = new javax.swing.GroupLayout(CambiarContraBt);
        CambiarContraBt.setLayout(CambiarContraBtLayout);
        CambiarContraBtLayout.setHorizontalGroup(
            CambiarContraBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiarContraBtLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CambiarContraBtLayout.setVerticalGroup(
            CambiarContraBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambiarContraBtLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        CerrarSesionBt.setBackground(new java.awt.Color(255, 255, 255));
        CerrarSesionBt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CerrarSesionBt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionBtMouseClicked(evt);
            }
        });

        jLabel2.setText("CERRAR SESION");

        javax.swing.GroupLayout CerrarSesionBtLayout = new javax.swing.GroupLayout(CerrarSesionBt);
        CerrarSesionBt.setLayout(CerrarSesionBtLayout);
        CerrarSesionBtLayout.setHorizontalGroup(
            CerrarSesionBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CerrarSesionBtLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(51, 51, 51))
        );
        CerrarSesionBtLayout.setVerticalGroup(
            CerrarSesionBtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CerrarSesionBtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProfilePic1.setMaximumSize(new java.awt.Dimension(150, 150));
        ProfilePic1.setMinimumSize(new java.awt.Dimension(150, 150));
        ProfilePic1.setName(""); // NOI18N

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imgperf/DefaultProfilePic.png"))); // NOI18N

        javax.swing.GroupLayout ProfilePic1Layout = new javax.swing.GroupLayout(ProfilePic1);
        ProfilePic1.setLayout(ProfilePic1Layout);
        ProfilePic1Layout.setHorizontalGroup(
            ProfilePic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ProfilePic1Layout.setVerticalGroup(
            ProfilePic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CAMBIAR FOTO");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
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
                    .addComponent(CambiarContraBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CerrarSesionBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Usuario_infoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ProfilePic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Usuario_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Usuario_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Usuario_infoLayout.setVerticalGroup(
            Usuario_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Usuario_infoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ProfilePic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(CambiarContraBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CerrarSesionBt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel1.add(Usuario_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 200, 480));

        jPanel6.setBackground(new java.awt.Color(234, 230, 230));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        desplegableMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "FINALIZADO", "HABILITADOS", "CERRADO", "CANCELADO", "PENDIENTE" }));
        desplegableMaterias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                desplegableMateriasItemStateChanged(evt);
            }
        });
        desplegableMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desplegableMateriasActionPerformed(evt);
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
        jScrollPane1.setViewportView(listaCursos);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("INFORMACION DEL CURSO");

        IDlabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IDlabel.setText("ID:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Nombre:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Estado:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Capacidad del curso:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Cantidad de inscriptos:");

        listaInscriptios.setBackground(new java.awt.Color(234, 230, 230));
        listaInscriptios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listaInscriptios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaInscriptios.setFocusable(false);
        listaInscriptios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaInscriptiosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaInscriptios);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Alumnos Inscriptos");

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setMaximumSize(new java.awt.Dimension(75, 28));
        btnCerrar.setMinimumSize(new java.awt.Dimension(75, 28));
        btnCerrar.setPreferredSize(new java.awt.Dimension(75, 28));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cerrar curso");

        javax.swing.GroupLayout btnCerrarLayout = new javax.swing.GroupLayout(btnCerrar);
        btnCerrar.setLayout(btnCerrarLayout);
        btnCerrarLayout.setHorizontalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnCerrarLayout.setVerticalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        btnProponerCurso.setBackground(new java.awt.Color(255, 255, 255));
        btnProponerCurso.setMaximumSize(new java.awt.Dimension(75, 28));
        btnProponerCurso.setMinimumSize(new java.awt.Dimension(75, 28));
        btnProponerCurso.setPreferredSize(new java.awt.Dimension(75, 28));
        btnProponerCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProponerCursoMouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Proponer curso");

        javax.swing.GroupLayout btnProponerCursoLayout = new javax.swing.GroupLayout(btnProponerCurso);
        btnProponerCurso.setLayout(btnProponerCursoLayout);
        btnProponerCursoLayout.setHorizontalGroup(
            btnProponerCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnProponerCursoLayout.setVerticalGroup(
            btnProponerCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        btnReiniciar.setBackground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setMaximumSize(new java.awt.Dimension(75, 28));
        btnReiniciar.setMinimumSize(new java.awt.Dimension(75, 28));
        btnReiniciar.setPreferredSize(new java.awt.Dimension(75, 28));
        btnReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReiniciarMouseClicked(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Reiniciar curso");

        javax.swing.GroupLayout btnReiniciarLayout = new javax.swing.GroupLayout(btnReiniciar);
        btnReiniciar.setLayout(btnReiniciarLayout);
        btnReiniciarLayout.setHorizontalGroup(
            btnReiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnReiniciarLayout.setVerticalGroup(
            btnReiniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        btnFinalizar.setBackground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setMaximumSize(new java.awt.Dimension(75, 28));
        btnFinalizar.setMinimumSize(new java.awt.Dimension(75, 28));
        btnFinalizar.setPreferredSize(new java.awt.Dimension(75, 28));
        btnFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinalizarMouseClicked(evt);
            }
        });

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Finalizar curso");
        jLabel20.setAlignmentX(0.5F);
        jLabel20.setMaximumSize(new java.awt.Dimension(75, 28));
        jLabel20.setMinimumSize(new java.awt.Dimension(75, 28));
        jLabel20.setPreferredSize(new java.awt.Dimension(75, 28));

        javax.swing.GroupLayout btnFinalizarLayout = new javax.swing.GroupLayout(btnFinalizar);
        btnFinalizar.setLayout(btnFinalizarLayout);
        btnFinalizarLayout.setHorizontalGroup(
            btnFinalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnFinalizarLayout.setVerticalGroup(
            btnFinalizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Cursos necesarios:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desplegableMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDlabel)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnReiniciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(btnProponerCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                            .addComponent(jLabel5))
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnProponerCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desplegableMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addGap(40, 40, 40))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 870, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
     * Metodo que permite que la ventana pueda ser arrastrada.
     *
     * @param evt Evento de movimiento del mouse.
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

    private void desplegableMateriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_desplegableMateriasItemStateChanged
        int selected = desplegableMaterias.getSelectedIndex();
        if (selected != 0) {
            cargarCursos(selected - 1);
        } else {
            cargarCursos();
        }
    }//GEN-LAST:event_desplegableMateriasItemStateChanged
    /**
     * Determina que materias se mostraran en la lista de cursos (TODOS,
     * FINALIZADO, HABILITADOS, CERRADO, CANCELADO, PENDIENTE)
     *
     * @param evt Evento del estado del item.
     */
    private void desplegableMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desplegableMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desplegableMateriasActionPerformed
    /**
     * Controla la seleccion dentro de las listas, no permite que se seleccione
     * otro elemento de una lista distinta y muestra el boton de reiniciar,
     * cancelar o finalizar segun el curso seleccionado
     *
     * @param evt Evento del estado del item.
     */
    private void listaCursosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaCursosValueChanged
        listaInscriptios.clearSelection();
        Curso curso_seleccionado = levantarCurso();
        imprimirCurso(curso_seleccionado);
        cargarAlumnosInscriptos();
        if (curso_seleccionado != null) {
            switch (curso_seleccionado.getEstadoCurso()) {
                case 0:
                    btnReiniciar.setVisible(true);
                    btnCerrar.setVisible(false);
                    btnFinalizar.setVisible(false);
                    break;
                case 1:
                    btnReiniciar.setVisible(false);
                    btnCerrar.setVisible(true);
                    btnFinalizar.setVisible(false);
                    break;
                case 2:
                    btnReiniciar.setVisible(false);
                    btnCerrar.setVisible(false);
                    btnFinalizar.setVisible(true);
                    break;
                default:
                    btnReiniciar.setVisible(false);
                    btnCerrar.setVisible(false);
                    btnFinalizar.setVisible(false);
                    break;
            }
        } else {
            btnReiniciar.setVisible(false);
            btnCerrar.setVisible(false);
            btnFinalizar.setVisible(false);
        }

    }//GEN-LAST:event_listaCursosValueChanged
    /**
     *
     * Imprime la informacion del curso seleccionado
     *
     * @param evt Evento del estado del item.
     */
    private void listaInscriptiosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaInscriptiosValueChanged
        listaCursos.clearSelection();
        Curso curso_seleccionado = levantarCurso();
        imprimirCurso(curso_seleccionado);
    }//GEN-LAST:event_listaInscriptiosValueChanged
    /**
     * Boton que sirve para desplegar la ventana para proponer un curso nuevo
     *
     * @param evt Evento del estado del item.
     */
    private void btnProponerCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProponerCursoMouseClicked
        vista.popups.Visual_GestionDeCursos visual_crearCurso = new vista.popups.Visual_GestionDeCursos(this.insti, this.usuario);
        visual_crearCurso.setVisible(true);
        visual_crearCurso.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnProponerCursoMouseClicked
    /**
     * Boton que sirve para reiniciar un curso seleccionado
     *
     * @param evt Evento del estado del item.
     */
    private void btnReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReiniciarMouseClicked
        int resp = JOptionPane.showConfirmDialog(rootPane, "Desea reiniciar el curso seleccionado?", "Atencion", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == resp) {
            Curso curso_seleccionado = levantarCurso();
            if (curso_seleccionado != null) {
                curso_seleccionado.setEstadoCurso(1);
                this.insti.serealizar(Instituto.NOMBRE_ARCHIVO);
                JOptionPane.showMessageDialog(rootPane, "Curso reiniciado correctamente", "Curso Reiniciado", 1);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Porfavor seleccione un curso valido", "ERROR", 2);
            }

        }
    }//GEN-LAST:event_btnReiniciarMouseClicked
    /**
     * Boton que sirve para cerrar un curso seleccionado
     *
     * @param evt Evento del estado del item.
     */
    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        int resp = JOptionPane.showConfirmDialog(rootPane, "Desea cerrar el curso seleccionado?"
                + "\n" + "Si lo hace ningun alumno podra inscribirse", "Atencion", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_OPTION == resp) {
            Curso curso_seleccionado = levantarCurso();
            curso_seleccionado.setEstadoCurso(2);
            this.insti.serealizar(Instituto.NOMBRE_ARCHIVO);
            JOptionPane.showMessageDialog(rootPane, "Curso cerrado correctamente");

        }
    }//GEN-LAST:event_btnCerrarMouseClicked
    /**
     * Boton que sirve para finalizar un curso seleccionado
     *
     * @param evt Evento del estado del item.
     */
    private void btnFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarMouseClicked
        Curso curso_seleccionado = levantarCurso();
        Visual_FinalizarCurso visual = new Visual_FinalizarCurso(this.insti, this.usuario, curso_seleccionado);
        visual.setVisible(true);
        visual.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(rootPane, "El curso fue finalizado correctamente", "CURSO MODIFICADO", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnFinalizarMouseClicked
    /**
     * Permite al usuario seleccionar una nueva foto de perfil.
     *
     * @param evt Evento del mouse.
     */
    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
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

    }//GEN-LAST:event_jLabel6MouseClicked
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
     * '0' equivale a mostrar todos los cursos FINALIZADOS.
     * '1' equivale a mostrar todos los cursos HABILITADOS.
     * '2' equivale a mostrar todos los cursos CERRADOS.
     * '3' equivale a mostrar todos los cursos CANCELADOS.
     * '4' equivale a mostrar todos los cursos PROPUESTOS.
     *
     *
     * @param estado El filtro para cargar los cursos (0: Todos, 1: Aprobados, 2:
     * Cursando).
     */
    public void cargarCursos(int estado) {
        model_cursos.clear();
        ArrayList<Curso> cursos_totales = this.insti.getCursos();
        for (int i = 0; i < cursos_totales.size(); i++) {
            if (cursos_totales.get(i).getDocente().getDocumento().equals(usuario.getDocumento()) && (cursos_totales.get(i).getEstadoCurso() == estado)) {
                model_cursos.addElement(cursos_totales.get(i));
            }
        }
        model_cursos.addElement(' ');
    }
     /**
     * Carga todos los cursos dictados por el docente.
     */
    private void cargarCursos() {
        model_cursos.clear();

        ArrayList<Curso> cursos_totales = this.insti.getCursos();
        for (int i = 0; i < cursos_totales.size(); i++) {
            if (cursos_totales.get(i).getDocente().getNombre().equals(usuario.getNombre())) {
                model_cursos.addElement(cursos_totales.get(i));
            }
        }
        model_cursos.addElement(' ');
    }

    /**
     * Permite mostrar los alumnos inscriptos en un curso cuando hay un curso
     * seleccionado en la lista de cursos
     */
    public void cargarAlumnosInscriptos() {
        model_alumnos_inscriptos.clear();
        if (!(listaCursos.isSelectionEmpty()) && !(model_cursos.get(listaCursos.getAnchorSelectionIndex()).equals(' '))) {
            Curso curso_seleccionado = levantarCurso();
            for (Alumno x : curso_seleccionado.getAlumnosCursando()) {
                model_alumnos_inscriptos.addElement(x);
            }
        }

        model_alumnos_inscriptos.addElement(' ');
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
            IDlabel.setText("Id: " + curso.getIdCurso());
            jLabel15.setText("Nombre: " + curso.getNombreCurso());
            jLabel17.setText("Estado: " + curso.getEstadoCurso());
            jLabel18.setText("Capacidad: " + curso.getTamanio_curso());
            jLabel19.setText("Cantidad: " + curso.getAlumnosCursando().size());
            actualizarCursosPrevios();
        }
    }

    /**
     * Actualiza los labels que informan los cursos previos necesarios para
     * poder inscribirte a un curso
     */
    public void actualizarCursosPrevios() {
        Curso aux = levantarCurso();
        if (aux.getCurso_previo1() == 0 && aux.getCurso_previo2() == 0) {
            jLabel5.setVisible(false);
        } else {
            jLabel5.setVisible(true);
            if (aux.getCurso_previo1() != 0 && aux.getCurso_previo2() != 0) {
                jLabel5.setText("Cursos necesarios: " + insti.getCurso(aux.getCurso_previo1()).getNombreCurso() + " " + insti.getCurso(aux.getCurso_previo2()).getNombreCurso());
            } else if (aux.getCurso_previo1() != 0 && aux.getCurso_previo2() == 0) {
                jLabel5.setText("Cursos necesarios: " + insti.getCurso(aux.getCurso_previo1()).getNombreCurso());
            } else if (aux.getCurso_previo1() == 0 && aux.getCurso_previo2() != 0) {
                jLabel5.setText("Cursos necesarios: " + insti.getCurso(aux.getCurso_previo2()).getNombreCurso());
            }

        }

    }

    /*-------------------------------------------------------------------------------------------------------------------*/
    /**
     * Inicializa los componentes necesarios para el correcto funcionamiento de
     * esta ventana grafica
     */
    private void inicializarVentana() {

        //ventana cursos
        listaCursos.setModel(model_cursos);
        listaInscriptios.setModel(model_alumnos_inscriptos);
        model_alumnos_inscriptos.addElement(' ');

        listaInscriptios.setEnabled(false);

        btnReiniciar.setVisible(false);
        btnCerrar.setVisible(false);
        btnFinalizar.setVisible(false);
        cargarCursos();
        CargarImagen();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CambiarContraBt;
    private javax.swing.JPanel CerrarSesionBt;
    private javax.swing.JLabel IDlabel;
    private javax.swing.JPanel Logo;
    private javax.swing.JPanel ProfilePic1;
    private javax.swing.JPanel Usuario_info;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnFinalizar;
    private javax.swing.JPanel btnProponerCurso;
    private javax.swing.JPanel btnReiniciar;
    private javax.swing.JLabel btn_Exit4;
    private javax.swing.JComboBox<String> desplegableMaterias;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> listaCursos;
    private javax.swing.JList<String> listaInscriptios;
    private javax.swing.JPanel superiorTab4;
    // End of variables declaration//GEN-END:variables
}
