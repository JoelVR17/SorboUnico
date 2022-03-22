/*By:Joel,Ale*/
package com.SorboUnico.dao;

/*SE IMPORTAN LAS LIBRERIAS*/
import com.SorboUnico.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Long>{
    
}
