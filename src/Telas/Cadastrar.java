package Telas;

import Banco.UsuarioBD;
import Dados.UsuarioDados;
import Telas.Login;
import javax.swing.JOptionPane;

public class Cadastrar extends javax.swing.JFrame {

    private String nome, email, login, senha;
    private int cod_usuario;
    //private Login telaLogin;

    public Cadastrar() {
        initComponents();
        //telaLogin = new Login();
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
        BotaoFinalizarCadastro = new javax.swing.JButton();
        botao = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        principal.setBackground(new java.awt.Color(255, 234, 189));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNome.setForeground(new java.awt.Color(0, 0, 0));
        labelNome.setText("Nome");
        principal.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 30, 37, -1));

        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        labelEmail.setText("Email");
        principal.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 74, 37, -1));

        labelLogin.setForeground(new java.awt.Color(0, 0, 0));
        labelLogin.setText("Login");
        principal.add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 123, -1, -1));

        labelSenha.setForeground(new java.awt.Color(0, 0, 0));
        labelSenha.setText("senha");
        principal.add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        principal.add(TextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 260, -1));

        TextNome.setToolTipText("");
        TextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeActionPerformed(evt);
            }
        });
        principal.add(TextNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 260, -1));
        principal.add(TextLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 260, -1));
        principal.add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 260, -1));

        BotaoFinalizarCadastro.setText("Finalizar Cadastro");
        BotaoFinalizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFinalizarCadastroActionPerformed(evt);
            }
        });
        principal.add(BotaoFinalizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        botao.setBackground(new java.awt.Color(255, 255, 204));
        botao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout botaoLayout = new javax.swing.GroupLayout(botao);
        botao.setLayout(botaoLayout);
        botaoLayout.setHorizontalGroup(
            botaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        botaoLayout.setVerticalGroup(
            botaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        principal.add(botao, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        getContentPane().add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMouseClicked
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoMouseClicked

    private void BotaoFinalizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFinalizarCadastroActionPerformed
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
    }//GEN-LAST:event_BotaoFinalizarCadastroActionPerformed

    private void TextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoFinalizarCadastro;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextLogin;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextSenha;
    private javax.swing.JPanel botao;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
