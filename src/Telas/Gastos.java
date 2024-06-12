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

public class Gastos extends javax.swing.JInternalFrame {

    private int mes, ano, cod_usuario;
    private float valor;
    private double total;
    private String tipo_gastos;
    private String descricao;
    private int qtd_linha;

    public Gastos() {

        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        //tira a barra que ja vem Jinternalframe

        tabela.getTableHeader().setFont(new Font("Arial", Font.BOLD, 20));

        UsuarioDados usuarioDados = new UsuarioDados();
        Login loginTela = new Login();
        cod_usuario = loginTela.cod_usuario;
        usuarioDados.setCod_usuario(cod_usuario);

        desselecionar();
        panelFixo.setBackground(new Color(175, 234, 226));
        tipo_gastos = "fixo";

        desselecionarMes();
        mesAtual();

        buscarDados();
        somarTabela();
        buscarTotais();
    }

    public void mesAtual() {
        Date dataAtual = new Date();
        mes = Integer.parseInt(new SimpleDateFormat("MM").format(dataAtual));
        if (mes == 1) {
            panelJaneiro.setBackground(new Color(175, 234, 226));
            labelMes.setText("Gastos de Janeiro");
            labelTotalMes.setText("Total de Janeiro");
        } else if (mes == 2) {
            panelFevereiro.setBackground(new Color(175, 234, 226));
            labelMes.setText("Gastos de Fevereiro");
            labelTotalMes.setText("Total de Fevereiro");
        } else if (mes == 3) {
            panelMarco.setBackground(new Color(175, 234, 226));
            labelMes.setText("Gastos de Marco");
            labelTotalMes.setText("Total de Março");
        } else if (mes == 4) {
            panelAbril.setBackground(new Color(175, 234, 226));
            labelMes.setText("Gastos de Abril");
            labelTotalMes.setText("Total de Abril");
        } else if (mes == 5) {
            panelMaio.setBackground(new Color(175, 234, 226));
            labelMes.setText("Gastos de Maio");
            labelTotalMes.setText("Total de Maio");
        } else if (mes == 6) {
            panelJunho.setBackground(new Color(175, 234, 226));
            labelMes.setText("Gastos de Junho");
            labelTotalMes.setText("Total de Junho");
        } else if (mes == 7) {
            panelJulho.setBackground(new Color(175, 234, 226));
            labelMes.setText("Gastos de Julho");
            labelTotalMes.setText("Total de Julho");
        } else if (mes == 8) {
            panelAgosto.setBackground(new Color(175, 234, 226));
            labelMes.setText("Gastos de Agosto");
            labelTotalMes.setText("Total de Agosto");
        } else if (mes == 9) {
            panelSetembro.setBackground(new Color(175, 234, 226));
            labelMes.setText("Gastos de Setembro");
            labelTotalMes.setText("Total de Setembro");
        } else if (mes == 10) {
            panelOutubro.setBackground(new Color(175, 234, 226));
            labelMes.setText("Gastos de Outubro");
            labelTotalMes.setText("Total de Outubro");
        } else if (mes == 11) {
            panelNovembro.setBackground(new Color(175, 234, 226));
            labelMes.setText("Gastos de Novembro");
            labelTotalMes.setText("Total de Novembro");
        } else if (mes == 12) {
            panelDezembro.setBackground(new Color(175, 234, 226));
            labelMes.setText("Gastos de Dezembro");
            labelTotalMes.setText("Total de Dezembro");
        }

    }

    public void desselecionar() {
        panelFixo.setBackground(new Color(90, 215, 198));
        panelMercado.setBackground(new Color(90, 215, 198));
        panelTotal.setBackground(new Color(90, 215, 198));
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

    public void somarTabela() {
        total = 0;
        for (int i = 0; i < tabela.getRowCount(); i++) {
            if (tabela.getModel().getValueAt(i, 1) != null && !"".equals(tabela.getModel().getValueAt(i, 1).toString())) {
                total += Double.parseDouble(tabela.getModel().getValueAt(i, 1).toString());
            }
        }

        String totalFormatado = String.format("%.02f", total);
        campoTotal.setText("R$ " + totalFormatado + "");

        if (tipo_gastos != "total") {
            botaoSalvar.setVisible(true);
            totalGastos.setVisible(true);
            campoTotal.setVisible(true);
        }
    }

    public void buscarTotais() {
        GastosBD gastosBD = new GastosBD();
        GastosDados gastosDados = new GastosDados();

        gastosDados.setCod_usuario(cod_usuario);
        gastosDados.setMes(mes);

        gastosDados.setTipo_gastos("fixo");
        if (gastosBD.buscarTotalGastos(gastosDados) == null) {
            campoFixo.setText("R$ 0,00");
        } else {
            campoFixo.setText("R$ " + String.format("%.02f", Double.parseDouble(gastosBD.buscarTotalGastos(gastosDados))));
        }

        gastosDados.setTipo_gastos("mercado");
        if (gastosBD.buscarTotalGastos(gastosDados) == null) {
            campoMercado.setText("R$ 0,00");
        } else {
            campoMercado.setText("R$ " + String.format("%.02f", Double.parseDouble(gastosBD.buscarTotalGastos(gastosDados))));
        }

        gastosDados.setTipo_gastos("lazer");
        if (gastosBD.buscarTotalGastos(gastosDados) == null) {
            campoLazer.setText("R$ 0,00");
        } else {
            campoLazer.setText("R$ " + String.format("%.02f", Double.parseDouble(gastosBD.buscarTotalGastos(gastosDados))));
        }

        gastosDados.setTipo_gastos("outros");
        if (gastosBD.buscarTotalGastos(gastosDados) == null) {
            campoOutros.setText("R$ 0,00");
        } else {
            campoOutros.setText("R$ " + String.format("%.02f", Double.parseDouble(gastosBD.buscarTotalGastos(gastosDados))));
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
            panelTotal.setBackground(new Color(175, 234, 226));
            tipo_gastos = "total";
            botaoSalvar.setVisible(false);
            totalGastos.setVisible(false);
            campoTotal.setVisible(false);

            GastosDados gastosDados = new GastosDados();
            GastosBD gastosBD = new GastosBD();

            gastosDados.setCod_usuario(cod_usuario);
            gastosDados.setAno(ano);
            gastosDados.setMes(mes);

            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setRowCount(0);
            gastosDados.setTipo_gastos("fixo");
            if (gastosBD.buscarTotalGastos(gastosDados) == null) {
                model.addRow(new Object[]{"Fixo", "0,00"});
            } else {
                model.addRow(new Object[]{"Fixo", String.format("%.02f", Double.parseDouble(gastosBD.buscarTotalGastos(gastosDados)))});
            }

            gastosDados.setTipo_gastos("mercado");
            if (gastosBD.buscarTotalGastos(gastosDados) == null) {
                model.addRow(new Object[]{"Mercado", "0,00"});
            } else {
                model.addRow(new Object[]{"Mercado", String.format("%.02f", Double.parseDouble(gastosBD.buscarTotalGastos(gastosDados)))});
            }

            gastosDados.setTipo_gastos("lazer");
            if (gastosBD.buscarTotalGastos(gastosDados) == null) {
                model.addRow(new Object[]{"Lazer", "0,00"});
            } else {
                model.addRow(new Object[]{"Lazer", String.format("%.02f", Double.parseDouble(gastosBD.buscarTotalGastos(gastosDados)))});
            }

            gastosDados.setTipo_gastos("outros");
            if (gastosBD.buscarTotalGastos(gastosDados) == null) {
                model.addRow(new Object[]{"Outros", "0,00"});
            } else {
                model.addRow(new Object[]{"Outros", String.format("%.02f", Double.parseDouble(gastosBD.buscarTotalGastos(gastosDados)))});
            }

            total = 0;

            if (gastosBD.buscarSomaTotalGastos(gastosDados) == null) {
                model.addRow(new Object[]{"Total", "0,00"});
            } else {
                model.addRow(new Object[]{"Total", String.format("%.02f", Double.parseDouble(gastosBD.buscarSomaTotalGastos(gastosDados)))});
            }
        }
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
        panelTotal = new javax.swing.JPanel();
        labelTotal = new javax.swing.JLabel();
        iconeTotal = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        campoTotal = new javax.swing.JTextField();
        totalGastos = new javax.swing.JLabel();
        jScrollPaneTabela = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botaoSalvar = new javax.swing.JButton();
        labelMes = new javax.swing.JLabel();
        panelTotais = new javax.swing.JPanel();
        labelTotais = new javax.swing.JLabel();
        labelTotalFixo = new javax.swing.JLabel();
        campoFixo = new javax.swing.JTextField();
        labelTotalMercado = new javax.swing.JLabel();
        campoMercado = new javax.swing.JTextField();
        labelTotalLazer = new javax.swing.JLabel();
        campoLazer = new javax.swing.JTextField();
        labelTotalOutros = new javax.swing.JLabel();
        campoOutros = new javax.swing.JTextField();
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
        panelFixo.setMaximumSize(new java.awt.Dimension(192, 55));
        panelFixo.setMinimumSize(new java.awt.Dimension(192, 55));
        panelFixo.setPreferredSize(new java.awt.Dimension(192, 55));
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

        panelMenuAnotacoes.add(panelFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 55));

        panelMercado.setBackground(new java.awt.Color(90, 215, 198));
        panelMercado.setMaximumSize(new java.awt.Dimension(192, 55));
        panelMercado.setMinimumSize(new java.awt.Dimension(192, 55));
        panelMercado.setPreferredSize(new java.awt.Dimension(192, 55));
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

        panelMenuAnotacoes.add(panelMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 230, 55));

        panelLazer.setBackground(new java.awt.Color(90, 215, 198));
        panelLazer.setMaximumSize(new java.awt.Dimension(192, 55));
        panelLazer.setMinimumSize(new java.awt.Dimension(192, 55));
        panelLazer.setPreferredSize(new java.awt.Dimension(192, 55));
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

        panelMenuAnotacoes.add(panelLazer, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 231, 55));

        panelOutros.setBackground(new java.awt.Color(90, 215, 198));
        panelOutros.setMaximumSize(new java.awt.Dimension(192, 55));
        panelOutros.setMinimumSize(new java.awt.Dimension(192, 55));
        panelOutros.setPreferredSize(new java.awt.Dimension(192, 55));
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

        panelMenuAnotacoes.add(panelOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 231, 55));

        panelTotal.setBackground(new java.awt.Color(90, 215, 198));
        panelTotal.setMaximumSize(new java.awt.Dimension(192, 55));
        panelTotal.setMinimumSize(new java.awt.Dimension(192, 55));
        panelTotal.setPreferredSize(new java.awt.Dimension(192, 55));
        panelTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelTotalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelTotalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelTotalMouseExited(evt);
            }
        });
        panelTotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTotal.setText("Relatório");
        panelTotal.add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        iconeTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Relatorio (40px).png"))); // NOI18N
        panelTotal.add(iconeTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, -1, -1));

        panelMenuAnotacoes.add(panelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 0, 231, -1));

        getContentPane().add(panelMenuAnotacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1152, 55));

        panelPrincipal.setBackground(new java.awt.Color(175, 234, 226));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1152, 468));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1152, 468));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1152, 468));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoTotal.setEditable(false);
        campoTotal.setBackground(new java.awt.Color(212, 241, 237));
        campoTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTotal.setPreferredSize(new java.awt.Dimension(150, 40));
        panelPrincipal.add(campoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, -1, -1));

        totalGastos.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        totalGastos.setText("Total");
        panelPrincipal.add(totalGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 285, -1, -1));

        tabela.setBackground(new java.awt.Color(242, 242, 242));
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
        tabela.setMaximumSize(new java.awt.Dimension(205, 120));
        tabela.setMinimumSize(new java.awt.Dimension(205, 120));
        tabela.setRowHeight(30);
        tabela.setRowSelectionAllowed(false);
        tabela.setShowGrid(true);
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

        panelPrincipal.add(jScrollPaneTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 500, 350));

        botaoSalvar.setBackground(new java.awt.Color(51, 51, 51));
        botaoSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(242, 242, 242));
        botaoSalvar.setText("Salvar");
        botaoSalvar.setMaximumSize(new java.awt.Dimension(150, 40));
        botaoSalvar.setMinimumSize(new java.awt.Dimension(150, 40));
        botaoSalvar.setPreferredSize(new java.awt.Dimension(150, 40));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        panelPrincipal.add(botaoSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, -1, -1));

        labelMes.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        labelMes.setForeground(new java.awt.Color(51, 51, 51));
        labelMes.setText("Gastos de Janeiro");
        panelPrincipal.add(labelMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        panelTotais.setBackground(new java.awt.Color(102, 102, 102));
        panelTotais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTotais.setPreferredSize(new java.awt.Dimension(250, 428));
        panelTotais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTotais.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        labelTotais.setForeground(new java.awt.Color(242, 242, 242));
        labelTotais.setText("Totais");
        panelTotais.add(labelTotais, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        labelTotalFixo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelTotalFixo.setForeground(new java.awt.Color(242, 242, 242));
        labelTotalFixo.setText("Fixo");
        panelTotais.add(labelTotalFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        campoFixo.setEditable(false);
        campoFixo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoFixo.setForeground(new java.awt.Color(51, 51, 51));
        campoFixo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoFixo.setPreferredSize(new java.awt.Dimension(150, 35));
        panelTotais.add(campoFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        labelTotalMercado.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelTotalMercado.setForeground(new java.awt.Color(242, 242, 242));
        labelTotalMercado.setText("Mercado");
        panelTotais.add(labelTotalMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        campoMercado.setEditable(false);
        campoMercado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoMercado.setForeground(new java.awt.Color(51, 51, 51));
        campoMercado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoMercado.setPreferredSize(new java.awt.Dimension(150, 35));
        panelTotais.add(campoMercado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        labelTotalLazer.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelTotalLazer.setForeground(new java.awt.Color(242, 242, 242));
        labelTotalLazer.setText("Lazer");
        panelTotais.add(labelTotalLazer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        campoLazer.setEditable(false);
        campoLazer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoLazer.setForeground(new java.awt.Color(51, 51, 51));
        campoLazer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoLazer.setPreferredSize(new java.awt.Dimension(150, 35));
        panelTotais.add(campoLazer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        labelTotalOutros.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelTotalOutros.setForeground(new java.awt.Color(242, 242, 242));
        labelTotalOutros.setText("Outros");
        panelTotais.add(labelTotalOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        campoOutros.setEditable(false);
        campoOutros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoOutros.setForeground(new java.awt.Color(51, 51, 51));
        campoOutros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoOutros.setPreferredSize(new java.awt.Dimension(150, 35));
        panelTotais.add(campoOutros, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        labelTotalMes.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelTotalMes.setForeground(new java.awt.Color(242, 242, 242));
        labelTotalMes.setText("Total de Janeiro");
        panelTotais.add(labelTotalMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        campoTotais.setEditable(false);
        campoTotais.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoTotais.setForeground(new java.awt.Color(51, 51, 51));
        campoTotais.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoTotais.setPreferredSize(new java.awt.Dimension(150, 35));
        panelTotais.add(campoTotais, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        panelPrincipal.add(panelTotais, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 20, 250, 428));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelFixoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFixoMouseClicked
        desselecionar();
        panelFixo.setBackground(new Color(175, 234, 226));
        tipo_gastos = "fixo";
        buscarDados();
        somarTabela();
    }//GEN-LAST:event_panelFixoMouseClicked

    private void panelMercadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMercadoMouseClicked
        desselecionar();
        panelMercado.setBackground(new Color(175, 234, 226));
        tipo_gastos = "mercado";
        buscarDados();
        somarTabela();
    }//GEN-LAST:event_panelMercadoMouseClicked

    private void panelTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTotalMouseClicked
        tipo_gastos = "total";
        relatarTotais();
    }//GEN-LAST:event_panelTotalMouseClicked

    private void panelLazerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLazerMouseClicked
        desselecionar();
        panelLazer.setBackground(new Color(175, 234, 226));
        tipo_gastos = "lazer";
        buscarDados();
        somarTabela();
    }//GEN-LAST:event_panelLazerMouseClicked

    private void panelOutrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutrosMouseClicked
        desselecionar();
        panelOutros.setBackground(new Color(175, 234, 226));
        tipo_gastos = "outros";
        buscarDados();
        somarTabela();
    }//GEN-LAST:event_panelOutrosMouseClicked

    private void panelJaneiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJaneiroMouseClicked
        desselecionarMes();
        panelJaneiro.setBackground(new Color(175, 234, 226));
        mes = 1;
        buscarDados();
        somarTabela();
        buscarTotais();
        relatarTotais();
        labelMes.setText("Gastos de Janeiro");
        labelTotalMes.setText("Total de Janeiro");
    }//GEN-LAST:event_panelJaneiroMouseClicked

    private void panelFevereiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFevereiroMouseClicked
        desselecionarMes();
        panelFevereiro.setBackground(new Color(175, 234, 226));
        mes = 2;
        buscarDados();
        somarTabela();
        buscarTotais();
        relatarTotais();
        labelMes.setText("Gastos de Fevereiro");
        labelTotalMes.setText("Total de Fevereiro");
    }//GEN-LAST:event_panelFevereiroMouseClicked

    private void panelMarcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMarcoMouseClicked
        desselecionarMes();
        panelMarco.setBackground(new Color(175, 234, 226));
        mes = 3;
        buscarDados();
        somarTabela();
        buscarTotais();
        relatarTotais();
        labelMes.setText("Gastos de Março");
        labelTotalMes.setText("Total de Março");
    }//GEN-LAST:event_panelMarcoMouseClicked

    private void panelAbrilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAbrilMouseClicked
        desselecionarMes();
        panelAbril.setBackground(new Color(175, 234, 226));
        mes = 4;
        buscarDados();
        somarTabela();
        buscarTotais();
        relatarTotais();
        labelMes.setText("Gastos de Abril");
        labelTotalMes.setText("Total de Abril");
    }//GEN-LAST:event_panelAbrilMouseClicked

    private void panelMaioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMaioMouseClicked
        desselecionarMes();
        panelMaio.setBackground(new Color(175, 234, 226));
        mes = 5;
        buscarDados();
        somarTabela();
        buscarTotais();
        relatarTotais();
        labelMes.setText("Gastos de Maio");
        labelTotalMes.setText("Total de Maio");
    }//GEN-LAST:event_panelMaioMouseClicked

    private void panelJunhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJunhoMouseClicked
        desselecionarMes();
        panelJunho.setBackground(new Color(175, 234, 226));
        mes = 6;
        buscarDados();
        somarTabela();
        buscarTotais();
        relatarTotais();
        labelMes.setText("Gastos de Junho");
        labelTotalMes.setText("Total de Junho");
    }//GEN-LAST:event_panelJunhoMouseClicked

    private void panelJulhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJulhoMouseClicked
        desselecionarMes();
        panelJulho.setBackground(new Color(175, 234, 226));
        mes = 7;
        buscarDados();
        somarTabela();
        buscarTotais();
        relatarTotais();
        labelMes.setText("Gastos de Julho");
        labelTotalMes.setText("Total de Julho");
    }//GEN-LAST:event_panelJulhoMouseClicked

    private void panelAgostoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgostoMouseClicked
        desselecionarMes();
        panelAgosto.setBackground(new Color(175, 234, 226));
        mes = 8;
        buscarDados();
        somarTabela();
        buscarTotais();
        relatarTotais();
        labelMes.setText("Gastos de Agosto");
        labelTotalMes.setText("Total de Agosto");
    }//GEN-LAST:event_panelAgostoMouseClicked

    private void panelSetembroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSetembroMouseClicked
        desselecionarMes();
        panelSetembro.setBackground(new Color(175, 234, 226));
        mes = 9;
        buscarDados();
        somarTabela();
        buscarTotais();
        relatarTotais();
        labelMes.setText("Gastos de Setembro");
        labelTotalMes.setText("Total de Setembro");
    }//GEN-LAST:event_panelSetembroMouseClicked

    private void panelOutubroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutubroMouseClicked
        desselecionarMes();
        panelOutubro.setBackground(new Color(175, 234, 226));
        mes = 10;
        buscarDados();
        somarTabela();
        buscarTotais();
        relatarTotais();
        labelMes.setText("Gastos de Outubro");
        labelTotalMes.setText("Total de Outubro");
    }//GEN-LAST:event_panelOutubroMouseClicked

    private void panelNovembroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNovembroMouseClicked
        desselecionarMes();
        panelNovembro.setBackground(new Color(175, 234, 226));
        mes = 11;
        buscarDados();
        somarTabela();
        buscarTotais();
        relatarTotais();
        labelMes.setText("Gastos de Novembro");
        labelTotalMes.setText("Total de Novembro");
    }//GEN-LAST:event_panelNovembroMouseClicked

    private void panelDezembroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDezembroMouseClicked
        desselecionarMes();
        panelDezembro.setBackground(new Color(175, 234, 226));
        mes = 12;
        buscarDados();
        somarTabela();
        buscarTotais();
        relatarTotais();
        labelMes.setText("Gastos de Dezembro");
        labelTotalMes.setText("Total de Dezembro");
    }//GEN-LAST:event_panelDezembroMouseClicked

    private void tabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyReleased
        if (tabela.getModel().getRowCount() - 1 == tabela.getEditingRow()) {
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.addRow(new Object[]{"", ""});
        }

        somarTabela();
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

    private void panelTotalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTotalMouseEntered
        if (tipo_gastos != "total") {
            panelTotal.setBackground(new Color(111, 233, 216));
        }
    }//GEN-LAST:event_panelTotalMouseEntered

    private void panelTotalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTotalMouseExited
        if (tipo_gastos != "total") {
            panelTotal.setBackground(new Color(90, 215, 198));
        } else {
            panelTotal.setBackground(new Color(175, 234, 226));
        }
    }//GEN-LAST:event_panelTotalMouseExited

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

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
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

            if (descricao != "" && valor != 0) {
                if (gastosBD.verificarGastos(gastosDados) == null && gastosBD.verificarGastosDescricao(gastosDados) == null) {
                    gastosBD.inserirGastos(gastosDados);
                } else {
                    gastosBD.atualizarGastos(gastosDados);
                }
            } else {
                gastosBD.atualizarGastos(gastosDados);
            }

            /*if (descricao.equals("") && valor == 0) {
                gastosBD.excluirGastos(gastosDados);
            }*/
            
            buscarTotais();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoFixo;
    private javax.swing.JTextField campoLazer;
    private javax.swing.JTextField campoMercado;
    private javax.swing.JTextField campoOutros;
    private javax.swing.JTextField campoTotais;
    private javax.swing.JTextField campoTotal;
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
    private javax.swing.JLabel labelMes;
    private javax.swing.JLabel labelNovembro;
    private javax.swing.JLabel labelOutros;
    private javax.swing.JLabel labelOutubro;
    private javax.swing.JLabel labelSetembro;
    private javax.swing.JLabel labelTotais;
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
    private javax.swing.JPanel panelSetembro;
    private javax.swing.JPanel panelTotais;
    private javax.swing.JPanel panelTotal;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel totalGastos;
    // End of variables declaration//GEN-END:variables
}
