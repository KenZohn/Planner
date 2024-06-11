package Telas;

import Banco.UsuarioBD;
import Dados.UsuarioDados;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Cadastrar extends javax.swing.JFrame {

    private String nome, email, login, senha;
    private int cod_usuario;

    public Cadastrar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        TextEmail = new javax.swing.JTextField();
        TextNome = new javax.swing.JTextField();
        TextLogin = new javax.swing.JTextField();
        TextSenha = new javax.swing.JTextField();
        botaoFinalizarCadastro = new javax.swing.JButton();
        botaoFechar = new javax.swing.JPanel();
        iconeFechar = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelMinimizar = new javax.swing.JPanel();
        iconeFechar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 350));
        setMinimumSize(new java.awt.Dimension(400, 350));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        principal.setBackground(new java.awt.Color(255, 234, 189));
        principal.setMaximumSize(new java.awt.Dimension(400, 350));
        principal.setMinimumSize(new java.awt.Dimension(400, 350));
        principal.setPreferredSize(new java.awt.Dimension(400, 350));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(0, 0, 0));
        labelNome.setText("Nome");
        labelNome.setMaximumSize(new java.awt.Dimension(39, 30));
        labelNome.setMinimumSize(new java.awt.Dimension(39, 30));
        labelNome.setPreferredSize(new java.awt.Dimension(39, 30));
        principal.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 80, -1, -1));

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        labelEmail.setText("E-mail");
        labelEmail.setMaximumSize(new java.awt.Dimension(39, 30));
        labelEmail.setMinimumSize(new java.awt.Dimension(39, 30));
        labelEmail.setPreferredSize(new java.awt.Dimension(39, 30));
        principal.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 130, -1, -1));

        labelLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(0, 0, 0));
        labelLogin.setText("Login");
        labelLogin.setMaximumSize(new java.awt.Dimension(35, 30));
        labelLogin.setMinimumSize(new java.awt.Dimension(35, 30));
        labelLogin.setPreferredSize(new java.awt.Dimension(35, 30));
        principal.add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 180, -1, -1));

        labelSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(0, 0, 0));
        labelSenha.setText("Senha");
        labelSenha.setMaximumSize(new java.awt.Dimension(38, 30));
        labelSenha.setMinimumSize(new java.awt.Dimension(38, 30));
        labelSenha.setPreferredSize(new java.awt.Dimension(38, 30));
        principal.add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 230, -1, -1));

        TextEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TextEmail.setMaximumSize(new java.awt.Dimension(250, 30));
        TextEmail.setMinimumSize(new java.awt.Dimension(250, 30));
        TextEmail.setPreferredSize(new java.awt.Dimension(250, 30));
        principal.add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        TextNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TextNome.setToolTipText("");
        TextNome.setPreferredSize(new java.awt.Dimension(250, 30));
        principal.add(TextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        TextLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TextLogin.setMaximumSize(new java.awt.Dimension(250, 30));
        TextLogin.setMinimumSize(new java.awt.Dimension(250, 30));
        TextLogin.setPreferredSize(new java.awt.Dimension(250, 30));
        principal.add(TextLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        TextSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TextSenha.setMaximumSize(new java.awt.Dimension(250, 30));
        TextSenha.setMinimumSize(new java.awt.Dimension(250, 30));
        TextSenha.setPreferredSize(new java.awt.Dimension(250, 30));
        principal.add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        botaoFinalizarCadastro.setBackground(new java.awt.Color(153, 255, 204));
        botaoFinalizarCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoFinalizarCadastro.setForeground(new java.awt.Color(0, 0, 0));
        botaoFinalizarCadastro.setText("Concluir");
        botaoFinalizarCadastro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoFinalizarCadastro.setMaximumSize(new java.awt.Dimension(128, 30));
        botaoFinalizarCadastro.setMinimumSize(new java.awt.Dimension(128, 30));
        botaoFinalizarCadastro.setPreferredSize(new java.awt.Dimension(128, 30));
        botaoFinalizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarCadastroActionPerformed(evt);
            }
        });
        principal.add(botaoFinalizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        botaoFechar.setBackground(new java.awt.Color(255, 234, 189));
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

        iconeFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/letra-x.png"))); // NOI18N
        iconeFechar.setText("jLabel2");
        iconeFechar.setPreferredSize(new java.awt.Dimension(30, 30));
        botaoFechar.add(iconeFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        principal.add(botaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 0, -1, -1));

        botaoCancelar.setBackground(new java.awt.Color(253, 103, 103));
        botaoCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoCancelar.setForeground(new java.awt.Color(0, 0, 0));
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCancelar.setMaximumSize(new java.awt.Dimension(128, 30));
        botaoCancelar.setMinimumSize(new java.awt.Dimension(128, 30));
        botaoCancelar.setPreferredSize(new java.awt.Dimension(128, 30));
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        principal.add(botaoCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Criar conta");
        principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

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

        iconeFechar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minimizar (30px).png"))); // NOI18N
        iconeFechar1.setText("jLabel2");
        iconeFechar1.setMaximumSize(new java.awt.Dimension(30, 30));
        iconeFechar1.setMinimumSize(new java.awt.Dimension(30, 30));
        iconeFechar1.setPreferredSize(new java.awt.Dimension(30, 30));
        panelMinimizar.add(iconeFechar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        principal.add(panelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 0, -1, -1));

        getContentPane().add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFecharMouseClicked
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoFecharMouseClicked

    private void botaoFinalizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarCadastroActionPerformed
        UsuarioDados usuarioDados = new UsuarioDados();
        UsuarioBD usuarioBD = new UsuarioBD();

        nome = TextNome.getText();
        email = TextEmail.getText();
        login = TextLogin.getText();
        senha = TextSenha.getText();

        usuarioDados.setNome(nome);
        usuarioDados.setEmail(email);
        usuarioDados.setLogin(login);
        usuarioDados.setSenha(senha);

        if (usuarioBD.inserirUsuario(usuarioDados) == true) {
            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!!!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            Login telaLogin = new Login();
            telaLogin.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Erro no cadastro", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoFinalizarCadastroActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextLogin;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextSenha;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JPanel botaoFechar;
    private javax.swing.JButton botaoFinalizarCadastro;
    private javax.swing.JLabel iconeFechar;
    private javax.swing.JLabel iconeFechar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel panelMinimizar;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
