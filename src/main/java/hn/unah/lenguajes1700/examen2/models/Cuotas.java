package hn.unah.lenguajes1700.examen2.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuotas")
@Data
public class Cuotas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoCuota")
    private long codigoCuota;

    private long mes;

    private double interes;

    private double capital;

    private double saldo;

    @OneToMany(mappedBy = "cuotas")
    private Prestamos prestamos;

}
