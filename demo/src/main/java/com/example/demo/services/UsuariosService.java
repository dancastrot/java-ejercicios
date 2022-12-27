package com.example.demo.services;

import com.example.demo.entities.Usuario;

public interface UsuariosService {
	
	Usuario obtenerUsuario(String username);
	
	void crearUsuario(Usuario usuario);
	
	void borrarUsuario(String username);
	
}
