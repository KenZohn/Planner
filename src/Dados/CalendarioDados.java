package Dados;

public class CalendarioDados {

    private int usuario;
    private int ano;
    private int mes;
    private int dia;
    private String conteudo;

    public CalendarioDados() {
        this.usuario = 0;
        this.ano = 0;
        this.mes = 0;
        this.dia = 0;
        this.conteudo = null;
    }

    public CalendarioDados(int ano, int mes, int dia, String conteudo) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.conteudo = conteudo;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

}
