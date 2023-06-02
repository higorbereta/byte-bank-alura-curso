package br.com.alura.bytebank;

import java.sql.*;


public class ConnectionFactory {

    public Connection recuperarConexao(){
        try {
           Connection db = DriverManager.getConnection("jdbc:postgresql://localhost:5432/byte_bank?user=sog&password=ZWY4NDhlMzkxNTEz");

            System.out.println("Conectado!");

            return db;

//            db.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    };


}
