/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pablo
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
  com.mysql.jdbc.Connection conn = null;
  private final String DB_NAME = "icave";
  private final String DB_URL = "jdbc:mysql://localhost:3306/";
  private final String DB_USER = "root";
  private final String DB_PASSWORD = "";
  
    
    public com.mysql.jdbc.Connection conectar(){
        try{
            
            Class.forName("org.gjt.mm.mysql.Driver");
        conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(DB_URL + DB_NAME, DB_USER, DB_PASSWORD);
        System.out.println("Ya esta...");
        }catch (Exception ex){
        System.out.println("Error"+ex);
        }
        return conn;
    }
    public com.mysql.jdbc.Connection CerrarConexion(){
        try{
            conn.close();
            System.out.println("Cerrando conexion...");
        }catch(SQLException ex){
        System.out.println(ex);}
        conn = null;
        return conn;
    }
    
}
