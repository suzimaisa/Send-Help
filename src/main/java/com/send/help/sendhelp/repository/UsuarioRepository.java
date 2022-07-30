package com.send.help.sendhelp.repository;

import com.send.help.sendhelp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer > {
    Optional<Usuario> findByEmail(String email);
};
