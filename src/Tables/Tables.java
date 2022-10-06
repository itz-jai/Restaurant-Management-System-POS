/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Tables {
    public static void main(String[] args)  {
   
        try {
            Connection conn=getcon();
             Statement st=conn.createStatement();

      
             st.executeUpdate("create table menu(Item_Id varchar(7),Item_Name varchar(30),Price int); ");
             st.executeUpdate("create table orders(Order_Id varchar(10),Date varchar(15),Time varchar(15),Customer_Name varchar(50),Type_Of_Order varchar(15),Membership varchar(10),Home_Delivery varchar(5),Tax varchar(10),Sub_Total varchar(10),Tax_Charge varchar(10),H_D_Charge varchar(10),Discount varchar(10),Grand_Total varchar(10)); ");
             st.executeUpdate("create table ordered_items(Order_Id varchar(10),Item_Id varchar(10),Item_Name varchar(30),Price int,Qty int,Amount int); ");
             st.executeUpdate("create table feedback(Name varchar(50),Email varchar(50),Phone varchar(10),Subject varchar(50),Message varchar(100)); ");
       
        } catch (Exception e) {
        }
    }
    public static Connection getcon() throws Exception{
        try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rms","root","jai12345");
             return con;
              } catch (SQLException e) {
    }
                return null;
    }
}
