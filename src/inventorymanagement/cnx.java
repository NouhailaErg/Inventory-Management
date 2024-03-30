/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class cnx {
    private final String User = "u310064717_nouhatest";
    private final String password = "Nouha2001";
    String ipLocal = "127.0.0.1";
    public static String name="" , pass="",dept="";
    private String url ="jdbc:mysql://sql507.main-hosting.eu:3306/u310064717_nouha";
    private Connection cnx = null;
    private PreparedStatement st , jt;
    private ResultSet rst;
    
    public void ConnexionIntoDataBase() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver OK");
            try {
                cnx = (Connection) DriverManager.getConnection(url, User, password);
                System.out.println("successful connexion");
            } catch (SQLException ex) {
                Logger.getLogger(cnx.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, " erreur connexion activer le serveur ou verifier "
                        + "\nle configuration de  serveur");

            } finally {
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cnx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

}
