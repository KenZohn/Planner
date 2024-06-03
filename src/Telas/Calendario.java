package Telas;

import Banco.CalendarioBD;
import Dados.CalendarioDados;
import Dados.UsuarioDados;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Calendario extends javax.swing.JInternalFrame {

    private String primeiroDiaSemana, conteudo;
    private int cod_usuario, ano, mes, dia;
    private int ultimoDia;

    public Calendario() {
        initComponents();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

        UsuarioDados usuarioDados = new UsuarioDados();

        Login loginTela = new Login();
        cod_usuario = loginTela.cod_usuario;
        usuarioDados.setCod_usuario(cod_usuario);
        System.out.println(cod_usuario);

        Date dataAtual = new Date();
        ano = Integer.parseInt(new SimpleDateFormat("yyyy").format(dataAtual));
        mes = Integer.parseInt(new SimpleDateFormat("MM").format(dataAtual));
        dia = Integer.parseInt(new SimpleDateFormat("dd").format(dataAtual));

        desselecionar();

        if (mes == 1) {
            panelJaneiro.setBackground(new Color(224, 236, 247));
            labelMes.setText("Janeiro");
        } else if (mes == 2) {
            panelFevereiro.setBackground(new Color(224, 236, 247));
            labelMes.setText("Fevereiro");
        } else if (mes == 3) {
            panelMarco.setBackground(new Color(224, 236, 247));
            labelMes.setText("Marco");
        } else if (mes == 4) {
            panelAbril.setBackground(new Color(224, 236, 247));
            labelMes.setText("Abril");
        } else if (mes == 5) {
            panelMaio.setBackground(new Color(224, 236, 247));
            labelMes.setText("Maio");
        } else if (mes == 6) {
            panelJunho.setBackground(new Color(224, 236, 247));
            labelMes.setText("Junho");
        } else if (mes == 7) {
            panelJulho.setBackground(new Color(224, 236, 247));
            labelMes.setText("Julho");
        } else if (mes == 8) {
            panelAgosto.setBackground(new Color(224, 236, 247));
            labelMes.setText("Agosto");
        } else if (mes == 9) {
            panelSetembro.setBackground(new Color(224, 236, 247));
            labelMes.setText("Setembro");
        } else if (mes == 10) {
            panelOutubro.setBackground(new Color(224, 236, 247));
            labelMes.setText("Outubro");
        } else if (mes == 11) {
            panelNovembro.setBackground(new Color(224, 236, 247));
            labelMes.setText("Novembro");
        } else if (mes == 12) {
            panelDezembro.setBackground(new Color(224, 236, 247));
            labelMes.setText("Dezembro");
        }

        try {
            ultimoDiaMes(ano, mes);
        } catch (ParseException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }

        selecionarDiaAtual();
    }

    public void desselecionar() {
        panelJaneiro.setBackground(new Color(150, 192, 230));
        panelFevereiro.setBackground(new Color(150, 192, 230));
        panelMarco.setBackground(new Color(150, 192, 230));
        panelAbril.setBackground(new Color(150, 192, 230));
        panelMaio.setBackground(new Color(150, 192, 230));
        panelJunho.setBackground(new Color(150, 192, 230));
        panelJulho.setBackground(new Color(150, 192, 230));
        panelAgosto.setBackground(new Color(150, 192, 230));
        panelSetembro.setBackground(new Color(150, 192, 230));
        panelOutubro.setBackground(new Color(150, 192, 230));
        panelNovembro.setBackground(new Color(150, 192, 230));
        panelDezembro.setBackground(new Color(150, 192, 230));
    }

    public void removerBorda() {
        dia1.setBorder(null);
        dia2.setBorder(null);
        dia3.setBorder(null);
        dia4.setBorder(null);
        dia5.setBorder(null);
        dia6.setBorder(null);
        dia7.setBorder(null);
        dia8.setBorder(null);
        dia9.setBorder(null);
        dia10.setBorder(null);
        dia11.setBorder(null);
        dia12.setBorder(null);
        dia13.setBorder(null);
        dia14.setBorder(null);
        dia15.setBorder(null);
        dia16.setBorder(null);
        dia17.setBorder(null);
        dia18.setBorder(null);
        dia19.setBorder(null);
        dia20.setBorder(null);
        dia21.setBorder(null);
        dia22.setBorder(null);
        dia23.setBorder(null);
        dia24.setBorder(null);
        dia25.setBorder(null);
        dia26.setBorder(null);
        dia27.setBorder(null);
        dia28.setBorder(null);
        dia29.setBorder(null);
        dia30.setBorder(null);
        dia31.setBorder(null);
        dia32.setBorder(null);
        dia33.setBorder(null);
        dia34.setBorder(null);
        dia35.setBorder(null);
        dia36.setBorder(null);
        dia37.setBorder(null);
    }

    public void selecionarDia1() {
        if (dia1.getText() != "") {
            labelDia.setText("Dia " + dia1.getText());
            removerBorda();
            dia1.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia1.getText());

            buscarConteudo();
        } else if (dia2.getText() != "") {
            labelDia.setText("Dia " + dia2.getText());
            removerBorda();
            dia2.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia2.getText());

            buscarConteudo();
        } else if (dia3.getText() != "") {
            labelDia.setText("Dia " + dia3.getText());
            removerBorda();
            dia3.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia3.getText());

            buscarConteudo();
        } else if (dia4.getText() != "") {
            labelDia.setText("Dia " + dia4.getText());
            removerBorda();
            dia4.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia4.getText());

            buscarConteudo();
        } else if (dia5.getText() != "") {
            labelDia.setText("Dia " + dia5.getText());
            removerBorda();
            dia5.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia5.getText());

            buscarConteudo();
        } else if (dia6.getText() != "") {
            labelDia.setText("Dia " + dia6.getText());
            removerBorda();
            dia6.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia6.getText());

            buscarConteudo();
        } else if (dia7.getText() != "") {
            labelDia.setText("Dia " + dia7.getText());
            removerBorda();
            dia7.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia7.getText());

            buscarConteudo();
        }
    }

    public void selecionarDiaAtual() {
        if (dia1.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia1.getText());
            removerBorda();
            dia1.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia2.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia2.getText());
            removerBorda();
            dia2.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia3.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia3.getText());
            removerBorda();
            dia3.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia4.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia4.getText());
            removerBorda();
            dia4.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia5.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia5.getText());
            removerBorda();
            dia5.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia6.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia6.getText());
            removerBorda();
            dia6.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia7.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia7.getText());
            removerBorda();
            dia7.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia8.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia8.getText());
            removerBorda();
            dia8.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia9.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia9.getText());
            removerBorda();
            dia9.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia10.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia10.getText());
            removerBorda();
            dia10.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia11.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia11.getText());
            removerBorda();
            dia11.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia12.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia12.getText());
            removerBorda();
            dia12.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia13.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia13.getText());
            removerBorda();
            dia13.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia14.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia14.getText());
            removerBorda();
            dia14.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia15.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia15.getText());
            removerBorda();
            dia15.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia16.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia16.getText());
            removerBorda();
            dia16.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia17.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia17.getText());
            removerBorda();
            dia17.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia18.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia18.getText());
            removerBorda();
            dia18.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia19.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia19.getText());
            removerBorda();
            dia19.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia20.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia20.getText());
            removerBorda();
            dia20.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia21.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia21.getText());
            removerBorda();
            dia21.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia22.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia22.getText());
            removerBorda();
            dia22.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia23.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia23.getText());
            removerBorda();
            dia23.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia24.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia24.getText());
            removerBorda();
            dia24.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia25.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia25.getText());
            removerBorda();
            dia25.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia26.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia26.getText());
            removerBorda();
            dia26.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia27.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia27.getText());
            removerBorda();
            dia27.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia28.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia28.getText());
            removerBorda();
            dia28.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia29.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia29.getText());
            removerBorda();
            dia29.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia30.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia30.getText());
            removerBorda();
            dia30.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia31.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia31.getText());
            removerBorda();
            dia31.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia32.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia32.getText());
            removerBorda();
            dia32.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia33.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia33.getText());
            removerBorda();
            dia33.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia34.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia34.getText());
            removerBorda();
            dia34.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia35.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia35.getText());
            removerBorda();
            dia35.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia36.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia36.getText());
            removerBorda();
            dia36.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        } else if (dia37.getText().equals("" + dia)) {
            labelDia.setText("Dia " + dia37.getText());
            removerBorda();
            dia37.setBorder(BorderFactory.createLineBorder(Color.black));
            buscarConteudo();
        }
    }

    public void ultimoDiaMes(int ano, int mes) throws ParseException {
        Month monthObj = Month.of(mes);
        LocalDate date = LocalDate.of(ano, mes, monthObj.maxLength());
        ultimoDia = Integer.parseInt(date.format(DateTimeFormatter.ofPattern("dd", Locale.US)));
        primeiroDiaSemana = diaSemana(date.format(DateTimeFormatter.ofPattern("01/MM/yyyy", Locale.US)));
        atualizarData();
    }

    public String diaSemana(String DiaMesAno) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", java.util.Locale.ENGLISH);
        Date myDate = sdf.parse(DiaMesAno);
        sdf.applyPattern("EEE");
        String sMyDate = sdf.format(myDate);
        return sMyDate;
    }

    public void atualizarData() {
        if (primeiroDiaSemana.equals("Sun")) {
            dia1.setText("1");
            dia2.setText("2");
            dia3.setText("3");
            dia4.setText("4");
            dia5.setText("5");
            dia6.setText("6");
            dia7.setText("7");
            dia8.setText("8");
            dia9.setText("9");
            dia10.setText("10");
            dia11.setText("11");
            dia12.setText("12");
            dia13.setText("13");
            dia14.setText("14");
            dia15.setText("15");
            dia16.setText("16");
            dia17.setText("17");
            dia18.setText("18");
            dia19.setText("19");
            dia20.setText("20");
            dia21.setText("21");
            dia22.setText("22");
            dia23.setText("23");
            dia24.setText("24");
            dia25.setText("25");
            dia26.setText("26");
            dia27.setText("27");
            dia28.setText("28");
            if (ultimoDia == 29) {
                dia29.setText("29");
                dia30.setText("");
                dia31.setText("");
            } else if (ultimoDia == 30) {
                dia29.setText("29");
                dia30.setText("30");
                dia31.setText("");
            } else if (ultimoDia == 31) {
                dia29.setText("29");
                dia30.setText("30");
                dia31.setText("31");
            }
            dia32.setText("");
            dia33.setText("");
            dia34.setText("");
            dia35.setText("");
            dia36.setText("");
            dia37.setText("");
        } else if (primeiroDiaSemana.equals("Mon")) {
            dia1.setText("");
            dia2.setText("1");
            dia3.setText("2");
            dia4.setText("3");
            dia5.setText("4");
            dia6.setText("5");
            dia7.setText("6");
            dia8.setText("7");
            dia9.setText("8");
            dia10.setText("9");
            dia11.setText("10");
            dia12.setText("11");
            dia13.setText("12");
            dia14.setText("13");
            dia15.setText("14");
            dia16.setText("15");
            dia17.setText("16");
            dia18.setText("17");
            dia19.setText("18");
            dia20.setText("19");
            dia21.setText("20");
            dia22.setText("21");
            dia23.setText("22");
            dia24.setText("23");
            dia25.setText("24");
            dia26.setText("25");
            dia27.setText("26");
            dia28.setText("27");
            dia29.setText("28");
            if (ultimoDia == 29) {
                dia30.setText("29");
                dia31.setText("");
                dia32.setText("");
            } else if (ultimoDia == 30) {
                dia30.setText("29");
                dia31.setText("30");
                dia32.setText("");
            } else if (ultimoDia == 31) {
                dia30.setText("29");
                dia31.setText("30");
                dia32.setText("31");
            }
            dia33.setText("");
            dia34.setText("");
            dia35.setText("");
            dia36.setText("");
            dia37.setText("");
        } else if (primeiroDiaSemana.equals("Tue")) {
            dia1.setText("");
            dia2.setText("");
            dia3.setText("1");
            dia4.setText("2");
            dia5.setText("3");
            dia6.setText("4");
            dia7.setText("5");
            dia8.setText("6");
            dia9.setText("7");
            dia10.setText("8");
            dia11.setText("9");
            dia12.setText("10");
            dia13.setText("11");
            dia14.setText("12");
            dia15.setText("13");
            dia16.setText("14");
            dia17.setText("15");
            dia18.setText("16");
            dia19.setText("17");
            dia20.setText("18");
            dia21.setText("19");
            dia22.setText("20");
            dia23.setText("21");
            dia24.setText("22");
            dia25.setText("23");
            dia26.setText("24");
            dia27.setText("25");
            dia28.setText("26");
            dia29.setText("27");
            dia30.setText("28");
            if (ultimoDia == 29) {
                dia31.setText("29");
                dia32.setText("");
                dia33.setText("");
            } else if (ultimoDia == 30) {
                dia31.setText("29");
                dia32.setText("30");
                dia33.setText("");
            } else if (ultimoDia == 31) {
                dia31.setText("29");
                dia32.setText("30");
                dia33.setText("31");
            }
            dia34.setText("");
            dia35.setText("");
            dia36.setText("");
            dia37.setText("");
        } else if (primeiroDiaSemana.equals("Wed")) {
            dia1.setText("");
            dia2.setText("");
            dia3.setText("");
            dia4.setText("1");
            dia5.setText("2");
            dia6.setText("3");
            dia7.setText("4");
            dia8.setText("5");
            dia9.setText("6");
            dia10.setText("7");
            dia11.setText("8");
            dia12.setText("9");
            dia13.setText("10");
            dia14.setText("11");
            dia15.setText("12");
            dia16.setText("13");
            dia17.setText("14");
            dia18.setText("15");
            dia19.setText("16");
            dia20.setText("17");
            dia21.setText("18");
            dia22.setText("19");
            dia23.setText("20");
            dia24.setText("21");
            dia25.setText("22");
            dia26.setText("23");
            dia27.setText("24");
            dia28.setText("25");
            dia29.setText("26");
            dia30.setText("27");
            dia31.setText("28");
            if (ultimoDia == 29) {
                dia32.setText("29");
                dia33.setText("");
                dia34.setText("");
            } else if (ultimoDia == 30) {
                dia32.setText("29");
                dia33.setText("30");
                dia34.setText("");
            } else if (ultimoDia == 31) {
                dia32.setText("29");
                dia33.setText("30");
                dia34.setText("31");
            }
            dia35.setText("");
            dia36.setText("");
            dia37.setText("");
        } else if (primeiroDiaSemana.equals("Thu")) {
            dia1.setText("");
            dia2.setText("");
            dia3.setText("");
            dia4.setText("");
            dia5.setText("1");
            dia6.setText("2");
            dia7.setText("3");
            dia8.setText("4");
            dia9.setText("5");
            dia10.setText("6");
            dia11.setText("7");
            dia12.setText("8");
            dia13.setText("9");
            dia14.setText("10");
            dia15.setText("11");
            dia16.setText("12");
            dia17.setText("13");
            dia18.setText("14");
            dia19.setText("15");
            dia20.setText("16");
            dia21.setText("17");
            dia22.setText("18");
            dia23.setText("19");
            dia24.setText("20");
            dia25.setText("21");
            dia26.setText("22");
            dia27.setText("23");
            dia28.setText("24");
            dia29.setText("25");
            dia30.setText("26");
            dia31.setText("27");
            dia32.setText("28");
            if (ultimoDia == 29) {
                dia33.setText("29");
                dia34.setText("");
                dia35.setText("");
            } else if (ultimoDia == 30) {
                dia33.setText("29");
                dia34.setText("30");
                dia35.setText("");
            } else if (ultimoDia == 31) {
                dia33.setText("29");
                dia34.setText("30");
                dia35.setText("31");
            }
            dia36.setText("");
            dia37.setText("");
        } else if (primeiroDiaSemana.equals("Fri")) {
            dia1.setText("");
            dia2.setText("");
            dia3.setText("");
            dia4.setText("");
            dia5.setText("");
            dia6.setText("1");
            dia7.setText("2");
            dia8.setText("3");
            dia9.setText("4");
            dia10.setText("5");
            dia11.setText("6");
            dia12.setText("7");
            dia13.setText("8");
            dia14.setText("9");
            dia15.setText("10");
            dia16.setText("11");
            dia17.setText("12");
            dia18.setText("13");
            dia19.setText("14");
            dia20.setText("15");
            dia21.setText("16");
            dia22.setText("17");
            dia23.setText("18");
            dia24.setText("19");
            dia25.setText("20");
            dia26.setText("21");
            dia27.setText("22");
            dia28.setText("23");
            dia29.setText("24");
            dia30.setText("25");
            dia31.setText("26");
            dia32.setText("27");
            dia33.setText("28");
            if (ultimoDia == 29) {
                dia34.setText("29");
                dia35.setText("");
                dia36.setText("");
            } else if (ultimoDia == 30) {
                dia34.setText("29");
                dia35.setText("30");
                dia36.setText("");
            } else if (ultimoDia == 31) {
                dia34.setText("29");
                dia35.setText("30");
                dia36.setText("31");
            }
            dia37.setText("");
        } else if (primeiroDiaSemana.equals("Sat")) {
            dia1.setText("");
            dia2.setText("");
            dia3.setText("");
            dia4.setText("");
            dia5.setText("");
            dia6.setText("");
            dia7.setText("1");
            dia8.setText("2");
            dia9.setText("3");
            dia10.setText("4");
            dia11.setText("5");
            dia12.setText("6");
            dia13.setText("7");
            dia14.setText("8");
            dia15.setText("9");
            dia16.setText("10");
            dia17.setText("11");
            dia18.setText("12");
            dia19.setText("13");
            dia20.setText("14");
            dia21.setText("15");
            dia22.setText("16");
            dia23.setText("17");
            dia24.setText("18");
            dia25.setText("19");
            dia26.setText("20");
            dia27.setText("21");
            dia28.setText("22");
            dia29.setText("23");
            dia30.setText("24");
            dia31.setText("25");
            dia32.setText("26");
            dia33.setText("27");
            dia34.setText("28");
            if (ultimoDia == 29) {
                dia35.setText("29");
                dia36.setText("");
                dia37.setText("");
            } else if (ultimoDia == 30) {
                dia35.setText("29");
                dia36.setText("30");
                dia37.setText("");
            } else if (ultimoDia == 31) {
                dia35.setText("29");
                dia36.setText("30");
                dia37.setText("31");
            }
        }
    }

    public void buscarConteudo() {
        CalendarioDados calendarioDados = new CalendarioDados();
        CalendarioBD calendarioBD = new CalendarioBD();

        calendarioDados.setCod_usuario(cod_usuario);
        calendarioDados.setAno(ano);
        calendarioDados.setMes(mes);
        calendarioDados.setDia(dia);
        calendarioDados.setConteudo(conteudo);

        textAreaCalendario.setText(calendarioBD.buscarCalendario(calendarioDados));
    }
    
    public void destacarDias() {
        if (!"".equals(dia1.getText())) {
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelNotas = new javax.swing.JPanel();
        scrollPaneCalendario = new javax.swing.JScrollPane();
        textAreaCalendario = new javax.swing.JTextArea();
        labelDia = new javax.swing.JLabel();
        panelCalendario = new javax.swing.JPanel();
        labelMes = new javax.swing.JLabel();
        domingo = new javax.swing.JLabel();
        segunda = new javax.swing.JLabel();
        terca = new javax.swing.JLabel();
        quarta = new javax.swing.JLabel();
        quinta = new javax.swing.JLabel();
        sexta = new javax.swing.JLabel();
        sabado = new javax.swing.JLabel();
        dia1 = new javax.swing.JLabel();
        dia2 = new javax.swing.JLabel();
        dia3 = new javax.swing.JLabel();
        dia4 = new javax.swing.JLabel();
        dia5 = new javax.swing.JLabel();
        dia6 = new javax.swing.JLabel();
        dia7 = new javax.swing.JLabel();
        dia8 = new javax.swing.JLabel();
        dia9 = new javax.swing.JLabel();
        dia10 = new javax.swing.JLabel();
        dia11 = new javax.swing.JLabel();
        dia12 = new javax.swing.JLabel();
        dia13 = new javax.swing.JLabel();
        dia14 = new javax.swing.JLabel();
        dia15 = new javax.swing.JLabel();
        dia16 = new javax.swing.JLabel();
        dia17 = new javax.swing.JLabel();
        dia18 = new javax.swing.JLabel();
        dia19 = new javax.swing.JLabel();
        dia20 = new javax.swing.JLabel();
        dia21 = new javax.swing.JLabel();
        dia22 = new javax.swing.JLabel();
        dia23 = new javax.swing.JLabel();
        dia24 = new javax.swing.JLabel();
        dia25 = new javax.swing.JLabel();
        dia26 = new javax.swing.JLabel();
        dia27 = new javax.swing.JLabel();
        dia28 = new javax.swing.JLabel();
        dia29 = new javax.swing.JLabel();
        dia30 = new javax.swing.JLabel();
        dia31 = new javax.swing.JLabel();
        dia32 = new javax.swing.JLabel();
        dia33 = new javax.swing.JLabel();
        dia34 = new javax.swing.JLabel();
        dia35 = new javax.swing.JLabel();
        dia36 = new javax.swing.JLabel();
        dia37 = new javax.swing.JLabel();
        panelMenuMeses = new javax.swing.JPanel();
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

        setBackground(new java.awt.Color(175, 216, 253));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1152, 588));
        setMinimumSize(new java.awt.Dimension(1152, 588));
        setPreferredSize(new java.awt.Dimension(1152, 588));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(224, 236, 247));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1152, 523));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1152, 523));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1152, 523));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNotas.setBackground(new java.awt.Color(245, 245, 245));
        panelNotas.setMaximumSize(new java.awt.Dimension(600, 493));
        panelNotas.setMinimumSize(new java.awt.Dimension(600, 493));
        panelNotas.setPreferredSize(new java.awt.Dimension(600, 493));
        panelNotas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPaneCalendario.setMaximumSize(new java.awt.Dimension(560, 403));
        scrollPaneCalendario.setMinimumSize(new java.awt.Dimension(560, 403));
        scrollPaneCalendario.setPreferredSize(new java.awt.Dimension(560, 403));

        textAreaCalendario.setColumns(15);
        textAreaCalendario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textAreaCalendario.setLineWrap(true);
        textAreaCalendario.setRows(5);
        textAreaCalendario.setBorder(null);
        textAreaCalendario.setMaximumSize(new java.awt.Dimension(560, 160));
        textAreaCalendario.setMinimumSize(new java.awt.Dimension(560, 160));
        textAreaCalendario.setPreferredSize(new java.awt.Dimension(560, 160));
        textAreaCalendario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textAreaCalendarioKeyReleased(evt);
            }
        });
        scrollPaneCalendario.setViewportView(textAreaCalendario);

        panelNotas.add(scrollPaneCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 93, 560, 380));

        labelDia.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelDia.setForeground(new java.awt.Color(51, 51, 51));
        labelDia.setText("Dia 1");
        panelNotas.add(labelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        panelPrincipal.add(panelNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 15, -1, -1));

        panelCalendario.setBackground(new java.awt.Color(224, 236, 247));
        panelCalendario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelCalendario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMes.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        labelMes.setForeground(new java.awt.Color(51, 51, 51));
        labelMes.setText("Janeiro");
        panelCalendario.add(labelMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        domingo.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        domingo.setForeground(new java.awt.Color(221, 50, 50));
        domingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        domingo.setText("D");
        domingo.setMaximumSize(new java.awt.Dimension(35, 35));
        domingo.setMinimumSize(new java.awt.Dimension(35, 35));
        domingo.setPreferredSize(new java.awt.Dimension(35, 35));
        panelCalendario.add(domingo, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 89, -1, -1));

        segunda.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        segunda.setForeground(new java.awt.Color(80, 107, 248));
        segunda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        segunda.setText("S");
        segunda.setMaximumSize(new java.awt.Dimension(35, 35));
        segunda.setMinimumSize(new java.awt.Dimension(35, 35));
        segunda.setPreferredSize(new java.awt.Dimension(35, 35));
        panelCalendario.add(segunda, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 89, -1, -1));

        terca.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        terca.setForeground(new java.awt.Color(80, 107, 248));
        terca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        terca.setText("T");
        terca.setMaximumSize(new java.awt.Dimension(35, 35));
        terca.setMinimumSize(new java.awt.Dimension(35, 35));
        terca.setPreferredSize(new java.awt.Dimension(35, 35));
        panelCalendario.add(terca, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 89, -1, -1));

        quarta.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        quarta.setForeground(new java.awt.Color(80, 107, 248));
        quarta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quarta.setText("Q");
        quarta.setMaximumSize(new java.awt.Dimension(35, 35));
        quarta.setMinimumSize(new java.awt.Dimension(35, 35));
        quarta.setPreferredSize(new java.awt.Dimension(35, 35));
        panelCalendario.add(quarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 89, -1, -1));

        quinta.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        quinta.setForeground(new java.awt.Color(80, 107, 248));
        quinta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quinta.setText("Q");
        quinta.setMaximumSize(new java.awt.Dimension(35, 35));
        quinta.setMinimumSize(new java.awt.Dimension(35, 35));
        quinta.setPreferredSize(new java.awt.Dimension(35, 35));
        panelCalendario.add(quinta, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 89, -1, -1));

        sexta.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        sexta.setForeground(new java.awt.Color(80, 107, 248));
        sexta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sexta.setText("S");
        sexta.setMaximumSize(new java.awt.Dimension(35, 35));
        sexta.setMinimumSize(new java.awt.Dimension(35, 35));
        sexta.setPreferredSize(new java.awt.Dimension(35, 35));
        panelCalendario.add(sexta, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 89, -1, -1));

        sabado.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        sabado.setForeground(new java.awt.Color(221, 50, 50));
        sabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sabado.setText("S");
        sabado.setMaximumSize(new java.awt.Dimension(35, 35));
        sabado.setMinimumSize(new java.awt.Dimension(35, 35));
        sabado.setPreferredSize(new java.awt.Dimension(35, 35));
        panelCalendario.add(sabado, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 89, -1, -1));

        dia1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia1.setForeground(new java.awt.Color(51, 51, 51));
        dia1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia1.setMaximumSize(new java.awt.Dimension(35, 35));
        dia1.setMinimumSize(new java.awt.Dimension(35, 35));
        dia1.setPreferredSize(new java.awt.Dimension(35, 35));
        dia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia1MouseClicked(evt);
            }
        });
        panelCalendario.add(dia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 129, -1, -1));

        dia2.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia2.setForeground(new java.awt.Color(51, 51, 51));
        dia2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia2.setText("1");
        dia2.setMaximumSize(new java.awt.Dimension(35, 35));
        dia2.setMinimumSize(new java.awt.Dimension(35, 35));
        dia2.setPreferredSize(new java.awt.Dimension(35, 35));
        dia2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia2MouseClicked(evt);
            }
        });
        dia2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dia2KeyReleased(evt);
            }
        });
        panelCalendario.add(dia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 129, -1, -1));

        dia3.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia3.setForeground(new java.awt.Color(51, 51, 51));
        dia3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia3.setText("2");
        dia3.setMaximumSize(new java.awt.Dimension(35, 35));
        dia3.setMinimumSize(new java.awt.Dimension(35, 35));
        dia3.setPreferredSize(new java.awt.Dimension(35, 35));
        dia3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia3MouseClicked(evt);
            }
        });
        panelCalendario.add(dia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 129, -1, -1));

        dia4.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia4.setForeground(new java.awt.Color(51, 51, 51));
        dia4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia4.setText("3");
        dia4.setMaximumSize(new java.awt.Dimension(35, 35));
        dia4.setMinimumSize(new java.awt.Dimension(35, 35));
        dia4.setPreferredSize(new java.awt.Dimension(35, 35));
        dia4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia4MouseClicked(evt);
            }
        });
        panelCalendario.add(dia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 129, -1, -1));

        dia5.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia5.setForeground(new java.awt.Color(51, 51, 51));
        dia5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia5.setText("4");
        dia5.setMaximumSize(new java.awt.Dimension(35, 35));
        dia5.setMinimumSize(new java.awt.Dimension(35, 35));
        dia5.setPreferredSize(new java.awt.Dimension(35, 35));
        dia5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia5MouseClicked(evt);
            }
        });
        panelCalendario.add(dia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 129, -1, -1));

        dia6.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia6.setForeground(new java.awt.Color(51, 51, 51));
        dia6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia6.setText("5");
        dia6.setMaximumSize(new java.awt.Dimension(35, 35));
        dia6.setMinimumSize(new java.awt.Dimension(35, 35));
        dia6.setPreferredSize(new java.awt.Dimension(35, 35));
        dia6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia6MouseClicked(evt);
            }
        });
        panelCalendario.add(dia6, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 129, -1, -1));

        dia7.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia7.setForeground(new java.awt.Color(51, 51, 51));
        dia7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia7.setText("6");
        dia7.setMaximumSize(new java.awt.Dimension(35, 35));
        dia7.setMinimumSize(new java.awt.Dimension(35, 35));
        dia7.setPreferredSize(new java.awt.Dimension(35, 35));
        dia7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia7MouseClicked(evt);
            }
        });
        panelCalendario.add(dia7, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 129, -1, -1));

        dia8.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia8.setForeground(new java.awt.Color(51, 51, 51));
        dia8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia8.setText("7");
        dia8.setToolTipText("");
        dia8.setMaximumSize(new java.awt.Dimension(35, 35));
        dia8.setMinimumSize(new java.awt.Dimension(35, 35));
        dia8.setPreferredSize(new java.awt.Dimension(35, 35));
        dia8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        panelCalendario.add(dia8, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 169, -1, -1));

        dia9.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia9.setForeground(new java.awt.Color(51, 51, 51));
        dia9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia9.setText("8");
        dia9.setToolTipText("");
        dia9.setMaximumSize(new java.awt.Dimension(35, 35));
        dia9.setMinimumSize(new java.awt.Dimension(35, 35));
        dia9.setPreferredSize(new java.awt.Dimension(35, 35));
        dia9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia9MouseClicked(evt);
            }
        });
        panelCalendario.add(dia9, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 169, -1, -1));

        dia10.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia10.setForeground(new java.awt.Color(51, 51, 51));
        dia10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia10.setText("9");
        dia10.setToolTipText("");
        dia10.setMaximumSize(new java.awt.Dimension(35, 35));
        dia10.setMinimumSize(new java.awt.Dimension(35, 35));
        dia10.setPreferredSize(new java.awt.Dimension(35, 35));
        dia10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia10MouseClicked(evt);
            }
        });
        panelCalendario.add(dia10, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 169, -1, -1));

        dia11.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia11.setForeground(new java.awt.Color(51, 51, 51));
        dia11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia11.setText("10");
        dia11.setToolTipText("");
        dia11.setMaximumSize(new java.awt.Dimension(35, 35));
        dia11.setMinimumSize(new java.awt.Dimension(35, 35));
        dia11.setPreferredSize(new java.awt.Dimension(35, 35));
        dia11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia11MouseClicked(evt);
            }
        });
        panelCalendario.add(dia11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 169, -1, -1));

        dia12.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia12.setForeground(new java.awt.Color(51, 51, 51));
        dia12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia12.setText("11");
        dia12.setToolTipText("");
        dia12.setMaximumSize(new java.awt.Dimension(35, 35));
        dia12.setMinimumSize(new java.awt.Dimension(35, 35));
        dia12.setPreferredSize(new java.awt.Dimension(35, 35));
        dia12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia12MouseClicked(evt);
            }
        });
        panelCalendario.add(dia12, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 169, -1, -1));

        dia13.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia13.setForeground(new java.awt.Color(51, 51, 51));
        dia13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia13.setText("12");
        dia13.setToolTipText("");
        dia13.setMaximumSize(new java.awt.Dimension(35, 35));
        dia13.setMinimumSize(new java.awt.Dimension(35, 35));
        dia13.setPreferredSize(new java.awt.Dimension(35, 35));
        dia13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia13MouseClicked(evt);
            }
        });
        panelCalendario.add(dia13, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 169, -1, -1));

        dia14.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia14.setForeground(new java.awt.Color(51, 51, 51));
        dia14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia14.setText("13");
        dia14.setToolTipText("");
        dia14.setMaximumSize(new java.awt.Dimension(35, 35));
        dia14.setMinimumSize(new java.awt.Dimension(35, 35));
        dia14.setPreferredSize(new java.awt.Dimension(35, 35));
        dia14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia14MouseClicked(evt);
            }
        });
        panelCalendario.add(dia14, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 169, -1, -1));

        dia15.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia15.setForeground(new java.awt.Color(51, 51, 51));
        dia15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia15.setText("14");
        dia15.setToolTipText("");
        dia15.setMaximumSize(new java.awt.Dimension(35, 35));
        dia15.setMinimumSize(new java.awt.Dimension(35, 35));
        dia15.setPreferredSize(new java.awt.Dimension(35, 35));
        dia15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia15MouseClicked(evt);
            }
        });
        panelCalendario.add(dia15, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 209, -1, -1));

        dia16.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia16.setForeground(new java.awt.Color(51, 51, 51));
        dia16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia16.setText("15");
        dia16.setToolTipText("");
        dia16.setMaximumSize(new java.awt.Dimension(35, 35));
        dia16.setMinimumSize(new java.awt.Dimension(35, 35));
        dia16.setPreferredSize(new java.awt.Dimension(35, 35));
        dia16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia16MouseClicked(evt);
            }
        });
        panelCalendario.add(dia16, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 209, -1, -1));

        dia17.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia17.setForeground(new java.awt.Color(51, 51, 51));
        dia17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia17.setText("16");
        dia17.setToolTipText("");
        dia17.setMaximumSize(new java.awt.Dimension(35, 35));
        dia17.setMinimumSize(new java.awt.Dimension(35, 35));
        dia17.setPreferredSize(new java.awt.Dimension(35, 35));
        dia17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia17MouseClicked(evt);
            }
        });
        panelCalendario.add(dia17, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 209, -1, -1));

        dia18.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia18.setForeground(new java.awt.Color(51, 51, 51));
        dia18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia18.setText("17");
        dia18.setToolTipText("");
        dia18.setMaximumSize(new java.awt.Dimension(35, 35));
        dia18.setMinimumSize(new java.awt.Dimension(35, 35));
        dia18.setPreferredSize(new java.awt.Dimension(35, 35));
        dia18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia18MouseClicked(evt);
            }
        });
        panelCalendario.add(dia18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 209, -1, -1));

        dia19.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia19.setForeground(new java.awt.Color(51, 51, 51));
        dia19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia19.setText("18");
        dia19.setMaximumSize(new java.awt.Dimension(35, 35));
        dia19.setMinimumSize(new java.awt.Dimension(35, 35));
        dia19.setPreferredSize(new java.awt.Dimension(35, 35));
        dia19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia19MouseClicked(evt);
            }
        });
        panelCalendario.add(dia19, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 209, -1, -1));

        dia20.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia20.setForeground(new java.awt.Color(51, 51, 51));
        dia20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia20.setText("19");
        dia20.setMaximumSize(new java.awt.Dimension(35, 35));
        dia20.setMinimumSize(new java.awt.Dimension(35, 35));
        dia20.setName(""); // NOI18N
        dia20.setPreferredSize(new java.awt.Dimension(35, 35));
        dia20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia20MouseClicked(evt);
            }
        });
        panelCalendario.add(dia20, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 209, -1, -1));

        dia21.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia21.setForeground(new java.awt.Color(51, 51, 51));
        dia21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia21.setText("20");
        dia21.setMaximumSize(new java.awt.Dimension(35, 35));
        dia21.setMinimumSize(new java.awt.Dimension(35, 35));
        dia21.setPreferredSize(new java.awt.Dimension(35, 35));
        dia21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia21MouseClicked(evt);
            }
        });
        panelCalendario.add(dia21, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 209, -1, -1));

        dia22.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia22.setForeground(new java.awt.Color(51, 51, 51));
        dia22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia22.setText("21");
        dia22.setMaximumSize(new java.awt.Dimension(35, 35));
        dia22.setMinimumSize(new java.awt.Dimension(35, 35));
        dia22.setPreferredSize(new java.awt.Dimension(35, 35));
        dia22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia22MouseClicked(evt);
            }
        });
        panelCalendario.add(dia22, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 249, -1, -1));

        dia23.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia23.setForeground(new java.awt.Color(51, 51, 51));
        dia23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia23.setText("22");
        dia23.setMaximumSize(new java.awt.Dimension(35, 35));
        dia23.setMinimumSize(new java.awt.Dimension(35, 35));
        dia23.setPreferredSize(new java.awt.Dimension(35, 35));
        dia23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia23MouseClicked(evt);
            }
        });
        panelCalendario.add(dia23, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 249, -1, -1));

        dia24.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia24.setForeground(new java.awt.Color(51, 51, 51));
        dia24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia24.setText("23");
        dia24.setMaximumSize(new java.awt.Dimension(35, 35));
        dia24.setMinimumSize(new java.awt.Dimension(35, 35));
        dia24.setPreferredSize(new java.awt.Dimension(35, 35));
        dia24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia24MouseClicked(evt);
            }
        });
        panelCalendario.add(dia24, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 249, -1, -1));

        dia25.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia25.setForeground(new java.awt.Color(51, 51, 51));
        dia25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia25.setText("24");
        dia25.setMaximumSize(new java.awt.Dimension(35, 35));
        dia25.setMinimumSize(new java.awt.Dimension(35, 35));
        dia25.setPreferredSize(new java.awt.Dimension(35, 35));
        dia25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia25MouseClicked(evt);
            }
        });
        panelCalendario.add(dia25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 249, -1, -1));

        dia26.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia26.setForeground(new java.awt.Color(51, 51, 51));
        dia26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia26.setText("25");
        dia26.setMaximumSize(new java.awt.Dimension(35, 35));
        dia26.setMinimumSize(new java.awt.Dimension(35, 35));
        dia26.setPreferredSize(new java.awt.Dimension(35, 35));
        dia26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia26MouseClicked(evt);
            }
        });
        panelCalendario.add(dia26, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 249, -1, -1));

        dia27.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia27.setForeground(new java.awt.Color(51, 51, 51));
        dia27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia27.setText("26");
        dia27.setMaximumSize(new java.awt.Dimension(35, 35));
        dia27.setMinimumSize(new java.awt.Dimension(35, 35));
        dia27.setPreferredSize(new java.awt.Dimension(35, 35));
        dia27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia27MouseClicked(evt);
            }
        });
        panelCalendario.add(dia27, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 249, -1, -1));

        dia28.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia28.setForeground(new java.awt.Color(51, 51, 51));
        dia28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia28.setText("27");
        dia28.setMaximumSize(new java.awt.Dimension(35, 35));
        dia28.setMinimumSize(new java.awt.Dimension(35, 35));
        dia28.setPreferredSize(new java.awt.Dimension(35, 35));
        dia28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia28MouseClicked(evt);
            }
        });
        panelCalendario.add(dia28, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 249, -1, -1));

        dia29.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia29.setForeground(new java.awt.Color(51, 51, 51));
        dia29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia29.setText("28");
        dia29.setMaximumSize(new java.awt.Dimension(35, 35));
        dia29.setMinimumSize(new java.awt.Dimension(35, 35));
        dia29.setPreferredSize(new java.awt.Dimension(35, 35));
        dia29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia29MouseClicked(evt);
            }
        });
        panelCalendario.add(dia29, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 289, -1, -1));

        dia30.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia30.setForeground(new java.awt.Color(51, 51, 51));
        dia30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia30.setText("29");
        dia30.setMaximumSize(new java.awt.Dimension(35, 35));
        dia30.setMinimumSize(new java.awt.Dimension(35, 35));
        dia30.setPreferredSize(new java.awt.Dimension(35, 35));
        dia30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia30MouseClicked(evt);
            }
        });
        panelCalendario.add(dia30, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 289, -1, -1));

        dia31.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia31.setForeground(new java.awt.Color(51, 51, 51));
        dia31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia31.setText("30");
        dia31.setMaximumSize(new java.awt.Dimension(35, 35));
        dia31.setMinimumSize(new java.awt.Dimension(35, 35));
        dia31.setPreferredSize(new java.awt.Dimension(35, 35));
        dia31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia31MouseClicked(evt);
            }
        });
        panelCalendario.add(dia31, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 289, -1, -1));

        dia32.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia32.setForeground(new java.awt.Color(51, 51, 51));
        dia32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia32.setText("31");
        dia32.setMaximumSize(new java.awt.Dimension(35, 35));
        dia32.setMinimumSize(new java.awt.Dimension(35, 35));
        dia32.setPreferredSize(new java.awt.Dimension(35, 35));
        dia32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia32MouseClicked(evt);
            }
        });
        panelCalendario.add(dia32, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 289, -1, -1));

        dia33.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia33.setForeground(new java.awt.Color(51, 51, 51));
        dia33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia33.setMaximumSize(new java.awt.Dimension(35, 35));
        dia33.setMinimumSize(new java.awt.Dimension(35, 35));
        dia33.setPreferredSize(new java.awt.Dimension(35, 35));
        dia33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia33MouseClicked(evt);
            }
        });
        panelCalendario.add(dia33, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 289, -1, -1));

        dia34.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia34.setForeground(new java.awt.Color(51, 51, 51));
        dia34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia34.setMaximumSize(new java.awt.Dimension(35, 35));
        dia34.setMinimumSize(new java.awt.Dimension(35, 35));
        dia34.setPreferredSize(new java.awt.Dimension(35, 35));
        dia34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia34MouseClicked(evt);
            }
        });
        panelCalendario.add(dia34, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 289, -1, -1));

        dia35.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia35.setForeground(new java.awt.Color(51, 51, 51));
        dia35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia35.setMaximumSize(new java.awt.Dimension(35, 35));
        dia35.setMinimumSize(new java.awt.Dimension(35, 35));
        dia35.setPreferredSize(new java.awt.Dimension(35, 35));
        dia35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia35MouseClicked(evt);
            }
        });
        panelCalendario.add(dia35, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 289, -1, -1));

        dia36.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia36.setForeground(new java.awt.Color(51, 51, 51));
        dia36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia36.setMaximumSize(new java.awt.Dimension(35, 35));
        dia36.setMinimumSize(new java.awt.Dimension(35, 35));
        dia36.setPreferredSize(new java.awt.Dimension(35, 35));
        dia36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia36MouseClicked(evt);
            }
        });
        panelCalendario.add(dia36, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 329, -1, -1));

        dia37.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dia37.setForeground(new java.awt.Color(51, 51, 51));
        dia37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dia37.setMaximumSize(new java.awt.Dimension(35, 35));
        dia37.setMinimumSize(new java.awt.Dimension(35, 35));
        dia37.setPreferredSize(new java.awt.Dimension(35, 35));
        dia37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia37MouseClicked(evt);
            }
        });
        panelCalendario.add(dia37, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 329, -1, -1));

        panelPrincipal.add(panelCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 450, 390));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, -1, -1));

        panelMenuMeses.setMaximumSize(new java.awt.Dimension(1152, 55));
        panelMenuMeses.setMinimumSize(new java.awt.Dimension(1152, 55));
        panelMenuMeses.setOpaque(false);
        panelMenuMeses.setPreferredSize(new java.awt.Dimension(1152, 55));
        panelMenuMeses.setRequestFocusEnabled(false);
        panelMenuMeses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelJaneiro.setBackground(new java.awt.Color(224, 236, 247));
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
        labelJaneiro.setForeground(new java.awt.Color(0, 0, 0));
        labelJaneiro.setText("Jan");
        panelJaneiro.add(labelJaneiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        panelMenuMeses.add(panelJaneiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 96, 55));

        panelFevereiro.setBackground(new java.awt.Color(150, 192, 230));
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
        labelFevereiro.setForeground(new java.awt.Color(0, 0, 0));
        labelFevereiro.setText("Fev");
        panelFevereiro.add(labelFevereiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 10, -1, -1));

        panelMenuMeses.add(panelFevereiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 0, 96, 55));

        panelMarco.setBackground(new java.awt.Color(150, 192, 230));
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
        labelMarco.setForeground(new java.awt.Color(0, 0, 0));
        labelMarco.setText("Mar");
        panelMarco.add(labelMarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 10, -1, -1));

        panelMenuMeses.add(panelMarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 0, 96, 55));

        panelAbril.setBackground(new java.awt.Color(150, 192, 230));
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
        labelAbril.setForeground(new java.awt.Color(0, 0, 0));
        labelAbril.setText("Abr");
        panelAbril.add(labelAbril, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 10, -1, -1));

        panelMenuMeses.add(panelAbril, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 0, 96, 55));

        panelMaio.setBackground(new java.awt.Color(150, 192, 230));
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
        labelMaio.setForeground(new java.awt.Color(0, 0, 0));
        labelMaio.setText("Mai");
        panelMaio.add(labelMaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 10, -1, -1));

        panelMenuMeses.add(panelMaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 0, 96, 55));

        panelJunho.setBackground(new java.awt.Color(150, 192, 230));
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
        labelJunho.setForeground(new java.awt.Color(0, 0, 0));
        labelJunho.setText("Jun");
        panelJunho.add(labelJunho, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 10, -1, -1));

        panelMenuMeses.add(panelJunho, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 96, 55));

        panelJulho.setBackground(new java.awt.Color(150, 192, 230));
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
        labelJulho.setForeground(new java.awt.Color(0, 0, 0));
        labelJulho.setText("Jul");
        panelJulho.add(labelJulho, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 10, -1, -1));

        panelMenuMeses.add(panelJulho, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 0, 96, 55));

        panelAgosto.setBackground(new java.awt.Color(150, 192, 230));
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
        labelAgosto.setForeground(new java.awt.Color(0, 0, 0));
        labelAgosto.setText("Ago");
        panelAgosto.add(labelAgosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 10, -1, -1));

        panelMenuMeses.add(panelAgosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 0, 96, 55));

        panelSetembro.setBackground(new java.awt.Color(150, 192, 230));
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
        labelSetembro.setForeground(new java.awt.Color(0, 0, 0));
        labelSetembro.setText("Set");
        panelSetembro.add(labelSetembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 10, -1, -1));

        panelMenuMeses.add(panelSetembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 0, 96, 55));

        panelOutubro.setBackground(new java.awt.Color(150, 192, 230));
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
        labelOutubro.setForeground(new java.awt.Color(0, 0, 0));
        labelOutubro.setText("Out");
        panelOutubro.add(labelOutubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 10, -1, -1));

        panelMenuMeses.add(panelOutubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 0, 96, 55));

        panelNovembro.setBackground(new java.awt.Color(150, 192, 230));
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
        labelNovembro.setForeground(new java.awt.Color(0, 0, 0));
        labelNovembro.setText("Nov");
        panelNovembro.add(labelNovembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 10, -1, -1));

        panelMenuMeses.add(panelNovembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 96, 55));

        panelDezembro.setBackground(new java.awt.Color(150, 192, 230));
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
        labelDezembro.setForeground(new java.awt.Color(0, 0, 0));
        labelDezembro.setText("Dez");
        panelDezembro.add(labelDezembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 10, -1, -1));

        panelMenuMeses.add(panelDezembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1056, 0, 96, 55));

        getContentPane().add(panelMenuMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelJaneiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJaneiroMouseClicked
        desselecionar();
        panelJaneiro.setBackground(new Color(224, 236, 247));
        mes = 1;
        labelMes.setText("Janeiro");

        try {
            ultimoDiaMes(ano, mes);
        } catch (ParseException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }

        selecionarDia1();
    }//GEN-LAST:event_panelJaneiroMouseClicked

    private void panelFevereiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFevereiroMouseClicked
        desselecionar();
        panelFevereiro.setBackground(new Color(224, 236, 247));
        mes = 2;
        labelMes.setText("Fevereiro");

        try {
            ultimoDiaMes(ano, mes);
        } catch (ParseException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }

        selecionarDia1();
    }//GEN-LAST:event_panelFevereiroMouseClicked

    private void panelMarcoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMarcoMouseClicked
        desselecionar();
        panelMarco.setBackground(new Color(224, 236, 247));
        mes = 3;
        labelMes.setText("Março");

        try {
            ultimoDiaMes(ano, mes);
        } catch (ParseException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }

        selecionarDia1();
    }//GEN-LAST:event_panelMarcoMouseClicked

    private void panelAbrilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAbrilMouseClicked
        desselecionar();
        panelAbril.setBackground(new Color(224, 236, 247));
        mes = 4;
        labelMes.setText("Abril");

        try {
            ultimoDiaMes(ano, mes);
        } catch (ParseException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }

        selecionarDia1();
    }//GEN-LAST:event_panelAbrilMouseClicked

    private void panelMaioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMaioMouseClicked
        desselecionar();
        panelMaio.setBackground(new Color(224, 236, 247));
        mes = 5;
        labelMes.setText("Maio");

        try {
            ultimoDiaMes(ano, mes);
        } catch (ParseException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }

        selecionarDia1();
    }//GEN-LAST:event_panelMaioMouseClicked

    private void panelJunhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJunhoMouseClicked
        desselecionar();
        panelJunho.setBackground(new Color(224, 236, 247));
        mes = 6;
        labelMes.setText("Junho");

        try {
            ultimoDiaMes(ano, mes);
        } catch (ParseException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }

        selecionarDia1();
    }//GEN-LAST:event_panelJunhoMouseClicked

    private void panelJulhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJulhoMouseClicked
        desselecionar();
        panelJulho.setBackground(new Color(224, 236, 247));
        mes = 7;
        labelMes.setText("Julho");

        try {
            ultimoDiaMes(ano, mes);
        } catch (ParseException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }

        selecionarDia1();
    }//GEN-LAST:event_panelJulhoMouseClicked

    private void panelAgostoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgostoMouseClicked
        desselecionar();
        panelAgosto.setBackground(new Color(224, 236, 247));
        mes = 8;
        labelMes.setText("Agosto");

        try {
            ultimoDiaMes(ano, mes);
        } catch (ParseException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }

        selecionarDia1();
    }//GEN-LAST:event_panelAgostoMouseClicked

    private void panelSetembroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSetembroMouseClicked
        desselecionar();
        panelSetembro.setBackground(new Color(224, 236, 247));
        mes = 9;
        labelMes.setText("Setembro");

        try {
            ultimoDiaMes(ano, mes);
        } catch (ParseException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }

        selecionarDia1();
    }//GEN-LAST:event_panelSetembroMouseClicked

    private void panelOutubroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutubroMouseClicked
        desselecionar();
        panelOutubro.setBackground(new Color(224, 236, 247));
        mes = 10;
        labelMes.setText("Outubro");

        try {
            ultimoDiaMes(ano, mes);
        } catch (ParseException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }

        selecionarDia1();
    }//GEN-LAST:event_panelOutubroMouseClicked

    private void panelNovembroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNovembroMouseClicked
        desselecionar();
        panelNovembro.setBackground(new Color(224, 236, 247));
        mes = 11;
        labelMes.setText("Novembro");

        try {
            ultimoDiaMes(ano, mes);
        } catch (ParseException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }

        selecionarDia1();
    }//GEN-LAST:event_panelNovembroMouseClicked

    private void panelDezembroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDezembroMouseClicked
        desselecionar();
        panelDezembro.setBackground(new Color(224, 236, 247));
        mes = 12;
        labelMes.setText("Dezembro");

        try {
            ultimoDiaMes(ano, mes);
        } catch (ParseException ex) {
            Logger.getLogger(Calendario.class.getName()).log(Level.SEVERE, null, ex);
        }

        selecionarDia1();
    }//GEN-LAST:event_panelDezembroMouseClicked

    private void dia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia1MouseClicked
        if (dia1.getText() != "") {
            labelDia.setText("Dia " + dia1.getText());
            removerBorda();
            dia1.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia1.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia1MouseClicked

    private void dia2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia2MouseClicked
        if (dia2.getText() != "") {
            labelDia.setText("Dia " + dia2.getText());
            removerBorda();
            dia2.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia2.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia2MouseClicked

    private void dia3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia3MouseClicked
        if (dia3.getText() != "") {
            labelDia.setText("Dia " + dia3.getText());
            removerBorda();
            dia3.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia3.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia3MouseClicked

    private void dia4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia4MouseClicked
        if (dia4.getText() != "") {
            labelDia.setText("Dia " + dia4.getText());
            removerBorda();
            dia4.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia4.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia4MouseClicked

    private void dia5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia5MouseClicked
        if (dia5.getText() != "") {
            labelDia.setText("Dia " + dia5.getText());
            removerBorda();
            dia5.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia5.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia5MouseClicked

    private void dia6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia6MouseClicked
        if (dia6.getText() != "") {
            labelDia.setText("Dia " + dia6.getText());
            removerBorda();
            dia6.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia6.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia6MouseClicked

    private void dia7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia7MouseClicked
        if (dia7.getText() != "") {
            labelDia.setText("Dia " + dia7.getText());
            removerBorda();
            dia7.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia7.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia7MouseClicked

    private void dia8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia8MouseClicked
        if (dia8.getText() != "") {
            labelDia.setText("Dia " + dia8.getText());
            removerBorda();
            dia8.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia8.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia8MouseClicked

    private void dia9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia9MouseClicked
        if (dia9.getText() != "") {
            labelDia.setText("Dia " + dia9.getText());
            removerBorda();
            dia9.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia9.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia9MouseClicked

    private void dia10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia10MouseClicked
        if (dia10.getText() != "") {
            labelDia.setText("Dia " + dia10.getText());
            removerBorda();
            dia10.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia10.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia10MouseClicked

    private void dia11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia11MouseClicked
        if (dia11.getText() != "") {
            labelDia.setText("Dia " + dia11.getText());
            removerBorda();
            dia11.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia11.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia11MouseClicked

    private void dia12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia12MouseClicked
        if (dia12.getText() != "") {
            labelDia.setText("Dia " + dia12.getText());
            removerBorda();
            dia12.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia12.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia12MouseClicked

    private void dia13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia13MouseClicked
        if (dia13.getText() != "") {
            labelDia.setText("Dia " + dia13.getText());
            removerBorda();
            dia13.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia13.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia13MouseClicked

    private void dia14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia14MouseClicked
        if (dia14.getText() != "") {
            labelDia.setText("Dia " + dia14.getText());
            removerBorda();
            dia14.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia14.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia14MouseClicked

    private void dia15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia15MouseClicked
        if (dia15.getText() != "") {
            labelDia.setText("Dia " + dia15.getText());
            removerBorda();
            dia15.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia15.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia15MouseClicked

    private void dia16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia16MouseClicked
        if (dia16.getText() != "") {
            labelDia.setText("Dia " + dia16.getText());
            removerBorda();
            dia16.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia16.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia16MouseClicked

    private void dia17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia17MouseClicked
        if (dia17.getText() != "") {
            labelDia.setText("Dia " + dia17.getText());
            removerBorda();
            dia17.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia17.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia17MouseClicked

    private void dia18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia18MouseClicked
        if (dia18.getText() != "") {
            labelDia.setText("Dia " + dia18.getText());
            removerBorda();
            dia18.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia18.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia18MouseClicked

    private void dia19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia19MouseClicked
        if (dia19.getText() != "") {
            labelDia.setText("Dia " + dia19.getText());
            removerBorda();
            dia19.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia19.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia19MouseClicked

    private void dia20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia20MouseClicked
        if (dia20.getText() != "") {
            labelDia.setText("Dia " + dia20.getText());
            removerBorda();
            dia20.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia20.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia20MouseClicked

    private void dia21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia21MouseClicked
        if (dia21.getText() != "") {
            labelDia.setText("Dia " + dia21.getText());
            removerBorda();
            dia21.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia21.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia21MouseClicked

    private void dia22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia22MouseClicked
        if (dia22.getText() != "") {
            labelDia.setText("Dia " + dia22.getText());
            removerBorda();
            dia22.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia22.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia22MouseClicked

    private void dia23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia23MouseClicked
        if (dia23.getText() != "") {
            labelDia.setText("Dia " + dia23.getText());
            removerBorda();
            dia23.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia23.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia23MouseClicked

    private void dia24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia24MouseClicked
        if (dia24.getText() != "") {
            labelDia.setText("Dia " + dia24.getText());
            removerBorda();
            dia24.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia24.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia24MouseClicked

    private void dia25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia25MouseClicked
        if (dia25.getText() != "") {
            labelDia.setText("Dia " + dia25.getText());
            removerBorda();
            dia25.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia25.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia25MouseClicked

    private void dia26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia26MouseClicked
        if (dia26.getText() != "") {
            labelDia.setText("Dia " + dia26.getText());
            removerBorda();
            dia26.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia26.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia26MouseClicked

    private void dia27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia27MouseClicked
        if (dia27.getText() != "") {
            labelDia.setText("Dia " + dia27.getText());
            removerBorda();
            dia27.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia27.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia27MouseClicked

    private void dia28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia28MouseClicked
        if (dia28.getText() != "") {
            labelDia.setText("Dia " + dia28.getText());
            removerBorda();
            dia28.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia28.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia28MouseClicked

    private void dia29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia29MouseClicked
        if (dia29.getText() != "") {
            labelDia.setText("Dia " + dia29.getText());
            removerBorda();
            dia29.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia29.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia29MouseClicked

    private void dia30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia30MouseClicked
        if (dia30.getText() != "") {
            labelDia.setText("Dia " + dia30.getText());
            removerBorda();
            dia30.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia30.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia30MouseClicked

    private void dia31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia31MouseClicked
        if (dia31.getText() != "") {
            labelDia.setText("Dia " + dia31.getText());
            removerBorda();
            dia31.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia31.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia31MouseClicked

    private void dia32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia32MouseClicked
        if (dia32.getText() != "") {
            labelDia.setText("Dia " + dia32.getText());
            removerBorda();
            dia32.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia32.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia32MouseClicked

    private void dia33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia33MouseClicked
        if (dia33.getText() != "") {
            labelDia.setText("Dia " + dia33.getText());
            removerBorda();
            dia33.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia33.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia33MouseClicked

    private void dia34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia34MouseClicked
        if (dia34.getText() != "") {
            labelDia.setText("Dia " + dia34.getText());
            removerBorda();
            dia34.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia34.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia34MouseClicked

    private void dia35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia35MouseClicked
        if (dia35.getText() != "") {
            labelDia.setText("Dia " + dia35.getText());
            removerBorda();
            dia35.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia35.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia35MouseClicked

    private void dia36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia36MouseClicked
        if (dia36.getText() != "") {
            labelDia.setText("Dia " + dia36.getText());
            removerBorda();
            dia36.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia36.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia36MouseClicked

    private void dia37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia37MouseClicked
        if (dia37.getText() != "") {
            labelDia.setText("Dia " + dia37.getText());
            removerBorda();
            dia37.setBorder(BorderFactory.createLineBorder(Color.black));

            dia = Integer.parseInt(dia37.getText());

            buscarConteudo();
        }
    }//GEN-LAST:event_dia37MouseClicked

    private void textAreaCalendarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaCalendarioKeyReleased
        CalendarioDados calendarioDados = new CalendarioDados();
        CalendarioBD calendarioBD = new CalendarioBD();

        conteudo = textAreaCalendario.getText();

        calendarioDados.setCod_usuario(cod_usuario);
        calendarioDados.setAno(ano);
        calendarioDados.setMes(mes);
        calendarioDados.setDia(dia);
        calendarioDados.setConteudo(conteudo);

        if (calendarioBD.verificarCalendario(calendarioDados) == null) {
            calendarioBD.inserirCalendario(calendarioDados);
        } else {
            calendarioBD.atualizarCalendario(calendarioDados);
        }

        if (conteudo.equals("")) {
            calendarioBD.excluirCalendario(calendarioDados);
        }
    }//GEN-LAST:event_textAreaCalendarioKeyReleased

    private void panelJaneiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJaneiroMouseEntered
        if (mes != 1) {
            panelJaneiro.setBackground(new Color(203, 228, 250));
        }
    }//GEN-LAST:event_panelJaneiroMouseEntered

    private void panelJaneiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJaneiroMouseExited
        if (mes != 1) {
            panelJaneiro.setBackground(new Color(150, 192, 230));
        } else {
            panelJaneiro.setBackground(new Color(224, 236, 247));
        }
    }//GEN-LAST:event_panelJaneiroMouseExited

    private void panelFevereiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFevereiroMouseEntered
        if (mes != 2) {
            panelFevereiro.setBackground(new Color(203, 228, 250));
        }
    }//GEN-LAST:event_panelFevereiroMouseEntered

    private void panelFevereiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFevereiroMouseExited
        if (mes != 2) {
            panelFevereiro.setBackground(new Color(150, 192, 230));
        } else {
            panelFevereiro.setBackground(new Color(224, 236, 247));
        }
    }//GEN-LAST:event_panelFevereiroMouseExited

    private void panelMarcoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMarcoMouseEntered
        if (mes != 3) {
            panelMarco.setBackground(new Color(203, 228, 250));
        }
    }//GEN-LAST:event_panelMarcoMouseEntered

    private void panelMarcoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMarcoMouseExited
        if (mes != 3) {
            panelMarco.setBackground(new Color(150, 192, 230));
        } else {
            panelMarco.setBackground(new Color(224, 236, 247));
        }
    }//GEN-LAST:event_panelMarcoMouseExited

    private void panelAbrilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAbrilMouseEntered
        if (mes != 4) {
            panelAbril.setBackground(new Color(203, 228, 250));
        }
    }//GEN-LAST:event_panelAbrilMouseEntered

    private void panelAbrilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAbrilMouseExited
        if (mes != 4) {
            panelAbril.setBackground(new Color(150, 192, 230));
        } else {
            panelAbril.setBackground(new Color(224, 236, 247));
        }
    }//GEN-LAST:event_panelAbrilMouseExited

    private void panelMaioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMaioMouseEntered
        if (mes != 5) {
            panelMaio.setBackground(new Color(203, 228, 250));
        }
    }//GEN-LAST:event_panelMaioMouseEntered

    private void panelMaioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMaioMouseExited
        if (mes != 5) {
            panelMaio.setBackground(new Color(150, 192, 230));
        } else {
            panelMaio.setBackground(new Color(224, 236, 247));
        }
    }//GEN-LAST:event_panelMaioMouseExited

    private void panelJunhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJunhoMouseEntered
        if (mes != 6) {
            panelJunho.setBackground(new Color(203, 228, 250));
        }
    }//GEN-LAST:event_panelJunhoMouseEntered

    private void panelJunhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJunhoMouseExited
        if (mes != 6) {
            panelJunho.setBackground(new Color(150, 192, 230));
        } else {
            panelJunho.setBackground(new Color(224, 236, 247));
        }
    }//GEN-LAST:event_panelJunhoMouseExited

    private void panelJulhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJulhoMouseEntered
        if (mes != 7) {
            panelJulho.setBackground(new Color(203, 228, 250));
        }
    }//GEN-LAST:event_panelJulhoMouseEntered

    private void panelJulhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJulhoMouseExited
        if (mes != 7) {
            panelJulho.setBackground(new Color(150, 192, 230));
        } else {
            panelJulho.setBackground(new Color(224, 236, 247));
        }
    }//GEN-LAST:event_panelJulhoMouseExited

    private void panelAgostoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgostoMouseEntered
        if (mes != 8) {
            panelAgosto.setBackground(new Color(203, 228, 250));
        }
    }//GEN-LAST:event_panelAgostoMouseEntered

    private void panelAgostoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAgostoMouseExited
        if (mes != 8) {
            panelAgosto.setBackground(new Color(150, 192, 230));
        } else {
            panelAgosto.setBackground(new Color(224, 236, 247));
        }
    }//GEN-LAST:event_panelAgostoMouseExited

    private void panelSetembroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSetembroMouseEntered
        if (mes != 9) {
            panelSetembro.setBackground(new Color(203, 228, 250));
        }
    }//GEN-LAST:event_panelSetembroMouseEntered

    private void panelSetembroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSetembroMouseExited
        if (mes != 9) {
            panelSetembro.setBackground(new Color(150, 192, 230));
        } else {
            panelSetembro.setBackground(new Color(224, 236, 247));
        }
    }//GEN-LAST:event_panelSetembroMouseExited

    private void panelOutubroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutubroMouseEntered
        if (mes != 10) {
            panelOutubro.setBackground(new Color(203, 228, 250));
        }
    }//GEN-LAST:event_panelOutubroMouseEntered

    private void panelOutubroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOutubroMouseExited
        if (mes != 10) {
            panelOutubro.setBackground(new Color(150, 192, 230));
        } else {
            panelOutubro.setBackground(new Color(224, 236, 247));
        }
    }//GEN-LAST:event_panelOutubroMouseExited

    private void panelNovembroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNovembroMouseEntered
        if (mes != 11) {
            panelNovembro.setBackground(new Color(203, 228, 250));
        }
    }//GEN-LAST:event_panelNovembroMouseEntered

    private void panelNovembroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNovembroMouseExited
        if (mes != 11) {
            panelNovembro.setBackground(new Color(150, 192, 230));
        } else {
            panelNovembro.setBackground(new Color(224, 236, 247));
        }
    }//GEN-LAST:event_panelNovembroMouseExited

    private void panelDezembroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDezembroMouseEntered
        if (mes != 12) {
            panelDezembro.setBackground(new Color(203, 228, 250));
        }
    }//GEN-LAST:event_panelDezembroMouseEntered

    private void panelDezembroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDezembroMouseExited
        if (mes != 12) {
            panelDezembro.setBackground(new Color(150, 192, 230));
        } else {
            panelDezembro.setBackground(new Color(224, 236, 247));
        }
    }//GEN-LAST:event_panelDezembroMouseExited

    private void dia2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dia2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_dia2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dia1;
    private javax.swing.JLabel dia10;
    private javax.swing.JLabel dia11;
    private javax.swing.JLabel dia12;
    private javax.swing.JLabel dia13;
    private javax.swing.JLabel dia14;
    private javax.swing.JLabel dia15;
    private javax.swing.JLabel dia16;
    private javax.swing.JLabel dia17;
    private javax.swing.JLabel dia18;
    private javax.swing.JLabel dia19;
    private javax.swing.JLabel dia2;
    private javax.swing.JLabel dia20;
    private javax.swing.JLabel dia21;
    private javax.swing.JLabel dia22;
    private javax.swing.JLabel dia23;
    private javax.swing.JLabel dia24;
    private javax.swing.JLabel dia25;
    private javax.swing.JLabel dia26;
    private javax.swing.JLabel dia27;
    private javax.swing.JLabel dia28;
    private javax.swing.JLabel dia29;
    private javax.swing.JLabel dia3;
    private javax.swing.JLabel dia30;
    private javax.swing.JLabel dia31;
    private javax.swing.JLabel dia32;
    private javax.swing.JLabel dia33;
    private javax.swing.JLabel dia34;
    private javax.swing.JLabel dia35;
    private javax.swing.JLabel dia36;
    private javax.swing.JLabel dia37;
    private javax.swing.JLabel dia4;
    private javax.swing.JLabel dia5;
    private javax.swing.JLabel dia6;
    private javax.swing.JLabel dia7;
    private javax.swing.JLabel dia8;
    private javax.swing.JLabel dia9;
    private javax.swing.JLabel domingo;
    private javax.swing.JLabel labelAbril;
    private javax.swing.JLabel labelAgosto;
    private javax.swing.JLabel labelDezembro;
    private javax.swing.JLabel labelDia;
    private javax.swing.JLabel labelFevereiro;
    private javax.swing.JLabel labelJaneiro;
    private javax.swing.JLabel labelJulho;
    private javax.swing.JLabel labelJunho;
    private javax.swing.JLabel labelMaio;
    private javax.swing.JLabel labelMarco;
    private javax.swing.JLabel labelMes;
    private javax.swing.JLabel labelNovembro;
    private javax.swing.JLabel labelOutubro;
    private javax.swing.JLabel labelSetembro;
    private javax.swing.JPanel panelAbril;
    private javax.swing.JPanel panelAgosto;
    private javax.swing.JPanel panelCalendario;
    private javax.swing.JPanel panelDezembro;
    private javax.swing.JPanel panelFevereiro;
    private javax.swing.JPanel panelJaneiro;
    private javax.swing.JPanel panelJulho;
    private javax.swing.JPanel panelJunho;
    private javax.swing.JPanel panelMaio;
    private javax.swing.JPanel panelMarco;
    private javax.swing.JPanel panelMenuMeses;
    private javax.swing.JPanel panelNotas;
    private javax.swing.JPanel panelNovembro;
    private javax.swing.JPanel panelOutubro;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSetembro;
    private javax.swing.JLabel quarta;
    private javax.swing.JLabel quinta;
    private javax.swing.JLabel sabado;
    private javax.swing.JScrollPane scrollPaneCalendario;
    private javax.swing.JLabel segunda;
    private javax.swing.JLabel sexta;
    private javax.swing.JLabel terca;
    private javax.swing.JTextArea textAreaCalendario;
    // End of variables declaration//GEN-END:variables
}
