package co.edu.uniquindio.estructuras.generictaller;

import java.util.ArrayList;
import java.util.Iterator;

public class Conjunto<T> implements Iterable<T> {

	private ArrayList<T> lista;

	public Conjunto() {
		this.lista = new ArrayList<>();
	}

	public boolean verificarElemento(T e) {
		return lista.contains(e);
	}

	public boolean agregarElemento(T e) {
		return lista.add(e);
	}

	public boolean eliminarElemento(T e) {
		return lista.remove(e);
	}

	public String mostrarElementos() {
		return lista.toString();
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterador<T>(lista);
	}

	public boolean verificarContencion(Conjunto<T> subconjunto) {
		Iterator<T> iterator = subconjunto.iterator();
		while (iterator.hasNext())
			if (!verificarElemento(iterator.next()))
				return false;
		return true;
	}

	public void unirConjuntos(Conjunto<T> conjunto) {
		Iterator<T> iterator = conjunto.iterator();
		while (iterator.hasNext())
			agregarElemento(iterator.next());

	}

}
