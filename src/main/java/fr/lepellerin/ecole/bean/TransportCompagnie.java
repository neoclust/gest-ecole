package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the transports_compagnies database table.
 * 
 */
@Entity
@Table(name = "transports_compagnies")

public class TransportCompagnie implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcompagnie;

  private String categorie;

  private String cp;

  private String fax;

  private String mail;

  @Lob
  private String nom;

  private String rue;

  private String tel;

  private String ville;

  public TransportCompagnie() {
  }

  public int getIDcompagnie() {
    return this.IDcompagnie;
  }

  public void setIDcompagnie(int IDcompagnie) {
    this.IDcompagnie = IDcompagnie;
  }

  public String getCategorie() {
    return this.categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }

  public String getCp() {
    return this.cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public String getFax() {
    return this.fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getMail() {
    return this.mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getRue() {
    return this.rue;
  }

  public void setRue(String rue) {
    this.rue = rue;
  }

  public String getTel() {
    return this.tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getVille() {
    return this.ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

}