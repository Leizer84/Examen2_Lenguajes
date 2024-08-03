package hn.unah.lenguajes1700.examen2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1700.examen2.models.Cliente;
import hn.unah.lenguajes1700.examen2.repositories.ClientesRepositorio;

@Service
public class ClienteServicio {

    @Autowired
    private ClientesRepositorio clientesRepositorio;

    public List<Cliente> obtenerTodos() {
        return this.clientesRepositorio.findAll();
    }

    public Cliente crearNvoCliente(Cliente nvoCliente) {
        if (!this.clientesRepositorio.existsById(nvoCliente.getDni())) {
            return this.clientesRepositorio.save(nvoCliente);
        }
        return null;
    }

}
