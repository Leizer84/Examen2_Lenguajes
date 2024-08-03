package hn.unah.lenguajes1700.examen2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1700.examen2.models.Prestamos;
import hn.unah.lenguajes1700.examen2.repositories.PrestamosRepositorio;

@Service
public class PrestamosServicio {

    @Autowired
    private PrestamosRepositorio prestamosRepositorio;

    public boolean buscarPorCodigo(long codigoPrestamo) {
        return this.prestamosRepositorio.existsById(codigoPrestamo);
    }
    /*
     * public Prestamos crearPrestamos(long codigoPrestamo, Prestamos nvoPrestamos)
     * {
     * if (this.prestamosRepositorio.existsById(codigoPrestamo)) {
     * 
     * }
     * 
     * return null;
     * }
     */

}
