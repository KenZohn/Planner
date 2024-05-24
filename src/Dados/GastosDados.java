package Dados;

public class GastosDados {

    private int cod_usuario;
    private String tipo_gastos;
    private int ano;
    private int mes;
    private int linha_item;
    private String descricao;
    private float valor;

    public GastosDados() {
        this.cod_usuario = 0;
        this.tipo_gastos = null;
        this.ano = 0;
        this.mes = 0;
        this.linha_item = 0;
        this.descricao = null;
        this.valor = 0;
    }

    public GastosDados(int cod_usuario, String tipo_gastos, int ano, int mes, int linha_item, String descricao, float valor) {
        this.cod_usuario = cod_usuario;
        this.tipo_gastos = tipo_gastos;
        this.ano = ano;
        this.mes = mes;
        this.linha_item = linha_item;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getTipo_gastos() {
        return tipo_gastos;
    }

    public void setTipo_gastos(String tipo_gastos) {
        this.tipo_gastos = tipo_gastos;
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

    public int getLinha_item() {
        return linha_item;
    }

    public void setLinha_item(int linha_item) {
        this.linha_item = linha_item;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
