package Telas;

import Banco.AcessoBD;
import Banco.UsuarioBD;
import Dados.UsuarioDados;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private Cadastrar cadastrar;
    private Principal principal;
    private Redefinir redefinir;
    public static int codUsuario;

    public Login() {
        initComponents();
        cadastrar = new Cadastrar();

        setLocationRelativeTo(null);
    }
    
    public void entrarSistema() {
        String login;
        String senha;

        AcessoBD acesso = new AcessoBD();
        UsuarioDados usuarioDados = new UsuarioDados();
        UsuarioBD usuarioBD = new UsuarioBD();

        login = campoLogin.getText();
        senha = campoSenha.getText();

        usuarioDados.setLogin(login);
        usuarioDados.setSenha(senha);

        if (acesso.verificaAcesso(usuarioDados) == true) {
            usuarioDados.setCod_usuario(Integer.parseInt(usuarioBD.buscarUsuario(usuarioDados)));
            codUsuario = Integer.parseInt(usuarioBD.buscarUsuario(usuarioDados));
            principal = new Principal(usuarioDados);
            principal.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Erro nos dados informados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        botaoEntrar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        botaoFechar = new javax.swing.JPanel();
        iconeFechar = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        imgLogo = new javax.swing.JLabel();
        labelPlanner = new javax.swing.JLabel();
        panelMinimizar = new javax.swing.JPanel();
        iconeFechar1 = new javax.swing.JLabel();
        botaoRedefinir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 390));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 234, 189));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(600, 400));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(600, 350));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(600, 390));
        panelPrincipal.setRequestFocusEnabled(false);
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelLogin.setText("Login");
        labelLogin.setMaximumSize(new java.awt.Dimension(46, 30));
        labelLogin.setMinimumSize(new java.awt.Dimension(46, 30));
        labelLogin.setPreferredSize(new java.awt.Dimension(46, 30));
        panelPrincipal.add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        labelSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSenha.setText("Senha");
        labelSenha.setMaximumSize(new java.awt.Dimension(46, 30));
        labelSenha.setMinimumSize(new java.awt.Dimension(46, 30));
        labelSenha.setPreferredSize(new java.awt.Dimension(46, 30));
        panelPrincipal.add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 50, -1));

        campoLogin.setBackground(new java.awt.Color(217, 247, 254));
        campoLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoLogin.setMaximumSize(new java.awt.Dimension(200, 30));
        campoLogin.setMinimumSize(new java.awt.Dimension(200, 30));
        campoLogin.setPreferredSize(new java.awt.Dimension(200, 30));
        campoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoginActionPerformed(evt);
            }
        });
        campoLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoLoginKeyPressed(evt);
            }
        });
        panelPrincipal.add(campoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        botaoEntrar.setBackground(new java.awt.Color(192, 231, 233));
        botaoEntrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoEntrar.setText("Entrar");
        botaoEntrar.setMaximumSize(new java.awt.Dimension(160, 40));
        botaoEntrar.setMinimumSize(new java.awt.Dimension(220, 40));
        botaoEntrar.setPreferredSize(new java.awt.Dimension(220, 40));
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        panelPrincipal.add(botaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        botaoCadastrar.setBackground(new java.awt.Color(192, 231, 233));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoCadastrar.setText("Criar Conta");
        botaoCadastrar.setMaximumSize(new java.awt.Dimension(220, 40));
        botaoCadastrar.setMinimumSize(new java.awt.Dimension(160, 40));
        botaoCadastrar.setPreferredSize(new java.awt.Dimension(220, 40));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        panelPrincipal.add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        botaoFechar.setBackground(new java.awt.Color(255, 234, 189));
        botaoFechar.setMaximumSize(new java.awt.Dimension(45, 30));
        botaoFechar.setMinimumSize(new java.awt.Dimension(45, 30));
        botaoFechar.setPreferredSize(new java.awt.Dimension(45, 30));
        botaoFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoFecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoFecharMouseExited(evt);
            }
        });
        botaoFechar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fechar (30px).png"))); // NOI18N
        botaoFechar.add(iconeFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        panelPrincipal.add(botaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 0, -1, -1));

        campoSenha.setBackground(new java.awt.Color(217, 247, 254));
        campoSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoSenha.setMaximumSize(new java.awt.Dimension(200, 30));
        campoSenha.setMinimumSize(new java.awt.Dimension(200, 30));
        campoSenha.setPreferredSize(new java.awt.Dimension(200, 30));
        campoSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoSenhaKeyPressed(evt);
            }
        });
        panelPrincipal.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.jpg"))); // NOI18N
        panelPrincipal.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        labelPlanner.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        labelPlanner.setForeground(new java.awt.Color(1, 74, 110));
        labelPlanner.setText("PLANNER");
        labelPlanner.setMaximumSize(new java.awt.Dimension(202, 50));
        labelPlanner.setMinimumSize(new java.awt.Dimension(202, 50));
        labelPlanner.setPreferredSize(new java.awt.Dimension(202, 50));
        panelPrincipal.add(labelPlanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        panelMinimizar.setBackground(new java.awt.Color(255, 234, 189));
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

        iconeFechar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minimizar (24px).png"))); // NOI18N
        iconeFechar1.setMaximumSize(new java.awt.Dimension(30, 30));
        iconeFechar1.setMinimumSize(new java.awt.Dimension(30, 30));
        iconeFechar1.setPreferredSize(new java.awt.Dimension(30, 30));
        panelMinimizar.add(iconeFechar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        panelPrincipal.add(panelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 0, -1, -1));

        botaoRedefinir.setBackground(new java.awt.Color(192, 231, 233));
        botaoRedefinir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoRedefinir.setText("Esqueci minha senha");
        botaoRedefinir.setMaximumSize(new java.awt.Dimension(220, 40));
        botaoRedefinir.setMinimumSize(new java.awt.Dimension(160, 40));
        botaoRedefinir.setPreferredSize(new java.awt.Dimension(220, 40));
        botaoRedefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRedefinirActionPerformed(evt);
            }
        });
        panelPrincipal.add(botaoRedefinir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLoginActionPerformed

    }//GEN-LAST:event_campoLoginActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        entrarSistema();
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void botaoFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botaoFecharMouseClicked

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        cadastrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void panelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseClicked
        this.setExtendedState(Principal.ICONIFIED);
    }//GEN-LAST:event_panelMinimizarMouseClicked

    private void panelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseEntered
        panelMinimizar.setBackground(new Color(252, 245, 228));
    }//GEN-LAST:event_panelMinimizarMouseEntered

    private void panelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseExited
        panelMinimizar.setBackground(new Color(255, 234, 189));
    }//GEN-LAST:event_panelMinimizarMouseExited

    private void botaoFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFecharMouseEntered
        botaoFechar.setBackground(new Color(222, 75, 75));
    }//GEN-LAST:event_botaoFecharMouseEntered

    private void botaoFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFecharMouseExited
        botaoFechar.setBackground(new Color(255, 234, 189));
    }//GEN-LAST:event_botaoFecharMouseExited

    private void campoSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarSistema();
        }
    }//GEN-LAST:event_campoSenhaKeyPressed

    private void campoLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarSistema();
        }
    }//GEN-LAST:event_campoLoginKeyPressed

    private void botaoRedefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRedefinirActionPerformed
        redefinir.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoRedefinirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JPanel botaoFechar;
    private javax.swing.JButton botaoRedefinir;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel iconeFechar;
    private javax.swing.JLabel iconeFechar1;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPlanner;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel panelMinimizar;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
