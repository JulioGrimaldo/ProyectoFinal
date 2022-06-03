/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class conexion {

    String url = "jdbc:mysql://bdnducfmitei5tilgawq-mysql.services.clever-cloud.com:3306/bdnducfmitei5tilgawq";
    String usuario = "unvpnwsekrcapbd1";
    String password = "AXkIRbyLueN8u4xEZ8tz";
     private Connection conn = null;

    conexion() {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");

            conn = (Connection) DriverManager.getConnection(url, usuario, password);

            if (conn != null) {
                System.out.println("Conexión a base de datos " + url + " . . . Ok");
            }

        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse a la base de datos" + url);
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Entro otro error");
            System.out.println(ex);
        }
    }
    public ResultSet getQuery(String _query) {
        Statement state = null;
        ResultSet resultado = null;
        try {
            state = (Statement) conn.createStatement();
            resultado = state.executeQuery(_query);
            JOptionPane.showMessageDialog(null, "Operacion Exitosa");
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return resultado;
    }

    public void setQuery(String _query) {

        Statement state = null;

        try {
            state = (Statement) conn.createStatement();
            state.execute(_query);
            JOptionPane.showMessageDialog(null, "Operacion realizada con Exito");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Existe problema al realizar la operación con el  Registro");
            e.printStackTrace();
        }
    }
    
    public void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
