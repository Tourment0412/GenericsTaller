package co.edu.uniquindio.estructuras.generictaller;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterador<T> implements Iterator<T> {

	private ArrayList<T> lista;
	//Puede llegar a ser -1 para que cuando se haga el primer next se devuelva el elemento 0
	private int index=-1;

	public Iterador(ArrayList<T> lista) {
		this.lista = lista;
	}

	@Override
	public boolean hasNext() {
		return index < lista.size();
	}

	@Override
	public T next() {
		try {
			return lista.get(index++);
		} catch (Exception e) {
			throw new RuntimeException("Ey bro no hay siguiente");
		}
		
	}

}
