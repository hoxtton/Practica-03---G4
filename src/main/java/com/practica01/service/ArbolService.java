package com.practica01.service;

import com.practica01.domain.Arbol;
import java.util.List;

/**
 *
 * @author horac
 */
public interface ArbolService {

    public List<Arbol> getArboles(boolean vivo);

    // Se obtiene un árbol, a partir del número del árbol
    public Arbol getArbol(Arbol arbol);

    // Se inserta un nuevo árbol si el id del árbol esta vacío
    // Se actualiza un árbol si el id del árbol NO esta vacío
    public void save(Arbol arbol);

    // Se elimina el árbol que tiene el id pasado por parámetro
    public void delete(Arbol arbol);
}
