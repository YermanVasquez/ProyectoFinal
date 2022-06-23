/*********************************************************************************************
 * @Autor: Vásquez Santiago Germán                                                           *
 * Fecha de creación: 01/05/2022                                                             *
 * Fecha de Modificación: 09/06/2022                                                         *
 * Descripción: Es la clase para seleccionar la musica.                                                                            *  
 * *******************************************************************************************
 */
package reproductormp3yerkus.view;
import java.awt.Image;
import java.io.File;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import jdk.jfr.Event;
public class Principal extends javax.swing.JFrame {
    public DefaultListModel modelo = new DefaultListModel(); //se hace una 
    //instancia a DefaultListModel
    private BasicPlayer play = new BasicPlayer();
    private int xMouse;
    private int yMouse;
    //int cont=0; // creo el contador *Pense agregarle un contador pero el jlisten traer esos metos*
    public Principal() {//constructor
        initComponents();
        listaDeCanciones.setModel(modelo);
        this.setLocationRelativeTo(null);// Para centar la interfaz 
        imagenApagando();//Para inicializar la imagen      
    }
    
    public void imagenApagando(){ // metodo de apagado
         ImageIcon foco;
        foco = new ImageIcon(getClass().getResource("/imagenes/fondo1.gif/"));
        Icon focoIcono = new ImageIcon(foco.getImage().getScaledInstance(
                labelImagen.getWidth(), labelImagen.getHeight(),Image.SCALE_SMOOTH));
                labelImagen.setIcon(focoIcono);
    }
    public void imagenEncendido(){ // metodo de encendido
         ImageIcon foco;
        foco = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg/"));
        Icon focoIcono = new ImageIcon(foco.getImage().getScaledInstance(
                labelImagen.getWidth(), labelImagen.getHeight(),Image.SCALE_SMOOTH));
                labelImagen.setIcon(focoIcono);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSlider2 = new javax.swing.JSlider();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jButton5 = new javax.swing.JButton();
        panelIntermedio = new javax.swing.JPanel();
        panelEncabezado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelPie = new javax.swing.JPanel();
        BotónAtras = new javax.swing.JButton();
        BotónPlay = new javax.swing.JButton();
        BotónAgregar = new javax.swing.JButton();
        BotónEliminar = new javax.swing.JButton();
        sliderVolumen = new javax.swing.JSlider();
        labelmás = new javax.swing.JLabel();
        labelMenos = new javax.swing.JLabel();
        BotónSalir = new javax.swing.JButton();
        BotónAdelantar = new javax.swing.JButton();
        botónVolumen = new javax.swing.JButton();
        botónStop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDeCanciones = new javax.swing.JList<>();
        labelImagen = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jScrollPane2.setViewportView(jTree1);

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jButton5.setBackground(new java.awt.Color(242, 251, 249));
        jButton5.setText("-");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelIntermedio.setBackground(new java.awt.Color(0, 1, 4));
        panelIntermedio.setForeground(new java.awt.Color(25, 25, 25));
        panelIntermedio.setDoubleBuffered(false);
        panelIntermedio.setPreferredSize(new java.awt.Dimension(500, 446));

        panelEncabezado.setBackground(new java.awt.Color(14, 15, 14));
        panelEncabezado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelEncabezadoMouseDragged(evt);
            }
        });
        panelEncabezado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelEncabezadoMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(242, 251, 249));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 249));
        jLabel2.setText("Reproductor MP3 Yerkus");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ecualizadorGif1.gif"))); // NOI18N
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEncabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(297, 297, 297))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPie.setBackground(new java.awt.Color(14, 15, 14));
        panelPie.setFocusable(false);
        panelPie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotónAtras.setBackground(new java.awt.Color(14, 15, 14));
        BotónAtras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotónAtras.setForeground(new java.awt.Color(255, 255, 255));
        BotónAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/retroceder.jpg"))); // NOI18N
        BotónAtras.setToolTipText("Retroceder");
        BotónAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotónAtras.setBorderPainted(false);
        BotónAtras.setFocusPainted(false);
        BotónAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotónAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotónAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotónAtrasMouseExited(evt);
            }
        });
        BotónAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotónAtrasActionPerformed(evt);
            }
        });
        panelPie.add(BotónAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 60));

        BotónPlay.setBackground(new java.awt.Color(14, 15, 14));
        BotónPlay.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        BotónPlay.setForeground(new java.awt.Color(255, 255, 255));
        BotónPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/play1.jpg"))); // NOI18N
        BotónPlay.setToolTipText("Play y Pausa");
        BotónPlay.setBorder(null);
        BotónPlay.setFocusPainted(false);
        BotónPlay.setFocusable(false);
        BotónPlay.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/play2.jpg"))); // NOI18N
        BotónPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotónPlayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotónPlayMouseExited(evt);
            }
        });
        BotónPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotónPlayActionPerformed(evt);
            }
        });
        panelPie.add(BotónPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 60, 60));

        BotónAgregar.setBackground(new java.awt.Color(14, 15, 14));
        BotónAgregar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotónAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BotónAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/carpeta.png"))); // NOI18N
        BotónAgregar.setToolTipText("Agregar Canción");
        BotónAgregar.setBorder(null);
        BotónAgregar.setBorderPainted(false);
        BotónAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotónAgregar.setFocusPainted(false);
        BotónAgregar.setFocusable(false);
        BotónAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotónAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotónAgregarMouseExited(evt);
            }
        });
        BotónAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotónAgregarActionPerformed(evt);
            }
        });
        panelPie.add(BotónAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, 60));

        BotónEliminar.setBackground(new java.awt.Color(14, 15, 14));
        BotónEliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotónEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BotónEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/eliminar1_1.png"))); // NOI18N
        BotónEliminar.setToolTipText("Eliminar");
        BotónEliminar.setBorder(null);
        BotónEliminar.setBorderPainted(false);
        BotónEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotónEliminar.setFocusPainted(false);
        BotónEliminar.setFocusable(false);
        BotónEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotónEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotónEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotónEliminarMousePressed(evt);
            }
        });
        BotónEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotónEliminarActionPerformed(evt);
            }
        });
        panelPie.add(BotónEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 60));

        sliderVolumen.setBackground(new java.awt.Color(14, 15, 14));
        sliderVolumen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sliderVolumen.setForeground(new java.awt.Color(51, 0, 102));
        sliderVolumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sliderVolumenMousePressed(evt);
            }
        });
        panelPie.add(sliderVolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, 41));

        labelmás.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelmás.setForeground(new java.awt.Color(0, 204, 249));
        labelmás.setText("+");
        labelmás.setToolTipText("Subir Volumen");
        panelPie.add(labelmás, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 10, 60));

        labelMenos.setBackground(new java.awt.Color(255, 255, 255));
        labelMenos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelMenos.setForeground(new java.awt.Color(0, 204, 249));
        labelMenos.setText("-");
        labelMenos.setToolTipText("Bajar volumen");
        panelPie.add(labelMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 10, 60));

        BotónSalir.setBackground(new java.awt.Color(14, 15, 14));
        BotónSalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotónSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotónSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/eliminar_1.png"))); // NOI18N
        BotónSalir.setToolTipText("Salir");
        BotónSalir.setBorder(null);
        BotónSalir.setBorderPainted(false);
        BotónSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotónSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotónSalirMouseExited(evt);
            }
        });
        BotónSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotónSalirActionPerformed(evt);
            }
        });
        panelPie.add(BotónSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, 60));

        BotónAdelantar.setBackground(new java.awt.Color(14, 15, 14));
        BotónAdelantar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotónAdelantar.setForeground(new java.awt.Color(255, 255, 255));
        BotónAdelantar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/adelantar.jpg"))); // NOI18N
        BotónAdelantar.setToolTipText("Adelantar");
        BotónAdelantar.setBorder(null);
        BotónAdelantar.setFocusPainted(false);
        BotónAdelantar.setFocusable(false);
        BotónAdelantar.setMaximumSize(new java.awt.Dimension(18, 26));
        BotónAdelantar.setMinimumSize(new java.awt.Dimension(18, 26));
        BotónAdelantar.setPreferredSize(new java.awt.Dimension(18, 26));
        BotónAdelantar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotónAdelantarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotónAdelantarMouseExited(evt);
            }
        });
        BotónAdelantar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotónAdelantarActionPerformed(evt);
            }
        });
        panelPie.add(BotónAdelantar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 50, 60));

        botónVolumen.setBackground(new java.awt.Color(14, 15, 14));
        botónVolumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/sonido.png"))); // NOI18N
        botónVolumen.setBorderPainted(false);
        botónVolumen.setFocusPainted(false);
        botónVolumen.setFocusable(false);
        botónVolumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botónVolumenActionPerformed(evt);
            }
        });
        panelPie.add(botónVolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 40, 40));

        botónStop.setBackground(new java.awt.Color(14, 15, 14));
        botónStop.setForeground(new java.awt.Color(14, 15, 14));
        botónStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/stop1.jpg"))); // NOI18N
        botónStop.setToolTipText("Stop");
        botónStop.setBorderPainted(false);
        botónStop.setRequestFocusEnabled(false);
        botónStop.setRolloverEnabled(false);
        botónStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botónStopActionPerformed(evt);
            }
        });
        panelPie.add(botónStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 50, 60));

        listaDeCanciones.setBackground(new java.awt.Color(0, 1, 4));
        listaDeCanciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        listaDeCanciones.setForeground(new java.awt.Color(255, 255, 255));
        listaDeCanciones.setToolTipText("");
        listaDeCanciones.setFixedCellWidth(2);
        listaDeCanciones.setFocusCycleRoot(true);
        listaDeCanciones.setFocusTraversalPolicyProvider(true);
        listaDeCanciones.setInheritsPopupMenu(true);
        listaDeCanciones.setSelectionBackground(new java.awt.Color(0, 204, 249));
        listaDeCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaDeCancionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaDeCanciones);

        labelImagen.setBackground(new java.awt.Color(0, 1, 4));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lista de reproducciones   ");

        javax.swing.GroupLayout panelIntermedioLayout = new javax.swing.GroupLayout(panelIntermedio);
        panelIntermedio.setLayout(panelIntermedioLayout);
        panelIntermedioLayout.setHorizontalGroup(
            panelIntermedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPie, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
            .addGroup(panelIntermedioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelIntermedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIntermedioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(81, 81, 81))
                    .addGroup(panelIntermedioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelIntermedioLayout.setVerticalGroup(
            panelIntermedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIntermedioLayout.createSequentialGroup()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIntermedioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelIntermedioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIntermedio, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIntermedio, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotónAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotónAgregarActionPerformed
        Carpeta abrir = new Carpeta(this); 
        abrir.setVisible(true);
        this.hide();     

    }//GEN-LAST:event_BotónAgregarActionPerformed

    private void sliderVolumenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderVolumenMousePressed
this.sliderVolumen.setPaintLabels(rootPaneCheckingEnabled);
    }//GEN-LAST:event_sliderVolumenMousePressed

    private void BotónAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotónAtrasActionPerformed
        if(listaDeCanciones.getSelectedIndex()!=0){
            if(play.getStatus() == BasicPlayer.PLAYING){   
               try {
               play.stop();
           } catch (BasicPlayerException ex) {
               java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
           }
       }
        try {
            play.open(new File((modelo.elementAt((listaDeCanciones.getSelectedIndex())-1)).toString()));
            play.play();
            listaDeCanciones.setSelectedIndex((listaDeCanciones.getSelectedIndex())-1);
        } catch (BasicPlayerException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        
           }
        }                 
    }//GEN-LAST:event_BotónAtrasActionPerformed
    private void BotónEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotónEliminarMousePressed

    }//GEN-LAST:event_BotónEliminarMousePressed
    private void BotónEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotónEliminarMouseEntered

    }//GEN-LAST:event_BotónEliminarMouseEntered
    private void BotónEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotónEliminarMouseExited
       
    }//GEN-LAST:event_BotónEliminarMouseExited
    private void BotónAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotónAgregarMouseEntered

    }//GEN-LAST:event_BotónAgregarMouseEntered
    private void BotónAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotónAgregarMouseExited
  
    }//GEN-LAST:event_BotónAgregarMouseExited
    private void BotónSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotónSalirMouseEntered
        
    }//GEN-LAST:event_BotónSalirMouseEntered
    private void BotónSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotónSalirMouseExited
     
    }//GEN-LAST:event_BotónSalirMouseExited
    private void BotónAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotónAtrasMouseExited
  
    }//GEN-LAST:event_BotónAtrasMouseExited
    private void BotónAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotónAtrasMouseEntered
    
    }//GEN-LAST:event_BotónAtrasMouseEntered
    private void BotónPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotónPlayMouseEntered
     
    }//GEN-LAST:event_BotónPlayMouseEntered
    private void BotónPlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotónPlayMouseExited
     
    }//GEN-LAST:event_BotónPlayMouseExited
    private void BotónAdelantarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotónAdelantarMouseEntered

    }//GEN-LAST:event_BotónAdelantarMouseEntered
    private void BotónAdelantarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotónAdelantarMouseExited
   
    }//GEN-LAST:event_BotónAdelantarMouseExited
    private void botónVolumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botónVolumenActionPerformed
       
    }//GEN-LAST:event_botónVolumenActionPerformed
    private void BotónPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotónPlayActionPerformed
//Imagen
String canciones= listaDeCanciones.getSelectedValue();
 try {
            play.open(new File(canciones));
            play.play();
        } catch (BasicPlayerException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }   
if(BotónPlay.isSelected()){  
  imagenApagando();
}else{
    imagenEncendido();
    //play.open(canciones);
}      
   
    }//GEN-LAST:event_BotónPlayActionPerformed

    private void BotónEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotónEliminarActionPerformed
       int eliminar = listaDeCanciones.getSelectedIndex();
       modelo.remove(eliminar);
    }//GEN-LAST:event_BotónEliminarActionPerformed

    private void BotónSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotónSalirActionPerformed
        int caso1 = JOptionPane.showConfirmDialog(this, "¿Está seguro que quiere cerrar?");
        if(caso1==0){
        System.exit(0);
        }else if (caso1==1){
        }
    }//GEN-LAST:event_BotónSalirActionPerformed

    private void panelEncabezadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEncabezadoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelEncabezadoMousePressed

    private void panelEncabezadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEncabezadoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelEncabezadoMouseDragged

    private void listaDeCancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaDeCancionesMouseClicked
  
    }//GEN-LAST:event_listaDeCancionesMouseClicked

    private void BotónAdelantarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotónAdelantarActionPerformed
if(listaDeCanciones.getSelectedIndex()!= modelo.size()-1){
            if(play.getStatus() == BasicPlayer.PLAYING){ 
               try {
               play.stop();
           } catch (BasicPlayerException ex) {
               java.util.logging.Logger.getLogger(Principal.class.getName()).
                       log(java.util.logging.Level.SEVERE, null, ex);
           }
       } 
        try {
            play.open(new File((modelo.elementAt((listaDeCanciones.
                    getSelectedIndex())+1)).toString()));
            play.play();
            listaDeCanciones.setSelectedIndex((listaDeCanciones.
                    getSelectedIndex())+1);
        } catch (BasicPlayerException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_BotónAdelantarActionPerformed

    private void botónStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botónStopActionPerformed
        try {
            String canciones= listaDeCanciones.getSelectedValue();
            play.open(new File(canciones));
            play.stop();
        } catch (BasicPlayerException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log
        (java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botónStopActionPerformed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotónAdelantar;
    private javax.swing.JButton BotónAgregar;
    private javax.swing.JButton BotónAtras;
    private javax.swing.JButton BotónEliminar;
    private javax.swing.JButton BotónPlay;
    private javax.swing.JButton BotónSalir;
    private javax.swing.JButton botónStop;
    private javax.swing.JButton botónVolumen;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labelMenos;
    private javax.swing.JLabel labelmás;
    private javax.swing.JList<String> listaDeCanciones;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelIntermedio;
    private javax.swing.JPanel panelPie;
    private javax.swing.JSlider sliderVolumen;
    // End of variables declaration//GEN-END:variables
}
