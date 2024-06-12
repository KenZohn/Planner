package Telas;

import Banco.UsuarioBD;
import Dados.UsuarioDados;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Dados extends javax.swing.JInternalFrame {

    public int cod_usuario;
    private String nome;
    private String email;
    private String login, senha;
    private Principal telaPrincipal;

    public Dados(Principal principal) {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        buscarDadosUsuario();

        telaPrincipal = principal;
    }

    public void buscarDadosUsuario() {
        UsuarioDados usuarioDados = new UsuarioDados();
        UsuarioBD usuarioBD = new UsuarioBD();
        Login loginTela = new Login();
        cod_usuario = loginTela.cod_usuario;
        usuarioDados.setCod_usuario(cod_usuario);
        System.out.println("cod:" + cod_usuario);

        campoNome.setText(usuarioBD.buscarNome(usuarioDados).toString());
        campoEmail.setText(usuarioBD.buscarEmail(usuarioDados).toString());
        campoLogin.setText(usuarioBD.buscarLogin(usuarioDados).toString());
    }

    public void excluirConta() {
        int resultado = JOptionPane.showConfirmDialog(null, "Todos os dados serão perdidos. Deseja excluir a conta?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            UsuarioDados usuarioDados = new UsuarioDados();
            UsuarioBD usuarioBD = new UsuarioBD();

            usuarioDados.setCod_usuario(cod_usuario);
            usuarioBD.excluirUsuario(usuarioDados);
            JOptionPane.showMessageDialog(null, "Conta excluída com sucesso.", "Conta excluída", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelAlterarDados = new javax.swing.JPanel();
        labelAlterarDados = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoLogin = new javax.swing.JTextField();
        botaoDesfazer = new javax.swing.JButton();
        botaoSalvarDados = new javax.swing.JButton();
        panelAlterarSenha = new javax.swing.JPanel();
        labelAlterarSenha = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelConfirmarSenha = new javax.swing.JLabel();
        campoSenhaNova = new javax.swing.JPasswordField();
        campoConfSenhaNova = new javax.swing.JPasswordField();
        botaoLimpar = new javax.swing.JButton();
        botaoSalvarSenha = new javax.swing.JButton();
        botaoExcluirConta = new javax.swing.JButton();

        setBackground(new java.awt.Color(224, 198, 250));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1152, 588));
        setMinimumSize(new java.awt.Dimension(1152, 588));
        setPreferredSize(new java.awt.Dimension(1152, 588));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(235, 219, 252));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1152, 523));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1152, 523));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1152, 578));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAlterarDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelAlterarDados.setOpaque(false);
        panelAlterarDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAlterarDados.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        labelAlterarDados.setText("Alterar Dados");
        panelAlterarDados.add(labelAlterarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 35, -1, -1));

        labelNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelNome.setText("Nome");
        labelNome.setMaximumSize(new java.awt.Dimension(40, 30));
        labelNome.setMinimumSize(new java.awt.Dimension(40, 30));
        labelNome.setPreferredSize(new java.awt.Dimension(40, 30));
        panelAlterarDados.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 60, -1));

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelEmail.setText("E-mail");
        labelEmail.setMaximumSize(new java.awt.Dimension(40, 30));
        labelEmail.setMinimumSize(new java.awt.Dimension(40, 30));
        labelEmail.setPreferredSize(new java.awt.Dimension(40, 30));
        panelAlterarDados.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, -1));

        labelLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelLogin.setText("Login");
        labelLogin.setMaximumSize(new java.awt.Dimension(40, 30));
        labelLogin.setMinimumSize(new java.awt.Dimension(40, 30));
        labelLogin.setPreferredSize(new java.awt.Dimension(40, 30));
        panelAlterarDados.add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 60, -1));

        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoNome.setMaximumSize(new java.awt.Dimension(250, 30));
        campoNome.setMinimumSize(new java.awt.Dimension(250, 30));
        campoNome.setPreferredSize(new java.awt.Dimension(250, 30));
        panelAlterarDados.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoEmail.setMaximumSize(new java.awt.Dimension(250, 30));
        campoEmail.setMinimumSize(new java.awt.Dimension(250, 30));
        campoEmail.setPreferredSize(new java.awt.Dimension(250, 30));
        panelAlterarDados.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        campoLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoLogin.setMaximumSize(new java.awt.Dimension(250, 30));
        campoLogin.setMinimumSize(new java.awt.Dimension(250, 30));
        campoLogin.setPreferredSize(new java.awt.Dimension(250, 30));
        panelAlterarDados.add(campoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        botaoDesfazer.setBackground(new java.awt.Color(227, 227, 227));
        botaoDesfazer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoDesfazer.setText("Desfazer");
        botaoDesfazer.setPreferredSize(new java.awt.Dimension(150, 40));
        botaoDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDesfazerActionPerformed(evt);
            }
        });
        panelAlterarDados.add(botaoDesfazer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        botaoSalvarDados.setBackground(new java.awt.Color(153, 255, 204));
        botaoSalvarDados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoSalvarDados.setText("Salvar ");
        botaoSalvarDados.setPreferredSize(new java.awt.Dimension(150, 40));
        botaoSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarDadosActionPerformed(evt);
            }
        });
        panelAlterarDados.add(botaoSalvarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        panelPrincipal.add(panelAlterarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 440, 300));

        panelAlterarSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelAlterarSenha.setOpaque(false);
        panelAlterarSenha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAlterarSenha.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        labelAlterarSenha.setText("Alterar Senha");
        panelAlterarSenha.add(labelAlterarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, -1, -1));

        labelSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSenha.setText("Nova Senha");
        labelSenha.setMaximumSize(new java.awt.Dimension(40, 30));
        labelSenha.setMinimumSize(new java.awt.Dimension(40, 30));
        labelSenha.setPreferredSize(new java.awt.Dimension(40, 30));
        panelAlterarSenha.add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        labelConfirmarSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelConfirmarSenha.setText("Confirmar senha");
        labelConfirmarSenha.setMaximumSize(new java.awt.Dimension(40, 30));
        labelConfirmarSenha.setMinimumSize(new java.awt.Dimension(40, 30));
        labelConfirmarSenha.setPreferredSize(new java.awt.Dimension(40, 30));
        panelAlterarSenha.add(labelConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 140, -1));

        campoSenhaNova.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoSenhaNova.setMaximumSize(new java.awt.Dimension(250, 30));
        campoSenhaNova.setMinimumSize(new java.awt.Dimension(250, 30));
        campoSenhaNova.setPreferredSize(new java.awt.Dimension(250, 30));
        panelAlterarSenha.add(campoSenhaNova, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        campoConfSenhaNova.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoConfSenhaNova.setMaximumSize(new java.awt.Dimension(250, 30));
        campoConfSenhaNova.setMinimumSize(new java.awt.Dimension(250, 30));
        campoConfSenhaNova.setPreferredSize(new java.awt.Dimension(250, 30));
        panelAlterarSenha.add(campoConfSenhaNova, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        botaoLimpar.setBackground(new java.awt.Color(227, 227, 227));
        botaoLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.setPreferredSize(new java.awt.Dimension(150, 40));
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        panelAlterarSenha.add(botaoLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        botaoSalvarSenha.setBackground(new java.awt.Color(153, 255, 204));
        botaoSalvarSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoSalvarSenha.setText("Salvar");
        botaoSalvarSenha.setPreferredSize(new java.awt.Dimension(150, 40));
        botaoSalvarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarSenhaActionPerformed(evt);
            }
        });
        panelAlterarSenha.add(botaoSalvarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        panelPrincipal.add(panelAlterarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 480, 300));

        botaoExcluirConta.setBackground(new java.awt.Color(253, 103, 103));
        botaoExcluirConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoExcluirConta.setText("Excluir conta");
        botaoExcluirConta.setPreferredSize(new java.awt.Dimension(150, 40));
        botaoExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirContaActionPerformed(evt);
            }
        });
        panelPrincipal.add(botaoExcluirConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 498, -1, -1));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarDadosActionPerformed
        UsuarioDados usuarioDados = new UsuarioDados();
        UsuarioBD usuarioBD = new UsuarioBD();

        nome = campoNome.getText();
        email = campoEmail.getText();
        login = campoLogin.getText();

        usuarioDados.setCod_usuario(cod_usuario);
        usuarioDados.setNome(nome);
        usuarioDados.setEmail(email);
        usuarioDados.setLogin(login);

        System.out.println("cod2:" + cod_usuario);

        if ("".equals(campoNome.getText()) || "".equals(campoEmail.getText()) || "".equals(campoLogin.getText())) {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (usuarioBD.atualizarDados(usuarioDados) == true) {
                JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso.", "Atualizado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro na atualização", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoSalvarDadosActionPerformed

    private void botaoDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDesfazerActionPerformed
        buscarDadosUsuario();
    }//GEN-LAST:event_botaoDesfazerActionPerformed

    private void botaoSalvarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarSenhaActionPerformed
        if ("".equals(campoSenhaNova.getText()) || "".equals(campoConfSenhaNova.getText())) {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (campoSenhaNova.getText() == null ? campoConfSenhaNova.getText() == null : campoSenhaNova.getText().equals(campoConfSenhaNova.getText())) {
                UsuarioDados usuarioDados = new UsuarioDados();
                UsuarioBD usuarioBD = new UsuarioBD();
                senha = campoSenhaNova.getText();
                usuarioDados.setCod_usuario(cod_usuario);
                usuarioDados.setSenha(senha);
                usuarioBD.atualizarSenha(usuarioDados);
                JOptionPane.showMessageDialog(null, "Senha atualizada com sucesso.", "Atualizado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro na confirmação", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoSalvarSenhaActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        campoSenhaNova.setText("");
        campoConfSenhaNova.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirContaActionPerformed
        excluirConta();
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
        telaPrincipal.dispose();
    }//GEN-LAST:event_botaoExcluirContaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDesfazer;
    private javax.swing.JButton botaoExcluirConta;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvarDados;
    private javax.swing.JButton botaoSalvarSenha;
    private javax.swing.JPasswordField campoConfSenhaNova;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenhaNova;
    private javax.swing.JLabel labelAlterarDados;
    private javax.swing.JLabel labelAlterarSenha;
    private javax.swing.JLabel labelConfirmarSenha;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel panelAlterarDados;
    private javax.swing.JPanel panelAlterarSenha;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
