package Banco;

import Dados.GastosDados;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GastosBD {

    Connection connection = null;

    public boolean inserirGastos(GastosDados gastosDados) {
        System.out.println("Inserir gastos");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para iniciar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "INSERT INTO gastos(cod_usuario,tipo_gastos, ano, mes,linha_item, descricao, valor) " + "VALUES ('"
                    + gastosDados.getCod_usuario() + "', '"
                    + gastosDados.getTipo_gastos() + "', '"
                    + gastosDados.getAno() + "', '"
                    + gastosDados.getMes() + "', '"
                    + gastosDados.getLinha_item() + "', '"
                    + gastosDados.getDescricao() + "', '"
                    + gastosDados.getValor() + "')";

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

    public boolean atualizarGastos(GastosDados gastosDados) {
        System.out.println("Atualizar gastos");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "UPDATE gastos SET valor = '" + gastosDados.getValor()
                    + "', descricao = '" + gastosDados.getDescricao()
                    + "' WHERE cod_usuario = '" + gastosDados.getCod_usuario()
                    + "' AND ano = '" + gastosDados.getAno()
                    + "' AND mes = '" + gastosDados.getMes()
                    + "' AND linha_item = '" + gastosDados.getLinha_item()
                    + "' AND tipo_gastos = '" + gastosDados.getTipo_gastos() + "';";

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

    public String buscarGastos(GastosDados gastosDados) {
        String dados = "";
        System.out.println("Buscar gastos");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado para buscar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM gastos"
                    + " WHERE cod_usuario = '" + gastosDados.getAno()
                    + "' AND mes = '" + gastosDados.getMes()
                    + "' AND linha_item = '" + gastosDados.getLinha_item()
                    + "' AND tipo_gastos = '" + gastosDados.getTipo_gastos() + "';");

            res.next();
            dados = res.getString("");

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

    public String verificarGastos(GastosDados gastosDados) {
        String dados = "";
        System.out.println("Verificar gastos");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado para verificar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM gastos"
                    + " WHERE cod_usuario = '" + gastosDados.getCod_usuario()
                    + "' AND mes = '" + gastosDados.getMes()
                    + "' AND linha_item= '" + gastosDados.getLinha_item()
                    + "' AND tipo_gastos = '" + gastosDados.getTipo_gastos() + "';");

            res.next();
            dados = res.getString("valor");

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

    public String verificarGastosDescricao(GastosDados gastosDados) {
        String dados = "";
        System.out.println("Verificar gastos");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado para verificar descricao");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM gastos"
                    + " WHERE cod_usuario = '" + gastosDados.getCod_usuario()
                    + "' AND mes = '" + gastosDados.getMes()
                    + "' AND linha_item= '" + gastosDados.getLinha_item()
                    + "' AND tipo_gastos = '" + gastosDados.getTipo_gastos() + "';");

            res.next();
            dados = res.getString("descricao");

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

    public boolean excluirGastos(GastosDados gastosDados) {
        boolean status = true;

        System.out.println("Excluir gastos");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado e pronto para excluir");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();

            String sql = "DELETE FROM gastos"
                    + " WHERE cod_usuario = '" + gastosDados.getCod_usuario()
                    + "' AND mes = '" + gastosDados.getMes()
                    + "' AND linha_item = '" + gastosDados.getLinha_item()
                    + "' AND tipo_gastos = '" + gastosDados.getTipo_gastos() + "'";

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

    public String buscarLinha_item(GastosDados gastosDados) {
        String dados = "";
        System.out.println("Buscar gastos");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado para buscar linha");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(linha_item) FROM gastos"
                    + " WHERE cod_usuario = '" + gastosDados.getCod_usuario()
                    + "' AND mes = '" + gastosDados.getMes()
                    + "' AND tipo_gastos = '" + gastosDados.getTipo_gastos() + "';");

            res.next();
            dados = res.getString(1);

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

    public String buscarGastosDescricao(GastosDados gastosDados) {
        String dados = "";
        System.out.println("Buscar gastos");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado para buscar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT descricao FROM gastos"
                    + " WHERE cod_usuario = '" + gastosDados.getCod_usuario()
                    + "' AND mes = '" + gastosDados.getMes()
                    + "' AND linha_item = '" + gastosDados.getLinha_item()
                    + "' AND tipo_gastos = '" + gastosDados.getTipo_gastos() + "';");

            res.next();
            dados = res.getString(1);

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

    public String buscarGastosValor(GastosDados gastosDados) {
        String dados = "";
        System.out.println("Buscar gastos");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado para buscar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT valor FROM gastos"
                    + " WHERE cod_usuario = '" + gastosDados.getCod_usuario()
                    + "' AND mes = '" + gastosDados.getMes()
                    + "' AND linha_item = '" + gastosDados.getLinha_item()
                    + "' AND tipo_gastos = '" + gastosDados.getTipo_gastos() + "';");

            res.next();
            dados = res.getString(1);

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

    public String buscarTotalGastos(GastosDados gastosDados) {
        String dados = "";
        System.out.println("Buscar totalGastos");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado para buscar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT SUM(valor) FROM gastos"
                    + " WHERE cod_usuario = '" + gastosDados.getCod_usuario()
                    + "' AND mes = '" + gastosDados.getMes()
                    + "' AND tipo_gastos = '" + gastosDados.getTipo_gastos() + "';");

            res.next();
            dados = res.getString(1);

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
    
    public String buscarSomaTotalGastos(GastosDados gastosDados) {
        String dados = "";
        System.out.println("Buscar totalGastos");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado para buscar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT SUM(valor) FROM gastos"
                    + " WHERE cod_usuario = '" + gastosDados.getCod_usuario()
                    + "' AND mes = '" + gastosDados.getMes() + "';");

            res.next();
            dados = res.getString(1);

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
    
    public String buscarTotalAnual(GastosDados gastosDados) {
        String dados = "";
        System.out.println("Buscar total anual");

        connection = Conexao.getInstance().getConnection();
        System.out.println("Conectado para buscar");
        Statement stmt = null;

        try {
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT SUM(valor) FROM gastos"
                    + " WHERE cod_usuario = '" + gastosDados.getCod_usuario() + "';");

            res.next();
            dados = res.getString(1);

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
