package co.edu.uniquindio.estructuras.generictaller;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterador<T> implements Iterator<T> {

	private ArrayList<T> lista;
	private int index;

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
