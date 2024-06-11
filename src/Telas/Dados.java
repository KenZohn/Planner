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

    public Dados() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        buscarDadosUsuario();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoLogin = new javax.swing.JTextField();
        botaoDadosSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botaoVoltarDados = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botaoDadosSalvar2 = new javax.swing.JButton();
        campoConfSenhaNova = new javax.swing.JPasswordField();
        campoSenhaNova = new javax.swing.JPasswordField();
        botaoVoltarDados1 = new javax.swing.JButton();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoNome.setMaximumSize(new java.awt.Dimension(250, 30));
        campoNome.setMinimumSize(new java.awt.Dimension(250, 30));
        campoNome.setPreferredSize(new java.awt.Dimension(250, 30));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        jPanel1.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoEmail.setMaximumSize(new java.awt.Dimension(250, 30));
        campoEmail.setMinimumSize(new java.awt.Dimension(250, 30));
        campoEmail.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        campoLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoLogin.setMaximumSize(new java.awt.Dimension(250, 30));
        campoLogin.setMinimumSize(new java.awt.Dimension(250, 30));
        campoLogin.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(campoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        botaoDadosSalvar.setBackground(new java.awt.Color(204, 102, 255));
        botaoDadosSalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoDadosSalvar.setForeground(new java.awt.Color(0, 0, 0));
        botaoDadosSalvar.setText("Salvar ");
        botaoDadosSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDadosSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoDadosSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 150, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Login");
        jLabel1.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 60, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome");
        jLabel2.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 60, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("E-mail");
        jLabel3.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Alterar Dados");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        botaoVoltarDados.setBackground(new java.awt.Color(204, 102, 255));
        botaoVoltarDados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoVoltarDados.setForeground(new java.awt.Color(0, 0, 0));
        botaoVoltarDados.setText("Desfazer");
        botaoVoltarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarDadosActionPerformed(evt);
            }
        });
        jPanel1.add(botaoVoltarDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 150, 40));

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 440, 300));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Confirmar senha");
        jLabel5.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel5.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel5.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 140, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nova Senha");
        jLabel7.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel7.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel7.setPreferredSize(new java.awt.Dimension(40, 30));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Alterar Senha");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        botaoDadosSalvar2.setBackground(new java.awt.Color(204, 102, 255));
        botaoDadosSalvar2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoDadosSalvar2.setForeground(new java.awt.Color(0, 0, 0));
        botaoDadosSalvar2.setText("Salvar alterações");
        botaoDadosSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDadosSalvar2ActionPerformed(evt);
            }
        });
        jPanel2.add(botaoDadosSalvar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 180, 40));

        campoConfSenhaNova.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoConfSenhaNova.setMaximumSize(new java.awt.Dimension(250, 30));
        campoConfSenhaNova.setMinimumSize(new java.awt.Dimension(250, 30));
        campoConfSenhaNova.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel2.add(campoConfSenhaNova, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        campoSenhaNova.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoSenhaNova.setMaximumSize(new java.awt.Dimension(250, 30));
        campoSenhaNova.setMinimumSize(new java.awt.Dimension(250, 30));
        campoSenhaNova.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel2.add(campoSenhaNova, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        botaoVoltarDados1.setBackground(new java.awt.Color(204, 102, 255));
        botaoVoltarDados1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botaoVoltarDados1.setForeground(new java.awt.Color(0, 0, 0));
        botaoVoltarDados1.setText("Limpar");
        botaoVoltarDados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarDados1ActionPerformed(evt);
            }
        });
        jPanel2.add(botaoVoltarDados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 150, 40));

        panelPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 480, 300));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed

    }//GEN-LAST:event_campoNomeActionPerformed

    private void botaoDadosSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDadosSalvarActionPerformed
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

        if (usuarioBD.atualizarDados(usuarioDados) == true) {
            JOptionPane.showMessageDialog(null, "atualizado com sucesso!!!", "atualizado", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Erro na atualização", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoDadosSalvarActionPerformed

    private void botaoVoltarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarDadosActionPerformed
        buscarDadosUsuario();
    }//GEN-LAST:event_botaoVoltarDadosActionPerformed

    private void botaoDadosSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDadosSalvar2ActionPerformed
        if (campoSenhaNova.getText() == null ? campoConfSenhaNova.getText() == null : campoSenhaNova.getText().equals(campoConfSenhaNova.getText())) {
            UsuarioDados usuarioDados = new UsuarioDados();
            UsuarioBD usuarioBD = new UsuarioBD();
            senha= campoSenhaNova.getText();
            usuarioDados.setCod_usuario(cod_usuario);
            usuarioDados.setSenha(senha);
           usuarioBD.atualizarSenha(usuarioDados);
            JOptionPane.showMessageDialog(null, "atualizado com sucesso!!!", "atualizado", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Erro na confirmação", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_botaoDadosSalvar2ActionPerformed

    private void botaoVoltarDados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarDados1ActionPerformed
        campoSenhaNova.setText("");
        campoConfSenhaNova.setText("");
    }//GEN-LAST:event_botaoVoltarDados1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDadosSalvar;
    private javax.swing.JButton botaoDadosSalvar2;
    private javax.swing.JButton botaoVoltarDados;
    private javax.swing.JButton botaoVoltarDados1;
    private javax.swing.JPasswordField campoConfSenhaNova;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenhaNova;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
