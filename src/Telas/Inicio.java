package Telas;


import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Inicio extends javax.swing.JInternalFrame {

    public Inicio() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 234, 189));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1152, 588));
        setMinimumSize(new java.awt.Dimension(1152, 588));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1152, 588));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 240, 216));
        jPanel1.setMaximumSize(new java.awt.Dimension(1152, 578));
        jPanel1.setMinimumSize(new java.awt.Dimension(1152, 578));
        jPanel1.setPreferredSize(new java.awt.Dimension(1152, 578));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1152, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1152, 578));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
