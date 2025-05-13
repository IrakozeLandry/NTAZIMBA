/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boucherientazimba;

public class classEmploye {
    private int idemploye;
    private String nom_employe;
    private  String prenom_employe;
    private int tel_employe;
    private String email_employe;
    private String adresse_employe;
    private String password;


    public classEmploye() {
    }

    public classEmploye(String nom_employe, String prenom_employe, int tel_employe, String email_employe, String adresse_employe, String password) {
        this.nom_employe = nom_employe;
        this.prenom_employe = prenom_employe;
        this.tel_employe = tel_employe;
        this.email_employe = email_employe;
        this.adresse_employe = adresse_employe;
        this.password = password;
    }

    public classEmploye(int idemploye, String nom_employe, String prenom_employe, int tel_employe, String email_employe, String adresse_employe, String password) {
        this.idemploye = idemploye;
        this.nom_employe = nom_employe;
        this.prenom_employe = prenom_employe;
        this.tel_employe = tel_employe;
        this.email_employe = email_employe;
        this.adresse_employe = adresse_employe;
        this.password = password;
    }

       
      
    
    
    public classEmploye(String email_employe, String password) {
        this.email_employe = email_employe;
        this.password = password;
    }

   


    
    
    
    // Getters
    public int getIdemploye() {
        return idemploye ;
          }

    public String getNom_employe() {
        return nom_employe;
         }

    public String getPrenom_employe() {
        return prenom_employe;
         }

    public int getTel_employe() {
        return tel_employe;
         }

    public String getEmail_employe() {
        return email_employe;
         }

    public String getAdresse_employe() {
        return adresse_employe;
         }   

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "classEmploye{" + "idemploye=" + idemploye + ", nom_employe=" + nom_employe + ", prenom_employe=" + prenom_employe + ", tel_employe=" + tel_employe + ", email_employe=" + email_employe + ", adresse_employe=" + adresse_employe + ", password=" + password + '}';
    }

   

   }

