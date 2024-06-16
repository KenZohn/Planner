package Telas;

import Banco.AnotacoesBD;
import Banco.CalendarioBD;
import Banco.GastosBD;
import Dados.AnotacoesDados;
import Dados.CalendarioDados;
import Dados.GastosDados;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Inicio extends javax.swing.JInternalFrame {

    private int ano, mes, dia, cod_usuario;

    public Inicio() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

        CalendarioBD calendarioBD = new CalendarioBD();
        CalendarioDados calendarioDados = new CalendarioDados();

        cod_usuario = Login.codUsuario;
        Date dataAtual = new Date();
        ano = Integer.parseInt(new SimpleDateFormat("yyyy").format(dataAtual));
        mes = Integer.parseInt(new SimpleDateFormat("MM").format(dataAtual));
        dia = Integer.parseInt(new SimpleDateFormat("dd").format(dataAtual));

        calendarioDados.setCod_usuario(cod_usuario);
        calendarioDados.setAno(ano);

        buscarCalendario();
        buscarGastos();
        buscarGastosPassado();
        buscarAfazeres();
        buscarCompras();
        buscarEstudos();

        atualizarLabelMes();
    }

    public void buscarCalendario() {
        CalendarioBD calendarioBD = new CalendarioBD();
        CalendarioDados calendarioDados = new CalendarioDados();

        calendarioDados.setCod_usuario(cod_usuario);
        calendarioDados.setAno(ano);

        for (int i = mes; i <= 12; i++) {
            calendarioDados.setMes(i);
            for (int j = dia; j <= 31; j++) {
                calendarioDados.setDia(j);
                if (calendarioBD.buscarCalendario(calendarioDados) != null) {
                    String mesFormatado = String.format("%02d", i);
                    String diaFormatado = String.format("%02d", j);
                    campoCalendario.setText(campoCalendario.getText() + "Dia " + diaFormatado + "/" + mesFormatado + " - " + calendarioBD.buscarCalendario(calendarioDados) + "\n");
                }
            }
            dia = 1;
        }
    }

    public void buscarGastos() {
        GastosDados gastosDados = new GastosDados();
        GastosBD gastosBD = new GastosBD();
        Date dataAtual = new Date();

        gastosDados.setCod_usuario(cod_usuario);
        gastosDados.setMes(Integer.parseInt(new SimpleDateFormat("MM").format(dataAtual)));

        if (gastosBD.buscarSomaTotalGastos(gastosDados) == null) {
            campoGastos.setText(String.format("R$ 0,00"));
        } else {
            campoGastos.setText(String.format("R$ %.02f", Double.parseDouble(gastosBD.buscarSomaTotalGastos(gastosDados))));
        }
    }
    
    public void buscarGastosPassado() {
        GastosDados gastosDados = new GastosDados();
        GastosBD gastosBD = new GastosBD();
        Date dataAtual = new Date();

        gastosDados.setCod_usuario(cod_usuario);
        gastosDados.setMes(Integer.parseInt(new SimpleDateFormat("MM").format(dataAtual)) - 1);

        if (gastosBD.buscarSomaTotalGastos(gastosDados) == null) {
            campoGastosPassado.setText(String.format("R$ 0,00"));
        } else {
            campoGastosPassado.setText(String.format("R$ %.02f", Double.parseDouble(gastosBD.buscarSomaTotalGastos(gastosDados))));
        }
    }

    public void buscarAfazeres() {
        AnotacoesDados anotacoesDados = new AnotacoesDados();
        AnotacoesBD anotacoesBD = new AnotacoesBD();

        anotacoesDados.setCod_usuario(cod_usuario);
        anotacoesDados.setTipo("afazeres");

        campoAfazeres.setText(anotacoesBD.buscarAnotacoes(anotacoesDados));
    }

    public void buscarCompras() {
        AnotacoesDados anotacoesDados = new AnotacoesDados();
        AnotacoesBD anotacoesBD = new AnotacoesBD();

        anotacoesDados.setCod_usuario(cod_usuario);
        anotacoesDados.setTipo("compras");

        campoCompras.setText(anotacoesBD.buscarAnotacoes(anotacoesDados));
    }

    public void buscarEstudos() {
        AnotacoesDados anotacoesDados = new AnotacoesDados();
        AnotacoesBD anotacoesBD = new AnotacoesBD();

        anotacoesDados.setCod_usuario(cod_usuario);
        anotacoesDados.setTipo("estudos");

        campoEstudos.setText(anotacoesBD.buscarAnotacoes(anotacoesDados));
    }

    public void atualizarLabelMes() {
        if (mes == 1) {
            labelGastos.setText("Gastos de Janeiro");
        } else if (mes == 2) {
            labelGastos.setText("Gastos de Fevereiro");
        } else if (mes == 3) {
            labelGastos.setText("Gastos de Março");
        } else if (mes == 4) {
            labelGastos.setText("Gastos de Abril");
        } else if (mes == 5) {
            labelGastos.setText("Gastos de Maio");
        } else if (mes == 6) {
            labelGastos.setText("Gastos de Junho");
        } else if (mes == 7) {
            labelGastos.setText("Gastos de Julho");
        } else if (mes == 8) {
            labelGastos.setText("Gastos de Agosto");
        } else if (mes == 9) {
            labelGastos.setText("Gastos de Setembro");
        } else if (mes == 10) {
            labelGastos.setText("Gastos de Outubro");
        } else if (mes == 11) {
            labelGastos.setText("Gastos de Novembro");
        } else if (mes == 12) {
            labelGastos.setText("Gastos de Dezembro");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicio = new javax.swing.JPanel();
        panelCalendario = new javax.swing.JPanel();
        jScrollPaneCalendario = new javax.swing.JScrollPane();
        campoCalendario = new javax.swing.JTextArea();
        labelCalendario = new javax.swing.JLabel();
        panelGastos = new javax.swing.JPanel();
        labelGastos = new javax.swing.JLabel();
        campoGastos = new javax.swing.JTextField();
        labelGastosPassado = new javax.swing.JLabel();
        campoGastosPassado = new javax.swing.JTextField();
        panelAfazeres = new javax.swing.JPanel();
        jScrollPaneAfazeres = new javax.swing.JScrollPane();
        campoAfazeres = new javax.swing.JTextArea();
        labelAfazeres = new javax.swing.JLabel();
        panelCompras = new javax.swing.JPanel();
        labelCompras = new javax.swing.JLabel();
        jScrollPaneCompras = new javax.swing.JScrollPane();
        campoCompras = new javax.swing.JTextArea();
        panelEstudos = new javax.swing.JPanel();
        labelEstudos = new javax.swing.JLabel();
        jScrollPaneEstudos = new javax.swing.JScrollPane();
        campoEstudos = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 234, 189));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1152, 588));
        setMinimumSize(new java.awt.Dimension(1152, 588));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1152, 588));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInicio.setBackground(new java.awt.Color(252, 240, 216));
        panelInicio.setMaximumSize(new java.awt.Dimension(1152, 578));
        panelInicio.setMinimumSize(new java.awt.Dimension(1152, 578));
        panelInicio.setPreferredSize(new java.awt.Dimension(1152, 578));
        panelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCalendario.setOpaque(false);
        panelCalendario.setPreferredSize(new java.awt.Dimension(553, 400));
        panelCalendario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPaneCalendario.setPreferredSize(new java.awt.Dimension(513, 322));

        campoCalendario.setEditable(false);
        campoCalendario.setColumns(20);
        campoCalendario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoCalendario.setLineWrap(true);
        campoCalendario.setRows(5);
        campoCalendario.setMargin(new java.awt.Insets(5, 15, 5, 15));
        jScrollPaneCalendario.setViewportView(campoCalendario);

        panelCalendario.add(jScrollPaneCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 63, -1, -1));

        labelCalendario.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        labelCalendario.setForeground(new java.awt.Color(51, 51, 51));
        labelCalendario.setText("Compromissos");
        panelCalendario.add(labelCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, -1, -1));

        panelInicio.add(panelCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, -1, -1));

        panelGastos.setOpaque(false);
        panelGastos.setPreferredSize(new java.awt.Dimension(553, 118));
        panelGastos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelGastos.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        labelGastos.setForeground(new java.awt.Color(51, 51, 51));
        labelGastos.setText("Gastos de \"Mês\"");
        panelGastos.add(labelGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 15, -1, -1));

        campoGastos.setEditable(false);
        campoGastos.setBackground(new java.awt.Color(245, 245, 245));
        campoGastos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoGastos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoGastos.setOpaque(true);
        campoGastos.setPreferredSize(new java.awt.Dimension(240, 40));
        panelGastos.add(campoGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 63, -1, -1));

        labelGastosPassado.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelGastosPassado.setForeground(new java.awt.Color(51, 51, 51));
        labelGastosPassado.setText("Gastos do mês passado");
        panelGastos.add(labelGastosPassado, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 20, -1, -1));

        campoGastosPassado.setEditable(false);
        campoGastosPassado.setBackground(new java.awt.Color(245, 245, 245));
        campoGastosPassado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoGastosPassado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoGastosPassado.setOpaque(true);
        campoGastosPassado.setPreferredSize(new java.awt.Dimension(240, 40));
        panelGastos.add(campoGastosPassado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 63, -1, -1));

        panelInicio.add(panelGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 415, -1, -1));

        panelAfazeres.setOpaque(false);
        panelAfazeres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPaneAfazeres.setPreferredSize(new java.awt.Dimension(514, 109));

        campoAfazeres.setEditable(false);
        campoAfazeres.setColumns(20);
        campoAfazeres.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoAfazeres.setLineWrap(true);
        campoAfazeres.setRows(3);
        campoAfazeres.setMargin(new java.awt.Insets(5, 15, 5, 15));
        jScrollPaneAfazeres.setViewportView(campoAfazeres);

        panelAfazeres.add(jScrollPaneAfazeres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        labelAfazeres.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        labelAfazeres.setForeground(new java.awt.Color(51, 51, 51));
        labelAfazeres.setText("Fazer");
        panelAfazeres.add(labelAfazeres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, -1, -1));

        panelInicio.add(panelAfazeres, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 15, 554, 172));

        panelCompras.setOpaque(false);
        panelCompras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCompras.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        labelCompras.setForeground(new java.awt.Color(51, 51, 51));
        labelCompras.setText("Comprar");
        panelCompras.add(labelCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, -1, -1));

        jScrollPaneCompras.setPreferredSize(new java.awt.Dimension(514, 109));

        campoCompras.setEditable(false);
        campoCompras.setColumns(20);
        campoCompras.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoCompras.setLineWrap(true);
        campoCompras.setRows(3);
        campoCompras.setMargin(new java.awt.Insets(5, 15, 5, 15));
        jScrollPaneCompras.setViewportView(campoCompras);

        panelCompras.add(jScrollPaneCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        panelInicio.add(panelCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 187, 567, 173));

        panelEstudos.setOpaque(false);
        panelEstudos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelEstudos.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        labelEstudos.setForeground(new java.awt.Color(51, 51, 51));
        labelEstudos.setText("Estudar");
        panelEstudos.add(labelEstudos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, -1, -1));

        jScrollPaneEstudos.setPreferredSize(new java.awt.Dimension(514, 109));

        campoEstudos.setEditable(false);
        campoEstudos.setColumns(20);
        campoEstudos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        campoEstudos.setLineWrap(true);
        campoEstudos.setRows(3);
        campoEstudos.setMargin(new java.awt.Insets(5, 15, 5, 15));
        jScrollPaneEstudos.setViewportView(campoEstudos);

        panelEstudos.add(jScrollPaneEstudos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        panelInicio.add(panelEstudos, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 360, 567, 173));

        getContentPane().add(panelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1152, 578));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea campoAfazeres;
    private javax.swing.JTextArea campoCalendario;
    private javax.swing.JTextArea campoCompras;
    private javax.swing.JTextArea campoEstudos;
    private javax.swing.JTextField campoGastos;
    private javax.swing.JTextField campoGastosPassado;
    private javax.swing.JScrollPane jScrollPaneAfazeres;
    private javax.swing.JScrollPane jScrollPaneCalendario;
    private javax.swing.JScrollPane jScrollPaneCompras;
    private javax.swing.JScrollPane jScrollPaneEstudos;
    private javax.swing.JLabel labelAfazeres;
    private javax.swing.JLabel labelCalendario;
    private javax.swing.JLabel labelCompras;
    private javax.swing.JLabel labelEstudos;
    private javax.swing.JLabel labelGastos;
    private javax.swing.JLabel labelGastosPassado;
    private javax.swing.JPanel panelAfazeres;
    private javax.swing.JPanel panelCalendario;
    private javax.swing.JPanel panelCompras;
    private javax.swing.JPanel panelEstudos;
    private javax.swing.JPanel panelGastos;
    private javax.swing.JPanel panelInicio;
    // End of variables declaration//GEN-END:variables
}
