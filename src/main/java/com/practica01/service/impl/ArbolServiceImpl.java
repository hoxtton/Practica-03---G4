package com.practica01.service.impl;

import com.practica01.dao.ArbolDAO;
import com.practica01.domain.Arbol;
import com.practica01.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author horac
 */
@Service
public class ArbolServiceImpl implements ArbolService {

    @Autowired
    private ArbolDAO arbolDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Arbol> getArboles(boolean vivos) {
        var lista = arbolDAO.findAll();
        if (vivos) {
            lista.removeIf(e -> !e.isVivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Arbol getArbol(Arbol arbol) {
        return arbolDAO.findById(arbol.getNumArbol()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Arbol arbol) {
        arbolDAO.save(arbol);
    }

    @Override
    @Transactional
    public void delete(Arbol arbol) {
        arbolDAO.delete(arbol);
    }

}
