/*By:Joel,Ale*/
package com.SorboUnico.service;

/*SE IMPORTAN LAS LIBRERIAS*/
import com.SorboUnico.domain.Usuario;
import java.util.List;

public interface UsuarioService {
    
    public List<Usuario> getUsuarios();
    
    public void save(Usuario usuario);
    
    public void delete(Usuario usuario);
    
    public Usuario getUsuario(Usuario usuario);
}
