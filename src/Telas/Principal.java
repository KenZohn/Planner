package Telas;

import Banco.UsuarioBD;
import Dados.UsuarioDados;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {

    private int cod_usuario;
    private String nome;
    
    public Principal(UsuarioDados usuarioDados) {
        initComponents();
        cod_usuario = usuarioDados.getCod_usuario();
        UsuarioBD usuarioBD = new UsuarioBD();
        Inicio inicio = new Inicio(cod_usuario);
        
        jDesktopPane.removeAll();
        jDesktopPane.add(inicio).setVisible(true);
        setLocationRelativeTo(null);
        nome = usuarioBD.buscarNome(usuarioDados);
        labelNome.setText("Bem vindo, " + nome);
        
        buscarDataAtual();
    }
    
    public void buscarDataAtual() {
        Date dataAtual = new Date();
        labelData.setText(Integer.parseInt(new SimpleDateFormat("dd").format(dataAtual)) + "/" + (new SimpleDateFormat("MM").format(dataAtual)));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jDesktopPane = new javax.swing.JDesktopPane();
        panelMenu = new javax.swing.JPanel();
        panelAno = new javax.swing.JPanel();
        labelAno = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
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
        panelDados = new javax.swing.JPanel();
        labelDados = new javax.swing.JLabel();
        iconeDados = new javax.swing.JLabel();
        panelFechar = new javax.swing.JPanel();
        iconeFechar = new javax.swing.JLabel();
        panelMinimizar = new javax.swing.JPanel();
        iconeFechar1 = new javax.swing.JLabel();
        panelDeslogar = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();

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

        panelMenu.setBackground(new java.awt.Color(255, 255, 255));
        panelMenu.setPreferredSize(new java.awt.Dimension(1152, 60));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAno.setBackground(new java.awt.Color(153, 153, 255));
        panelAno.setPreferredSize(new java.awt.Dimension(190, 60));
        panelAno.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAno.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelAno.setForeground(new java.awt.Color(227, 227, 227));
        labelAno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAno.setText("2024");
        labelAno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelAno.add(labelAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 7, -1, -1));

        labelData.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelData.setForeground(new java.awt.Color(227, 227, 227));
        labelData.setText("00/00");
        panelAno.add(labelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, -1, -1));

        panelMenu.add(panelAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        panelMenu.add(panelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 130, 60));

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

        panelMenu.add(panelCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 130, 60));

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

        panelMenu.add(panelAnotacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 130, 60));

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

        panelMenu.add(panelGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 130, 60));

        panelDados.setBackground(new java.awt.Color(224, 198, 250));
        panelDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelDadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelDadosMouseExited(evt);
            }
        });
        panelDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDados.setForeground(new java.awt.Color(0, 0, 0));
        labelDados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDados.setText("Dados");
        labelDados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelDados.add(labelDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 40, -1, -1));

        iconeDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Outros (40px).png"))); // NOI18N
        iconeDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeDadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconeDadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconeDadosMouseExited(evt);
            }
        });
        panelDados.add(iconeDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 0, -1, -1));

        panelMenu.add(panelDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 130, 60));

        panelFechar.setBackground(new java.awt.Color(255, 255, 255));
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
        panelFechar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/letra-x.png"))); // NOI18N
        iconeFechar.setText("jLabel2");
        iconeFechar.setMaximumSize(new java.awt.Dimension(30, 30));
        iconeFechar.setMinimumSize(new java.awt.Dimension(30, 30));
        iconeFechar.setPreferredSize(new java.awt.Dimension(30, 30));
        panelFechar.add(iconeFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        panelMenu.add(panelFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1108, 0, -1, -1));

        panelMinimizar.setBackground(new java.awt.Color(255, 255, 255));
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
        panelMinimizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeFechar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minimizar (30px).png"))); // NOI18N
        iconeFechar1.setText("jLabel2");
        iconeFechar1.setMaximumSize(new java.awt.Dimension(30, 30));
        iconeFechar1.setMinimumSize(new java.awt.Dimension(30, 30));
        iconeFechar1.setPreferredSize(new java.awt.Dimension(30, 30));
        panelMinimizar.add(iconeFechar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        panelMenu.add(panelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 0, -1, -1));

        panelDeslogar.setBackground(new java.awt.Color(255, 255, 255));
        panelDeslogar.setForeground(new java.awt.Color(0, 0, 0));
        panelDeslogar.setText("sair da conta");
        panelDeslogar.setBorder(null);
        panelDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelDeslogarActionPerformed(evt);
            }
        });
        panelMenu.add(panelDeslogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 140, 30));

        labelNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelNome.setForeground(new java.awt.Color(51, 51, 51));
        labelNome.setText("Bem vindo, Usuário");
        panelMenu.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, -1, -1));

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
        Inicio inicio = new Inicio(cod_usuario);
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
        Inicio inicio = new Inicio(cod_usuario);
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
        panelFechar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_panelFecharMouseExited

    private void panelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseClicked
        this.setExtendedState(Principal.ICONIFIED);
    }//GEN-LAST:event_panelMinimizarMouseClicked

    private void panelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseEntered
        panelMinimizar.setBackground(new Color(200, 200, 200));
    }//GEN-LAST:event_panelMinimizarMouseEntered

    private void panelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseExited
        panelMinimizar.setBackground(new Color(255, 255, 255));
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

    private void panelDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelDeslogarActionPerformed
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_panelDeslogarActionPerformed

    private void iconeDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeDadosMouseClicked
        Dados dados = new Dados();
        jDesktopPane.removeAll();
        jDesktopPane.add(dados).setVisible(true);
    }//GEN-LAST:event_iconeDadosMouseClicked

    private void iconeDadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeDadosMouseEntered
        panelDados.setBackground(new Color(235, 219, 252));
    }//GEN-LAST:event_iconeDadosMouseEntered

    private void iconeDadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeDadosMouseExited
        panelDados.setBackground(new Color(224, 198, 250));
    }//GEN-LAST:event_iconeDadosMouseExited

    private void panelDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDadosMouseClicked
        Dados dados = new Dados();
        jDesktopPane.removeAll();
        jDesktopPane.add(dados).setVisible(true);
    }//GEN-LAST:event_panelDadosMouseClicked

    private void panelDadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDadosMouseEntered
        panelDados.setBackground(new Color(235, 219, 252));
    }//GEN-LAST:event_panelDadosMouseEntered

    private void panelDadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDadosMouseExited
        panelDados.setBackground(new Color(224, 198, 250));
    }//GEN-LAST:event_panelDadosMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconeAnotacoes;
    private javax.swing.JLabel iconeCalendario;
    private javax.swing.JLabel iconeDados;
    private javax.swing.JLabel iconeFechar;
    private javax.swing.JLabel iconeFechar1;
    private javax.swing.JLabel iconeGastos;
    private javax.swing.JLabel iconeInicio;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelAnotacoes;
    private javax.swing.JLabel labelCalendario;
    private javax.swing.JLabel labelDados;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelGastos;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel labelNome;
    private javax.swing.JPanel panelAno;
    private javax.swing.JPanel panelAnotacoes;
    private javax.swing.JPanel panelCalendario;
    private javax.swing.JPanel panelDados;
    private javax.swing.JButton panelDeslogar;
    private javax.swing.JPanel panelFechar;
    private javax.swing.JPanel panelGastos;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMinimizar;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
