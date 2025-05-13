/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boucherientazimba;

public class fournisseur {
    private int idfournisseur;
    private String nom_fournisseur;
    private  String prenom_fournisseur;
    private int tel_fournisseur;
    private String email_fournisseur;
    private String adresse_fournisseur;

   
    // Constructeur
    public fournisseur (int idfournisseur, String nom_fournisseur, String prenom_fournisseur, int tel_fournisseur, String email_fournisseur, String adresse_fournisseur) {
        this.idfournisseur = idfournisseur;
        this.nom_fournisseur = nom_fournisseur;
        this.prenom_fournisseur = prenom_fournisseur;
        this.tel_fournisseur = tel_fournisseur;
        this.email_fournisseur = email_fournisseur;
        this.adresse_fournisseur= adresse_fournisseur;
    }
    
    
       public fournisseur ( String nom_fournisseur, String prenom_fournisseur, int tel_fournisseur, String email_fournisseur, String adresse_fournisseur) {
       
        this.nom_fournisseur = nom_fournisseur;
        this.prenom_fournisseur = prenom_fournisseur;
        this.tel_fournisseur = tel_fournisseur;
        this.email_fournisseur = email_fournisseur;
        this.adresse_fournisseur= adresse_fournisseur;
    }

    // Getters
    public int getIdfournisseur() {
        return idfournisseur;
    }

    public String getNom_fournisseur() {
        return nom_fournisseur;
    }

    public String getPrenom_fournisseur() {
        return prenom_fournisseur;
    }

    public int getTel_fournisseur() {
        return tel_fournisseur;
    }

    public String getEmail_fournisseur() {
        return email_fournisseur;
    }

    public String getAdresse_fournisseur() {
        return adresse_fournisseur;
    }

    @Override
    public String toString() {
        return "fournisseur{" + "idfournisseur=" + idfournisseur + ", nom_fournisseur=" + nom_fournisseur + ", prenom_fournisseur=" + prenom_fournisseur + ", tel_fournisseur=" + tel_fournisseur + ", email_fournisseur=" + email_fournisseur + ", adresse_fournisseur=" + adresse_fournisseur + '}';
    }

   
    
    
    
}
         