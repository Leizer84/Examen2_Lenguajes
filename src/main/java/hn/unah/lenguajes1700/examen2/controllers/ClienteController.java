package hn.unah.lenguajes1700.examen2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1700.examen2.models.Cliente;
import hn.unah.lenguajes1700.examen2.services.ClienteServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping("/obtener/clientes")
    public List<Cliente> obtenerTodos() {
        return this.clienteServicio.obtenerTodos();
    }

    @PostMapping("/crear/clientes")
    public Cliente crearNvoCliente(@RequestBody Cliente nvoCliente) {
        return this.clienteServicio.crearNvoCliente(nvoCliente);

    }

}
