package Dados;

public class UsuarioDados {

    private int cod_usuario;
    private String nome;
    private String email;
    private String login;
    private String senha;
    private String pergunta;
    private String resposta;

    public UsuarioDados() {
        this.cod_usuario = 0;
        this.nome = null;
        this.email = null;
        this.login = null;
        this.senha = null;
        this.pergunta = null;
        this.resposta = null;
    }

    public UsuarioDados(int cod_usuario, String nome, String email, String login, String senha, String pergunta, String resposta) {
        this.cod_usuario = cod_usuario;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.pergunta = pergunta;
        this.resposta = resposta;
    }


    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}
