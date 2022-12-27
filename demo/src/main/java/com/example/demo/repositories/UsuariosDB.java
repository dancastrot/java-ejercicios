package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.entities.Usuario;

abstract public class UsuariosDB {
	
	private int totalInserciones = 0;
	private int totalEliminaciones = 0;
	
	protected void incrementarInserciones() {totalInserciones++;}
	
	protected void incrementarEliminaciones() {totalEliminaciones++;}
	
	abstract public ArrayList<Usuario> obtener();
	
	abstract public Usuario buscar(Usuario usuario);
	
	abstract public void insertar(Usuario usuario);
	
	abstract public void borrar(Usuario usuario);
}
