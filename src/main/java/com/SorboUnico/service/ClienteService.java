
package com.SorboUnico.service;

import com.SorboUnico.domain.ClienteV;
import java.util.List;

public interface ClienteService {
    
    public List<ClienteV> getClientes();
    
    public void save(ClienteV cliente);
    
    public void delete(ClienteV cliente);
    
    public ClienteV getCliente(ClienteV cliente);
    
}
