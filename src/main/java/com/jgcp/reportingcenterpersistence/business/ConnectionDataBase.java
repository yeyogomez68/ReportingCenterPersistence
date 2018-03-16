/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgcp.reportingcenterpersistence.business;


import com.jgcp.reportingcenterpersistence.utils.ObjectConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author jeisson.gomez
 */
public class ConnectionDataBase {     
    
    public static Connection conn = null;
    public static ObjectConnection objCon = new ObjectConnection();     
    
    public static Connection getConnectionDataBase(){        
        if(conn==null){
            try {
                if(objCon==null){
                    //Se obtiene la cadena de conexion de base de datos.
                }
                conn = DriverManager.getConnection(objCon.getUrl(), objCon.getUser(), objCon.getPassword());
                Statement st = conn.createStatement();
            } catch (SQLException e) {
               e.printStackTrace();  
            }
        }
        return conn;
    }
}