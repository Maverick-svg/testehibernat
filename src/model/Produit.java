package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Transient;

@Entity
@Table(name="produit")
public class Produit {

	@Id
	@GeneratedValue
	private int idProduit;
	@Column(name="n_produit")
	private String nomProduit; 
	
	private String description;
	
	public Produit() {}

	public Produit(int idProduit, String nomProduit, String description) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.description = description;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
