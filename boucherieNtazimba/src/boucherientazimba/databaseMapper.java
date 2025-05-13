/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boucherientazimba;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class databaseMapper {
    private databaseConfig dbc=null;
    private Connection con=null;
    private Statement stmt=null;
    private PreparedStatement pstmt=null;
    private ResultSet rs=null;
    
    public databaseMapper () {
        dbc= new databaseConfig();
        con=dbc.getcon();
        Map<String,Integer> k = new HashMap<>();
        Map<String,Integer> ke= new HashMap<>();
    
    }
    
    
 public int login (classEmploye p){
    String sql="SELECT email_employe,password FROM employe where email_employe=? AND password=?";
    try{
       pstmt=con.prepareStatement(sql);
       pstmt.setString(1, p.getEmail_employe());
       pstmt.setString(2, p.getPassword());
       
       rs=pstmt.executeQuery();
       
       if(rs.next()){
           return 1;
       }
    }catch(SQLException ex){
        System.err.println(ex.getMessage());
    }
    
     
  return 0;   
}   
    
    
//***************operation sur client***********************

    public int addClient (Client p) {
        String req="INSERT INTO Client (nom_client,prenom_client,tel_client,email_client,adresse_client) values (?,?,?,?,?)";
            try{
                pstmt=con.prepareStatement(req);
                pstmt.setString(1, p.getNom_client());
                pstmt.setString(2, p.getPrenom_client());
                pstmt.setInt(3, p.getTel_client());
                pstmt.setString(4, p.getEmail_client());
                pstmt.setString(5, p.getAdresse_client());
                int nlm=pstmt.executeUpdate();
                return nlm;
            }catch(SQLException ex){
                System.err.println(ex.getMessage());
            } 
        return 0;
        }
    //-----------------------------------------------------------------------------------------------------------------------
    
    
    
    ///*************************************************************************************************************************
///******une methode permettant de mise a jour une personne dans la base de donnee***********************************************
       
public int UpdateClient(Client p) {
    String req = "UPDATE Client SET nom_client = ?, prenom_client = ?, tel_client = ?, email_client = ?, adresse_client = ? WHERE idclient = ?";
    try {
        pstmt = con.prepareStatement(req);
        pstmt.setString(1, p.getNom_client());
        pstmt.setString(2, p.getPrenom_client());
        pstmt.setInt(3, p.getTel_client());
        pstmt.setString(4, p.getEmail_client());
        pstmt.setString(5, p.getAdresse_client());
        pstmt.setInt(6, p.getIdclient()); // on suppose que l'objet Personne contient l'ID

        int nlm = pstmt.executeUpdate(); // nombre de lignes modifiées
        return nlm;
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    return 0;
}
    //-----------------------------------------------------------------------------------------------------------------------


///*************************************************************************************************************************
///******une methode permettant de supprimer une personne dans la base de donnee***********************************************
public int deleteClient(int idclient) {
    String req = "DELETE FROM Client WHERE idclient = ?";
    try {
        pstmt = con.prepareStatement(req);
        pstmt.setInt(1, idclient);
        int nlm = pstmt.executeUpdate(); // Nombre de lignes supprimées
        return nlm;
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    return 0;
}

      public List<Client> getClient(){
           List<Client> Client=new ArrayList<>();
           String req="SELECT * FROM  Client ORDER BY idclient ASC";
            try{
                stmt=con.createStatement();
                rs=stmt.executeQuery(req);
                
                while(rs.next()){
                    int idclient=rs.getInt("idclient");
                    String nom_client=rs.getString("nom_client");
                    String prenom_client=rs.getString("prenom_client");
                    int tel_client=rs.getInt("tel_client");
                    String email_client=rs.getString("email_client");
                    String adresse_client=rs.getString("adresse_client");
                    Client p=new Client(idclient,nom_client,prenom_client,tel_client,email_client,adresse_client);
                    Client.add(p);
                }
                
            }catch(SQLException ex){
                System.err.println(ex.getMessage());
            }
            return Client;                
         }
      
           //**************operation sur employe**********************
            
         public int  addclassEmploye ( classEmploye p) {
        String req="INSERT INTO employe (nom_employe,prenom_employe,tel_employe,email_employe,adresse_employe,password) values (?,?,?,?,?,?)";
            try{
                pstmt=con.prepareStatement(req);
                pstmt.setString(1, p.getNom_employe());
                pstmt.setString(2, p.getPrenom_employe());
                pstmt.setInt(3, p.getTel_employe());
                pstmt.setString(4, p.getEmail_employe());
                pstmt.setString(5, p.getAdresse_employe());
                pstmt.setString(6, p.getPassword());
                int nlm=pstmt.executeUpdate();
                return nlm;
            }catch(SQLException ex){
                System.err.println(ex.getMessage());
            } 
        return 0;
        }
    //-----------------------------------------------------------------------------------------------------------------------
    
    
    
    ///*************************************************************************************************************************
///******une methode permettant de mise a jour une personne dans la base de donnee***********************************************
       
   public int UpdateaddclassEmploye(classEmploye p) {
    String req = "UPDATE employe SET nom_employe = ?, prenom_employe = ?, tel_employe = ?, email_employe= ?, adresse_employe = ? WHERE idemploye = ?";
    try {
        pstmt = con.prepareStatement(req);
        pstmt.setString(1, p.getNom_employe());
        pstmt.setString(2, p.getPrenom_employe());
        pstmt.setInt(3, p.getTel_employe());
        pstmt.setString(4, p.getEmail_employe());
        pstmt.setString(5, p.getAdresse_employe());
        pstmt.setInt(6, p.getIdemploye()); // on suppose que l'objet Personne contient l'ID

        int nlm = pstmt.executeUpdate(); // nombre de lignes modifiées
        return nlm;
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    return 0;
}
    //-----------------------------------------------------------------------------------------------------------------------


///*************************************************************************************************************************
///******une methode permettant de supprimer une personne dans la base de donnee***********************************************
public int deleteaddclassEmploye(int idemploye) {
    String req = "DELETE FROM employe WHERE idemploye = ?";
    try {
        pstmt = con.prepareStatement(req);
        pstmt.setInt(1, idemploye);
        int nlm = pstmt.executeUpdate(); // Nombre de lignes supprimées
        return nlm;
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    return 0;
}

      public List<classEmploye> getclassEmploye(){
           List<classEmploye> employe=new ArrayList<>();
           String req="SELECT * FROM  employe ORDER BY idemploye ASC";
            try{
                stmt=con.createStatement();
                rs=stmt.executeQuery(req);
                
                while(rs.next()){
                    int idemploye=rs.getInt("idemploye");
                    String nom_employe=rs.getString("nom_employe");
                    String prenom_employe=rs.getString("prenom_employe");
                    int tel_employe=rs.getInt("tel_employe");
                    String email_employe=rs.getString("email_employe");
                    String adresse_employe=rs.getString("adresse_employe");
                     String password=rs.getString("password");
                    classEmploye p=new classEmploye (idemploye,nom_employe,prenom_employe,tel_employe,email_employe,adresse_employe,password);
                    employe.add(p);
                }
                
            }catch(SQLException ex){
                System.err.println(ex.getMessage());
            }
            return employe ;                
         }
      
          
          //********************operation sur utilisateur************************************
      
           //**************operation sur employe**********************
            
         public int  addfournisseur ( fournisseur p) {
        String req="INSERT INTO fournisseur (nom_fournisseur,prenom_fournisseur,tel_fournisseur,email_fournisseur,adresse_fournisseur) values (?,?,?,?,?)";
            try{
                pstmt=con.prepareStatement(req);
                pstmt.setString(1, p.getNom_fournisseur());
                pstmt.setString(2, p.getPrenom_fournisseur());
                pstmt.setInt(3, p.getTel_fournisseur());
                pstmt.setString(4, p.getEmail_fournisseur());
                pstmt.setString(5, p.getAdresse_fournisseur());
                int nlm=pstmt.executeUpdate();
                return nlm;
            }catch(SQLException ex){
                System.err.println(ex.getMessage());
            } 
        return 0;
        }
    //-----------------------------------------------------------------------------------------------------------------------
    
    
    
    ///*************************************************************************************************************************
///******une methode permettant de mise a jour une personne dans la base de donnee***********************************************
       
   public int Updatefournisseur(fournisseur p) {
    String req = "UPDATE fournisseur SET nom_fournisseur = ?, prenom_fournisseur = ?, tel_fournisseur = ?, email_fournisseur = ?, adresse_fournisseur = ? WHERE idfournisseur = ?";
    try {
        pstmt = con.prepareStatement(req);
        pstmt.setString(1, p.getNom_fournisseur());
        pstmt.setString(2, p.getPrenom_fournisseur());
        pstmt.setInt(3, p.getTel_fournisseur());
        pstmt.setString(4, p.getEmail_fournisseur());
        pstmt.setString(5, p.getAdresse_fournisseur());
        pstmt.setInt(6, p.getIdfournisseur()); // on suppose que l'objet Personne contient l'ID

        int nlm = pstmt.executeUpdate(); // nombre de lignes modifiées
        return nlm;
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    return 0;
}
    //-----------------------------------------------------------------------------------------------------------------------


///*************************************************************************************************************************
///******une methode permettant de supprimer une personne dans la base de donnee***********************************************
public int deletefournisseur(int idfournisseur) {
    String req = "DELETE FROM fournisseur WHERE idfournisseur = ?";
    try {
        pstmt = con.prepareStatement(req);
        pstmt.setInt(1, idfournisseur);
        int nlm = pstmt.executeUpdate(); // Nombre de lignes supprimées
        return nlm;
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    return 0;
}

      public List<fournisseur> getFournisseur(){
           List<fournisseur> Fournisseur=new ArrayList<>();
           String req="SELECT * FROM fournisseur  ORDER BY idfournisseur ASC";
            try{
                stmt=con.createStatement();
                rs=stmt.executeQuery(req);
                
                while(rs.next()){
                    int idfournisseur=rs.getInt("idfournisseur");
                    String nom_fournisseur=rs.getString("nom_fournisseur");
                    String prenom_fournisseur=rs.getString("prenom_fournisseur");
                    int tel_fournisseur=rs.getInt("tel_fournisseur");
                    String email_fournisseur=rs.getString("email_fournisseur");
                    String adresse_fournisseur=rs.getString("adresse_fournisseur");
                    fournisseur p=new fournisseur(idfournisseur,nom_fournisseur,prenom_fournisseur,tel_fournisseur,email_fournisseur,adresse_fournisseur);
                    Fournisseur.add(p);
                }
                
            }catch(SQLException ex){
                System.err.println(ex.getMessage());
            }
            return Fournisseur;    
         }
           
      
      
            public int addproduit (produit p) {
        String req="INSERT INTO produit (nom_produit,type_produit,prixunitaire_produit,quantite_produit,prixtotal_produit) values (?,?,?,?,?)";
            try{
                pstmt=con.prepareStatement(req);
                pstmt.setString(1, p.getNom_produit());
                pstmt.setString(2, p.getType_produit());
                pstmt.setInt(3, p.getPrixunitaire_produit());
                pstmt.setInt(4, p.getQuantite_produit());
                pstmt.setInt(5, p.getPrixtotal_produit());
                int nlm=pstmt.executeUpdate();
                return nlm;
            }catch(SQLException ex){
                System.err.println(ex.getMessage());
            } 
        return 0;
        }
          
            public int Updateproduit(produit p) {
    String req = "UPDATE produit SET nom_produit = ?, type_produit = ?  prixunitaire_produit = ?, quantite_produit = ? prixtotal_produit = ? WHERE idproduit = ?";
    try {
        pstmt = con.prepareStatement(req);
        pstmt.setString(1, p.getNom_produit());
        pstmt.setString(2, p.getType_produit());
        pstmt.setInt(3, p.getPrixunitaire_produit());
        pstmt.setInt(4, p.getQuantite_produit());
        pstmt.setInt(5, p.getPrixtotal_produit());
        pstmt.setInt(6, p.getIdproduit()); // on suppose que l'objet Personne contient l'ID

        int nlm = pstmt.executeUpdate(); // nombre de lignes modifiées
        return nlm;
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    return 0;
}

    
            public int deleteproduit(int idproduit) {
    String req = "DELETE FROM produit WHERE idproduit = ?";
    try {
        pstmt = con.prepareStatement(req);
        pstmt.setInt(1, idproduit);
        int nlm = pstmt.executeUpdate(); // Nombre de lignes supprimées
        return nlm;
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    return 0;
}
    
     public List<produit> getProduit(){
           List<produit> PRODUIT=new ArrayList<>();
           String req="SELECT * FROM  produit ORDER BY idproduit ASC";
            try{
                stmt=con.createStatement();
                rs=stmt.executeQuery(req);
                
                while(rs.next()){
                    int idproduit=rs.getInt("idproduit");
                    String nom_produit=rs.getString("nom_produit");
                    String type_produit=rs.getString("type_produit");
                    int quantite_produit=rs.getInt("quantite_produit");
                    int prixunitaire_produit=rs.getInt("prixunitaire_produit");
                    int prixtotal_produit=rs.getInt("prixtotal_produit");
                    produit p=new produit (idproduit,nom_produit,type_produit,prixunitaire_produit,quantite_produit,prixtotal_produit);
                    PRODUIT.add(p);
                }
                
            }catch(SQLException ex){
                System.err.println(ex.getMessage());
            }
            return PRODUIT ;                
         }
         
          public int addfonction (fonction p) {
        String req="INSERT INTO fonction (nom_fonction) values (?)";
            try{
                pstmt=con.prepareStatement(req);
                pstmt.setString(1, p.getNom_fonction());
               
                int nlm=pstmt.executeUpdate();
                return nlm;
            }catch(SQLException ex){
                System.err.println(ex.getMessage());
            } 
        return 0;
        }
          public int Updatefonction(fonction p) {
    String req = "UPDATE fonction SET nom_fonction = ? WHERE idfonction = ?";
    try {
        pstmt = con.prepareStatement(req);
        pstmt.setString(1, p.getNom_fonction());
        pstmt.setInt(2, p.getIdfonction());
        // on suppose que l'objet Personne contient l'ID

        int nlm = pstmt.executeUpdate(); // nombre de lignes modifiées
        return nlm;
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    return 0;
}

          public int deletefonction(int idfonction) {
    String req = "DELETE FROM fonction WHERE idfonction = ?";
    try {
        pstmt = con.prepareStatement(req);
        pstmt.setInt(1, idfonction);
        int nlm = pstmt.executeUpdate(); // Nombre de lignes supprimées
        return nlm;
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    return 0;
}
   
          public List<fonction> getfonction(){
           List<fonction> fonctions=new ArrayList<>();
           String req="SELECT * FROM  fonction ORDER BY idfonction ASC";
            try{
                stmt=con.createStatement();
                rs=stmt.executeQuery(req);
                
                while(rs.next()){
                    int idfonction=rs.getInt("idfonction");
                    String nom_fonction=rs.getString("nom_fonction");
                    fonction p=new fonction(idfonction,nom_fonction);
                    fonctions.add(p);
                }
                
            }catch(SQLException ex){
                System.err.println(ex.getMessage());
            }
            return fonctions;                
         }
          
          
      
    }  

    

