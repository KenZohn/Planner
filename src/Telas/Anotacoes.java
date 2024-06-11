package Telas;

import Banco.AnotacoesBD;
import Dados.AnotacoesDados;
import Dados.UsuarioDados;
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Anotacoes extends javax.swing.JInternalFrame {

    private String conteudo, tipo;
    private int cod_usuario;

    public Anotacoes() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

        UsuarioDados usuarioDados = new UsuarioDados();

        Login loginTela = new Login();
        cod_usuario = loginTela.cod_usuario;
        usuarioDados.setCod_usuario(cod_usuario);
        System.out.println(cod_usuario);

        desselecionar();
        panelAfazeres.setBackground(new Color(253, 238, 251));
        labelTitulo.setText("Afazeres");
        tipo = "afazeres";
        buscarConteudo();
    }

    public void buscarConteudo() {
        AnotacoesDados anotacoesDados = new AnotacoesDados();
        AnotacoesBD anotacoesBD = new AnotacoesBD();

        anotacoesDados.setCod_usuario(cod_usuario);
        anotacoesDados.setTipo(tipo);
        anotacoesDados.setConteudo(conteudo);

        textAreaNotas.setText(anotacoesBD.buscarAnotacoes(anotacoesDados));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenuAnotacoes = new javax.swing.JPanel();
        panelAfazeres = new javax.swing.JPanel();
        labelAfazeres = new javax.swing.JLabel();
        iconeAfazeres = new javax.swing.JLabel();
        panelCompras = new javax.swing.JPanel();
        labelCompras = new javax.swing.JLabel();
        iconeCompras = new javax.swing.JLabel();
        panelEstudos = new javax.swing.JPanel();
        labelEstudos = new javax.swing.JLabel();
        iconeEstudos = new javax.swing.JLabel();
        panelOutros = new javax.swing.JPanel();
        labelOutros = new javax.swing.JLabel();
        iconeOutros = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        panelNotasTela = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        scrollNotas = new javax.swing.JScrollPane();
        textAreaNotas = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(252, 219, 248));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1152, 588));
        setMinimumSize(new java.awt.Dimension(1152, 588));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1152, 588));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenuAnotacoes.setMaximumSize(new java.awt.Dimension(1152, 55));
        panelMenuAnotacoes.setMinimumSize(new java.awt.Dimension(1152, 55));
        panelMenuAnotacoes.setOpaque(false);
        panelMenuAnotacoes.setPreferredSize(new java.awt.Dimension(1152, 55));
        panelMenuAnotacoes.setRequestFocusEnabled(false);
        panelMenuAnotacoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAfazeres.setBackground(new java.awt.Color(250, 185, 242));
        panelAfazeres.setMaximumSize(new java.awt.Dimension(288, 55));
        panelAfazeres.setMinimumSize(new java.awt.Dimension(288, 55));
        panelAfazeres.setPreferredSize(new java.awt.Dimension(288, 55));
        panelAfazeres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAfazeresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAfazeresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelAfazeresMouseExited(evt);
            }
        });
        panelAfazeres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAfazeres.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelAfazeres.setForeground(new java.awt.Color(0, 0, 0));
        labelAfazeres.setText("To Do");
        panelAfazeres.add(labelAfazeres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        iconeAfazeres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tarefas (40px).png"))); // NOI18N
        panelAfazeres.add(iconeAfazeres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        panelMenuAnotacoes.add(panelAfazeres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelCompras.setBackground(new java.awt.Color(250, 185, 242));
        panelCompras.setMaximumSize(new java.awt.Dimension(288, 55));
        panelCompras.setMinimumSize(new java.awt.Dimension(288, 55));
        panelCompras.setPreferredSize(new java.awt.Dimension(288, 55));
        panelCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelComprasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelComprasMouseExited(evt);
            }
        });
        panelCompras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCompras.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelCompras.setForeground(new java.awt.Color(0, 0, 0));
        labelCompras.setText("Compras");
        panelCompras.add(labelCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        iconeCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Compras (40px).png"))); // NOI18N
        panelCompras.add(iconeCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        panelMenuAnotacoes.add(panelCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, -1, -1));

        panelEstudos.setBackground(new java.awt.Color(250, 185, 242));
        panelEstudos.setMaximumSize(new java.awt.Dimension(288, 55));
        panelEstudos.setMinimumSize(new java.awt.Dimension(288, 55));
        panelEstudos.setPreferredSize(new java.awt.Dimension(288, 55));
        panelEstudos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEstudosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelEstudosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelEstudosMouseExited(evt);
            }
        });
        panelEstudos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelEstudos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEstudos.setForeground(new java.awt.Color(0, 0, 0));
        labelEstudos.setText("Estudos");
        panelEstudos.add(labelEstudos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        iconeEstudos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Estudos (40px).png"))); // NOI18N
        panelEstudos.add(iconeEstudos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        panelMenuAnotacoes.add(panelEstudos, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 0, -1, -1));

        panelOutros.setBackground(new java.awt.Color(250, 185, 242));
        panelOutros.setMaximumSize(new java.awt.Dimension(288, 55));
        panelOutros.setMinimumSize(new java.awt.Dimension(288, 55));
        panelOutros.setPreferredSize(new java.awt.Dimension(288, 55));
        panelOutros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelOutrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelOutrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelOutrosMouseExited(evt);
            }
        });
        panelOutros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelOutros.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelOutros.setForeground(new java.awt.Color(0, 0, 0));
        labelOutros.setText("Outros");
        panelOutros.add(labelOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        iconeOutros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Outros (40px).png"))); // NOI18N
        panelOutros.add(iconeOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        panelMenuAnotacoes.add(panelOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 0, -1, -1));

        getContentPane().add(panelMenuAnotacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1152, 55));

        panelPrincipal.setBackground(new java.awt.Color(253, 238, 251));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1152, 523));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1152, 523));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1152, 523));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNotasTela.setBackground(new java.awt.Color(245, 245, 245));
        panelNotasTela.setPreferredSize(new java.awt.Dimension(600, 493));
        panelNotasTela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labelTitulo.setText("Notas");
        panelNotasTela.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        scrollNotas.setMaximumSize(new java.awt.Dimension(560, 380));
        scrollNotas.setMinimumSize(new java.awt.Dimension(560, 380));
        scrollNotas.setName(""); // NOI18N
        scrollNotas.setPreferredSize(new java.awt.Dimension(560, 380));

        textAreaNotas.setColumns(15);
        textAreaNotas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textAreaNotas.setLineWrap(true);
        textAreaNotas.setRows(5);
        textAreaNotas.setBorder(null);
        textAreaNotas.setMaximumSize(new java.awt.Dimension(560, 160));
        textAreaNotas.setMinimumSize(new java.awt.Dimension(560, 160));
        textAreaNotas.setPreferredSize(new java.awt.Dimension(560, 160));
        textAreaNotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textAreaNotasKeyReleased(evt);
            }
        });
        scrollNotas.setViewportView(textAreaNotas);

        panelNotasTela.add(scrollNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 93, 560, 380));

        panelPrincipal.add(panelNotasTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 600, 493));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 1152, 523));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void desselecionar() {
        panelAfazeres.setBackground(new Color(250, 185, 242));
        panelCompras.setBackground(new Color(250, 185, 242));
        panelEstudos.setBackground(new Color(250, 185, 242));
        panelOutros.setBackground(new Color(250, 185, 242));
    }

    private void panelAfazeresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAfazeresMouseClicked
        desselecionar();
        panelAfazeres.setBackground(new Color(253, 238, 251));
        labelTitulo.setText("Afazeres");
        tipo = "afazeres";
        buscarConteudo();
    }//GEN-LAST:event_panelAfazeresMouseClicked

    private void panelComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelComprasMouseClicked
        desselecionar();
        panelCompras.setBackground(new Color(253, 238, 251));
        labelTitulo.setText("Compras");
        tipo = "compras";
        buscarConteudo();
    }//GEN-LAST:event_panelComprasMouseClicked

    private void panelEstudosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEstudosMouseClicked
        desselecionar();
        panelEstudos.setBackground(new Color(253, 238, 251));
        labelTitulo.setText("Estudos");
        tipo = "estudos";
        buscarConteudo();
    }//GEN-LAST:event_panelEstudosMouseClicked

    private void panelOutrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutrosMouseClicked
        desselecionar();
        panelOutros.setBackground(new Color(253, 238, 251));
        labelTitulo.setText("Outros");
        tipo = "outros";
        buscarConteudo();
    }//GEN-LAST:event_panelOutrosMouseClicked

    private void textAreaNotasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaNotasKeyReleased
        AnotacoesDados anotacoesDados = new AnotacoesDados();
        AnotacoesBD anotacoesBD = new AnotacoesBD();
        conteudo = textAreaNotas.getText();

        anotacoesDados.setCod_usuario(cod_usuario);
        anotacoesDados.setTipo(tipo);
        anotacoesDados.setConteudo(conteudo);

        if (anotacoesBD.verificarAnotacoes(anotacoesDados) == null) {
            anotacoesBD.inserirAnotacoes(anotacoesDados);
        } else {
            anotacoesBD.atualizarAnotacoes(anotacoesDados);
        }

    }//GEN-LAST:event_textAreaNotasKeyReleased

    private void panelAfazeresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAfazeresMouseEntered
        if (tipo != "afazeres") {
            panelAfazeres.setBackground(new Color(255, 209, 249));
        }
    }//GEN-LAST:event_panelAfazeresMouseEntered

    private void panelAfazeresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAfazeresMouseExited
        if (tipo != "afazeres") {
            panelAfazeres.setBackground(new Color(250, 185, 242));
        } else {
            panelAfazeres.setBackground(new Color(253, 238, 251));
        }
    }//GEN-LAST:event_panelAfazeresMouseExited

    private void panelComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelComprasMouseEntered
        if (tipo != "compras") {
            panelCompras.setBackground(new Color(255, 209, 249));
        }
    }//GEN-LAST:event_panelComprasMouseEntered

    private void panelComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelComprasMouseExited
        if (tipo != "compras") {
            panelCompras.setBackground(new Color(250, 185, 242));
        } else {
            panelCompras.setBackground(new Color(253, 238, 251));
        }
    }//GEN-LAST:event_panelComprasMouseExited

    private void panelEstudosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEstudosMouseEntered
        if (tipo != "estudos") {
            panelEstudos.setBackground(new Color(255, 209, 249));
        }
    }//GEN-LAST:event_panelEstudosMouseEntered

    private void panelEstudosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEstudosMouseExited
        if (tipo != "estudos") {
            panelEstudos.setBackground(new Color(250, 185, 242));
        } else {
            panelEstudos.setBackground(new Color(253, 238, 251));
        }
    }//GEN-LAST:event_panelEstudosMouseExited

    private void panelOutrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutrosMouseEntered
        if (tipo != "outros") {
            panelOutros.setBackground(new Color(255, 209, 249));
        }
    }//GEN-LAST:event_panelOutrosMouseEntered

    private void panelOutrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutrosMouseExited
        if (tipo != "outros") {
            panelOutros.setBackground(new Color(250, 185, 242));
        } else {
            panelOutros.setBackground(new Color(253, 238, 251));
        }
    }//GEN-LAST:event_panelOutrosMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconeAfazeres;
    private javax.swing.JLabel iconeCompras;
    private javax.swing.JLabel iconeEstudos;
    private javax.swing.JLabel iconeOutros;
    private javax.swing.JLabel labelAfazeres;
    private javax.swing.JLabel labelCompras;
    private javax.swing.JLabel labelEstudos;
    private javax.swing.JLabel labelOutros;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelAfazeres;
    private javax.swing.JPanel panelCompras;
    private javax.swing.JPanel panelEstudos;
    private javax.swing.JPanel panelMenuAnotacoes;
    private javax.swing.JPanel panelNotasTela;
    private javax.swing.JPanel panelOutros;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollNotas;
    private javax.swing.JTextArea textAreaNotas;
    // End of variables declaration//GEN-END:variables
}
