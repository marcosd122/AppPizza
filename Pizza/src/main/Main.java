package main;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import component.SwitchPanel;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.ModelUser;
import swing.PictureBox;

public class Main extends javax.swing.JFrame {

    int x, y;

    public Main() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.btnHome.setSelected(true);
        showDate();
        showTime();

        new SwitchPanel(pnlPrincipal, new component.pnlHome());
    }

    public void setData(ModelUser data) {
        pic.setIcon(data.getProfile());
        lbUser.setText(data.getUserName());
    }

    
      void showDate() {
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        Date d = new Date();
        date.setText(s.format(d));
    }

    void showTime() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat s = new SimpleDateFormat("hh:mm a");
                Date d = new Date();
                time.setText(s.format(d));
            }
        }).start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbUser = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnHome = new swing.MyButton();
        btnPed = new swing.MyButton();
        btnFor = new swing.MyButton();
        btnEst = new swing.MyButton();
        btnRel = new swing.MyButton();
        pic = new swing.ImageAvatar();
        btnCli = new swing.MyButton();
        button1 = new swing.Button();
        btnProds = new swing.MyButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pnlCentro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPrincipal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        pnlMenu.setBackground(new java.awt.Color(51, 51, 51));
        pnlMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(239, 238, 244)));
        pnlMenu.setPreferredSize(new java.awt.Dimension(250, 598));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        lbUser.setBackground(new java.awt.Color(51, 51, 51));
        lbUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUser.setText("USER");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbUser)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setActionCommand("btnHome");
        btnHome.setBorderColor(new java.awt.Color(255, 255, 255));
        btnHome.setColorClick(new java.awt.Color(153, 0, 0));
        btnHome.setColorOver(new java.awt.Color(153, 153, 153));
        btnHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setIconTextGap(20);
        btnHome.setRadius(20);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHomeMousePressed(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnPed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/3_1.png"))); // NOI18N
        btnPed.setText("Delivery");
        btnPed.setActionCommand("btnPed");
        btnPed.setBorderColor(new java.awt.Color(255, 255, 255));
        btnPed.setColorClick(new java.awt.Color(153, 0, 0));
        btnPed.setColorOver(new java.awt.Color(153, 153, 153));
        btnPed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPed.setIconTextGap(15);
        btnPed.setRadius(20);
        btnPed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPedMousePressed(evt);
            }
        });
        btnPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedActionPerformed(evt);
            }
        });

        btnFor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fornecedor.png"))); // NOI18N
        btnFor.setText("Fornecedor");
        btnFor.setActionCommand("btnFor");
        btnFor.setBorderColor(new java.awt.Color(255, 255, 255));
        btnFor.setColorClick(new java.awt.Color(153, 0, 0));
        btnFor.setColorOver(new java.awt.Color(153, 153, 153));
        btnFor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFor.setIconTextGap(20);
        btnFor.setRadius(20);
        btnFor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnForMousePressed(evt);
            }
        });
        btnFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForActionPerformed(evt);
            }
        });

        btnEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2.png"))); // NOI18N
        btnEst.setText("Estoque");
        btnEst.setActionCommand("btnEst");
        btnEst.setBorderColor(new java.awt.Color(255, 255, 255));
        btnEst.setColorClick(new java.awt.Color(153, 0, 0));
        btnEst.setColorOver(new java.awt.Color(153, 153, 153));
        btnEst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEst.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEst.setIconTextGap(20);
        btnEst.setRadius(20);
        btnEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEstMousePressed(evt);
            }
        });
        btnEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstActionPerformed(evt);
            }
        });

        btnRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/4.png"))); // NOI18N
        btnRel.setText("Relatorios");
        btnRel.setActionCommand("btnRel");
        btnRel.setBorderColor(new java.awt.Color(255, 255, 255));
        btnRel.setColorClick(new java.awt.Color(153, 0, 0));
        btnRel.setColorOver(new java.awt.Color(153, 153, 153));
        btnRel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRel.setIconTextGap(20);
        btnRel.setRadius(20);
        btnRel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRelMousePressed(evt);
            }
        });
        btnRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelActionPerformed(evt);
            }
        });

        pic.setBackground(new java.awt.Color(67, 99, 132));
        pic.setForeground(new java.awt.Color(188, 188, 188));
        pic.setBorderSize(3);
        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        pic.setOpaque(true);

        btnCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1.png"))); // NOI18N
        btnCli.setText("Clientes");
        btnCli.setActionCommand("btnCli");
        btnCli.setBorderColor(new java.awt.Color(255, 255, 255));
        btnCli.setColorClick(new java.awt.Color(153, 0, 0));
        btnCli.setColorOver(new java.awt.Color(153, 153, 153));
        btnCli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCli.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCli.setIconTextGap(15);
        btnCli.setRadius(20);
        btnCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCliMousePressed(evt);
            }
        });
        btnCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(51, 51, 51));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/desligar.png"))); // NOI18N
        button1.setOpaque(true);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        btnProds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-bens-de-consumo-rápido-48.png"))); // NOI18N
        btnProds.setText("Produtos");
        btnProds.setActionCommand("btnFor");
        btnProds.setBorderColor(new java.awt.Color(255, 255, 255));
        btnProds.setColorClick(new java.awt.Color(153, 0, 0));
        btnProds.setColorOver(new java.awt.Color(153, 153, 153));
        btnProds.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProds.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProds.setIconTextGap(20);
        btnProds.setRadius(20);
        btnProds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProdsMousePressed(evt);
            }
        });
        btnProds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProds, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCli, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPed, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProds, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEst, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 8.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        jPanel1.add(pnlMenu, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(1108, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.2;
        jPanel1.add(jPanel2, gridBagConstraints);

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(null);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnlPrincipal);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("jLabel1");

        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(time)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(date)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(pnlCentro, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1154, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int posicion = pnlMenu.getX();
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, pnlMenu);
        } else {
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, pnlMenu);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void dosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uno1MousePressed

    }//GEN-LAST:event_uno1MousePressed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno1ActionPerformed

    }//GEN-LAST:event_uno1ActionPerformed

    private void tresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uno2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_uno2MousePressed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uno2ActionPerformed

    private void cuatroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uno4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_uno4MousePressed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uno4ActionPerformed

    private void cincoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uno5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_uno5MousePressed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uno5ActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new SwitchPanel(pnlPrincipal, new component.pnlHome());
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMousePressed
        this.btnHome.setSelected(true);
        this.btnPed.setSelected(false);
        this.btnCli.setSelected(false);
        this.btnFor.setSelected(false);
        this.btnEst.setSelected(false);
        this.btnProds.setSelected(false);
        this.btnRel.setSelected(false);
        
    }//GEN-LAST:event_btnHomeMousePressed

    private void btnCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliActionPerformed
        new SwitchPanel(pnlPrincipal, new component.pnlCli());
    }//GEN-LAST:event_btnCliActionPerformed

    private void btnCliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCliMousePressed
        this.btnHome.setSelected(false);
        this.btnPed.setSelected(false);
        this.btnCli.setSelected(true);
        this.btnFor.setSelected(false);
        this.btnEst.setSelected(false);
        this.btnProds.setSelected(false);
        this.btnRel.setSelected(false);
        
    }//GEN-LAST:event_btnCliMousePressed

    private void btnPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedActionPerformed
        new SwitchPanel(pnlPrincipal, new component.pnlPed());
    }//GEN-LAST:event_btnPedActionPerformed

    private void btnPedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedMousePressed
        this.btnHome.setSelected(false);
        this.btnPed.setSelected(true);
        this.btnCli.setSelected(false);
        this.btnFor.setSelected(false);
        this.btnEst.setSelected(false);
        this.btnProds.setSelected(false);
        this.btnRel.setSelected(false);
       
    }//GEN-LAST:event_btnPedMousePressed

    private void btnForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForActionPerformed
        new SwitchPanel(pnlPrincipal, new component.pnlFor());
    }//GEN-LAST:event_btnForActionPerformed

    private void btnForMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForMousePressed
        this.btnHome.setSelected(false);
        this.btnPed.setSelected(false);
        this.btnCli.setSelected(false);
        this.btnFor.setSelected(true);
        this.btnEst.setSelected(false);
        this.btnProds.setSelected(false);
        this.btnRel.setSelected(false);
       
    }//GEN-LAST:event_btnForMousePressed

    private void btnEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstActionPerformed
        new SwitchPanel(pnlPrincipal, new component.pnlEst());
    }//GEN-LAST:event_btnEstActionPerformed

    private void btnEstMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstMousePressed
        this.btnHome.setSelected(false);
        this.btnPed.setSelected(false);
        this.btnCli.setSelected(false);
        this.btnFor.setSelected(false);
        this.btnEst.setSelected(true);
        this.btnProds.setSelected(false);
        this.btnRel.setSelected(false);
        
    }//GEN-LAST:event_btnEstMousePressed

    private void btnRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelActionPerformed
        new SwitchPanel(pnlPrincipal, new component.pnlRel());
    }//GEN-LAST:event_btnRelActionPerformed

    private void btnRelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelMousePressed
        this.btnHome.setSelected(false);
        this.btnPed.setSelected(false);
        this.btnCli.setSelected(false);
        this.btnFor.setSelected(false);
        this.btnEst.setSelected(false);
        this.btnProds.setSelected(false);
        this.btnRel.setSelected(true);
       
    }//GEN-LAST:event_btnRelMousePressed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void btnProdsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdsMousePressed
        this.btnHome.setSelected(false);
        this.btnPed.setSelected(false);
        this.btnCli.setSelected(false);
        this.btnFor.setSelected(false);
        this.btnEst.setSelected(false);
        this.btnRel.setSelected(false);
        this.btnProds.setSelected(false);
        this.btnProds.setSelected(true);
    }//GEN-LAST:event_btnProdsMousePressed

    private void btnProdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdsActionPerformed
  new SwitchPanel(pnlPrincipal, new component.pnlProd());
    }//GEN-LAST:event_btnProdsActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new Main().setVisible(true);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton btnCli;
    private swing.MyButton btnEst;
    private swing.MyButton btnFor;
    private swing.MyButton btnHome;
    private swing.MyButton btnPed;
    private swing.MyButton btnProds;
    private swing.MyButton btnRel;
    private swing.Button button1;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbUser;
    private swing.ImageAvatar pic;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
