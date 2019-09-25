
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class product {
  String forname=  "com.mysql.jdbc.Driver";
   String driver = "jdbc:mysql://localhost/bsit23";
   String us = "root";
   String ps1 ="";
    
    
    public int addproductadd(String product,int quantity,float price){
        int x=0;
        String sql="insert into product values(null,?,?,?)";//query that inserted into your table name product
        
        try{
            Class.forName(forname);
            Connection con = DriverManager.getConnection(driver,us,ps1);
            PreparedStatement ps = con.prepareStatement(sql); 
            ps.setString(1, product);
            ps.setInt(2, quantity);
            ps.setFloat(3, price);
           x= ps.executeUpdate();
            
            
        } catch (ClassNotFoundException ex) {
          Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
          Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
      }
        
        
        
        
        
    return x;    
    }
    
    
}
