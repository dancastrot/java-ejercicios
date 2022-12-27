package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Usuario;
import com.example.demo.repositories.UsuariosDB;
import com.example.demo.repositories.UsuariosDBMemoria;

@Service
public class UsuariosServiceImpl implements UsuariosService{
	
	UsuariosDB usuariosDB = new UsuariosDBMemoria();
	
	public void usuarios(UsuariosDB usuariosDB) {this.usuariosDB = usuariosDB;}
	
	private void usuarios() {}
	
	public ArrayList<Usuario> listarUsuarios(){return usuariosDB.obtener();}
	
	@Override
	public Usuario obtenerUsuario(String username) {
		Usuario usuario = new Usuario();
		usuario.nombreUsuario = username;
		
		return usuariosDB.buscar(usuario);
	}
	
	@Override
	public void crearUsuario(Usuario usuario) {
		if(usuariosDB.buscar(usuario)!=null) {
			return;
		}
		
		usuariosDB.insertar(usuario);
	}
	
	@Override
	public void borrarUsuario(String username) {
		Usuario usuario = new Usuario();
		usuario.nombreUsuario = username;
		usuariosDB.borrar(usuario);
	}
}
