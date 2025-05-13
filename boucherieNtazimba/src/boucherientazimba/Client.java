
package boucherientazimba;

public class Client {
    private int idclient;
    private String nom_client;
    private  String prenom_client;
    private int tel_client;
    private String email_client;
    private String adresse_client;
    
  // Constructeur
    public Client (int idclient, String nom_client, String prenom_client, int tel_client, String email_client, String adresse_client) {
        this.idclient = idclient;
        this.nom_client = nom_client;
        this.prenom_client = prenom_client;
        this.tel_client = tel_client;
        this.email_client = email_client;
        this.adresse_client = adresse_client;
    }

      public Client ( String nom_client, String prenom_client, int tel_client, String email_client, String adresse_client) {
       
        this.nom_client = nom_client;
        this.prenom_client = prenom_client;
        this.tel_client = tel_client;
        this.email_client = email_client;
        this.adresse_client = adresse_client;
    }

   

    // Getters
    public int getIdclient() {
        return idclient;
    }

    public String getNom_client() {
        return nom_client ;
    }

    public String getPrenom_client() {
        return prenom_client;
    }

    public int getTel_client() {
        return tel_client;
    }

    public String getEmail_client() {
        return email_client ;
    }

    public String getAdresse_client() {
        return adresse_client;
    }

    @Override
    public String toString() {
        return "Client{" + "idclient=" + idclient + ", nom_client=" + nom_client + ", prenom_client=" + prenom_client + ", tel_client=" + tel_client + ", email_client=" + email_client + ", adresse_client=" + adresse_client + '}';
    }

    
    

    
    
}