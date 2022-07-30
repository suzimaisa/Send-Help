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

    public Usuario atualizarUsuario(Usuario usuario){
        if(usuarioRepository.existsById(usuario.getId())){
            Usuario objUsuario = usuarioRepository.save(usuario);
            return objUsuario;
        }
        throw new RuntimeException("Usuario não existe");
    }

    public Usuario atualizarEmail(Usuario usuario) {
        Optional<Usuario> objUsuario = usuarioRepository.findById(usuario.getId());

        if(objUsuario.isPresent()){
            objUsuario.get().setEmail(usuario.getEmail());
            return usuarioRepository.save(objUsuario.get());
        }

        throw new RuntimeException("Usuário não encontrado");
    }
}
