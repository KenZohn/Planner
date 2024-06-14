/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author thais
 */
public class Redefinir extends javax.swing.JFrame {

    /**
     * Creates new form Redefinir
     */
    public Redefinir() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        labelredefinirSenha = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoLogin = new javax.swing.JTextField();
        botaoMinimizar = new javax.swing.JPanel();
        iconeFechar1 = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JPanel();
        iconeVoltar = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        botaoFinalizarRedefinicao = new javax.swing.JButton();
        campoResposta = new javax.swing.JTextField();
        campoPergunta = new javax.swing.JComboBox<>();
        labelResposta = new javax.swing.JLabel();
        labelPergunta = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        principal.setBackground(new java.awt.Color(255, 234, 189));
        principal.setMaximumSize(new java.awt.Dimension(400, 350));
        principal.setMinimumSize(new java.awt.Dimension(400, 350));
        principal.setPreferredSize(new java.awt.Dimension(400, 350));
        principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelredefinirSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelredefinirSenha.setText("Redefinir Senha");
        principal.add(labelredefinirSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelEmail.setText("E-mail");
        labelEmail.setMaximumSize(new java.awt.Dimension(39, 30));
        labelEmail.setMinimumSize(new java.awt.Dimension(39, 30));
        labelEmail.setPreferredSize(new java.awt.Dimension(39, 30));
        principal.add(labelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 80, -1));

        labelLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelLogin.setText("Login");
        labelLogin.setMaximumSize(new java.awt.Dimension(35, 30));
        labelLogin.setMinimumSize(new java.awt.Dimension(35, 30));
        labelLogin.setPreferredSize(new java.awt.Dimension(35, 30));
        principal.add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 50, -1));

        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoEmail.setMaximumSize(new java.awt.Dimension(250, 30));
        campoEmail.setMinimumSize(new java.awt.Dimension(250, 30));
        campoEmail.setPreferredSize(new java.awt.Dimension(250, 30));
        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        principal.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        campoLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoLogin.setMaximumSize(new java.awt.Dimension(250, 30));
        campoLogin.setMinimumSize(new java.awt.Dimension(250, 30));
        campoLogin.setPreferredSize(new java.awt.Dimension(250, 30));
        principal.add(campoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        botaoMinimizar.setBackground(new java.awt.Color(255, 234, 189));
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

        principal.add(botaoMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 0, -1, -1));

        botaoVoltar.setBackground(new java.awt.Color(255, 234, 189));
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

        principal.add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 0, -1, -1));

        botaoCancelar.setBackground(new java.awt.Color(253, 103, 103));
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
        principal.add(botaoCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        botaoFinalizarRedefinicao.setBackground(new java.awt.Color(153, 255, 204));
        botaoFinalizarRedefinicao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoFinalizarRedefinicao.setText("Concluir");
        botaoFinalizarRedefinicao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoFinalizarRedefinicao.setMaximumSize(new java.awt.Dimension(128, 30));
        botaoFinalizarRedefinicao.setMinimumSize(new java.awt.Dimension(128, 30));
        botaoFinalizarRedefinicao.setPreferredSize(new java.awt.Dimension(128, 30));
        botaoFinalizarRedefinicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarRedefinicaoActionPerformed(evt);
            }
        });
        principal.add(botaoFinalizarRedefinicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, -1, -1));

        campoResposta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoResposta.setMaximumSize(new java.awt.Dimension(250, 30));
        campoResposta.setMinimumSize(new java.awt.Dimension(250, 30));
        campoResposta.setPreferredSize(new java.awt.Dimension(250, 30));
        principal.add(campoResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        campoPergunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Qual é o nome do seu primeiro Pet?", "Qual é a cidade que sua mãe nasceu?", "Quem você era no RBD?", "Quem voce era no Naruto?", " ", " " }));
        campoPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPerguntaActionPerformed(evt);
            }
        });
        principal.add(campoPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 250, -1));

        labelResposta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelResposta.setText("Resposta");
        labelResposta.setMaximumSize(new java.awt.Dimension(39, 30));
        labelResposta.setMinimumSize(new java.awt.Dimension(39, 30));
        labelResposta.setPreferredSize(new java.awt.Dimension(39, 30));
        principal.add(labelResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 100, -1));

        labelPergunta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPergunta.setText("Pergunta");
        labelPergunta.setMaximumSize(new java.awt.Dimension(39, 30));
        labelPergunta.setMinimumSize(new java.awt.Dimension(39, 30));
        labelPergunta.setPreferredSize(new java.awt.Dimension(39, 30));
        principal.add(labelPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 100, -1));

        labelSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelSenha.setText("Senha");
        labelSenha.setMaximumSize(new java.awt.Dimension(38, 30));
        labelSenha.setMinimumSize(new java.awt.Dimension(38, 30));
        labelSenha.setPreferredSize(new java.awt.Dimension(38, 30));
        principal.add(labelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 50, -1));

        campoSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoSenha.setMaximumSize(new java.awt.Dimension(250, 30));
        campoSenha.setMinimumSize(new java.awt.Dimension(250, 30));
        campoSenha.setPreferredSize(new java.awt.Dimension(250, 30));
        principal.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        getContentPane().add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMinimizarMouseClicked
        this.setExtendedState(Principal.ICONIFIED);
    }//GEN-LAST:event_botaoMinimizarMouseClicked

    private void botaoMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMinimizarMouseEntered
        botaoMinimizar.setBackground(new Color(252, 245, 228));
    }//GEN-LAST:event_botaoMinimizarMouseEntered

    private void botaoMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoMinimizarMouseExited
        botaoMinimizar.setBackground(new Color(255, 234, 189));
    }//GEN-LAST:event_botaoMinimizarMouseExited

    private void botaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarMouseClicked
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoVoltarMouseClicked

    private void botaoVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarMouseEntered
        botaoVoltar.setBackground(new Color(252, 245, 228));
    }//GEN-LAST:event_botaoVoltarMouseEntered

    private void botaoVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarMouseExited
        botaoVoltar.setBackground(new Color(255, 234, 189));
    }//GEN-LAST:event_botaoVoltarMouseExited

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoFinalizarRedefinicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarRedefinicaoActionPerformed
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
    }//GEN-LAST:event_botaoFinalizarRedefinicaoActionPerformed

    private void campoPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPerguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPerguntaActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Redefinir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Redefinir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Redefinir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Redefinir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Redefinir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoFinalizarRedefinicao;
    private javax.swing.JPanel botaoMinimizar;
    private javax.swing.JPanel botaoVoltar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JComboBox<String> campoPergunta;
    private javax.swing.JTextField campoResposta;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JLabel iconeFechar1;
    private javax.swing.JLabel iconeVoltar;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPergunta;
    private javax.swing.JLabel labelResposta;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelredefinirSenha;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
