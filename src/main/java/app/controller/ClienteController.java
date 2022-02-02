package app.controller;

import app.repository.ClienteRepository;

import app.service.ClienteService;

import javax.persistence.EntityManager;


public class ClienteController {

    private final ClienteService clienteService;
    public ClienteController(EntityManager em){
        this.clienteService = new ClienteService(new ClienteRepository(em));
    }

    public String getCliente(String id){
        return clienteService.find(id).toString();
    }
    public String getClienteAll(){
        return clienteService.findAll().toString();
    }
}
