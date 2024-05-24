package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dados.CalendarioDados;

public class CalendarioBD {

    Connection connection = null;

    public boolean inserirCalendario(CalendarioDados calendarioDados) {
        System.out.println("Inserir calendário");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para iniciar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "INSERT INTO calendario(cod_usuario, ano, mes, dia, conteudo) " + "VALUES ('"
                    + calendarioDados.getCod_usuario() + "', '"
                    + calendarioDados.getAno() + "', '"
                    + calendarioDados.getMes() + "', '"
                    + calendarioDados.getDia() + "', '"
                    + calendarioDados.getConteudo() + "')";

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

    public boolean atualizarCalendario(CalendarioDados calendarioDados) {
        System.out.println("Atualizar calendário");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "UPDATE calendario SET conteudo = '" + calendarioDados.getConteudo()
                    + "' WHERE ano = '" + calendarioDados.getAno()
                    + "' AND cod_usuario = '" + calendarioDados.getCod_usuario()
                    + "' AND mes = '" + calendarioDados.getMes()
                    + "' AND dia = '" + calendarioDados.getDia() + "';";

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

    public String buscarCalendario(CalendarioDados calendarioDados) {
        String dados = "";
        System.out.println("Buscar calendário");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado para buscar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM calendario"
                    + " WHERE ano = '" + calendarioDados.getAno()
                    + "' AND mes = '" + calendarioDados.getMes()
                    + "' AND dia = '" + calendarioDados.getDia() + "';");

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

    public String verificarCalendario(CalendarioDados calendarioDados) {
        String dados = "";
        System.out.println("Verificar calendário");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado para verificar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM calendario"
                    + " WHERE ano = '" + calendarioDados.getAno()
                    + "' AND mes = '" + calendarioDados.getMes()
                    + "' AND dia = '" + calendarioDados.getDia() + "';");

            res.next();
            dados = res.getString("dia");

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

    public boolean excluirCalendario(CalendarioDados calendarioDados) {
        boolean status = true;

        System.out.println("Excluir calendario");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para excluir");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "DELETE FROM calendario"
                    + " WHERE ano = '" + calendarioDados.getAno()
                    + "' AND mes = '" + calendarioDados.getMes()
                    + "' AND dia = '" + calendarioDados.getDia() + "';";

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
