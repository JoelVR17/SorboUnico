
package com.SorboUnico.service;

import com.SorboUnico.dao.ClienteDao;
import com.SorboUnico.domain.ClienteV;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteDao clienteDao;
    
    @Override
    public List<ClienteV> getClientes() {
        
        return(List<ClienteV>)clienteDao.findAll();
        
    }

    @Override
    public void save(ClienteV cliente) {
        
        clienteDao.save(cliente);
        
    }

    @Override
    public void delete(ClienteV cliente) {
        
        clienteDao.delete(cliente);
        
    }

    @Override
    public ClienteV getCliente(ClienteV cliente) {
        
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
        
    }    
    
}
