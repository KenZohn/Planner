package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dados.AnotacoesDados;

public class AnotacoesBD {

    Connection connection = null;

    public boolean inserirAnotacoes(AnotacoesDados anotacoesDados) {
        System.out.println("Inserir anotacoes");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para iniciar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "INSERT INTO anotacoes(cod_usuario, tipo, conteudo) " + "VALUES ('" +
                    anotacoesDados.getCod_usuario() + "','" +
                    anotacoesDados.getTipo() + "','" +
                    anotacoesDados.getConteudo() + "')";

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

    public boolean atualizarAnotacoes(AnotacoesDados anotacoesDados) {
        System.out.println("Atualizar anotacoes ");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "UPDATE anotacoes SET conteudo = '" + anotacoesDados.getConteudo() +
                    "' WHERE cod_usuario = '" + anotacoesDados.getCod_usuario() +
                    "'AND tipo = '" + anotacoesDados.getTipo() + "';";                    

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

    public String buscarAnotacoes(AnotacoesDados anotacoesDados) {
        String dados = "";
        System.out.println("Buscar anotacoes");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado para buscar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM anotacoes WHERE cod_usuario = '" + anotacoesDados.getCod_usuario() +
                    "' AND tipo = '" + anotacoesDados.getTipo() + "';");

            res.next();
            dados = res.getString("conteudo");

            System.out.println("SQL: " + res);

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

    public String verificarAnotacoes(AnotacoesDados anotacoesDados) {
        String dados = "";
        System.out.println("Verificar anotacoes");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado para verificar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM anotacoes WHERE cod_usuario = '" + anotacoesDados.getCod_usuario() +
                    "' AND tipo = '" + anotacoesDados.getTipo() + "';");
            
            res.next();
            dados = res.getString("tipo");

            System.out.println("SQL: " + res);

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
