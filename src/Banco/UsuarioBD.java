package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Dados.UsuarioDados;

public class UsuarioBD {

    Connection connection = null;

    public boolean inserirUsuario(UsuarioDados usuarioDados) {
        System.out.println("Inserir usuario");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para iniciar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "INSERT INTO usuario(nome, email, login, senha, pergunta,resposta) "
                    + "VALUES ('" + usuarioDados.getNome() + "', '"
                    + usuarioDados.getEmail() + "', '"
                    + usuarioDados.getLogin() + "', '"
                    + usuarioDados.getSenha() + "', '"
                    + usuarioDados.getPergunta()+ "','"
                    + usuarioDados.getResposta ()+ "')";

            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);

            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }

    public String buscarUsuario(UsuarioDados usuarioDados) {
        String dados = "";

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT cod_usuario FROM usuario"
                    + " WHERE login = '" + usuarioDados.getLogin() + "';");

            res.next();
            dados = res.getString("cod_usuario");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {

            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }

        return dados;
    }

    public String buscarNome(UsuarioDados usuarioDados) {
        String dados = "";

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT nome FROM usuario"
                    + " WHERE cod_usuario = '" + usuarioDados.getCod_usuario() + "';");

            res.next();
            dados = res.getString("nome");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {

            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return dados;
    }

    public String buscarEmail(UsuarioDados usuarioDados) {
        String dados = "";

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT email FROM usuario"
                    + " WHERE cod_usuario = '" + usuarioDados.getCod_usuario() + "';");

            res.next();
            dados = res.getString("email");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {

            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return dados;
    }

    public String buscarLogin(UsuarioDados usuarioDados) {
        String dados = "";

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e preparando a listagem");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT login FROM usuario"
                    + " WHERE cod_usuario = '" + usuarioDados.getCod_usuario() + "';");

            res.next();
            dados = res.getString("login");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {

            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return dados;

    }

    public boolean atualizarDados(UsuarioDados usuarioDados) {
        System.out.println("Atualizar usuario");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "UPDATE usuario SET nome = '" + usuarioDados.getNome()
                    + "' , email = '" + usuarioDados.getEmail()
                    + "', login = '" + usuarioDados.getLogin()
                    + "' WHERE cod_usuario = '" + usuarioDados.getCod_usuario() + "';";

            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);

            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }
    public boolean atualizarSenha(UsuarioDados usuarioDados) {
        System.out.println("Atualizar usuario");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "UPDATE usuario SET senha= '" + usuarioDados.getSenha()
                    + "' WHERE cod_usuario = '" + usuarioDados.getCod_usuario() + "';";

            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);

            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }
    
    public boolean excluirUsuario(UsuarioDados usuarioDados) {
        boolean status = true;

        System.out.println("Excluir usuario");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para excluir");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "DELETE FROM usuario"
                    + " WHERE cod_usuario = '" + usuarioDados.getCod_usuario() + "';";

            System.out.println("SQL: " + sql);

            if (stmt.executeUpdate(sql) != 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            status = false;
        } finally {
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return status;
    }
}
