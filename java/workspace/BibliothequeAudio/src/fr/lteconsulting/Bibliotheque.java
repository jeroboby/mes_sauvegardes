package fr.lteconsulting;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque
{
	private List<Disque> disques;

	public Bibliotheque()
	{
		disques = new ArrayList<>();
	}

	public void ajouterDisque( Disque disque )
	{
		disques.add( disque );
	}

	public Disque getDisque( String codeBarre )
	{
		for( Disque disque : disques )
		{
			String codeBarreDisque = disque.getCodeBarre();
			if( codeBarreDisque.equals( codeBarre ) )
				return disque;
		}

		return null;
	}

	public void afficherDisques()
	{
		System.out.println( "Liste des disques de la bibliothèque" );
		System.out.println( "Il y a " + disques.size() + " disque(s)" );

		for( Disque disque : disques )
			disque.afficher();
	}

	public List<Disque> getDisques()
	{
		return disques;
	}
}
