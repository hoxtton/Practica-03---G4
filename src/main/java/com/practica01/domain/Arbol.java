package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author horac
 */
@Data
@Entity
@Table(name = "arbol")
public class Arbol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero")
    private Long numArbol;
    private String nombreArbol;
    private String tipoFlor;
    private int durezaArbol;
    private String rutaImagen;
    private boolean vivo;

    public Arbol() {
    }

    public Arbol(String nombreArbol, boolean vivo) {
        this.nombreArbol = nombreArbol;
        this.vivo = vivo;
    }

}
