package Dados;

public class AnotacoesDados {

    private int cod_usuario;
    private String tipo;
    private String conteudo;

    public AnotacoesDados() {
        this.cod_usuario = 0;
        this.tipo = null;
        this.conteudo = null;
    }

    public AnotacoesDados(int cod_usuario, String tipo, String conteudo) {
        this.cod_usuario = cod_usuario;
        this.tipo = tipo;
        this.conteudo = conteudo;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

}
