package com.gamaster.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamaster.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	
}
