package Telas;

import Banco.UsuarioBD;
import Dados.UsuarioDados;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Cadastrar extends javax.swing.JFrame {

    private String nome, email, login, senha, pergunta, resposta;
    private int cod_usuario;

    public Cadastrar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        labelCriarConta = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoLogin = new javax.swing.JTextField();
        botaoMinimizar = new javax.swing.JPanel();
        iconeFechar1 = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JPanel();
        iconeVoltar = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        botaoFinalizarCadastro = new javax.swing.JButton();
        campoResposta = new javax.swing.JTextField();
        campoPergunta = new javax.swing.JComboBox<>();
        labelResposta = new javax.swing.JLabel();
        labelPergunta = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 390));
        setMinimumSize(new java.awt.Dimension(400, 350));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        principal.setBackground(new java.awt.Color(252, 240, 216));
        principal.setMaximumSize(new java.awt.Dimension(700, 390));
        principal.setMinimumSize(new java.awt.Dimension(400, 350));
        principal.setPreferredSize(new java.awt.Dimension(700, 390));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCriarConta.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        labelCriarConta.setText("Criar conta");
        principal.add(labelCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        labelNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelNome.setText("Nome");
        labelNome.setMaximumSize(new java.awt.Dimension(50, 30));
        labelNome.setMinimumSize(new java.awt.Dimension(39, 30));
        labelNome.setPreferredSize(new java.awt.Dimension(50, 30));
        principal.add(labelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelEmail.setText("E-mail");
        labelEmail.setMaximumSize(new java.awt.Dimension(39, 30));
        labelEmail.setMinimumSize(new java.awt.Dimension(39, 30));
        labelEmail.setPreferredSize(new java.awt.Dimension(39, 30));
        principal.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 80, -1));

        labelLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelLogin.setText("Login");
        labelLogin.setMaximumSize(new java.awt.Dimension(35, 30));
        labelLogin.setMinimumSize(new java.awt.Dimension(35, 30));
        labelLogin.setPreferredSize(new java.awt.Dimension(35, 30));
        principal.add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 50, -1));

        labelSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSenha.setText("Senha");
        labelSenha.setMaximumSize(new java.awt.Dimension(38, 30));
        labelSenha.setMinimumSize(new java.awt.Dimension(38, 30));
        labelSenha.setPreferredSize(new java.awt.Dimension(38, 30));
        principal.add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 50, -1));

        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoNome.setToolTipText("");
        campoNome.setPreferredSize(new java.awt.Dimension(280, 30));
        principal.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoEmail.setMaximumSize(new java.awt.Dimension(250, 30));
        campoEmail.setMinimumSize(new java.awt.Dimension(250, 30));
        campoEmail.setPreferredSize(new java.awt.Dimension(280, 30));
        principal.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        campoLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoLogin.setMaximumSize(new java.awt.Dimension(250, 30));
        campoLogin.setMinimumSize(new java.awt.Dimension(250, 30));
        campoLogin.setPreferredSize(new java.awt.Dimension(280, 30));
        principal.add(campoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        botaoMinimizar.setBackground(new java.awt.Color(252, 240, 216));
        botaoMinimizar.setToolTipText("Minimizar");
        botaoMinimizar.setMaximumSize(new java.awt.Dimension(45, 30));
        botaoMinimizar.setMinimumSize(new java.awt.Dimension(45, 30));
        botaoMinimizar.setPreferredSize(new java.awt.Dimension(45, 30));
        botaoMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoMinimizarMouseExited(evt);
            }
        });
        botaoMinimizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeFechar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minimizar (24px).png"))); // NOI18N
        iconeFechar1.setMaximumSize(new java.awt.Dimension(30, 30));
        iconeFechar1.setMinimumSize(new java.awt.Dimension(30, 30));
        iconeFechar1.setPreferredSize(new java.awt.Dimension(30, 30));
        botaoMinimizar.add(iconeFechar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        principal.add(botaoMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, -1));

        botaoVoltar.setBackground(new java.awt.Color(252, 240, 216));
        botaoVoltar.setToolTipText("Voltar");
        botaoVoltar.setPreferredSize(new java.awt.Dimension(45, 30));
        botaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoVoltarMouseExited(evt);
            }
        });
        botaoVoltar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconeVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Voltar (24px).png"))); // NOI18N
        iconeVoltar.setPreferredSize(new java.awt.Dimension(30, 30));
        botaoVoltar.add(iconeVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 0, -1, -1));

        principal.add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 0, -1, -1));

        botaoCancelar.setBackground(new java.awt.Color(255, 139, 139));
        botaoCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        principal.add(botaoCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        botaoFinalizarCadastro.setBackground(new java.awt.Color(153, 255, 204));
        botaoFinalizarCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        principal.add(botaoFinalizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        campoResposta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoResposta.setMaximumSize(new java.awt.Dimension(250, 30));
        campoResposta.setMinimumSize(new java.awt.Dimension(250, 30));
        campoResposta.setPreferredSize(new java.awt.Dimension(280, 30));
        principal.add(campoResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        campoPergunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Qual é o nome do seu primeiro Pet?", "Qual é a cidade que sua mãe nasceu?", "Quem você era no RBD?", "Quem voce era no Naruto?" }));
        campoPergunta.setPreferredSize(new java.awt.Dimension(280, 30));
        principal.add(campoPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        labelResposta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelResposta.setText("Resposta");
        labelResposta.setMaximumSize(new java.awt.Dimension(39, 30));
        labelResposta.setMinimumSize(new java.awt.Dimension(39, 30));
        labelResposta.setPreferredSize(new java.awt.Dimension(39, 30));
        principal.add(labelResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 100, -1));

        labelPergunta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPergunta.setText("Pergunta");
        labelPergunta.setMaximumSize(new java.awt.Dimension(39, 30));
        labelPergunta.setMinimumSize(new java.awt.Dimension(39, 30));
        labelPergunta.setPreferredSize(new java.awt.Dimension(39, 30));
        principal.add(labelPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 100, -1));

        campoSenha.setPreferredSize(new java.awt.Dimension(280, 30));
        principal.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        getContentPane().add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarMouseClicked
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoVoltarMouseClicked

    private void botaoFinalizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarCadastroActionPerformed
        UsuarioDados usuarioDados = new UsuarioDados();
        UsuarioBD usuarioBD = new UsuarioBD();

        nome = campoNome.getText();
        email = campoEmail.getText();
        login = campoLogin.getText();
        senha = campoSenha.getText();
        pergunta = campoPergunta.getSelectedItem().toString();
        resposta = campoResposta.getText();
        

        usuarioDados.setNome(nome);
        usuarioDados.setEmail(email);
        usuarioDados.setLogin(login);
        usuarioDados.setSenha(senha);
        usuarioDados.setPergunta(pergunta);
        usuarioDados.setResposta(resposta);
        

        if ("".equals(campoNome.getText()) || "".equals(campoEmail.getText()) || "".equals(campoLogin.getText()) || "".equals(campoSenha.getText()) || "".equals(campoPergunta.getSelectedItem().toString()) ||"".equals(campoResposta.getText())) {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (usuarioBD.inserirUsuario(usuarioDados) == true) {
                JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!!!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                Login telaLogin = new Login();
                telaLogin.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro no cadastro", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoFinalizarCadastroActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMinimizarMouseClicked
        this.setExtendedState(Principal.ICONIFIED);
    }//GEN-LAST:event_botaoMinimizarMouseClicked

    private void botaoMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMinimizarMouseEntered
        botaoMinimizar.setBackground(new Color(252, 245, 228));
    }//GEN-LAST:event_botaoMinimizarMouseEntered

    private void botaoMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMinimizarMouseExited
        botaoMinimizar.setBackground(new Color(252, 240, 216));
    }//GEN-LAST:event_botaoMinimizarMouseExited

    private void botaoVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarMouseEntered
        botaoVoltar.setBackground(new Color(252, 245, 228));
    }//GEN-LAST:event_botaoVoltarMouseEntered

    private void botaoVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarMouseExited
        botaoVoltar.setBackground(new Color(252, 240, 216));
    }//GEN-LAST:event_botaoVoltarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoFinalizarCadastro;
    private javax.swing.JPanel botaoMinimizar;
    private javax.swing.JPanel botaoVoltar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JComboBox<String> campoPergunta;
    private javax.swing.JTextField campoResposta;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel iconeFechar1;
    private javax.swing.JLabel iconeVoltar;
    private javax.swing.JLabel labelCriarConta;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPergunta;
    private javax.swing.JLabel labelResposta;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
