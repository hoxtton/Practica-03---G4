package com.practica01.dao;

import com.practica01.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author horac
 */
public interface ArbolDAO extends JpaRepository <Arbol, Long> {
    
}
