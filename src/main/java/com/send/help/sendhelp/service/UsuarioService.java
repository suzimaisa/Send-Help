package com.send.help.sendhelp.service;

import com.send.help.sendhelp.model.Usuario;
import com.send.help.sendhelp.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> listar(){
    	return usuarioRepository.findAll();
    }

    public Usuario buscarUsuarioPeloEmail(String email) {
        Optional<Usuario> objUsuario = usuarioRepository.findByEmail(email);

        if(objUsuario.isPresent()){
            return objUsuario.get();
        }

        throw new RuntimeException("Usuário não encontrado");
    }
}
