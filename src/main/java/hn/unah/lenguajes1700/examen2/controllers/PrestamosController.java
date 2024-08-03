package hn.unah.lenguajes1700.examen2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import hn.unah.lenguajes1700.examen2.models.Prestamos;
import hn.unah.lenguajes1700.examen2.services.PrestamosServicio;

@RequestMapping("/api/prestamos")
public class PrestamosController {

    @Autowired
    private PrestamosServicio prestamosServicio;

    @GetMapping("/{id}")
    public boolean buscarPorCodigo(@PathVariable long codigoPrestamo) {
        return this.prestamosServicio.buscarPorCodigo(codigoPrestamo);
    }

    /*
     * @RequestMapping("/api/cliente")
     * public class ClienteController {
     * 
     * @Autowired
     * private ClienteServicio clienteServicio;
     * 
     * @GetMapping("/obtener/clientes")
     * public List<Cliente> obtenerTodos() {
     * return this.clienteServicio.obtenerTodos();
     * }
     * 
     * @PostMapping("/crear/clientes")
     * public Cliente crearNvoCliente(@RequestBody Cliente nvoCliente) {
     * return this.clienteServicio.crearNvoCliente(nvoCliente);
     * 
     * }
     * 
     * }
     */
}
