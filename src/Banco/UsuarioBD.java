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

            String sql = "INSERT INTO usuario(nome, email, login, senha) "
                    + "VALUES ('" + usuarioDados.getNome() + "', '"
                    + usuarioDados.getEmail() + "', '"
                    + usuarioDados.getLogin() + "', '"
                    + usuarioDados.getSenha() + "')";

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
}
