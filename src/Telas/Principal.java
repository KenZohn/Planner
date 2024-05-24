package Telas;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        Inicio inicio = new Inicio();
        jDesktopPane.removeAll();
        jDesktopPane.add(inicio).setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jDesktopPane = new javax.swing.JDesktopPane();
        panelMenu = new javax.swing.JPanel();
        panelAno = new javax.swing.JPanel();
        labelAno = new javax.swing.JLabel();
        panelInicio = new javax.swing.JPanel();
        labelInicio = new javax.swing.JLabel();
        iconeInicio = new javax.swing.JLabel();
        panelCalendario = new javax.swing.JPanel();
        labelCalendario = new javax.swing.JLabel();
        iconeCalendario = new javax.swing.JLabel();
        panelAnotacoes = new javax.swing.JPanel();
        labelAnotacoes = new javax.swing.JLabel();
        iconeAnotacoes = new javax.swing.JLabel();
        panelGastos = new javax.swing.JPanel();
        labelGastos = new javax.swing.JLabel();
        iconeGastos = new javax.swing.JLabel();
        panelFechar = new javax.swing.JPanel();
        iconeFechar = new javax.swing.JLabel();
        panelMinimizar = new javax.swing.JPanel();
        iconeFechar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1152, 648));
        setMinimumSize(new java.awt.Dimension(1152, 648));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1152, 648));

        panelPrincipal.setMaximumSize(new java.awt.Dimension(1152, 648));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1152, 648));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1152, 648));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane.setMaximumSize(new java.awt.Dimension(1152, 588));
        jDesktopPane.setMinimumSize(new java.awt.Dimension(1152, 588));

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1152, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        panelPrincipal.add(jDesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1152, 588));

        panelMenu.setBackground(new java.awt.Color(230, 230, 230));
        panelMenu.setPreferredSize(new java.awt.Dimension(1152, 60));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAno.setBackground(new java.awt.Color(64, 64, 64));
        panelAno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAno.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelAno.setForeground(new java.awt.Color(227, 227, 227));
        labelAno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAno.setText("2024");
        labelAno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelAno.add(labelAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 5, -1, -1));

        panelMenu.add(panelAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 60));

        panelInicio.setBackground(new java.awt.Color(255, 234, 189));
        panelInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelInicioMouseExited(evt);
            }
        });
        panelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelInicio.setForeground(new java.awt.Color(0, 0, 0));
        labelInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInicio.setText("Início");
        labelInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelInicio.add(labelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        iconeInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Início (33px).png"))); // NOI18N
        iconeInicio.setToolTipText("");
        iconeInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconeInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconeInicioMouseExited(evt);
            }
        });
        panelInicio.add(iconeInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 5, -1, -1));

        panelMenu.add(panelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 60));

        panelCalendario.setBackground(new java.awt.Color(175, 216, 253));
        panelCalendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCalendarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelCalendarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelCalendarioMouseExited(evt);
            }
        });
        panelCalendario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCalendario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCalendario.setForeground(new java.awt.Color(0, 0, 0));
        labelCalendario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCalendario.setText("Calendário");
        labelCalendario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelCalendario.add(labelCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 40, -1, -1));

        iconeCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Calendário (33px).png"))); // NOI18N
        iconeCalendario.setToolTipText("");
        iconeCalendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeCalendarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconeCalendarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconeCalendarioMouseExited(evt);
            }
        });
        panelCalendario.add(iconeCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 5, -1, -1));

        panelMenu.add(panelCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 130, 60));

        panelAnotacoes.setBackground(new java.awt.Color(252, 219, 248));
        panelAnotacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAnotacoesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAnotacoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelAnotacoesMouseExited(evt);
            }
        });
        panelAnotacoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAnotacoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelAnotacoes.setForeground(new java.awt.Color(0, 0, 0));
        labelAnotacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAnotacoes.setText("Anotações");
        labelAnotacoes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelAnotacoes.add(labelAnotacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 40, 80, 20));

        iconeAnotacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Anotações (33px).png"))); // NOI18N
        iconeAnotacoes.setToolTipText("");
        iconeAnotacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeAnotacoesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconeAnotacoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconeAnotacoesMouseExited(evt);
            }
        });
        panelAnotacoes.add(iconeAnotacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 5, -1, -1));

        panelMenu.add(panelAnotacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 130, 60));

        panelGastos.setBackground(new java.awt.Color(141, 231, 219));
        panelGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelGastosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelGastosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelGastosMouseExited(evt);
            }
        });
        panelGastos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelGastos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelGastos.setForeground(new java.awt.Color(0, 0, 0));
        labelGastos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGastos.setText("Gastos");
        labelGastos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelGastos.add(labelGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 40, -1, -1));

        iconeGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Gastos (33px).png"))); // NOI18N
        iconeGastos.setToolTipText("");
        iconeGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeGastosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconeGastosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconeGastosMouseExited(evt);
            }
        });
        panelGastos.add(iconeGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 5, -1, -1));

        panelMenu.add(panelGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 130, 60));

        panelFechar.setBackground(new java.awt.Color(230, 230, 230));
        panelFechar.setMaximumSize(new java.awt.Dimension(45, 30));
        panelFechar.setMinimumSize(new java.awt.Dimension(45, 30));
        panelFechar.setPreferredSize(new java.awt.Dimension(45, 30));
        panelFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelFecharMouseExited(evt);
            }
        });

        iconeFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/letra-x.png"))); // NOI18N
        iconeFechar.setText("jLabel2");
        iconeFechar.setMaximumSize(new java.awt.Dimension(30, 30));
        iconeFechar.setMinimumSize(new java.awt.Dimension(30, 30));
        iconeFechar.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout panelFecharLayout = new javax.swing.GroupLayout(panelFechar);
        panelFechar.setLayout(panelFecharLayout);
        panelFecharLayout.setHorizontalGroup(
            panelFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFecharLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconeFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        panelFecharLayout.setVerticalGroup(
            panelFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFecharLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconeFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelMenu.add(panelFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 0, -1, -1));

        panelMinimizar.setBackground(new java.awt.Color(230, 230, 230));
        panelMinimizar.setMaximumSize(new java.awt.Dimension(45, 30));
        panelMinimizar.setMinimumSize(new java.awt.Dimension(45, 30));
        panelMinimizar.setPreferredSize(new java.awt.Dimension(45, 30));
        panelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseExited(evt);
            }
        });

        iconeFechar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minimizar (30px).png"))); // NOI18N
        iconeFechar1.setText("jLabel2");
        iconeFechar1.setMaximumSize(new java.awt.Dimension(30, 30));
        iconeFechar1.setMinimumSize(new java.awt.Dimension(30, 30));
        iconeFechar1.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout panelMinimizarLayout = new javax.swing.GroupLayout(panelMinimizar);
        panelMinimizar.setLayout(panelMinimizarLayout);
        panelMinimizarLayout.setHorizontalGroup(
            panelMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMinimizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconeFechar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMinimizarLayout.setVerticalGroup(
            panelMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconeFechar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelMenu.add(panelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 0, -1, -1));

        panelPrincipal.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelCalendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCalendarioMouseClicked
        Calendario calendario = new Calendario();
        jDesktopPane.removeAll();
        jDesktopPane.add(calendario).setVisible(true);
    }//GEN-LAST:event_panelCalendarioMouseClicked

    private void panelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInicioMouseClicked
        Inicio inicio = new Inicio();
        jDesktopPane.removeAll();
        jDesktopPane.add(inicio).setVisible(true);
    }//GEN-LAST:event_panelInicioMouseClicked

    private void panelAnotacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAnotacoesMouseClicked
        Anotacoes anotacoes = new Anotacoes();
        jDesktopPane.removeAll();
        jDesktopPane.add(anotacoes).setVisible(true);
    }//GEN-LAST:event_panelAnotacoesMouseClicked

    private void panelGastosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGastosMouseClicked
        Gastos gastos = new Gastos();
        jDesktopPane.removeAll();
        jDesktopPane.add(gastos).setVisible(true);
    }//GEN-LAST:event_panelGastosMouseClicked

    private void panelFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_panelFecharMouseClicked

    private void iconeInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeInicioMouseClicked
        Inicio inicio = new Inicio();
        jDesktopPane.removeAll();
        jDesktopPane.add(inicio).setVisible(true);
    }//GEN-LAST:event_iconeInicioMouseClicked

    private void iconeCalendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeCalendarioMouseClicked
        Calendario calendario = new Calendario();
        jDesktopPane.removeAll();
        jDesktopPane.add(calendario).setVisible(true);
    }//GEN-LAST:event_iconeCalendarioMouseClicked

    private void iconeAnotacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeAnotacoesMouseClicked
        Anotacoes anotacoes = new Anotacoes();
        jDesktopPane.removeAll();
        jDesktopPane.add(anotacoes).setVisible(true);
    }//GEN-LAST:event_iconeAnotacoesMouseClicked

    private void iconeGastosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeGastosMouseClicked
        Gastos gastos = new Gastos();
        jDesktopPane.removeAll();
        jDesktopPane.add(gastos).setVisible(true);
    }//GEN-LAST:event_iconeGastosMouseClicked

    private void panelFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFecharMouseEntered
        panelFechar.setBackground(new Color(222, 75, 75));
    }//GEN-LAST:event_panelFecharMouseEntered

    private void panelFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFecharMouseExited
        panelFechar.setBackground(new Color(230, 230, 230));
    }//GEN-LAST:event_panelFecharMouseExited

    private void panelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseClicked
        this.setExtendedState(Principal.ICONIFIED);
    }//GEN-LAST:event_panelMinimizarMouseClicked

    private void panelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseEntered
        panelMinimizar.setBackground(new Color(248, 248, 248));
    }//GEN-LAST:event_panelMinimizarMouseEntered

    private void panelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseExited
        panelMinimizar.setBackground(new Color(230, 230, 230));
    }//GEN-LAST:event_panelMinimizarMouseExited

    private void panelInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInicioMouseEntered
        panelInicio.setBackground(new Color(255, 242, 215));
    }//GEN-LAST:event_panelInicioMouseEntered

    private void panelInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelInicioMouseExited
        panelInicio.setBackground(new Color(255, 234, 189));
    }//GEN-LAST:event_panelInicioMouseExited

    private void panelCalendarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCalendarioMouseEntered
        panelCalendario.setBackground(new Color(224, 236, 247));
    }//GEN-LAST:event_panelCalendarioMouseEntered

    private void panelCalendarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCalendarioMouseExited
        panelCalendario.setBackground(new Color(175, 216, 253));
    }//GEN-LAST:event_panelCalendarioMouseExited

    private void panelAnotacoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAnotacoesMouseEntered
        panelAnotacoes.setBackground(new Color(253, 238, 251));
    }//GEN-LAST:event_panelAnotacoesMouseEntered

    private void panelAnotacoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAnotacoesMouseExited
        panelAnotacoes.setBackground(new Color(252, 219, 248));
    }//GEN-LAST:event_panelAnotacoesMouseExited

    private void panelGastosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGastosMouseEntered
        panelGastos.setBackground(new Color(208, 240, 235));
    }//GEN-LAST:event_panelGastosMouseEntered

    private void panelGastosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGastosMouseExited
        panelGastos.setBackground(new Color(141, 231, 219));
    }//GEN-LAST:event_panelGastosMouseExited

    private void iconeInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeInicioMouseEntered
        panelInicio.setBackground(new Color(255, 242, 215));
    }//GEN-LAST:event_iconeInicioMouseEntered

    private void iconeInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeInicioMouseExited
        panelInicio.setBackground(new Color(255, 234, 189));
    }//GEN-LAST:event_iconeInicioMouseExited

    private void iconeCalendarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeCalendarioMouseEntered
        panelCalendario.setBackground(new Color(224, 236, 247));
    }//GEN-LAST:event_iconeCalendarioMouseEntered

    private void iconeCalendarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeCalendarioMouseExited
        panelCalendario.setBackground(new Color(175, 216, 253));
    }//GEN-LAST:event_iconeCalendarioMouseExited

    private void iconeAnotacoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeAnotacoesMouseEntered
        panelAnotacoes.setBackground(new Color(253, 238, 251));
    }//GEN-LAST:event_iconeAnotacoesMouseEntered

    private void iconeAnotacoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeAnotacoesMouseExited
        panelAnotacoes.setBackground(new Color(252, 219, 248));
    }//GEN-LAST:event_iconeAnotacoesMouseExited

    private void iconeGastosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeGastosMouseEntered
        panelGastos.setBackground(new Color(208, 240, 235));
    }//GEN-LAST:event_iconeGastosMouseEntered

    private void iconeGastosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeGastosMouseExited
        panelGastos.setBackground(new Color(141, 231, 219));
    }//GEN-LAST:event_iconeGastosMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconeAnotacoes;
    private javax.swing.JLabel iconeCalendario;
    private javax.swing.JLabel iconeFechar;
    private javax.swing.JLabel iconeFechar1;
    private javax.swing.JLabel iconeGastos;
    private javax.swing.JLabel iconeInicio;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelAnotacoes;
    private javax.swing.JLabel labelCalendario;
    private javax.swing.JLabel labelGastos;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JPanel panelAno;
    private javax.swing.JPanel panelAnotacoes;
    private javax.swing.JPanel panelCalendario;
    private javax.swing.JPanel panelFechar;
    private javax.swing.JPanel panelGastos;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMinimizar;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
