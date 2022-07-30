package com.send.help.sendhelp.resource;

import com.send.help.sendhelp.model.Usuario;
import com.send.help.sendhelp.service.UsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioResource {

    @Autowired
    public UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Usuario adicionarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }
    
    @GetMapping
    private List<Usuario> listarUsuarios(){
    	return usuarioService.listar();
    }

    @GetMapping(path = "{email}")
    private Usuario buscarUsuarioPeloEmail(@PathVariable String email) {
        return usuarioService.buscarUsuarioPeloEmail(email);
    }

}
