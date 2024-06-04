package Telas;

import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Dados extends javax.swing.JInternalFrame {

    public Dados() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        campoEmail = new javax.swing.JTextField();
        campoLogin = new javax.swing.JTextField();
        campoSenha = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        campoConfSenha = new javax.swing.JTextField();

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
        panelPrincipal.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 100, 28));
        panelPrincipal.add(campoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 100, 28));

        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        panelPrincipal.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 100, 28));

        campoNome.setMaximumSize(null);
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        panelPrincipal.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 100, 28));

        jButton1.setBackground(new java.awt.Color(204, 102, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("salvar");
        panelPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 337, 110, 40));

        campoConfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConfSenhaActionPerformed(evt);
            }
        });
        panelPrincipal.add(campoConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 100, 28));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
       
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

    private void campoConfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoConfSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoConfSenha;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
