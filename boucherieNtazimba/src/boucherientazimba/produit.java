
package boucherientazimba;

public class produit {
  private int idproduit;
   private String nom_produit;
   private String type_produit;
   private int prixunitaire_produit;
   private int quantite_produit;
   private int prixtotal_produit;

    public produit(String nom_produit, String type_produit, int prixunitaire_produit, int quantite_produit, int prixtotal_produit) {
        this.nom_produit = nom_produit;
        this.type_produit = type_produit;
        this.prixunitaire_produit = prixunitaire_produit;
        this.quantite_produit = quantite_produit;
        this.prixtotal_produit = prixtotal_produit;
    }

    public produit(int idproduit, String nom_produit, String type_produit, int prixunitaire_produit, int quantite_produit) {
        this.idproduit = idproduit;
        this.nom_produit = nom_produit;
        this.type_produit = type_produit;
        this.prixunitaire_produit = prixunitaire_produit;
        this.quantite_produit = quantite_produit;
    }

    public produit(int idproduit, String nom_produit, String type_produit, int prixunitaire_produit, int quantite_produit, int prixtotal_produit) {
        this.idproduit = idproduit;
        this.nom_produit = nom_produit;
        this.type_produit = type_produit;
        this.prixunitaire_produit = prixunitaire_produit;
        this.quantite_produit = quantite_produit;
        this.prixtotal_produit = prixtotal_produit;
    }
   
      
    
  
  

    public produit(int prixtotal_produit) {
        this.prixtotal_produit = prixtotal_produit;
    }
  
  
  
  
    public int getIdproduit() {
    
    return idproduit;

}
   
  public String getNom_produit() {
   
  return nom_produit;

}
   public String getType_produit() {
    
    return type_produit;
}
   public int getPrixunitaire_produit() {
   
  return prixunitaire_produit;
}
   public int getQuantite_produit() {
      
    return quantite_produit;
}
   
   public int getPrixtotal_produit() {
       
       return prixtotal_produit;
   }

    @Override
    public String toString() {
        return "produit{" + "idproduit=" + idproduit + ", nom_produit=" + nom_produit + ", type_produit=" + type_produit + ", prixunitaire_produit=" + prixunitaire_produit + ", quantite_produit=" + quantite_produit + ", prixtotal_produit=" + prixtotal_produit + '}';
    }

    
   
}
