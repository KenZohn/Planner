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
        labelLogin = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        botaoEntrar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        botaoFechar = new javax.swing.JPanel();
        iconeFechar = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 350));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 234, 189));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(700, 350));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(700, 350));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(700, 350));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(0, 0, 0));
        labelLogin.setText("Login");
        labelLogin.setMaximumSize(new java.awt.Dimension(46, 30));
        labelLogin.setMinimumSize(new java.awt.Dimension(46, 30));
        labelLogin.setPreferredSize(new java.awt.Dimension(46, 30));
        panelPrincipal.add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        labelSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(0, 0, 0));
        labelSenha.setText("Senha");
        labelSenha.setMaximumSize(new java.awt.Dimension(46, 30));
        labelSenha.setMinimumSize(new java.awt.Dimension(46, 30));
        labelSenha.setPreferredSize(new java.awt.Dimension(46, 30));
        panelPrincipal.add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        campoLogin.setBackground(new java.awt.Color(217, 247, 254));
        campoLogin.setMaximumSize(new java.awt.Dimension(150, 30));
        campoLogin.setMinimumSize(new java.awt.Dimension(150, 30));
        campoLogin.setPreferredSize(new java.awt.Dimension(150, 30));
        campoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoginActionPerformed(evt);
            }
        });
        panelPrincipal.add(campoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        botaoEntrar.setBackground(new java.awt.Color(127, 215, 219));
        botaoEntrar.setForeground(new java.awt.Color(0, 0, 0));
        botaoEntrar.setText("Entrar");
        botaoEntrar.setMaximumSize(new java.awt.Dimension(120, 40));
        botaoEntrar.setMinimumSize(new java.awt.Dimension(120, 40));
        botaoEntrar.setPreferredSize(new java.awt.Dimension(120, 40));
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        panelPrincipal.add(botaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        botaoCadastrar.setBackground(new java.awt.Color(127, 215, 219));
        botaoCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        botaoCadastrar.setText("Criar Conta");
        botaoCadastrar.setMaximumSize(new java.awt.Dimension(160, 40));
        botaoCadastrar.setMinimumSize(new java.awt.Dimension(160, 40));
        botaoCadastrar.setPreferredSize(new java.awt.Dimension(160, 40));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        panelPrincipal.add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, -1));

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

        panelPrincipal.add(botaoFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 30, 30));

        campoSenha.setBackground(new java.awt.Color(217, 247, 254));
        campoSenha.setMaximumSize(new java.awt.Dimension(150, 30));
        campoSenha.setMinimumSize(new java.awt.Dimension(150, 30));
        campoSenha.setPreferredSize(new java.awt.Dimension(150, 30));
        panelPrincipal.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novalogo (2).jpg"))); // NOI18N
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("PLANNER");
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 230, 50));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JPanel botaoFechar;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel iconeFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
