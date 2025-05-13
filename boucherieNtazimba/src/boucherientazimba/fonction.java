/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boucherientazimba;

  public class fonction {
    
   private int idfonction;
   private String nom_fonction;
 
   
   
   
   
   public fonction(int idfonction,String nom_fonction) {
       
       this.idfonction=idfonction;
       this.nom_fonction=nom_fonction;
      
   }

    
   
      
      
   public int getIdfonction(){
       
       return idfonction;
   }
       public String getNom_fonction(){
           
           return nom_fonction;
       }
         
    @Override
    public String toString() {
        return "fonction{" + "idfonction=" + idfonction + ", nom_fonction=" + nom_fonction + '}';
    }
       
       
  }
