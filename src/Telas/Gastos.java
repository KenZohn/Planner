package Telas;

import Banco.GastosBD;
import Dados.GastosDados;
import Dados.UsuarioDados;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public final class Gastos extends javax.swing.JInternalFrame {

    private int mes, ano, cod_usuario;
    private float valor;
    private double total;
    private String tipo_gastos;
    private String descricao;
    private int qtd_linha;
    private String[] mesString;

    public Gastos() {
        initComponents();

        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

        mesString = new String[13];
        mesString[1] = "Janeiro";
        mesString[2] = "Fevereiro";
        mesString[3] = "Março";
        mesString[4] = "Abril";
        mesString[5] = "Maio";
        mesString[6] = "Junho";
        mesString[7] = "Julho";
        mesString[8] = "Agosto";
        mesString[9] = "Setembro";
        mesString[10] = "Outubro";
        mesString[11] = "Novembro";
        mesString[12] = "Dezembro";

        tabela.getTableHeader().setFont(new Font("Arial", Font.BOLD, 20));

        UsuarioDados usuarioDados = new UsuarioDados();
        cod_usuario = Login.codUsuario;
        usuarioDados.setCod_usuario(cod_usuario);

        desselecionar();
        panelFixo.setBackground(new Color(175, 234, 226));
        tipo_gastos = "fixo";

        desselecionarMes();
        mesAtual();
        buscarDados();
        buscarTotais();
    }

    public void mesAtual() {
        Date dataAtual = new Date();
        mes = Integer.parseInt(new SimpleDateFormat("MM").format(dataAtual));
        switch (mes) {
            case 1 ->
                panelJaneiro.setBackground(new Color(175, 234, 226));
            case 2 ->
                panelFevereiro.setBackground(new Color(175, 234, 226));
            case 3 ->
                panelMarco.setBackground(new Color(175, 234, 226));
            case 4 ->
                panelAbril.setBackground(new Color(175, 234, 226));
            case 5 ->
                panelMaio.setBackground(new Color(175, 234, 226));
            case 6 ->
                panelJunho.setBackground(new Color(175, 234, 226));
            case 7 ->
                panelJulho.setBackground(new Color(175, 234, 226));
            case 8 ->
                panelAgosto.setBackground(new Color(175, 234, 226));
            case 9 ->
                panelSetembro.setBackground(new Color(175, 234, 226));
            case 10 ->
                panelOutubro.setBackground(new Color(175, 234, 226));
            case 11 ->
                panelNovembro.setBackground(new Color(175, 234, 226));
            case 12 ->
                panelDezembro.setBackground(new Color(175, 234, 226));
            default -> {
            }
        }
        labelTotais.setText(mesString[mes]);
    }

    public void desselecionar() {
        panelFixo.setBackground(new Color(90, 215, 198));
        panelMercado.setBackground(new Color(90, 215, 198));
        panelRelatório.setBackground(new Color(90, 215, 198));
        panelLazer.setBackground(new Color(90, 215, 198));
        panelOutros.setBackground(new Color(90, 215, 198));
    }

    public void desselecionarMes() {
        panelJaneiro.setBackground(new Color(56, 208, 187));
        panelFevereiro.setBackground(new Color(56, 208, 187));
        panelMarco.setBackground(new Color(56, 208, 187));
        panelAbril.setBackground(new Color(56, 208, 187));
        panelMaio.setBackground(new Color(56, 208, 187));
        panelJunho.setBackground(new Color(56, 208, 187));
        panelJulho.setBackground(new Color(56, 208, 187));
        panelAgosto.setBackground(new Color(56, 208, 187));
        panelSetembro.setBackground(new Color(56, 208, 187));
        panelOutubro.setBackground(new Color(56, 208, 187));
        panelNovembro.setBackground(new Color(56, 208, 187));
        panelDezembro.setBackground(new Color(56, 208, 187));
    }

    public void voltarCorTotal() {
        labelTotalFixo.setForeground(new Color(242, 242, 242));
        labelTotalMercado.setForeground(new Color(242, 242, 242));
        labelTotalLazer.setForeground(new Color(242, 242, 242));
        labelTotalOutros.setForeground(new Color(242, 242, 242));
        campoTotalFixo.setForeground(new Color(51, 51, 51));
        campoTotalMercado.setForeground(new Color(51, 51, 51));
        campoTotalLazer.setForeground(new Color(51, 51, 51));
        campoTotalOutros.setForeground(new Color(51, 51, 51));
        campoTotalFixo.setBackground(new Color(242, 242, 242));
        campoTotalMercado.setBackground(new Color(242, 242, 242));
        campoTotalLazer.setBackground(new Color(242, 242, 242));
        campoTotalOutros.setBackground(new Color(242, 242, 242));
    }

    public void buscarDados() {
        GastosDados gastosDados = new GastosDados();
        GastosBD gastosBD = new GastosBD();

        gastosDados.setCod_usuario(cod_usuario);
        gastosDados.setTipo_gastos(tipo_gastos);
        gastosDados.setAno(ano);
        gastosDados.setMes(mes);

        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{"", ""});

        if (gastosBD.buscarLinha_item(gastosDados) != null) {
            qtd_linha = Integer.parseInt(gastosBD.buscarLinha_item(gastosDados));
            for (int i = 0; i <= qtd_linha; i++) {
                model.addRow(new Object[]{"", ""});
                gastosDados.setLinha_item(i);
                gastosDados.setDescricao(descricao);
                gastosDados.setValor(valor);

                descricao = gastosBD.buscarGastosDescricao(gastosDados);
                valor = Float.parseFloat(gastosBD.buscarGastosValor(gastosDados));

                tabela.getModel().setValueAt(descricao, i, 0);
                tabela.getModel().setValueAt(valor, i, 1);
            }
        }
    }

    public void buscarTotais() {
        GastosBD gastosBD = new GastosBD();
        GastosDados gastosDados = new GastosDados();

        gastosDados.setCod_usuario(cod_usuario);
        gastosDados.setMes(mes);

        gastosDados.setTipo_gastos("fixo");
        if (gastosBD.buscarTotalGastos(gastosDados) == null) {
            campoTotalFixo.setText("R$ 0,00");
        } else {
            campoTotalFixo.setText("R$ " + String.format("%.02f", Double.parseDouble(gastosBD.buscarTotalGastos(gastosDados))));
        }

        gastosDados.setTipo_gastos("mercado");
        if (gastosBD.buscarTotalGastos(gastosDados) == null) {
            campoTotalMercado.setText("R$ 0,00");
        } else {
            campoTotalMercado.setText("R$ " + String.format("%.02f", Double.parseDouble(gastosBD.buscarTotalGastos(gastosDados))));
        }

        gastosDados.setTipo_gastos("lazer");
        if (gastosBD.buscarTotalGastos(gastosDados) == null) {
            campoTotalLazer.setText("R$ 0,00");
        } else {
            campoTotalLazer.setText("R$ " + String.format("%.02f", Double.parseDouble(gastosBD.buscarTotalGastos(gastosDados))));
        }

        gastosDados.setTipo_gastos("outros");
        if (gastosBD.buscarTotalGastos(gastosDados) == null) {
            campoTotalOutros.setText("R$ 0,00");
        } else {
            campoTotalOutros.setText("R$ " + String.format("%.02f", Double.parseDouble(gastosBD.buscarTotalGastos(gastosDados))));
        }

        if (gastosBD.buscarSomaTotalGastos(gastosDados) == null) {
            campoTotais.setText("R$ 0,00");
        } else {
            campoTotais.setText("R$ " + String.format("%.02f", Double.parseDouble(gastosBD.buscarSomaTotalGastos(gastosDados))));
        }
    }

    public void relatarTotais() {
        if ("total".equals(tipo_gastos)) {
            desselecionar();
            panelRelatório.setBackground(new Color(175, 234, 226));
            tipo_gastos = "total";

            GastosDados gastosDados = new GastosDados();
            GastosBD gastosBD = new GastosBD();

            gastosDados.setCod_usuario(cod_usuario);
            gastosDados.setAno(ano);

            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setRowCount(0);

            for (int i = 1; i <= 12; i++) {
                gastosDados.setMes(i);
                if (gastosBD.buscarSomaTotalGastos(gastosDados) == null) {
                    model.addRow(new Object[]{mesString[i], "0,00"});
                } else {
                    model.addRow(new Object[]{mesString[i], String.format("%.02f", Double.valueOf(gastosBD.buscarSomaTotalGastos(gastosDados)))});
                }
            }
            if (gastosBD.buscarTotalAnual(gastosDados) == null) {
                    model.addRow(new Object[]{"Total", "0,00"});
                } else {
                    model.addRow(new Object[]{"Total", String.format("%.02f", Double.valueOf(gastosBD.buscarTotalAnual(gastosDados)))});
                }
        }
    }

    public void salvar() {
        GastosDados gastosDados = new GastosDados();
        GastosBD gastosBD = new GastosBD();
        for (int i = 0; i < tabela.getRowCount(); i++) {
            if (tabela.getModel().getValueAt(i, 0).toString() == null || "".equals(tabela.getModel().getValueAt(i, 0).toString())) {
                descricao = "";
            } else {
                descricao = tabela.getModel().getValueAt(i, 0).toString();
            }
            if (tabela.getModel().getValueAt(i, 1).toString() == null || "".equals(tabela.getModel().getValueAt(i, 1).toString())) {
                valor = 0;
            } else {
                valor = Float.parseFloat(tabela.getModel().getValueAt(i, 1).toString());
            }

            gastosDados.setCod_usuario(cod_usuario);
            gastosDados.setTipo_gastos(tipo_gastos);
            gastosDados.setAno(ano);
            gastosDados.setMes(mes);
            gastosDados.setLinha_item(i);
            gastosDados.setDescricao(descricao);
            gastosDados.setValor(valor);

            if (!"".equals(descricao) && valor != 0) {
                if (gastosBD.verificarGastos(gastosDados) == null && gastosBD.verificarGastosDescricao(gastosDados) == null) {
                    gastosBD.inserirGastos(gastosDados);
                } else {
                    gastosBD.atualizarGastos(gastosDados);
                }
            } else {
                gastosBD.atualizarGastos(gastosDados);
            }
        }

        buscarTotais();
    }

    public void atualizarLabelMes(int mes) {
        labelTotais.setText(mesString[mes]);
    }

    public void clicarBotaoMes() {
        desselecionarMes();
        buscarDados();
        buscarTotais();
        relatarTotais();
        atualizarLabelMes(mes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuMeses = new javax.swing.JPanel();
        panelJaneiro = new javax.swing.JPanel();
        labelJaneiro = new javax.swing.JLabel();
        panelFevereiro = new javax.swing.JPanel();
        labelFevereiro = new javax.swing.JLabel();
        panelMarco = new javax.swing.JPanel();
        labelMarco = new javax.swing.JLabel();
        panelAbril = new javax.swing.JPanel();
        labelAbril = new javax.swing.JLabel();
        panelMaio = new javax.swing.JPanel();
        labelMaio = new javax.swing.JLabel();
        panelJunho = new javax.swing.JPanel();
        labelJunho = new javax.swing.JLabel();
        panelJulho = new javax.swing.JPanel();
        labelJulho = new javax.swing.JLabel();
        panelAgosto = new javax.swing.JPanel();
        labelAgosto = new javax.swing.JLabel();
        panelSetembro = new javax.swing.JPanel();
        labelSetembro = new javax.swing.JLabel();
        panelOutubro = new javax.swing.JPanel();
        labelOutubro = new javax.swing.JLabel();
        panelNovembro = new javax.swing.JPanel();
        labelNovembro = new javax.swing.JLabel();
        panelDezembro = new javax.swing.JPanel();
        labelDezembro = new javax.swing.JLabel();
        panelMenuAnotacoes = new javax.swing.JPanel();
        panelFixo = new javax.swing.JPanel();
        labelFixo = new javax.swing.JLabel();
        iconeFixo = new javax.swing.JLabel();
        panelMercado = new javax.swing.JPanel();
        labelMercado = new javax.swing.JLabel();
        iconeMercado = new javax.swing.JLabel();
        panelLazer = new javax.swing.JPanel();
        labelLazer = new javax.swing.JLabel();
        iconeLazer = new javax.swing.JLabel();
        panelOutros = new javax.swing.JPanel();
        labelOutros = new javax.swing.JLabel();
        iconeOutros = new javax.swing.JLabel();
        panelRelatório = new javax.swing.JPanel();
        labelTotal = new javax.swing.JLabel();
        iconeTotal = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        jScrollPaneTabela = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        panelTotais = new javax.swing.JPanel();
        labelTotaisDe = new javax.swing.JLabel();
        labelTotais = new javax.swing.JLabel();
        labelTotalFixo = new javax.swing.JLabel();
        campoTotalFixo = new javax.swing.JTextField();
        labelTotalMercado = new javax.swing.JLabel();
        campoTotalMercado = new javax.swing.JTextField();
        labelTotalLazer = new javax.swing.JLabel();
        campoTotalLazer = new javax.swing.JTextField();
        labelTotalOutros = new javax.swing.JLabel();
        campoTotalOutros = new javax.swing.JTextField();
        labelTotalMes = new javax.swing.JLabel();
        campoTotais = new javax.swing.JTextField();

        setBackground(new java.awt.Color(141, 231, 219));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1152, 588));
        setMinimumSize(new java.awt.Dimension(1152, 588));
        setPreferredSize(new java.awt.Dimension(1152, 588));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenuMeses.setMaximumSize(new java.awt.Dimension(1152, 55));
        jPanelMenuMeses.setMinimumSize(new java.awt.Dimension(1152, 55));
        jPanelMenuMeses.setOpaque(false);
        jPanelMenuMeses.setPreferredSize(new java.awt.Dimension(1152, 55));
        jPanelMenuMeses.setRequestFocusEnabled(false);
        jPanelMenuMeses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelJaneiro.setBackground(new java.awt.Color(56, 208, 187));
        panelJaneiro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelJaneiro.setMaximumSize(new java.awt.Dimension(96, 55));
        panelJaneiro.setMinimumSize(new java.awt.Dimension(96, 55));
        panelJaneiro.setPreferredSize(new java.awt.Dimension(96, 55));
        panelJaneiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelJaneiroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelJaneiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelJaneiroMouseExited(evt);
            }
        });
        panelJaneiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelJaneiro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelJaneiro.setText("Jan");
        panelJaneiro.add(labelJaneiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanelMenuMeses.add(panelJaneiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelFevereiro.setBackground(new java.awt.Color(56, 208, 187));
        panelFevereiro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelFevereiro.setMaximumSize(new java.awt.Dimension(96, 55));
        panelFevereiro.setMinimumSize(new java.awt.Dimension(96, 55));
        panelFevereiro.setPreferredSize(new java.awt.Dimension(96, 55));
        panelFevereiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFevereiroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelFevereiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelFevereiroMouseExited(evt);
            }
        });
        panelFevereiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelFevereiro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelFevereiro.setText("Fev");
        panelFevereiro.add(labelFevereiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 10, -1, -1));

        jPanelMenuMeses.add(panelFevereiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 0, -1, -1));

        panelMarco.setBackground(new java.awt.Color(56, 208, 187));
        panelMarco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelMarco.setMaximumSize(new java.awt.Dimension(96, 55));
        panelMarco.setMinimumSize(new java.awt.Dimension(96, 55));
        panelMarco.setPreferredSize(new java.awt.Dimension(96, 55));
        panelMarco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMarcoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMarcoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMarcoMouseExited(evt);
            }
        });
        panelMarco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMarco.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelMarco.setText("Mar");
        panelMarco.add(labelMarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 10, -1, -1));

        jPanelMenuMeses.add(panelMarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 0, -1, -1));

        panelAbril.setBackground(new java.awt.Color(56, 208, 187));
        panelAbril.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelAbril.setMaximumSize(new java.awt.Dimension(96, 55));
        panelAbril.setMinimumSize(new java.awt.Dimension(96, 55));
        panelAbril.setPreferredSize(new java.awt.Dimension(96, 55));
        panelAbril.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAbrilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAbrilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelAbrilMouseExited(evt);
            }
        });
        panelAbril.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAbril.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelAbril.setText("Abr");
        panelAbril.add(labelAbril, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 10, -1, -1));

        jPanelMenuMeses.add(panelAbril, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, -1, -1));

        panelMaio.setBackground(new java.awt.Color(56, 208, 187));
        panelMaio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelMaio.setMaximumSize(new java.awt.Dimension(96, 55));
        panelMaio.setMinimumSize(new java.awt.Dimension(96, 55));
        panelMaio.setPreferredSize(new java.awt.Dimension(96, 55));
        panelMaio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMaioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMaioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMaioMouseExited(evt);
            }
        });
        panelMaio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMaio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelMaio.setText("Mai");
        panelMaio.add(labelMaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 10, -1, -1));

        jPanelMenuMeses.add(panelMaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 0, -1, -1));

        panelJunho.setBackground(new java.awt.Color(56, 208, 187));
        panelJunho.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelJunho.setMaximumSize(new java.awt.Dimension(96, 55));
        panelJunho.setMinimumSize(new java.awt.Dimension(96, 55));
        panelJunho.setPreferredSize(new java.awt.Dimension(96, 55));
        panelJunho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelJunhoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelJunhoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelJunhoMouseExited(evt);
            }
        });
        panelJunho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelJunho.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelJunho.setText("Jun");
        panelJunho.add(labelJunho, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 10, -1, -1));

        jPanelMenuMeses.add(panelJunho, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        panelJulho.setBackground(new java.awt.Color(56, 208, 187));
        panelJulho.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelJulho.setMaximumSize(new java.awt.Dimension(96, 55));
        panelJulho.setMinimumSize(new java.awt.Dimension(96, 55));
        panelJulho.setPreferredSize(new java.awt.Dimension(96, 55));
        panelJulho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelJulhoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelJulhoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelJulhoMouseExited(evt);
            }
        });
        panelJulho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelJulho.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelJulho.setText("Jul");
        panelJulho.add(labelJulho, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 10, -1, -1));

        jPanelMenuMeses.add(panelJulho, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 0, -1, -1));

        panelAgosto.setBackground(new java.awt.Color(56, 208, 187));
        panelAgosto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelAgosto.setMaximumSize(new java.awt.Dimension(96, 55));
        panelAgosto.setMinimumSize(new java.awt.Dimension(96, 55));
        panelAgosto.setPreferredSize(new java.awt.Dimension(96, 55));
        panelAgosto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAgostoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAgostoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelAgostoMouseExited(evt);
            }
        });
        panelAgosto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAgosto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelAgosto.setText("Ago");
        panelAgosto.add(labelAgosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 10, -1, -1));

        jPanelMenuMeses.add(panelAgosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 0, -1, -1));

        panelSetembro.setBackground(new java.awt.Color(56, 208, 187));
        panelSetembro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelSetembro.setMaximumSize(new java.awt.Dimension(96, 55));
        panelSetembro.setMinimumSize(new java.awt.Dimension(96, 55));
        panelSetembro.setPreferredSize(new java.awt.Dimension(96, 55));
        panelSetembro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSetembroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelSetembroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelSetembroMouseExited(evt);
            }
        });
        panelSetembro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelSetembro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelSetembro.setText("Set");
        panelSetembro.add(labelSetembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 10, -1, -1));

        jPanelMenuMeses.add(panelSetembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 0, -1, -1));

        panelOutubro.setBackground(new java.awt.Color(56, 208, 187));
        panelOutubro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelOutubro.setMaximumSize(new java.awt.Dimension(96, 55));
        panelOutubro.setMinimumSize(new java.awt.Dimension(96, 55));
        panelOutubro.setPreferredSize(new java.awt.Dimension(96, 55));
        panelOutubro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelOutubroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelOutubroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelOutubroMouseExited(evt);
            }
        });
        panelOutubro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelOutubro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelOutubro.setText("Out");
        panelOutubro.add(labelOutubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 10, -1, -1));

        jPanelMenuMeses.add(panelOutubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 0, -1, -1));

        panelNovembro.setBackground(new java.awt.Color(56, 208, 187));
        panelNovembro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelNovembro.setMaximumSize(new java.awt.Dimension(96, 55));
        panelNovembro.setMinimumSize(new java.awt.Dimension(96, 55));
        panelNovembro.setPreferredSize(new java.awt.Dimension(96, 55));
        panelNovembro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNovembroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelNovembroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelNovembroMouseExited(evt);
            }
        });
        panelNovembro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNovembro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelNovembro.setText("Nov");
        panelNovembro.add(labelNovembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 10, -1, -1));

        jPanelMenuMeses.add(panelNovembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, -1));

        panelDezembro.setBackground(new java.awt.Color(56, 208, 187));
        panelDezembro.setMaximumSize(new java.awt.Dimension(96, 55));
        panelDezembro.setMinimumSize(new java.awt.Dimension(96, 55));
        panelDezembro.setPreferredSize(new java.awt.Dimension(96, 55));
        panelDezembro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDezembroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelDezembroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelDezembroMouseExited(evt);
            }
        });
        panelDezembro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDezembro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelDezembro.setText("Dez");
        panelDezembro.add(labelDezembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 10, -1, -1));

        jPanelMenuMeses.add(panelDezembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1056, 0, -1, -1));

        getContentPane().add(jPanelMenuMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, -1, -1));

        panelMenuAnotacoes.setMaximumSize(new java.awt.Dimension(1152, 55));
        panelMenuAnotacoes.setMinimumSize(new java.awt.Dimension(1152, 55));
        panelMenuAnotacoes.setOpaque(false);
        panelMenuAnotacoes.setPreferredSize(new java.awt.Dimension(1152, 55));
        panelMenuAnotacoes.setRequestFocusEnabled(false);
        panelMenuAnotacoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFixo.setBackground(new java.awt.Color(90, 215, 198));
        panelFixo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelFixo.setMaximumSize(new java.awt.Dimension(230, 55));
        panelFixo.setMinimumSize(new java.awt.Dimension(230, 55));
        panelFixo.setPreferredSize(new java.awt.Dimension(230, 55));
        panelFixo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelFixoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelFixoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelFixoMouseExited(evt);
            }
        });
        panelFixo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelFixo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelFixo.setText("Fixo");
        panelFixo.add(labelFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        iconeFixo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Notas (40px).png"))); // NOI18N
        panelFixo.add(iconeFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        panelMenuAnotacoes.add(panelFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelMercado.setBackground(new java.awt.Color(90, 215, 198));
        panelMercado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelMercado.setMaximumSize(new java.awt.Dimension(230, 55));
        panelMercado.setMinimumSize(new java.awt.Dimension(230, 55));
        panelMercado.setPreferredSize(new java.awt.Dimension(230, 55));
        panelMercado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMercadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMercadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMercadoMouseExited(evt);
            }
        });
        panelMercado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMercado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelMercado.setText("Mercado");
        panelMercado.add(labelMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        iconeMercado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Compras (40px).png"))); // NOI18N
        panelMercado.add(iconeMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        panelMenuAnotacoes.add(panelMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        panelLazer.setBackground(new java.awt.Color(90, 215, 198));
        panelLazer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelLazer.setMaximumSize(new java.awt.Dimension(230, 55));
        panelLazer.setMinimumSize(new java.awt.Dimension(230, 55));
        panelLazer.setPreferredSize(new java.awt.Dimension(230, 55));
        panelLazer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLazerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelLazerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelLazerMouseExited(evt);
            }
        });
        panelLazer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLazer.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelLazer.setText("Lazer");
        panelLazer.add(labelLazer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        iconeLazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lazer (40px).png"))); // NOI18N
        panelLazer.add(iconeLazer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        panelMenuAnotacoes.add(panelLazer, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        panelOutros.setBackground(new java.awt.Color(90, 215, 198));
        panelOutros.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(102, 102, 102)));
        panelOutros.setMaximumSize(new java.awt.Dimension(230, 55));
        panelOutros.setMinimumSize(new java.awt.Dimension(230, 55));
        panelOutros.setPreferredSize(new java.awt.Dimension(230, 55));
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
        labelOutros.setText("Outros");
        panelOutros.add(labelOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        iconeOutros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/outros (40px).png"))); // NOI18N
        panelOutros.add(iconeOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        panelMenuAnotacoes.add(panelOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, -1));

        panelRelatório.setBackground(new java.awt.Color(90, 215, 198));
        panelRelatório.setMaximumSize(new java.awt.Dimension(232, 55));
        panelRelatório.setMinimumSize(new java.awt.Dimension(232, 55));
        panelRelatório.setPreferredSize(new java.awt.Dimension(232, 55));
        panelRelatório.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRelatórioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRelatórioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRelatórioMouseExited(evt);
            }
        });
        panelRelatório.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTotal.setText("Relatório");
        panelRelatório.add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        iconeTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Relatorio (40px).png"))); // NOI18N
        panelRelatório.add(iconeTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        panelMenuAnotacoes.add(panelRelatório, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, -1, -1));

        getContentPane().add(panelMenuAnotacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1152, 55));

        panelPrincipal.setBackground(new java.awt.Color(175, 234, 226));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1152, 468));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1152, 468));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1152, 468));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPaneTabela.setPreferredSize(new java.awt.Dimension(500, 428));

        tabela.setBackground(new java.awt.Color(245, 245, 245));
        tabela.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Descrição", "Valor"
            }
        ));
        tabela.setMaximumSize(new java.awt.Dimension(325, 120));
        tabela.setMinimumSize(new java.awt.Dimension(205, 120));
        tabela.setRowHeight(30);
        tabela.setRowSelectionAllowed(false);
        tabela.setShowGrid(true);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaKeyReleased(evt);
            }
        });
        jScrollPaneTabela.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(250);
            tabela.getColumnModel().getColumn(1).setResizable(false);
        }

        panelPrincipal.add(jScrollPaneTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 20, -1, -1));

        panelTotais.setBackground(new java.awt.Color(102, 102, 102));
        panelTotais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTotais.setPreferredSize(new java.awt.Dimension(300, 428));
        panelTotais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTotaisDe.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        labelTotaisDe.setForeground(new java.awt.Color(242, 242, 242));
        labelTotaisDe.setText("Totais de");
        panelTotais.add(labelTotaisDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        labelTotais.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        labelTotais.setForeground(new java.awt.Color(238, 238, 37));
        labelTotais.setText("Janeiro");
        panelTotais.add(labelTotais, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        labelTotalFixo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelTotalFixo.setForeground(new java.awt.Color(238, 238, 37));
        labelTotalFixo.setText("Fixo");
        panelTotais.add(labelTotalFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        campoTotalFixo.setEditable(false);
        campoTotalFixo.setBackground(new java.awt.Color(70, 70, 70));
        campoTotalFixo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        campoTotalFixo.setForeground(new java.awt.Color(238, 238, 37));
        campoTotalFixo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTotalFixo.setPreferredSize(new java.awt.Dimension(200, 35));
        panelTotais.add(campoTotalFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        labelTotalMercado.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelTotalMercado.setForeground(new java.awt.Color(242, 242, 242));
        labelTotalMercado.setText("Mercado");
        panelTotais.add(labelTotalMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        campoTotalMercado.setEditable(false);
        campoTotalMercado.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        campoTotalMercado.setForeground(new java.awt.Color(51, 51, 51));
        campoTotalMercado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTotalMercado.setPreferredSize(new java.awt.Dimension(200, 35));
        panelTotais.add(campoTotalMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        labelTotalLazer.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelTotalLazer.setForeground(new java.awt.Color(242, 242, 242));
        labelTotalLazer.setText("Lazer");
        panelTotais.add(labelTotalLazer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        campoTotalLazer.setEditable(false);
        campoTotalLazer.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        campoTotalLazer.setForeground(new java.awt.Color(51, 51, 51));
        campoTotalLazer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTotalLazer.setPreferredSize(new java.awt.Dimension(200, 35));
        panelTotais.add(campoTotalLazer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        labelTotalOutros.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelTotalOutros.setForeground(new java.awt.Color(242, 242, 242));
        labelTotalOutros.setText("Outros");
        panelTotais.add(labelTotalOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        campoTotalOutros.setEditable(false);
        campoTotalOutros.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        campoTotalOutros.setForeground(new java.awt.Color(51, 51, 51));
        campoTotalOutros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTotalOutros.setPreferredSize(new java.awt.Dimension(200, 35));
        panelTotais.add(campoTotalOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        labelTotalMes.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelTotalMes.setForeground(new java.awt.Color(242, 242, 242));
        labelTotalMes.setText("Total");
        panelTotais.add(labelTotalMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        campoTotais.setEditable(false);
        campoTotais.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        campoTotais.setForeground(new java.awt.Color(51, 51, 51));
        campoTotais.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTotais.setPreferredSize(new java.awt.Dimension(200, 35));
        panelTotais.add(campoTotais, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        panelPrincipal.add(panelTotais, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 20, -1, -1));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelFixoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFixoMouseClicked
        desselecionar();
        voltarCorTotal();
        panelFixo.setBackground(new Color(175, 234, 226));
        tipo_gastos = "fixo";
        labelTotalFixo.setForeground(new Color(238, 238, 37));
        campoTotalFixo.setForeground(new Color(238, 238, 37));
        campoTotalFixo.setBackground(new Color(70, 70, 70));
        buscarDados();
        tabela.setEnabled(true);
    }//GEN-LAST:event_panelFixoMouseClicked

    private void panelMercadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMercadoMouseClicked
        desselecionar();
        voltarCorTotal();
        panelMercado.setBackground(new Color(175, 234, 226));
        tipo_gastos = "mercado";
        labelTotalMercado.setForeground(new Color(238, 238, 37));
        campoTotalMercado.setForeground(new Color(238, 238, 37));
        campoTotalMercado.setBackground(new Color(70, 70, 70));
        buscarDados();
        tabela.setEnabled(true);
    }//GEN-LAST:event_panelMercadoMouseClicked

    private void panelRelatórioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRelatórioMouseClicked
        voltarCorTotal();
        tipo_gastos = "total";
        relatarTotais();
        tabela.setEnabled(false);
    }//GEN-LAST:event_panelRelatórioMouseClicked

    private void panelLazerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLazerMouseClicked
        desselecionar();
        voltarCorTotal();
        panelLazer.setBackground(new Color(175, 234, 226));
        tipo_gastos = "lazer";
        labelTotalLazer.setForeground(new Color(238, 238, 37));
        campoTotalLazer.setForeground(new Color(238, 238, 37));
        campoTotalLazer.setBackground(new Color(70, 70, 70));
        buscarDados();
        tabela.setEnabled(true);
    }//GEN-LAST:event_panelLazerMouseClicked

    private void panelOutrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutrosMouseClicked
        desselecionar();
        voltarCorTotal();
        panelOutros.setBackground(new Color(175, 234, 226));
        tipo_gastos = "outros";
        labelTotalOutros.setForeground(new Color(238, 238, 37));
        campoTotalOutros.setForeground(new Color(238, 238, 37));
        campoTotalOutros.setBackground(new Color(70, 70, 70));
        buscarDados();
        tabela.setEnabled(true);
    }//GEN-LAST:event_panelOutrosMouseClicked

    private void panelJaneiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJaneiroMouseClicked
        mes = 1;
        clicarBotaoMes();
        panelJaneiro.setBackground(new Color(175, 234, 226));
    }//GEN-LAST:event_panelJaneiroMouseClicked

    private void panelFevereiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFevereiroMouseClicked
        mes = 2;
        clicarBotaoMes();
        panelFevereiro.setBackground(new Color(175, 234, 226));
    }//GEN-LAST:event_panelFevereiroMouseClicked

    private void panelMarcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMarcoMouseClicked
        mes = 3;
        clicarBotaoMes();
        panelMarco.setBackground(new Color(175, 234, 226));
    }//GEN-LAST:event_panelMarcoMouseClicked

    private void panelAbrilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAbrilMouseClicked
        mes = 4;
        clicarBotaoMes();
        panelAbril.setBackground(new Color(175, 234, 226));
    }//GEN-LAST:event_panelAbrilMouseClicked

    private void panelMaioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMaioMouseClicked
        mes = 5;
        clicarBotaoMes();
        panelMaio.setBackground(new Color(175, 234, 226));
    }//GEN-LAST:event_panelMaioMouseClicked

    private void panelJunhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJunhoMouseClicked
        mes = 6;
        clicarBotaoMes();
        panelJunho.setBackground(new Color(175, 234, 226));
    }//GEN-LAST:event_panelJunhoMouseClicked

    private void panelJulhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJulhoMouseClicked
        mes = 7;
        clicarBotaoMes();
        panelJulho.setBackground(new Color(175, 234, 226));
    }//GEN-LAST:event_panelJulhoMouseClicked

    private void panelAgostoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgostoMouseClicked
        mes = 8;
        clicarBotaoMes();
        panelAgosto.setBackground(new Color(175, 234, 226));
    }//GEN-LAST:event_panelAgostoMouseClicked

    private void panelSetembroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSetembroMouseClicked
        mes = 9;
        clicarBotaoMes();
        panelSetembro.setBackground(new Color(175, 234, 226));
    }//GEN-LAST:event_panelSetembroMouseClicked

    private void panelOutubroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutubroMouseClicked
        mes = 10;
        clicarBotaoMes();
        panelOutubro.setBackground(new Color(175, 234, 226));
    }//GEN-LAST:event_panelOutubroMouseClicked

    private void panelNovembroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNovembroMouseClicked
        mes = 11;
        clicarBotaoMes();
        panelNovembro.setBackground(new Color(175, 234, 226));
    }//GEN-LAST:event_panelNovembroMouseClicked

    private void panelDezembroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDezembroMouseClicked
        mes = 12;
        clicarBotaoMes();
        panelDezembro.setBackground(new Color(175, 234, 226));
    }//GEN-LAST:event_panelDezembroMouseClicked

    private void tabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyReleased
        if (tabela.getModel().getRowCount() - 1 == tabela.getEditingRow()) {
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.addRow(new Object[]{"", ""});
        }
        salvar();
    }//GEN-LAST:event_tabelaKeyReleased

    private void panelFixoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFixoMouseEntered
        if (tipo_gastos != "fixo") {
            panelFixo.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelFixoMouseEntered

    private void panelFixoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFixoMouseExited
        if (tipo_gastos != "fixo") {
            panelFixo.setBackground(new Color(90, 215, 198));
        } else {
            panelFixo.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelFixoMouseExited

    private void panelMercadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMercadoMouseEntered
        if (tipo_gastos != "mercado") {
            panelMercado.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelMercadoMouseEntered

    private void panelMercadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMercadoMouseExited
        if (tipo_gastos != "mercado") {
            panelMercado.setBackground(new Color(90, 215, 198));
        } else {
            panelMercado.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelMercadoMouseExited

    private void panelLazerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLazerMouseEntered
        if (tipo_gastos != "lazer") {
            panelLazer.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelLazerMouseEntered

    private void panelLazerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLazerMouseExited
        if (tipo_gastos != "lazer") {
            panelLazer.setBackground(new Color(90, 215, 198));
        } else {
            panelLazer.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelLazerMouseExited

    private void panelOutrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutrosMouseEntered
        if (tipo_gastos != "outros") {
            panelOutros.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelOutrosMouseEntered

    private void panelOutrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutrosMouseExited
        if (tipo_gastos != "outros") {
            panelOutros.setBackground(new Color(90, 215, 198));
        } else {
            panelOutros.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelOutrosMouseExited

    private void panelRelatórioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRelatórioMouseEntered
        if (tipo_gastos != "total") {
            panelRelatório.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelRelatórioMouseEntered

    private void panelRelatórioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRelatórioMouseExited
        if (tipo_gastos != "total") {
            panelRelatório.setBackground(new Color(90, 215, 198));
        } else {
            panelRelatório.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelRelatórioMouseExited

    private void panelJaneiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJaneiroMouseEntered
        if (mes != 1) {
            panelJaneiro.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelJaneiroMouseEntered

    private void panelJaneiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJaneiroMouseExited
        if (mes != 1) {
            panelJaneiro.setBackground(new Color(56, 208, 187));
        } else {
            panelJaneiro.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelJaneiroMouseExited

    private void panelFevereiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFevereiroMouseEntered
        if (mes != 2) {
            panelFevereiro.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelFevereiroMouseEntered

    private void panelFevereiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFevereiroMouseExited
        if (mes != 2) {
            panelFevereiro.setBackground(new Color(56, 208, 187));
        } else {
            panelFevereiro.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelFevereiroMouseExited

    private void panelMarcoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMarcoMouseEntered
        if (mes != 3) {
            panelMarco.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelMarcoMouseEntered

    private void panelMarcoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMarcoMouseExited
        if (mes != 3) {
            panelMarco.setBackground(new Color(56, 208, 187));
        } else {
            panelMarco.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelMarcoMouseExited

    private void panelAbrilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAbrilMouseEntered
        if (mes != 4) {
            panelAbril.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelAbrilMouseEntered

    private void panelAbrilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAbrilMouseExited
        if (mes != 4) {
            panelAbril.setBackground(new Color(56, 208, 187));
        } else {
            panelAbril.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelAbrilMouseExited

    private void panelMaioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMaioMouseEntered
        if (mes != 5) {
            panelMaio.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelMaioMouseEntered

    private void panelMaioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMaioMouseExited
        if (mes != 5) {
            panelMaio.setBackground(new Color(56, 208, 187));
        } else {
            panelMaio.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelMaioMouseExited

    private void panelJunhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJunhoMouseEntered
        if (mes != 6) {
            panelJunho.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelJunhoMouseEntered

    private void panelJunhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJunhoMouseExited
        if (mes != 6) {
            panelJunho.setBackground(new Color(56, 208, 187));
        } else {
            panelJunho.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelJunhoMouseExited

    private void panelJulhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJulhoMouseEntered
        if (mes != 7) {
            panelJulho.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelJulhoMouseEntered

    private void panelJulhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJulhoMouseExited
        if (mes != 7) {
            panelJulho.setBackground(new Color(56, 208, 187));
        } else {
            panelJulho.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelJulhoMouseExited

    private void panelAgostoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgostoMouseEntered
        if (mes != 8) {
            panelAgosto.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelAgostoMouseEntered

    private void panelAgostoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgostoMouseExited
        if (mes != 8) {
            panelAgosto.setBackground(new Color(56, 208, 187));
        } else {
            panelAgosto.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelAgostoMouseExited

    private void panelSetembroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSetembroMouseEntered
        if (mes != 9) {
            panelSetembro.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelSetembroMouseEntered

    private void panelSetembroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSetembroMouseExited
        if (mes != 9) {
            panelSetembro.setBackground(new Color(56, 208, 187));
        } else {
            panelSetembro.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelSetembroMouseExited

    private void panelOutubroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutubroMouseEntered
        if (mes != 10) {
            panelOutubro.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelOutubroMouseEntered

    private void panelOutubroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutubroMouseExited
        if (mes != 10) {
            panelOutubro.setBackground(new Color(56, 208, 187));
        } else {
            panelOutubro.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelOutubroMouseExited

    private void panelNovembroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNovembroMouseEntered
        if (mes != 11) {
            panelNovembro.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelNovembroMouseEntered

    private void panelNovembroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNovembroMouseExited
        if (mes != 11) {
            panelNovembro.setBackground(new Color(56, 208, 187));
        } else {
            panelNovembro.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelNovembroMouseExited

    private void panelDezembroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDezembroMouseEntered
        if (mes != 12) {
            panelDezembro.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelDezembroMouseEntered

    private void panelDezembroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDezembroMouseExited
        if (mes != 12) {
            panelDezembro.setBackground(new Color(56, 208, 187));
        } else {
            panelDezembro.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelDezembroMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoTotais;
    private javax.swing.JTextField campoTotalFixo;
    private javax.swing.JTextField campoTotalLazer;
    private javax.swing.JTextField campoTotalMercado;
    private javax.swing.JTextField campoTotalOutros;
    private javax.swing.JLabel iconeFixo;
    private javax.swing.JLabel iconeLazer;
    private javax.swing.JLabel iconeMercado;
    private javax.swing.JLabel iconeOutros;
    private javax.swing.JLabel iconeTotal;
    private javax.swing.JPanel jPanelMenuMeses;
    private javax.swing.JScrollPane jScrollPaneTabela;
    private javax.swing.JLabel labelAbril;
    private javax.swing.JLabel labelAgosto;
    private javax.swing.JLabel labelDezembro;
    private javax.swing.JLabel labelFevereiro;
    private javax.swing.JLabel labelFixo;
    private javax.swing.JLabel labelJaneiro;
    private javax.swing.JLabel labelJulho;
    private javax.swing.JLabel labelJunho;
    private javax.swing.JLabel labelLazer;
    private javax.swing.JLabel labelMaio;
    private javax.swing.JLabel labelMarco;
    private javax.swing.JLabel labelMercado;
    private javax.swing.JLabel labelNovembro;
    private javax.swing.JLabel labelOutros;
    private javax.swing.JLabel labelOutubro;
    private javax.swing.JLabel labelSetembro;
    private javax.swing.JLabel labelTotais;
    private javax.swing.JLabel labelTotaisDe;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelTotalFixo;
    private javax.swing.JLabel labelTotalLazer;
    private javax.swing.JLabel labelTotalMercado;
    private javax.swing.JLabel labelTotalMes;
    private javax.swing.JLabel labelTotalOutros;
    private javax.swing.JPanel panelAbril;
    private javax.swing.JPanel panelAgosto;
    private javax.swing.JPanel panelDezembro;
    private javax.swing.JPanel panelFevereiro;
    private javax.swing.JPanel panelFixo;
    private javax.swing.JPanel panelJaneiro;
    private javax.swing.JPanel panelJulho;
    private javax.swing.JPanel panelJunho;
    private javax.swing.JPanel panelLazer;
    private javax.swing.JPanel panelMaio;
    private javax.swing.JPanel panelMarco;
    private javax.swing.JPanel panelMenuAnotacoes;
    private javax.swing.JPanel panelMercado;
    private javax.swing.JPanel panelNovembro;
    private javax.swing.JPanel panelOutros;
    private javax.swing.JPanel panelOutubro;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelRelatório;
    private javax.swing.JPanel panelSetembro;
    private javax.swing.JPanel panelTotais;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
