package meu_pacote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private Connection con = null;

    private String hostName = null;
    private String userName = null;
    private String password = null;
    private String url = null;
    private String jdbcDriver = null;
    private String dataBaseName = null;
    private String dataBasePrefix = null;
    private String dabaBasePort = null;

    public Conexao() {
        super();
    
      //Exemplo: "jdbc: mysql:/localhost:3306/meu_bd";
        this.hostName = "localhost";
        this.userName = "root";
        this.password = "";
        this.jdbcDriver = "org.gjt.mm.mysql.Driver";
        this.dataBaseName = "poo";
        this.dataBasePrefix = "jdbc: mysql:/";
        this.dabaBasePort = "3306";
      
        url = dataBasePrefix + hostName + ":"+dabaBasePort+"/" + dataBaseName + "/";      
      }

    public Connection getConnection() {
        try {
          if (con == null) {
            Class.forName(jdbcDriver);
            con = DriverManager.getConnection(url, userName, password);
          } else if (con.isClosed()) {
            con = null;
            return getConnection();
          }
        } catch (ClassNotFoundException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro na Conexão!");
            e.printStackTrace();
        }
        return con;
      }

      public void closeConnection() {
        if (con != null) {
          try {
            con.close();
          } catch (SQLException e) {
            System.out.println("Erro!");
            e.printStackTrace();
          }
        }
      }

}
