
package boucherientazimba;

public class produit {
  private int id_produit;
   private String nom_produit;
   private String type_produit;
   private String pu_produit;
   private String quantite_produit;
   
}
 public produit() {

}
  
  public produit(int id_produit,String nom_produit,String type_produit,String pu_produit,String quantite_produit) {

   this.id_produit=id_produit;
   this.nom_produit=nom_produit;
   this.type_produit=type_produit;
   this.pu_produit=pu_produit;
   this.quantite_produit=quantite_produit;

 }
    public int getId_produit() {
    
    return id_produit;

}
   
  public String getNom_produit() {
   
  return nom_produit;

}
   public String getType_produit() {
    
    return type_produit;
}
   public String getPu_produit() {
   
  return pu_produit;
}
   public String getQuantite_produit() {
      
    return quantite_produit;
}
