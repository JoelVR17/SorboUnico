/*By:Joel,Ale*/
package com.SorboUnico.service;

import com.SorboUnico.domain.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SorboUnico.dao.UsuarioDao;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    private UsuarioDao usuarioDao;
    
    @Override
    public List<Usuario> getUsuarios() {
        
        return (List<Usuario>)usuarioDao.findAll();
    }

    @Override
    public void delete(Usuario usuario) {
        
        usuarioDao.delete(usuario);
    }

    @Override
    public Usuario getUsuario(Usuario usuario) {
        
        return usuarioDao.findById(usuario.getId_usuario()).orElse(null);
    }

    @Override
    public void save(Usuario usuario) {
        
        usuarioDao.save(usuario);
    }
}
