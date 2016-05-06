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
 * The persistent class for the pes_pieces database table.
 * 
 */
@Entity
@Table(name = "pes_pieces")

public class PesPiece implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDpiece;

  @ManyToOne
  @JoinColumn(name = "IDfacture")
  private Facture facture;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDlot")
  private PesLot lot;

  @Lob
  private String libelle;

  private double montant;

  private int numero;

  private int prelevement;

  @Column(name = "prelevement_bic")
  private String prelevementBic;

  @Column(name = "prelevement_date_mandat")
  private String prelevementDateMandat;

  @Column(name = "prelevement_iban")
  private String prelevementIban;

  private int prelevement_IDmandat;

  @Lob
  @Column(name = "prelevement_rum")
  private String prelevementRum;

  @Column(name = "prelevement_sequence")
  private String prelevementSequence;

  @Column(name = "prelevement_statut")
  private String prelevementStatut;

  @Lob
  @Column(name = "prelevement_titulaire")
  private String prelevementTitulaire;

  @Column(name = "titulaire_helios")
  private int titulaireHelios;

  @Lob
  private String type;

  public PesPiece() {
  }

  public int getIDpiece() {
    return this.IDpiece;
  }

  public void setIDpiece(int IDpiece) {
    this.IDpiece = IDpiece;
  }

  public Facture getFacture() {
    return facture;
  }

  public void setFacture(Facture facture) {
    this.facture = facture;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(Famille famille) {
    this.famille = famille;
  }

  public PesLot getLot() {
    return lot;
  }

  public void setLot(PesLot lot) {
    this.lot = lot;
  }

  public String getLibelle() {
    return this.libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public double getMontant() {
    return this.montant;
  }

  public void setMontant(double montant) {
    this.montant = montant;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getPrelevement() {
    return this.prelevement;
  }

  public void setPrelevement(int prelevement) {
    this.prelevement = prelevement;
  }

  public String getPrelevementBic() {
    return this.prelevementBic;
  }

  public void setPrelevementBic(String prelevementBic) {
    this.prelevementBic = prelevementBic;
  }

  public String getPrelevementDateMandat() {
    return this.prelevementDateMandat;
  }

  public void setPrelevementDateMandat(String prelevementDateMandat) {
    this.prelevementDateMandat = prelevementDateMandat;
  }

  public String getPrelevementIban() {
    return this.prelevementIban;
  }

  public void setPrelevementIban(String prelevementIban) {
    this.prelevementIban = prelevementIban;
  }

  public int getPrelevement_IDmandat() {
    return this.prelevement_IDmandat;
  }

  public void setPrelevement_IDmandat(int prelevement_IDmandat) {
    this.prelevement_IDmandat = prelevement_IDmandat;
  }

  public String getPrelevementRum() {
    return this.prelevementRum;
  }

  public void setPrelevementRum(String prelevementRum) {
    this.prelevementRum = prelevementRum;
  }

  public String getPrelevementSequence() {
    return this.prelevementSequence;
  }

  public void setPrelevementSequence(String prelevementSequence) {
    this.prelevementSequence = prelevementSequence;
  }

  public String getPrelevementStatut() {
    return this.prelevementStatut;
  }

  public void setPrelevementStatut(String prelevementStatut) {
    this.prelevementStatut = prelevementStatut;
  }

  public String getPrelevementTitulaire() {
    return this.prelevementTitulaire;
  }

  public void setPrelevementTitulaire(String prelevementTitulaire) {
    this.prelevementTitulaire = prelevementTitulaire;
  }

  public int getTitulaireHelios() {
    return this.titulaireHelios;
  }

  public void setTitulaireHelios(int titulaireHelios) {
    this.titulaireHelios = titulaireHelios;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}