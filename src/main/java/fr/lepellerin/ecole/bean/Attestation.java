package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the attestations database table.
 * 
 */
@Entity
@Table(name = "attestations")
public class Attestation implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDattestation;

  @Lob
  private String activites;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_edition")
  private String dateEdition;

  @Column(name = "date_fin")
  private String dateFin;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDutilisateur")
  private Utilisateur utilisateur;

  @Lob
  private String individus;

  private int numero;

  private double regle;

  private double solde;

  private double total;

  public Attestation() {
  }

  public int getIDattestation() {
    return this.IDattestation;
  }

  public void setIDattestation(int IDattestation) {
    this.IDattestation = IDattestation;
  }

  public String getActivites() {
    return this.activites;
  }

  public void setActivites(String activites) {
    this.activites = activites;
  }

  public String getDateDebut() {
    return this.dateDebut;
  }

  public void setDateDebut(String dateDebut) {
    this.dateDebut = dateDebut;
  }

  public String getDateEdition() {
    return this.dateEdition;
  }

  public void setDateEdition(String dateEdition) {
    this.dateEdition = dateEdition;
  }

  public String getDateFin() {
    return this.dateFin;
  }

  public void setDateFin(String dateFin) {
    this.dateFin = dateFin;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(Famille famille) {
    this.famille = famille;
  }

  public Utilisateur getUtilisateur() {
    return utilisateur;
  }

  public void setUtilisateur(Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
  }

  public String getIndividus() {
    return this.individus;
  }

  public void setIndividus(String individus) {
    this.individus = individus;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public double getRegle() {
    return this.regle;
  }

  public void setRegle(double regle) {
    this.regle = regle;
  }

  public double getSolde() {
    return this.solde;
  }

  public void setSolde(double solde) {
    this.solde = solde;
  }

  public double getTotal() {
    return this.total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

}