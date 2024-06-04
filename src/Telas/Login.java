package Telas;

import Banco.AcessoBD;
import Banco.UsuarioBD;
import Dados.UsuarioDados;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private Cadastrar cadastrar;
    private Principal principal;
    public static int cod_usuario;

    public Login() {
        initComponents();
        cadastrar = new Cadastrar();
        principal = new Principal();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        imagemLogo = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        botaoEntrar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        botaoRedefinir = new javax.swing.JButton();
        botaoFechar = new javax.swing.JPanel();
        iconeFechar = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(450, 310));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 234, 189));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(709, 415));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(709, 415));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(709, 415));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo (300px).jpg"))); // NOI18N
        panelPrincipal.add(imagemLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, 330));

        labelLogin.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(0, 0, 0));
        labelLogin.setText("login");
        panelPrincipal.add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 20));

        labelSenha.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(0, 0, 0));
        labelSenha.setText("Senha");
        panelPrincipal.add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, 20));

        campoLogin.setBackground(new java.awt.Color(0, 204, 255));
        campoLogin.setMaximumSize(new java.awt.Dimension(150, 26));
        campoLogin.setMinimumSize(new java.awt.Dimension(150, 26));
        campoLogin.setPreferredSize(new java.awt.Dimension(150, 26));
        campoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoginActionPerformed(evt);
            }
        });
        panelPrincipal.add(campoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        botaoEntrar.setBackground(new java.awt.Color(127, 215, 219));
        botaoEntrar.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        botaoEntrar.setForeground(new java.awt.Color(0, 0, 0));
        botaoEntrar.setText("entrar");
        botaoEntrar.setMaximumSize(new java.awt.Dimension(120, 40));
        botaoEntrar.setMinimumSize(new java.awt.Dimension(120, 40));
        botaoEntrar.setPreferredSize(new java.awt.Dimension(120, 40));
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        panelPrincipal.add(botaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        botaoCadastrar.setBackground(new java.awt.Color(127, 215, 219));
        botaoCadastrar.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setMaximumSize(new java.awt.Dimension(120, 40));
        botaoCadastrar.setMinimumSize(new java.awt.Dimension(120, 40));
        botaoCadastrar.setPreferredSize(new java.awt.Dimension(120, 40));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        panelPrincipal.add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        botaoRedefinir.setBackground(new java.awt.Color(127, 215, 219));
        botaoRedefinir.setFont(new java.awt.Font("Felix Titling", 0, 12)); // NOI18N
        botaoRedefinir.setForeground(new java.awt.Color(0, 0, 0));
        botaoRedefinir.setText("redefinir");
        botaoRedefinir.setMaximumSize(new java.awt.Dimension(120, 40));
        botaoRedefinir.setMinimumSize(new java.awt.Dimension(120, 40));
        botaoRedefinir.setPreferredSize(new java.awt.Dimension(120, 40));
        botaoRedefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRedefinirActionPerformed(evt);
            }
        });
        panelPrincipal.add(botaoRedefinir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        botaoFechar.setBackground(new java.awt.Color(255, 255, 204));
        botaoFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoFecharMouseClicked(evt);
            }
        });
        botaoFechar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/letra-x.png"))); // NOI18N
        iconeFechar.setText("jLabel2");
        iconeFechar.setPreferredSize(new java.awt.Dimension(30, 30));
        botaoFechar.add(iconeFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelPrincipal.add(botaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 30, 30));

        campoSenha.setBackground(new java.awt.Color(0, 204, 255));
        campoSenha.setMaximumSize(new java.awt.Dimension(150, 26));
        campoSenha.setMinimumSize(new java.awt.Dimension(150, 26));
        campoSenha.setPreferredSize(new java.awt.Dimension(150, 26));
        panelPrincipal.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLoginActionPerformed

    }//GEN-LAST:event_campoLoginActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
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
            cod_usuario = Integer.parseInt(usuarioBD.buscarUsuario(usuarioDados));
            System.out.println(cod_usuario);
            principal.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Erro nos dados informados", "Erro", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void botaoFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botaoFecharMouseClicked

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        cadastrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoRedefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRedefinirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoRedefinirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JPanel botaoFechar;
    private javax.swing.JButton botaoRedefinir;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel iconeFechar;
    private javax.swing.JLabel imagemLogo;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
