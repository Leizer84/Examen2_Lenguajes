package hn.unah.lenguajes1700.examen2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes1700.examen2.models.Prestamos;

public interface PrestamosRepositorio extends JpaRepository<Prestamos, Long> {

}
