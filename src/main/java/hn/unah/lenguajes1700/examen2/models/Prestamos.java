package hn.unah.lenguajes1700.examen2.models;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "prestamos")
@Data
public class Prestamos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoPrestamo")
    private long codigoPrestamo;

    @Column(name = "fechaApertura")
    private Date fechaApertura;

    private Double monto;

    private Double cuota;

    private Integer plazo;

    @OneToMany(mappedBy = "prestamos", cascade = CascadeType.ALL)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "codigoPrestamo")
    private Cuotas cuotas;

}
