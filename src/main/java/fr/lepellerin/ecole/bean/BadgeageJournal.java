package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the badgeage_journal database table.
 * 
 */
@Entity
@Table(name = "badgeage_journal")
public class BadgeageJournal implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDaction;

  @Lob
  private String action;

  private String date;

  private String heure;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individus;

  @Lob
  private String individu;

  @Lob
  private String resultat;

  public BadgeageJournal() {
  }

  public int getIDaction() {
    return this.IDaction;
  }

  public void setIDaction(int IDaction) {
    this.IDaction = IDaction;
  }

  public String getAction() {
    return this.action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getHeure() {
    return this.heure;
  }

  public void setHeure(String heure) {
    this.heure = heure;
  }

  public Individu getIndividus() {
    return individus;
  }

  public void setIndividus(Individu individus) {
    this.individus = individus;
  }

  public String getIndividu() {
    return this.individu;
  }

  public void setIndividu(String individu) {
    this.individu = individu;
  }

  public String getResultat() {
    return this.resultat;
  }

  public void setResultat(String resultat) {
    this.resultat = resultat;
  }

}