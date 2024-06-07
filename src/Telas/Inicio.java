package Telas;

import Banco.CalendarioBD;
import Dados.CalendarioDados;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Inicio extends javax.swing.JInternalFrame {

    private int ano, mes, dia, cod_usuario;

    public Inicio(int cod) {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

        CalendarioBD calendarioBD = new CalendarioBD();
        CalendarioDados calendarioDados = new CalendarioDados();

        cod_usuario = cod;
        Date dataAtual = new Date();
        ano = Integer.parseInt(new SimpleDateFormat("yyyy").format(dataAtual));
        mes = Integer.parseInt(new SimpleDateFormat("MM").format(dataAtual));
        dia = Integer.parseInt(new SimpleDateFormat("dd").format(dataAtual));

        calendarioDados.setCod_usuario(cod_usuario);
        calendarioDados.setAno(ano);

        for (int i = mes; i <= 12; i++) {
            calendarioDados.setMes(i);
            for (int j = dia; j <= 31; j++) {
                calendarioDados.setDia(j);
                if (calendarioBD.buscarCalendario(calendarioDados) != null) {
                    String mesFormatado = String.format("%02d", i);
                    String diaFormatado = String.format("%02d", j);
                    jTextArea1.setText(jTextArea1.getText() + "Dia " + mesFormatado + "/" + diaFormatado + " - " + calendarioBD.buscarCalendario(calendarioDados) + "\n");
                }
            }
            dia = 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 500, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1152, 578));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
