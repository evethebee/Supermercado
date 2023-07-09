package com.mycompany.supermercado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Supermercado {

    protected static Connection conectar = null;
    private final static String url = "jdbc:mysql://localhost/supermercado";
    private final static String usuario = "root";
    private final static String password = "admin";

    public static void main(String[] args) {

        try {

            conectar = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión Exitosa");
        } catch (SQLException ex) {
            System.out.println("Error al abrir Conexión: " + ex.getMessage());
        }

        System.out.println("Hello World!");
    }
}
