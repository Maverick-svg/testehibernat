package dao;

import model.Produit;

public interface IProduitDAO {

	public int creat(Produit pr) ;
	
	public int supr(int id);
}
