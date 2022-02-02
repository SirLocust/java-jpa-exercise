package app.service;

import app.entity.Cliente;
import app.repository.ClienteRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ClienteService {
    private ClienteRepository clienteRepository;

    public Cliente find(String id){
        return  clienteRepository.find(id);

    }
    public Cliente save(Cliente cliente){
        return  clienteRepository.save(cliente);
    }
    public void delete(String id){
        clienteRepository.delete(id);
    }
    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }
}
