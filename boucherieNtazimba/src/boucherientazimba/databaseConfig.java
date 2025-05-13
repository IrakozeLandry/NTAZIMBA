/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boucherientazimba;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;


public class databaseConfig {
    
     private Connection con=null;
        private String url="jdbc:mysql://localhost:3306/boucherientazimba";
        private final String username="root";
        private final String password="";

        public databaseConfig  (){
            try{
                con=DriverManager.getConnection(url,username,password);
            }catch(SQLException ex){
                System.err.println(ex.getMessage());
            }
        }
        /**
         *
         * @return
         */
              public Connection getcon(){
                  return con;
              }


        }
   


